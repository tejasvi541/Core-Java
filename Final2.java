final class A
{
	void show()
	{
		System.out.println("Base Class");
	}
}
class B extends A
{
	void showb()
	{
		System.out.println("Derived ");
	}
}
class Final2
{
	public static void main(String[] args) {
		B obj = new B();
		obj.showb();
	}
}
/*Here also we used final keyword before class a so that is cannot
be called or override. error shows that-:cannot inherit
from final A class B Extends A*/