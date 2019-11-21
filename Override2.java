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
class Override2
{
	public static void main(String[] args) {
		Base b = new Base();
		
		b.show();
		b=new Derived();
		b.show();
	}
}