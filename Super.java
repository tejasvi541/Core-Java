class Base
{
	void show()
	{
		System.out.println("Base classs function called");
	}
}
class Derived extends Base
{
	void show()
	{
		super.show();
		System.out.println("Derived class funtion is called");
	}
}
class Super
{
	public static void main(String[] args) {
		
		Derived d = new Derived();
		d.show();
	}
}