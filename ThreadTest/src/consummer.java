
public class consummer extends Thread {
	volatile static  boolean run=true;
	//public static final Object obj=new Object();
	@Override
	public void run() {
			while(run){
				

			try {
				test.fun(false);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			
			
		//	Thread.currentThread();
		//	Thread.yield();
			
			}
	}
	 

