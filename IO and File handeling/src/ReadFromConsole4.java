import java.io.*;
public class ReadFromConsole4 {

	public static void main(String[] args)  {
		try {
			Console c = System.console();
			System.out.println("Enter username: ");
			String uname = c.readLine();
			System.out.println("Enter Password: ");
			char[] ch = c.readPassword();
			String pass = String.valueOf(ch);
			if(pass.contentEquals("yoyo"))
			{
				System.out.println("Successful Login Mr. : " + uname);
				
			}
			else
				System.out.println("Wrong credentials");
	}
		catch(Exception e)
		{
			
			System.out.println(e);
		}
	}

}
