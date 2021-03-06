import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.Format;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.Attributes;


public class DOM4Jtest {

	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		DOM4Jtest test=new DOM4Jtest();
		test.createXML();
		
		
	}
	
	private void parseXML() throws DocumentException
	{
		SAXReader reader=new SAXReader();
		org.dom4j.Document  document=	reader.read(new File("C:\\Users\\Administrator\\Desktop\\test_xml"));
		Element bookstore=document.getRootElement();
		Iterator it=bookstore.elementIterator();
		
		
		/*
		SAXReader reader2=new SAXReader()
		org.dom4j.Document document2=reader2.read(new File("C:\\Users\\Administrator\\Desktop\\test_xml"));
		*/
		
		
		
		
		while(it.hasNext())
		{
			System.out.println("=====开始遍历某一本书=====");
			Element book=(Element) it.next();
			
		List<Attribute> bookattrs=book.attributes();
		for(Attribute attr:bookattrs)
		{
			System.out.println("节点名："+attr.getName()+"  节点值:"+attr.getValue());
		}
		Iterator itt=book.elementIterator();
		while(itt.hasNext())
		{
			Element child=(Element) itt.next();
			System.out.println("属性:"+child.getName()+"  属性值:"+child.getStringValue());
		}
		
		
		
		System.out.println("=====结束遍历某一本书=====");
		}
		
		
	}
	private void createXML() throws IOException {
		
		org.dom4j.Document document=org.dom4j.DocumentHelper.createDocument();
		
		Element rss=document.addElement("rss");
		rss.addAttribute("version","2.0");
		Element channel=rss.addElement("channel");
		Element title=rss.addElement("title");
		title.setText("国内最新新闻");
		
		 OutputFormat format=OutputFormat.createPrettyPrint();
		 format.setEncoding("GBK");
		
		
		
		 File file=new File("rssnews.xml");
		XMLWriter writer=new XMLWriter(new FileOutputStream(file),format);
		writer.write(document);
		writer.close();
	
	
	
	}
	
	@Test
	public void test()
	{
		long start=System.currentTimeMillis();
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
