import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class server {

	public static void  main(String[] args) throws IOException {
		ServerSocket serverSocket=new ServerSocket(18180);
		Socket socket=null;
		int count=0;
		System.out.println("等待客户端连接！");
		
		while(true){
		 socket=serverSocket.accept();
		 serverThread serverThread=new serverThread(socket);
		serverThread.start();
		count++;
		System.out.println("客户端的数量:"+count);
		InetAddress inetAddress=socket.getInetAddress();
		System.out.println("IP地址:"+inetAddress);
		
		}
	
		
	}
	
}
