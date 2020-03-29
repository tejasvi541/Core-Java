import java.lang.Exception;
 class MyExp2 extends Exception
  {
	int a;
	MyExp2(int x)
	{
		a = x;
	}
	public String toString()
	{
		return "MY Exception occured ^" + a + "^";
	}
  }
public class OwnExp2 {

	public static void main(String[] args) {
		int age;
		age = Integer.parseInt(args[0]);
		 try
		 {
			 if(age>20)
				 throw new MyExp2(age);
			 else
				 System.out.println("Age : " + age);
		 }
		 catch(MyExp2 e)
		 {
			 System.out.println(e);
		 }
	}

}
