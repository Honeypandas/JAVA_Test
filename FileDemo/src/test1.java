import java.awt.Image;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;


public class test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileUtils.listDirectory(new File("G:\\"));
		//IOUtil.printHex("G:\\ywq.txt");
		//	String s="E:\\ywq.txt";
		
		//读一个文件以16进制
		/*FileInputStream f=new FileInputStream("G:\\ywq.txt");
		byte[] s=new byte[1024];
		int j=f.read(s, 0, s.length);
		System.out.println("长度为:"+j);
		for(int i=0;i<j;i++)
		{
			System.out.print(Integer.toHexString(s[i])+" ");
		}
		 f.close()*/;
		/* IOUtil.copyFile(new File("G:\\ywq.txt"),new File("F:\\JJJ.txt"));*/
		 
		 
		/* DataOutputStream s=new DataOutputStream(new FileOutputStream("F:\\JJJ.txt"));
		 
		 s.writeInt(10);s.writeUTF("YWQ");
		 s.flush();
		 s.close();
		 IOUtil.printHex("F:\\JJJ.txt");*/
		 
		
		 long start=System.currentTimeMillis();
		 IOUtil.copybuff(new File("F:\\ywq.txt"),new File("F:\\JJJ.txt"));
		 long end=System.currentTimeMillis();
		 System.out.println("耗时:"+(end-start));
	}

}
