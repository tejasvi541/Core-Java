import java.io.*;
public class ReadFromConsole3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String name = "";
		while(!name.equals("Exit"));
		{
			System.out.println("Enter your name or write exit to back off");
			name = br.readLine();
			if(!name.equals("Exit"));
			System.out.println(name );
			
		}
		br.close();
		isr.close();
	}

}
