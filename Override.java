class Base
{
	void show()
	{
		System.out.println("Base class function called");
	}
}
class Derived extends Base
{
	void show()
	{
		System.out.println("Derived class function called");
	}
}
class Override
{
	public static void main(String[] args) {
		Derived d = new Derived();
		d.show();
		Base b = new Base();
		b.show();
	}
}