package collection_map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Listtest {
	
	public List coursesToSelect;
	public Listtest()
	{
		this.coursesToSelect=new ArrayList();
		
	}

	public void testAdd()
	{
		Course cr1=new Course("1", "���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp=(Course) coursesToSelect.get(0);
		System.out.println("�����˿γ̣�"+temp.id+":"+temp.name);
		
		Course cr2=new Course("2", "C����");
		coursesToSelect.add(0, cr2);
		
		Course temp2=(Course) coursesToSelect.get(0);
		System.out.println("�����˿γ̣�"+temp2.id+":"+temp2.name);
		
		 
	}
	
	public void testModify()
	{
		coursesToSelect.set(1, new Course("5", "ë�󶫸���"));
	}
	
	
	//ͨ������������!
	
	public void testlterator()
	{
		System.out.println("ͨ��������������");
		Iterator it =coursesToSelect.iterator();
		while(it.hasNext())
		{
			Course cr=(Course) it.next();
			System.out.println("�γ̣�"+cr.id+":"+cr.name);
		}
	}
	
	public void testRemove()
	{
		Course cr=(Course) coursesToSelect.get(1);
		coursesToSelect.remove(cr);
		System.out.println("�ɹ�ɾ���γ̣�");
		testlterator();
	}
	
	public static  void main(String[] args) {
		
		Listtest lt=new Listtest();
		lt.testAdd();
		lt.testModify();
	    lt.testlterator();
	    lt.testRemove();
		
	}
}