import java.net.InetAddress;
import java.net.UnknownHostException;


public class Test01 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress address=InetAddress.getLocalHost();
	
	
	InetAddress address2=InetAddress.getByName("172.24.17.217");
	System.out.println(address.getHostName()+"  "+address.getHostAddress());
	
	System.out.println(address2.getHostName()+"  "+address2.getHostAddress());
	

}
}
