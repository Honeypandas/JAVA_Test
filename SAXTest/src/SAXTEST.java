import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyStore.Entry.Attribute;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.Handler;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

import entity.Book;


public class SAXTEST {
	
	public ArrayList<Book> parseXML() throws SAXException, IOException, ParserConfigurationException
	{
		
		
		SAXParserFactory sax=SAXParserFactory.newInstance();
		SAXParser saxParser=sax.newSAXParser();
		saxParser.parse("C:\\Users\\Administrator\\Desktop\\test_xml", new SAXhander());

		
		return  SAXhander.getBookList();
		
	}
	
	public void createXml() throws SAXException, IOException, ParserConfigurationException, TransformerConfigurationException
	{
		ArrayList<Book> booklist=parseXML();
		SAXTransformerFactory tff=(SAXTransformerFactory) SAXTransformerFactory.newInstance();
		//Transformer tf=tff.newTransformer();
		
		TransformerHandler handler=tff.newTransformerHandler();
		Transformer tr=handler.getTransformer();
		//设置格式
		tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		tr.setOutputProperty(OutputKeys.INDENT, "yes");
		
		Result result=new StreamResult(new FileOutputStream(new File("src/res/newbook.xml")));
		handler.setResult(result);
		
		//开始生成XML文件
		handler.startDocument();
		AttributesImpl attr=new AttributesImpl();
		handler.startElement("", "", "bookstore", attr);
		
		for(Book book :booklist)
		{	attr.clear();
		attr.addAttribute("", "", "id", "", book.getId());
		handler.startElement("", "", "book", attr);
		attr.clear();
		if(book.getName()!=null&&!book.getName().trim().equals("")){
		handler.startElement("", "", "name", attr);
		handler.characters(book.getName().toCharArray(),0, book.getName().length() );
		handler.endElement("", "", "name");
		}
		if(book.getYear()!=null&&!book.getYear().trim().equals("")){
		attr.clear();
		handler.startElement("", "", "year", attr);
		handler.characters(book.getYear().toCharArray(),0, book.getYear().length() );
		handler.endElement("", "", "year");
		}
		if(book.getAuthor()!=null&&!book.getAuthor().trim().equals("")){
		attr.clear();
		handler.startElement("", "", "author", attr);
		handler.characters(book.getAuthor().toCharArray(),0, book.getAuthor().length() );
		handler.endElement("", "", "author");
		}
		if(book.getPrice()!=null&&!book.getPrice().trim().equals("")){
		attr.clear();
		handler.startElement("", "", "price", attr);
		handler.characters(book.getPrice().toCharArray(),0, book.getPrice().length() );
		handler.endElement("", "", "price");
		}
		if(book.getLanguage()!=null&&!book.getLanguage().trim().equals("")){
		attr.clear();
		handler.startElement("", "", "language", attr);
		handler.characters(book.getLanguage().toCharArray(),0, book.getLanguage().length() );
		handler.endElement("", "", "language");
		}
		handler.endElement("", "", "book");
		}
		handler.endElement("", "", "bookstore");
		handler.endDocument();
	}
 
	public static void main(String[] args) throws Exception, SAXException {
		// TODO Auto-generated method stub
	
		SAXTEST saxtest=new SAXTEST();
		saxtest.createXml();
	}

}
