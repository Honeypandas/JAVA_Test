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
		System.out.println("�ɹ���������:"+k);
		}
	System.out.println("-------����ǰ-------");
	for(Integer integer:integerList)
	{
		System.out.println("Ԫ�أ�"+integer);
		
	}
	Collections.sort(integerList);
	System.out.println("-------�����-------");
	
		for(Integer integer:integerList)
		{
			System.out.println("Ԫ�أ�"+integer);
			
		}
	}
	
	public void testSort3(){
		List<Student> studentslist=new ArrayList<Student>();
		Random random=new Random();
		studentslist.add(new Student(random.nextInt(1000)+"","Mike"));
		studentslist.add(new Student(random.nextInt(1000)+"","Anna"));
		studentslist.add(new Student(random.nextInt(1000)+"","Elsa"));
		System.out.println("-------����ǰ------");
		for(Student stu:studentslist)
		{
			System.out.println("ѧ����"+stu.id+stu.name);
			
		}
		Collections.sort(studentslist,new StudentComparator());
		
		System.out.println("-------�����-------");
		for(Student stu:studentslist)
		{
			System.out.println("ѧ����"+stu.id+stu.name);
			
		}
	}
	
	public void testSort2(){
		
		List<String> stringlist=new ArrayList<String>();
		stringlist.add("microsoft");
		stringlist.add("google");
		stringlist.add("lenove");
		
		System.out.println("--------����ǰ-------");
		for(String string:stringlist)
		{
			System.out.println("Ԫ��:"+string);

		}
		Collections.sort(stringlist);

		System.out.println("--------�����-------");
		for(String string:stringlist)
		{
			System.out.println("Ԫ��:"+string);

		}
		
	}
	
	
	

}