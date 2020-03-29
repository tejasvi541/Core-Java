import java.io.*;
public class MyBufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FileWriter writer;
			try {
				writer = new FileWriter("E:\\Workspace\\TextFiles\\read1.txt");
				BufferedWriter buffer = new BufferedWriter(writer);
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				String str = br.readLine();
				
				buffer.write(str);
				buffer.close();
				System.out.println("Success");
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
	}

}
