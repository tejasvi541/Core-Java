import java.io.*;
public class ReadFromConsole {
	public static void main(String[] args)
	{
		try {
		System.out.println("Enter yor data");
		int i = System.in.read();
		System.out.println((char)i);
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}