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
		Course cr1=new Course("1", "数据结构");
		coursesToSelect.add(cr1);
		Course temp=(Course) coursesToSelect.get(0);
		System.out.println("添加了课程："+temp.id+":"+temp.name);
		
		Course cr2=new Course("2", "C语言");
		coursesToSelect.add(0, cr2);
		
		Course temp2=(Course) coursesToSelect.get(0);
		System.out.println("添加了课程："+temp2.id+":"+temp2.name);
		
		 
	}
	
	public void testModify()
	{
		coursesToSelect.set(1, new Course("5", "毛泽东概论"));
	}
	
	
	//通过迭代器遍历!
	
	public void testlterator()
	{
		System.out.println("通过迭代器遍历：");
		Iterator it =coursesToSelect.iterator();
		while(it.hasNext())
		{
			Course cr=(Course) it.next();
			System.out.println("课程："+cr.id+":"+cr.name);
		}
	}
	
	public void testRemove()
	{
		Course cr=(Course) coursesToSelect.get(1);
		coursesToSelect.remove(cr);
		System.out.println("成功删除课程！");
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
