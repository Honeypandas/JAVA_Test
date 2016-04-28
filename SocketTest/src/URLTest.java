import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class URLTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		URL imooc=new URL("http://www.imooc.com/index.html");
		 
		System.out.println("–≠“È:"+imooc.getProtocol() +" \n "  +imooc.getPath()+ imooc.getFile()   );
	System.out.println(imooc.getProtocol());
	}

}
