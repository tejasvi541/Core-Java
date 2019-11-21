class A
{
	void show1()
	{
	
		System.out.println("Class A");
	}
}
class B extends A
{
	void show2()
	{
		System.out.println("Class B");
	}
}
class C extends B
{
	void show3()
	{
		System.out.println("Class C");
	}
}
class D extends C
{
	void show4()
	{
		System.out.println("Class D");
	}
}

class MultiInheritance
{
	public static void main(String[] args) {
		D obj= new D();
		obj.show1();
		obj.show2();
		obj.show3();
		obj.show4();
	}
}