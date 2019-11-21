class A
{
	int a=100;
	void show1()
	{
		

		System.out.println("Class A" + a);
	}
}
class B extends A
{
	void show2()
	{
		System.out.println("Class B" + a);
	}
}
class C extends A
{
	void show3()
	{
		System.out.println("Class C" + a);
	}
}
class D extends A
{
	void show4()
	{
		System.out.println("Class D" + a);
	}
}

class Hierarchy
{
	public static void main(String[] args) {
		D obj4= new D();
		B obj2= new B();
		C obj3= new C();

		//obj.show1();
		obj2.show2();
		obj3.show3();
		obj4.show4();
	}
}