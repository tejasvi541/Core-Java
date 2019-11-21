import java.util.*;
class Student
{
	String name; //String is a class
	int eng;
	int mat;
	int hin;
   void setval(String name, int eng, int mat, int hin)
   {
   	 this.name = name;
   	 this.eng = eng;
   	 this.mat = mat;
   	 this.hin = hin;
   }
   void showval()
   {
   	System.out.println(name + " | " + eng + " | " + mat + " | " + hin);
   }	
}
class StudentRun
{
	public static void main(String args[]) 
	{
		Student student[] = new Student[3];
		String t1;
		int t2,t3,t4;	
		Scanner console = new Scanner(System.in);
		for(int i=0;i<=2;i++)
		{
		  System.out.println("Enter name of Student");
         if(i>0) t1=console.nextLine();
         t1=console.nextLine();
          System.out.println("Enter marks in English");
         t2=console.nextInt();
          System.out.println("Enter marks in Hindi");
         t3=console.nextInt();
          System.out.println("Enter marks in Maths");				
         t4=console.nextInt();
         student[i]= new Student();
         student[i].setval(t1,t2,t3,t4);
         student[i].showval();
		}
	}
}