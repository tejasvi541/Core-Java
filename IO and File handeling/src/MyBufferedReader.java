import java.io.*;
public class MyBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				FileReader fr = new FileReader("E:\\Workspace\\TextFiles\\read1.txt");
				BufferedReader br = new BufferedReader(fr);
				
				int i;
				while((i=br.read())!=-1)
				{
					System.out.print((char)i);
				}
				br.close();
				fr.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
	}

}
