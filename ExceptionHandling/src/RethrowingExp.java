
public class RethrowingExp {

	public static void main(String[] args) {
	   int a = 0;//to see exception being handled write value of a = 10;
	   try 
	    {
		 System.out.println("Outer try block");
		   try
		   {
			   System.out.println("Inner try block");
			     if(a==10)
			    	 throw new ArithmeticException("OOPS!!");
		   }
		   catch(ArithmeticException e)
		   {
			   throw e; //throwing the exception to get handled in outer catch block
		   }
	    }
	   catch(ArithmeticException e)
	   {
		   System.out.println("Problem arised " + e);
	   }
	   catch(ArrayIndexOutOfBoundsException e)
	   {
		   System.out.println("Problem arised " + e);
	   }
	   catch(Exception e)
	   {
		   System.out.println("Problem arised " + e);
	   }

	}

}
