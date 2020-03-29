abstract class A {
	void show()
	{
		System.out.println("Non-abstract Method");
	}
	abstract void display();
}
class B extends A{
	void display()
	{
		System.out.println("Abstract medthod of class A defined in B");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();
		obj.display();
	}

}
