
public class NestTry {

	public static void main(String[] args) {
	  try {
		  int ar[] = new int[3];
		  ar[0] = 22;
		  ar[1] = 23;
		  ar[2] = 24;
		  ar[3] = 222;  //Ye lekr hamne array ki boundary paar kr li tbhi index out of bounds exception li hamne...!
		  try {
			  System.out.println("Division result: " + (2/0));
		  }
          catch(ArithmeticException d) {
        	  System.out.println("Divison failure");
            }
		  }
	  catch(ArrayIndexOutOfBoundsException e)  {
		  System.out.println("Array read operation failure : " + e);
		  
	  }

	}

}
