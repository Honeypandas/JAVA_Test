import java.awt.geom.FlatteningPathIterator;
import java.io.File;
import java.io.Flushable;



//工具类：遍历 
public class FileUtils {
	
	public static void listDirectory(File dir)
	{
		if(!dir.exists())
		{
			throw new IllegalArgumentException("目录:"+dir+"不存在！");
		}
		
		if(!dir.isDirectory())
		{
			throw new IllegalArgumentException(dir+"不是目录！");
			
			
		}
		File[] files=dir.listFiles();
		if(files!=null&&files.length>0){
				for(File file:files)
				{
					if(file.isDirectory())
					{
						listDirectory(file);
					}
					else {
						if(file.getName().contains(".")&&file.getName().contains(".avi"))
						{
							System.out.println(file);
						}
						//System.out.println(file);
						}
					
				}
		}
		}

}
