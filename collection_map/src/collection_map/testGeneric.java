package collection_map;

import java.util.ArrayList;
import java.util.List;

public class testGeneric {

	//泛型----Course
	public List<Course> courses;
	public testGeneric()
	{
		this.courses=new ArrayList<Course>();
	}
	
	public void testAdd()
	{
		Course cr1=new Course("1","大学语文");
		courses.add(cr1);
		//泛型集合中，不能添加泛型规定以外的对象
		//course.add("能否添加一些奇怪的东西");
		Course cr2= new Course("2", "JAVA基础");
		courses.add(cr2);
	}
	
	//测试遍历
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
		ccr.name="我是子类型的对象实例";
		courses.add(ccr);
	}
	
 }
