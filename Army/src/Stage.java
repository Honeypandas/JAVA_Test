
public class Stage extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stage stage=new Stage();
		stage.start();
	}
public void run() {
	ArmyRunnable  sui=new ArmyRunnable();
	ArmyRunnable  re=new  ArmyRunnable();
	
	Thread  suid=new Thread(sui,"���");
	Thread  red=new Thread(re,"ũ�������");
	suid.start();
	red.start();
	//��̨��������
	try {
		Thread.sleep(50);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("����˫����ս������");
	Thread mrCheng=new KeyPerson();
	mrCheng.setName("��ҧ��");
	System.out.println("��ҧ����������ð��հ�����ҵ��");
	sui.keepRunning=false;
	re.keepRunning=false;
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	mrCheng.start();
	try {
		mrCheng.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("ս�����������񰲾���ҵ��");
}
}