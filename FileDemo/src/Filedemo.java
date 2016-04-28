import java.io.File;
import java.io.IOException;


public class Filedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file =new File("F:\\ywq.txt");System.out.println(file.exists());
		
		
		
		if(!file.exists()){
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
			
			System.out.println(file);
		
	}

}
