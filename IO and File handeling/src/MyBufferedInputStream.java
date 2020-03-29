import java.io.*;
public class MyBufferedInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				FileInputStream fin = new FileInputStream("E:\\\\Workspace\\\\TextFiles\\\\read2.txt");
				BufferedInputStream bin = new BufferedInputStream(fin);
				int i;
				while((i=bin.read())!=-1)
				{
					System.out.print((char)i);
				}
				bin.close();
				fin.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
	}

}
