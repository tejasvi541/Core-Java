import java.io.*;
public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File f = new File("E:\\Workspace\\TextFiles\\read1.txt");
			try {
				FileInputStream fis = new FileInputStream(f);
				int i = fis.read();
				while(i!=-1)
				{
					System.out.println((char)i);
					i = fis.read();				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
	}

}
