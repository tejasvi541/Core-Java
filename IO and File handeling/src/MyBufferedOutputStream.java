import java.io.*;
public class MyBufferedOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				FileOutputStream fout = new FileOutputStream("E:\\\\Workspace\\\\TextFiles\\\\read2.txt");
				BufferedOutputStream bout = new BufferedOutputStream(fout);
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				String s = bf.readLine();
				//String s = System.console().readLine(); We cannot use this in an ide
				
				byte b[]=s.getBytes();
				bout.write(b);
				bout.flush();
				bout.close();
				fout.close();
				System.out.println("Success");
			}
			catch(IOException e) {
				System.out.println(e);
			}
	}

}
