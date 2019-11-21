import java.util.*;
class Calc
{
	double a, b;
	void setval(double a,double b)
	{
		this.a = a;
		this.b = b;
	}

	double add(double a, double b)
	{
		return a+b;
	}
	double sub(double a, double b)
	{
		return a-b;
	}
	double mul(double a, double b)
	{
		return a*b;
	}
	double div(double a, double b)
	{
		return a/b;
	}


}
class Calculator
{
	public static void main(String[] args) {
		int i;
		double t1,t2,result=0.00;
       Scanner console= new Scanner(System.in);
       System.out.print("Enter 1 to add\nEnter 2 to subtract\nEnter 3 to Multiply\nEnter 4 to divide\n");
       i=console.nextInt();
       System.out.println("Enter 2 numbers to perform task");
       t1=console.nextDouble();
       t2=console.nextDouble();
       Calc obj1= new Calc();

       switch(i)
       {
       	case 1:
        result=obj1.add(t1,t2);
        break;
        case 2:
        result=obj1.sub(t1,t2);
        break;
        case 3:
        result=obj1.mul(t1,t2);
        break;
        case 4:
        result=obj1.div(t1,t2);
        break;
       }
  
    System.out.println(result);
	}
}