package test1;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Test {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

			//输入一个字符
			/*	Scanner in=new Scanner(System.in);
				int i=in.nextInt();
				System.out.println(++i);
				*/
				
		
			//读写文件
			/*BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter buff=new BufferedWriter(new FileWriter("F:/test.txt"));
			String str=buf.readLine();
			while(!str.equals("exit"))
			{
				buff.write(str);
				buff.newLine();
				str=buf.readLine();
				
			}
			
			buf.close();---
			buff.close();*/
	
		
		/*//读写文件
		 String str="ywqywq";
		BufferedWriter buff=new BufferedWriter(new FileWriter("F:/test.txt"));
		 
	
			buff.write(str);
			buff.newLine(); 
		 
		buff.close(); 
		System.err.println(person.getnum());
	*/
		
		//字符串转换
		/*
		 String st="1000";
		 int i=Integer.parseInt(st);
		 System.out.println(i);
	 */
			//日期转换
		/*Date a=new Date() ;
		System.err.println(a);
		 SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String j=sd.format(a);
			System.err.println(j);
			
		String today="2016年04月21日13:50:50";
				SimpleDateFormat sf=new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
				Date ds=sf.parse(today);
			System.out.println(ds);
			*/
		
		//日期
	/*	
		Calendar c=Calendar.getInstance();
		int i=c.get(Calendar.DATE);
		int j=c.get(Calendar.HOUR_OF_DAY);
		System.out.println(j);*/
			
			
		double s=1.9;
			long i=Math.round(s);
			int j=Math.abs(-18);
			System.out.println(j);
			
			
	}
	
	@org.junit.Test
	public void test()
	{
		long start=System.currentTimeMillis();
		
		
		System.out.println("耗时："+(System.currentTimeMillis()-start));
		
	}
	
	

}
