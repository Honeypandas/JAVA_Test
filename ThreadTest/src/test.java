
public class test {
	
	public static int sum=0;
	public static Object obj=new Object();
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread  ywq=new productor();
		Thread  alex=new consummer();
		ywq.setName("ywq");
		alex.setName("alex");
		long i=System.currentTimeMillis();
		ywq.start();
		alex.start();
		while(System.currentTimeMillis()-i<5000)
		{
			
		}
		consummer.run=false;
		productor.run=false;
	}
	
	public static void fun(boolean s) throws InterruptedException
	{
		
		synchronized (obj) 
		{
					if(s==true){
						while(test.sum>=10)
						{
							obj.wait();
						}
						
						try {
							Thread.currentThread();
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					System.out.print("仓库有："+test.sum+"件产品   ");
					test.sum++;
					System.out.println("生产者生产了一件产品！现在仓库还有"+test.sum+"件产品");
					}
					else {
						
						while(test.sum<=0)
						{
							obj.wait();
						}
						
						try {
							Thread.currentThread();
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.print("仓库有："+test.sum+"件产品   ");
						test.sum--;
						System.out.println("消费者消费了一件产品！现在仓库还有"+test.sum+"件产品");
										
					}
			
				obj.notifyAll();
		}
		
		
	}

	
}
