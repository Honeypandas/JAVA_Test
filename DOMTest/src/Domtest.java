import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;


public class Domtest {
	
	public DocumentBuilder getDocumentBuilder() throws Exception{
		
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		
		DocumentBuilder db=dbf.newDocumentBuilder();
		return db;
		
		
		
		
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Domtest dom=new Domtest();
		
		dom.createXml();
		//����XML�ļ�
		/*DocumentBuilder  db=dom.getDocumentBuilder();
		Document document=db.parse("C:\\Users\\Administrator\\Desktop\\test_xml");
		NodeList bookList =document.getElementsByTagName("book");
		
		System.out.println("һ����"+bookList.getLength()+"������");
		
		for(int i=0;i<bookList.getLength();i++)
		{
			org.w3c.dom.Node book = bookList.item(i);
			//
		
			NamedNodeMap attrs=book.getAttributes();
			
			NodeList child=book.getChildNodes();
			
		
			System.out.print("��"+(i+1)+"���鹲��"+attrs.getLength()+"������: ");
			for(int q=0;q<attrs.getLength();q++)
			{
				org.w3c.dom.Node atrr=attrs.item(q);
				System.out.print(" ������:"+atrr.getNodeName());
				System.out.println(" ����ֵ:"+atrr.getNodeValue());
				 
			}
			//�������Ե�ֵ
			System.out.println(child.item(3).getTextContent());
			
		
		}
	*/
	}
	
	public void createXml() throws Exception{
		DocumentBuilder db=getDocumentBuilder();
		Document document=db.newDocument();
		document.setXmlStandalone(true);
		Element bookstore=document.createElement("bookstore");
		
		
	
		
		
		Element book=document.createElement("book");
		book.setAttribute("id", "1");	
		Element name=document.createElement("name");
		name.setTextContent("Frozen");
		book.appendChild(name);
		bookstore.appendChild(book);	
		document.appendChild(bookstore);
		
		TransformerFactory tff=TransformerFactory.newInstance();
		
		Transformer tf=tff.newTransformer();
		tf.setOutputProperty(OutputKeys.INDENT, "yes");
		tf.transform(new DOMSource(document), new StreamResult(new File("books.xml")));
	}
	
	

}