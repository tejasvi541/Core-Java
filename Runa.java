import java.util.*;
class A
{
	int a;
	int b;
	A() //Default Constructor
	{
		a=1;
		b=1;
	}
	A(int x, int y) // Parameterized constructor
	{
		a=x;
		b=y;
	}
	A(A x)
	{
		this.a = x.a;
		this.b = x.b;
	}
	void set(int x, int y)
	{
		this.a=x;
		this.b=y;
	}
	void show()
	{
		System.out.println(a + " | " + b);		
	}
}
class Runa
{
	public static void main(String a[])
	{
		A obj = new A();
		obj.show();
		A obj2 = new A(10,20);
		obj2.show();
		Scanner console = new Scanner(System.in);
		int t1,t2;
		System.out.println("Enter two numbers for initial values of a and b: ");
		t1=console.nextInt(); //nextDouble
		t2=console.nextInt();
		A obj3 = new A(t1,t2);
		obj3.show();
		A obj4 = new A(obj2);
		obj4.show();
		System.out.println("Enter the values of a and b: ");
		t1=console.nextInt();
		t2=console.nextInt();
		obj2.set(t1,t2);
		obj2.show();
	}
}