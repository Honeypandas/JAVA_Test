
public class ArmyRunnable implements Runnable{
	volatile boolean keepRunning=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(keepRunning)
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(Thread.currentThread().getName()+"进攻对方["+i+"]");
				Thread.yield();
			}
		}
		System.out.println("战斗结束了！");
	}

}
