package collection_map;

import java.util.ArrayList;
import java.util.List;

public class testGeneric {

	//����----Course
	public List<Course> courses;
	public testGeneric()
	{
		this.courses=new ArrayList<Course>();
	}
	
	public void testAdd()
	{
		Course cr1=new Course("1","��ѧ����");
		courses.add(cr1);
		//���ͼ����У��������ӷ��͹涨����Ķ���
		//course.add("�ܷ�����һЩ��ֵĶ���");
		Course cr2= new Course("2", "JAVA����");
		courses.add(cr2);
	}
	
	//���Ա���
	public void testForEach()
	{
		for(Course cr:courses)
		{
			System.out.println(cr.id+":"+cr.name);
		}
		
	}
	
	public static void main(String[] args)
	{
		testGeneric tg=new testGeneric();
		tg.testAdd();
		tg.testChild();
		tg.testForEach();
		
	}
	
	public void testChild()
	{
		childCourse ccr=new childCourse();
		ccr.id="3";
		ccr.name="���������͵Ķ���ʵ��";
		courses.add(ccr);
	}
	
 }