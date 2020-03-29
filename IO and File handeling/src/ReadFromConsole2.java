import java.io.*;
public class ReadFromConsole2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println(name);
			br.close();
		is.close();
		
	}

}
