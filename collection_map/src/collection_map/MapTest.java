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
		System.out.println("������Ҫ��ѯ��ѧ��������");
		Scanner console=new Scanner(System.in);
		String id=console.next();
		System.out.println("�������ѧ��ID:"+id+"�Ƿ����:"+
		student.containsKey(id));
		if(student.containsKey(id))
		{
			System.out.println("��Ӧ��ѧ��ѧ����:"+student.get(id).name);
		}
		else {
			System.out.println("�����ڴ�ѧ����");
		}
	}
	public Map<String,Student> student;
	
	
	public MapTest()
			{
		
		this.student=new HashMap<String,Student>();
		
	}
	
	public void testModify(){
		System.out.println("������Ҫ�޸ĵ�ѧ��ID");
		Scanner console=new Scanner(System.in);
		while(true)
		{
			String stuID=console.next();
			Student stu=student.get(stuID);
			if(stu==null)
			{
				System.out.println("��ID�����ڣ����������룡");
				continue;
				
			}
			
			System.out.println("��ǰѧ��ID����Ӧ��ѧ������Ϊ:"+stu.name);
			System.out.println("�������µ�ѧ��������");
			String  name=console.next();
			Student newStudent=new Student(stuID, name);
			student.put(stuID, newStudent);
			System.out.println("�޸ĳɹ���");
			break;
		}
			
	}
	
	public void testPut()
	{
		
		Scanner console=new Scanner(System.in);
		int i=0;
		while(i<3)
		{
			System.out.println("������ѧ��ID");
			String ID=console.next();
			Student st=student.get(ID);
			if(st==null)
			{
				System.out.println("������ѧ������");
				String name=console.next();
				Student newStudent=new Student(ID,name);
				student.put(ID, newStudent);
				System.out.println("�ɹ�����ѧ����");
				i++;
			}
			else{
				System.out.println("��ѧ��ID�ѱ�ռ�ã�");
				continue;
			}
		}
		
	}
	
	public void testkeyset()
	{
		//ͨ��keyset������Map�����м��ļ��ϣ�
		Set<String> keyset=student.keySet();
		System.out.println("�ܹ��У�"+student.size()+"��ѧ����");
		
		for(String stuid:keyset)
		{
			Student st=student.get(stuid);
			if(st!=null)
			{
				System.out.println("ѧ����"+"ѧ��:"+st.id+"����:"+st.name);
			}
		}
		
	}
	
	public void testRemove()
	{
		while(true){
		System.out.println("������Ҫɾ����ѧ��ѧ�ţ�");
		Scanner console=new Scanner(System.in);
		String ID=console.next();
		Student  st=student.get(ID);
		if(st==null)
		{
			System.out.println("��ID�����ڣ�");
			continue;
		}
		student.remove(ID);
		System.out.println("�ɹ�ɾ��ѧ����"+st.name);
		break;
		}
		
	}
	
	public void testEntrySet()
	{
		Set<java.util.Map.Entry<String, Student>>entrySet =student.entrySet();
	
	for(java.util.Map.Entry<String, Student> entry: entrySet)
	{
		System.out.println("ȡ�ü�ֵ��"+entry.getKey());
		System.out.println("��Ӧ��ֵΪ:"+entry.getValue().name);
	}
	}

}