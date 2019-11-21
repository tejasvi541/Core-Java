class Base
{
	int a;
	Base(int x)//constructor
	{
		a=x;
	}
}
class Derived extends Base
{
	int b;
	Derived(int t, int y)
	{
		super(y);
		b=t;
	}
	void show()
	{
		System.out.println("a = "+a+" | b = " + b);
	}
}
class Abstract
{
	public static void main(String[] args) {
		Derived d = new Derived(10,20);
		d.show();
	}
}