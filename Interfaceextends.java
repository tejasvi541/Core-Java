interface msg
{
	public void show();
}
interface msg1 extends msg{
	public void display();
}     
class A implements msg1
{
	public void display()
	{
		System.out.println("Function of interface msg1 defined in class A");
	}
	public void show()
	{
		System.out.println("Function interface msg defined in class A");
	}
}
class Interfaceextends
{
	public static void main(String[] args) {
		A obj = new A();
		obj.show();
		obj.display();
	}
}