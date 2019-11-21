interface Area 
{
	double pi = 3.14;
	public void getdata();
	public void calc();

}

class Rect implements Area
{
	int l, b;
	public void getdata()
	{
		l=2;
		b=4;
	}
	public void calc()
	{
		System.out.println("Area of rectangle is : " + (l*b));
	}
}
class Circle implements Area
{
	int r;
	public void getdata()
	{
		r=7;
	}
	public void calc()
	{
		System.out.println("Area of Circle : " + (pi*r*r));
	}
}
class Interface
{
	public static void main(String[] args) {
		Rect r1 = new Rect();
		r1.getdata();
		r1.calc();

		Circle c = new Circle();
		c.getdata();
		c.calc();
	}
}