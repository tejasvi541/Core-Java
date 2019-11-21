class A
{
	void show()
	{
		System.out.println("Base class");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("Derived class");
	}
}
class Final4
{
	public static void main(String[] args) {
		final A obj = new A();
		obj.show();
		B obj1 = new B();

		obj = obj1;
		obj.show();

	}
}
/*Here too as in previous programs the final keyword stops the referencing
to another class B ,...error shows= cnnot assign a value to final variable obj 
...as we have fixed the value of obj we have created using the final keyword;
*/