interface msg
{
	public void show();
}
class A implements msg
{
	public void show()
	{
		System.out.println("Function of interface defined in class A");
	}
}
class B implements msg
{
	public void show()
	{
		System.out.println("Function of interface defined in class B ");
	}

}
class Interface2
{
	public static void main(String[] args) {
		msg obj = new A();
		obj.show();

		B testobj = new B();
		obj = testobj;
		obj.show();
	}
}