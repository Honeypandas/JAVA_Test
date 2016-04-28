import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;


public class serverThread extends Thread {
	
		Socket socket=null;
		BufferedReader bff=null;
		public serverThread(Socket socket)
		{
			this.socket=socket;
		
		}
		
		public void run()
		{
			InputStreamReader ist=null;
			InputStream is=null;
			try {
				
				is = socket.getInputStream();
				InputStreamReader ist1=new InputStreamReader(is);
				BufferedReader bff=new BufferedReader(ist1);
				String info=null;
				while((info=bff.readLine())!=null)
				{
					System.out.println("我是服务器,客户说:"+info);
					
				}
				socket.shutdownInput();
				OutputStream os=socket.getOutputStream();
				PrintWriter pw=new PrintWriter(os);
				pw.write("欢迎您！");
				System.out.println("服务器说：欢迎您");
				pw.flush();
				
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
		}
}
