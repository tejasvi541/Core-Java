class Base
{
	int a = 100;
}
class Derived extends Base
{
	int a = 200;
	void show()
	{
		
		System.out.println("Value of base class's a is : " + super.a);
		System.out.println("Value of Derived class's a is : "+a);
	}
}
class Super2
{
	public static void main(String[] args) {
		
		Derived d = new Derived();
		d.show();
	}
}