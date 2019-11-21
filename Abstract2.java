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
class Tmp
{
	Derived d;
	void setval(int x, int y)
	{
		d = new Derived(x,y);
	}
	void show()
	{
		d.show();
	}
}
class Abstract2
{
	public static void main(String[] args) {
		Tmp t = new Tmp();
		t.setval(10,20);
		t.show();
	}
}