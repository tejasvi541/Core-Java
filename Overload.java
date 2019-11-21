class Base
{
  int a,b,c;
   void show()
   {
   	System.out.println("\n\nFunction with no parameters called");
   	System.out.println("Now value of a is - " + a);
   }
  void show(int y)
   {
   	a=y;
   	System.out.println("\n\nFunction with one parameter called");
   	System.out.println("Now value of a is - " + a);

   } 
  void show(int x,int y,int z)
  {
   a=x;
   b=y;
   c=z;
   	System.out.println("\n\nFunction with Three parameter called");	
   	System.out.println("Now value of a is - " + a);
   	System.out.println("Now value of b is - " + b);
   	System.out.println("Now value of c is - " + c);
   	

  } 

}

class Overload
{
	public static void main(String[] args) {
		Base b1= new Base();

		b1.show();
		b1.show(20);
		b1.show(20,30,40);

	}
}