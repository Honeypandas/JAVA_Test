import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutput {
	
	 public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("F:\\ywq.txt",true);
		f.write('a');
		f.close();
	}
}
