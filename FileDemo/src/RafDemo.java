import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.util.Arrays;


public class RafDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			String s="ÓáÎÄÇ«";
			byte[] gbk=s.getBytes("gbk");
			File file=new File("F:\\ywq.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			RandomAccessFile raf=new RandomAccessFile(file, "rw");
			raf.write(gbk);
			System.err.println(raf.length());
			raf.seek(0);
			byte[] buf=new byte[(int)raf.length()];
			raf.read(buf);
			System.out.println(Arrays.toString(buf));
	
			raf.close();
	}
	
}
