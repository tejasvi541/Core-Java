class A
{
	final int a =100;
	void show()
	{
		a=200;
		System.out.println("Value of a: " + a);

	}
}
class Final3
{
	public static void main(String[] args) {
		A obj = new A();
		obj.show();
	}
}
/*Same here as previous programs , we have finalised the vale of
int a therefore again if we assign vale of a in tha class A or anyother
class there will be error saying-cannot assig a value to final variable a*/