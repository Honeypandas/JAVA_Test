import java.awt.im.InputContext;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;



public class URLtest3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	URL url=new URL("http://www.baidu.com");
	File file=new File("ywq.txt");
	InputStream is=url.openStream();
	InputStreamReader isr=new InputStreamReader(is,"UTF-8");
	 
	
	
	BufferedReader bff=new BufferedReader(isr);
	String data=bff.readLine();
	FileWriter fileWriter=new FileWriter(file);
	fileWriter.write(data);
	while(data!=null)
	{
		fileWriter.write(data);
		System.out.println(data);
		data=bff.readLine();
	}
	bff.close();
	is.close();
	isr.close();
	fileWriter.close();
	}

}
