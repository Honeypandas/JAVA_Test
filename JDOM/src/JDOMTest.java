import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.CDATA;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.w3c.dom.Document;
import org.xml.sax.Attributes;


public class JDOMTest {

	
	private void  parseXML() throws FileNotFoundException, IOException, JDOMException {
		SAXBuilder saxBuilder=new SAXBuilder();
		InputStream in=new FileInputStream("C:\\Users\\Administrator\\Desktop\\test_xml");
		InputStreamReader isr=new InputStreamReader(in,"UTF-8");
		org.jdom2.Document document=saxBuilder.build(isr);
		Element rootElement=document.getRootElement();
		List<Element> bookList=rootElement.getChildren();
	
		for(Element book:bookList)
		{
			Book bookEntity=new Book();
			System.out.println("开始解析第"+(bookList.indexOf(book)+1)+"本书"); 
		//解析book属性
			List<Attribute> attrs =book.getAttributes();
			for(Attribute attr:attrs)
			{
				String attrname=attr.getName();
				String attrvalue=attr.getValue();
				System.out.println("属性名："+attrname+"属性值:"+attrvalue);
				if(attrname.equals("id"))
				{
					bookEntity.setId(attrvalue);
				}
			
			}
			List<Element> bookChilds=book.getChildren();
			for(Element books:bookChilds)
			{
				System.out.println("节点名:"+books.getName()+"属性值："+books.getValue());
				if(books.getName().equals("name"))
				{
					bookEntity.setName(books.getValue());
				}
				else if(books.getName().equals("author"))
				{
					bookEntity.setAuthor(books.getValue()); 
				}
				else if(books.getName().equals("year"))
				{
					bookEntity.setYear(books.getValue());
				}
				else if(books.getName().equals("language"))
				{
					bookEntity.setLanguage(books.getValue());
				}
			}
			
			System.out.println("结束解析第"+(bookList.indexOf(book)+1)+"本书"); 
			book_ywq.add(bookEntity);
			bookEntity=null;
			System.out.println("长度:"+book_ywq.size());
			for(Book book2:book_ywq){
			System.out.println("ID: "+book2.getAuthor());
			}
		}
		
	
		
		
	}
	
	
	
	private  static List<Book> book_ywq=new ArrayList<Book>();
	public static void main(String[] args) throws JDOMException, IOException {
		// TODO Auto-generated method stub

		JDOMTest test=new JDOMTest();
		test.createXML();
		
	
	}
	
	private void  createXML() throws FileNotFoundException, IOException {
		Element rss=new Element("rss");
		rss.setAttribute("version","2.0");
		org.jdom2.Document document=new org.jdom2.Document(rss);
		Element channel=new Element("channel");
		Element ssss=new Element("ssss");
		rss.addContent(ssss);rss.addContent(channel);
		
		//Element title=new Element("title");
		
		
		ssss.addContent(new CDATA("<Y45646456466666666666666666666666666666WQ>"));
		//title.addContent("ssss");
		
		
		//channel.addContent("title");
		XMLOutputter outputter=new XMLOutputter();
		 Format newFormat=Format.getCompactFormat();
		 newFormat.setIndent("");
		 newFormat.setEncoding("GBK");
		outputter.setFormat(newFormat);
		
		outputter.output(document, new FileOutputStream(new File("rssnews.xml")));
		
		
		
		
		
	}
	

}
