
public class KeyPerson extends Thread {
	
	public void  run() {
		System.out.println(Thread.currentThread().getName()+"��ʼ��ս����");
		for(int i=0;i<10;i++)
		{
		System.out.println(Thread.currentThread().getName()+"��ɱ�ķ���");	
		
		}
	System.out.println(Thread.currentThread().getName()+"������ս����");
	
	}

}
