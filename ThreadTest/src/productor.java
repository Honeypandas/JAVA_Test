
public class productor extends Thread {
	 
	volatile static  boolean run=true;
	//public final Object obj=new Object();
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		
		while(run)
		{
			
		
		
			try {
				test.fun(true);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		}
		
		
		//Thread.currentThread();
		//Thread.yield();
		
		}
		
	}
	
	


