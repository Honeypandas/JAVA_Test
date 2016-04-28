import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class client {

	public static void main(String[] args) throws UnknownHostException, IOException
	{
		
		Socket socket=new Socket("localhost",18180);
		
		OutputStream os=socket.getOutputStream();
		
		PrintWriter pw=new PrintWriter(os);
		pw.write("用户名:ywq;密码:123");
		pw.flush();
		socket.shutdownOutput();
		InputStream is=socket.getInputStream();
		BufferedReader bf=new BufferedReader(new InputStreamReader(is));
		String s=null;
		while((s=bf.readLine())!=null)

		{
			System.out.println("我是客户机，服务器说"+s);
		}
		socket.shutdownInput();
		is.close();
		bf.close();
		os.close();
		pw.close();
		socket.close();
	}
}
