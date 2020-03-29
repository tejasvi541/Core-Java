class A
{
	int a;
	void getdata(int x)
	 {
		a = x;
	 }
	void calc()
	 {
		try
		{
			if(a==10)
				throw new ArithmeticException("OOPS!!");
			else
				System.out.println("Value of a : " + a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Manual failure :" + a );
		}
	 }  
}
public class ManualExpThrow {

	public static void main(String[] args) {
		A a = new A();
		a.getdata(4);
		a.calc();
		a.getdata(10);
        a.calc();   
	}

}
