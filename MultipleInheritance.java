//Though this program will not work as multiple inheritance is not valid in java.

class A
{
	void show1()
	{
		System.out.println("Class A");
	}
}
class B 
{
	void show2()
	{
		System.out.println("Class B");
	}
}
class C 
{
	void show3()
	{
		System.out.println("Class C");
	}
}
class D extends A,B,C
{
	void show4()
	{
		System.out.println("Class D");
	}
}

class MultipleInheritance
{
	public static void main(String[] args) {
		D obj= new D();
		obj.show1();
		obj.show2();
		obj.show3();
		obj.show4();
	}
}