package collection_map;

import java.awt.Robot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.sound.midi.Synthesizer;

public class collectiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		collectiontest st=new collectiontest();
		st.testSort3();
	}
	public void testsort()
	{
		List<Integer> integerList =new ArrayList<Integer>();
		Random random=new Random();
		Integer k;
		for(int i=0;i<10;i++){
		do{
			k=random.nextInt(100);	
		}while(integerList.contains(k));
		integerList.add(k);
		System.out.println("成功添加整数:"+k);
		}
	System.out.println("-------排序前-------");
	for(Integer integer:integerList)
	{
		System.out.println("元素："+integer);
		
	}
	Collections.sort(integerList);
	System.out.println("-------排序后-------");
	
		for(Integer integer:integerList)
		{
			System.out.println("元素："+integer);
			
		}
	}
	
	public void testSort3(){
		List<Student> studentslist=new ArrayList<Student>();
		Random random=new Random();
		studentslist.add(new Student(random.nextInt(1000)+"","Mike"));
		studentslist.add(new Student(random.nextInt(1000)+"","Anna"));
		studentslist.add(new Student(random.nextInt(1000)+"","Elsa"));
		System.out.println("-------排序前------");
		for(Student stu:studentslist)
		{
			System.out.println("学生："+stu.id+stu.name);
			
		}
		Collections.sort(studentslist,new StudentComparator());
		
		System.out.println("-------排序后-------");
		for(Student stu:studentslist)
		{
			System.out.println("学生："+stu.id+stu.name);
			
		}
	}
	
	public void testSort2(){
		
		List<String> stringlist=new ArrayList<String>();
		stringlist.add("microsoft");
		stringlist.add("google");
		stringlist.add("lenove");
		
		System.out.println("--------排序前-------");
		for(String string:stringlist)
		{
			System.out.println("元素:"+string);

		}
		Collections.sort(stringlist);

		System.out.println("--------排序后-------");
		for(String string:stringlist)
		{
			System.out.println("元素:"+string);

		}
		
	}
	
	
	

}
