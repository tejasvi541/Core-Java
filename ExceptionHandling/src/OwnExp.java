import java.lang.Exception;
class MyExp extends Exception {
	MyExp(String message)
	{
		super(message);
	}
}
public class OwnExp {
	public static void main(String[] args) {
		int a = 0;
		 try 
		 {
			 if(a==0)
				 throw new MyExp("Its an exception by me");
		 }
		 catch(MyExp e)
		 {
			 System.out.println(e.getMessage());
		 }
	}

}
