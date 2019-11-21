class Base
{
	final void show()
	{
		System.out.println("Base class");
	}
}
class Derived extends Base
{
	void show()
	{
		System.out.println("derived class");
	}
}
class Final
{
	public static void main(String[] args) {
		Derived d = new Derived();
		d.show();
	}
}
/*Derived cannot override Show() in Base ...as Overridde method
is final.....we have used final keywords here to stop inheritance
,Method overriding,Refernce changing.*/
//Therefore this program will show error. 