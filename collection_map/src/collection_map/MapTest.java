package collection_map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MapTest mt=new MapTest();
		mt.testPut();
		mt.testkeyset();
		
		//mt.testRemove();
		//mt.testEntrySet();
		/*mt.testModify();
		mt.testEntrySet();*/
		mt.testContainKeyOrValue();
		
	}
	
	public void testContainKeyOrValue(){
		System.out.println("请输入要查询的学生姓名：");
		Scanner console=new Scanner(System.in);
		String id=console.next();
		System.out.println("您输入的学生ID:"+id+"是否存在:"+
		student.containsKey(id));
		if(student.containsKey(id))
		{
			System.out.println("对应的学生学生名:"+student.get(id).name);
		}
		else {
			System.out.println("不存在此学生！");
		}
	}
	public Map<String,Student> student;
	
	
	public MapTest()
			{
		
		this.student=new HashMap<String,Student>();
		
	}
	
	public void testModify(){
		System.out.println("请输入要修改的学生ID");
		Scanner console=new Scanner(System.in);
		while(true)
		{
			String stuID=console.next();
			Student stu=student.get(stuID);
			if(stu==null)
			{
				System.out.println("该ID不存在，请重新输入！");
				continue;
				
			}
			
			System.out.println("当前学生ID所对应的学生姓名为:"+stu.name);
			System.out.println("请输入新的学生姓名：");
			String  name=console.next();
			Student newStudent=new Student(stuID, name);
			student.put(stuID, newStudent);
			System.out.println("修改成功！");
			break;
		}
			
	}
	
	public void testPut()
	{
		
		Scanner console=new Scanner(System.in);
		int i=0;
		while(i<3)
		{
			System.out.println("请输入学生ID");
			String ID=console.next();
			Student st=student.get(ID);
			if(st==null)
			{
				System.out.println("请输入学生姓名");
				String name=console.next();
				Student newStudent=new Student(ID,name);
				student.put(ID, newStudent);
				System.out.println("成功添加学生！");
				i++;
			}
			else{
				System.out.println("该学生ID已被占用！");
				continue;
			}
		}
		
	}
	
	public void testkeyset()
	{
		//通过keyset，返回Map中所有键的集合！
		Set<String> keyset=student.keySet();
		System.out.println("总共有："+student.size()+"个学生！");
		
		for(String stuid:keyset)
		{
			Student st=student.get(stuid);
			if(st!=null)
			{
				System.out.println("学生："+"学号:"+st.id+"名字:"+st.name);
			}
		}
		
	}
	
	public void testRemove()
	{
		while(true){
		System.out.println("请输入要删除的学生学号：");
		Scanner console=new Scanner(System.in);
		String ID=console.next();
		Student  st=student.get(ID);
		if(st==null)
		{
			System.out.println("该ID不存在！");
			continue;
		}
		student.remove(ID);
		System.out.println("成功删除学生："+st.name);
		break;
		}
		
	}
	
	public void testEntrySet()
	{
		Set<java.util.Map.Entry<String, Student>>entrySet =student.entrySet();
	
	for(java.util.Map.Entry<String, Student> entry: entrySet)
	{
		System.out.println("取得键值："+entry.getKey());
		System.out.println("对应的值为:"+entry.getValue().name);
	}
	}

}
