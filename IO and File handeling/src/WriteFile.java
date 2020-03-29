import java.io.*;
public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File f = new File("E:\\Workspace\\TextFiles\\read1.txt");
			try {
				FileOutputStream fos = new FileOutputStream(f);
				fos.write(127);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}
