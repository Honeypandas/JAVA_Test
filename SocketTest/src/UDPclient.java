import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.sound.sampled.Port;


public class UDPclient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InetAddress address=InetAddress.getByName("localhost");
		byte[] data="用户名:admin;密码:123".getBytes();
		int port=8800;
		
		DatagramPacket packet=new DatagramPacket(data, data.length,address,port);
		
		DatagramSocket socket=new DatagramSocket();
		socket.send(packet);
		byte[] data2=new byte[1024];
		
		DatagramPacket packet2=new DatagramPacket(data2,data2.length);
		socket.receive(packet2);
		String reply=new String(data2,0,packet2.getLength());
		System.out.println("服务器说："+reply+ packet2.getLength());
		socket.close();
	}

}
