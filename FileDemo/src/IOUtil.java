import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class IOUtil {
	
	public static void printHex(String fileName) throws IOException{
		FileInputStream file =new FileInputStream(fileName);
		int b;
		int i=1;
		while((b=file.read())!=-1)
		{
			if(b<0xf)
			{
				System.out.println("0");
			}
			System.out.print(Integer.toHexString(b)+" ");
			if(i++%10==0){
				
		System.out.println("\n");
		}
			}
		file.close();
	}
	
	public static void  copyFile(File scr,File destFile) throws IOException {
		
		if(!scr.exists())
		{
			throw new IllegalArgumentException();
		}
		
		FileInputStream in=new FileInputStream(scr);
		FileOutputStream out=new FileOutputStream(destFile);
	
		byte[] buf=new byte[1024];
		int b;
		while((b=in.read(buf,0,buf.length))!=-1)
		{
			out.write(buf, 0, b);
			out.flush();
		}
		
		in.close();
		out.close();
	
	
	}
	
	
	public static void  copybuff(File srcFile,File destFile) throws IOException  {
		
		BufferedInputStream bis=new 
				BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFile));
		int c;
		while((c=bis.read())!=-1)
		{
			bos.write(c);
			bos.flush();//Ë¢ÐÂ»º³åÆ÷
		}
		bis.close();
		bos.close();
	}
	
	
	
	
}
