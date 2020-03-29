
public class ExceptionHandeling {

	public static void main(String[] args) {
		
        int a,b;
        a=0;
        b=20;
        
        try {    //Agar pta h exception aane vali h to try me daal do
            System.out.println(b/a);
        }
        catch(ArithmeticException exp)
        {
        	System.out.println("Please do not use 0 in denominator " );
        	exp.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException exp){
        	System.out.println(exp);
        }
        catch(ArrayStoreException exp) {
        	System.out.println(exp);
        }
        catch(NullPointerException exp) {
        	System.out.println(exp);
        }
        catch(Exception exp) {
        	System.out.println("Some error has occured please try again");
        }
        finally
        {
        	System.out.println("Thank you");
        }
        
	}

}
