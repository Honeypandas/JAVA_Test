import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

		
public class UDPserver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DatagramSocket socket=new DatagramSocket(8800);
		byte[] data=new byte[1024];
		InetAddress address=InetAddress.getByName("localhost");
		DatagramPacket packet=new DatagramPacket(data, data.length);
		System.out.println("�������Ѿ��������ȴ��ͻ�����");
		socket.receive(packet);
		String info=new String(data,0,packet.getLength());
		System.out.println("���Ƿ��������ͻ�����Ϣ��"+info);
		
		InetAddress address2=packet.getAddress();
		int port=packet.getPort();
		
		byte[] data2="yyyy��".getBytes();
		DatagramPacket packet2=new DatagramPacket(data2, data2.length,address2,port);
		socket.send(packet2);
		socket.close();
		
	}

}