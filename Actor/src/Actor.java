
public class Actor extends Thread {
	
	public void run()
	{
		System.out.println(getName()+"��һ����Ա��");
		int count=0;
		boolean keeping=true;
		while(keeping){
		System.out.println(getName()+"��̨�ݳ�"+(++count));
		System.out.println(getName()+"�ݳ�����");
		if(count==100)
		{
			keeping=false;
		}
		if(count%10==0)
		{
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	}
	public static void  main(String[] args) {
		Thread actor=new Actor();
		actor.setName("Mr.Alex");
		actor.start();
		Thread  actress=new Thread(new Actress(), "Mrs.Stepy");
		actress.start();
		
	}
	
	static class Actress implements Runnable{

		@Override
		  public void run() {
			// TODO Auto-generated method stub
			System.out.println(Thread.currentThread().getName()+"��һ����Ա��");
			int count=0;
			boolean keeping=true;
			while(keeping){
			System.out.println(Thread.currentThread().getName()+"��̨�ݳ�"+(++count));
			System.out.println(Thread.currentThread().getName()+"�ݳ�����");
			if(count==100)
			{
				keeping=false;
			}
			if(count%10==0)
			{
				try {
					sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			}
			}
	}
	
	
}