import java.io.*;
public class ListDirectoryContents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = null;
		String[] paths;
		try
		{
			file = new File("E:\\\\Workspace\\\\TextFiles");
			paths =  file.list();
			for(String path:paths)
			{
				System.out.println(path);
			}
					
		}
		catch(Exception e)
		{
			
		}
	}

}
