import java.util.*;
class Person
{
	String name;
	String dob;
	int age;
}
class Student extends Person
{
	String clgname, course;
	int year, rollno;
	
	void setval1(String name,int age, String dob,String clgname,String course, int year, int rollno)
	{
    this.name =name;
    this.age =age;
    this.dob =dob;
    this.clgname =clgname;
    this.course =course;
    this.year =year;
    this.rollno =rollno;
	}
	void show()
	{
		System.out.println("Info of student are " + name + " | " + age + " | " + dob + " | " + clgname + " | " + course + " | " + year + " | " + rollno);
	}
}
class Professional extends Person
{
	String companyname;
	int salary, yearofwork;

}
class Salaried extends Professional
{
	String position;
	int tax;
	void setval2(String name,int age, String dob,String companyname,int salary,int yearofwork,String position,int tax)
	{
    this.name =name;
    this.age =age;
    this.dob =dob;
    this.companyname =companyname;
    this.salary =salary;
    this.yearofwork =yearofwork;
    this.position =position;
    this.tax =tax;
	}
	void show2()
	{
		System.out.println("Info of Salaried person are " + name + " | " + age + " | " + dob + " | " + companyname + " | " + salary + " | " + yearofwork + " | " + position + " | " + tax);
	}
	
}
class SelfEmployed extends Professional
{
	
	int annualturnover, numofworkers;

	 void setval3(String name,int age, String dob,String companyname,int salary,int yearofwork,int annualturnover,int numofworkers)
	 {
	 this.name =name;
     this.age =age;
     this.dob =dob;
     this.companyname =companyname;
     this.salary =salary;
     this.yearofwork =yearofwork;
     this.annualturnover =annualturnover;
     this.numofworkers =numofworkers;	
	 }
	 void show3()
	 {
	 	System.out.println("Info of Salaried person are " + name + " | " + age + " | " + dob + " | " + companyname + " | " + salary + " | " + yearofwork + " | " + annualturnover + " | " + numofworkers);
	 }
}

class PersonData
{
   public static void main(String[] args) {
   	String name,dob,clgname,course,companyname,position;
   	int age,year,rollno,salary,yearofwork,tax,annualturnover,numofworkers;
   
	Student obj1 = new Student();
   	System.out.print("\nEnter info of Student\n__________________ \n");
   	Scanner console = new Scanner(System.in);
   	System.out.println("Name");
   	name=console.nextLine();
   	System.out.println("Enter age");
   	age=console.nextInt();
   	console.nextLine();
   	dob=console.nextLine();
   	clgname=console.nextLine();
   	course=console.nextLine();
   	year=console.nextInt();
   	rollno=console.nextInt();
   	System.out.println("Course is: " +  clgname);
   	obj1.setval1(name,age,dob,clgname,course,year,rollno);
   	obj1.show();

    System.out.print("\nEnter info of Salaried\n__________________ \n");
   	Salaried obj2 = new Salaried();
   	console.nextLine();
   	name=console.nextLine();
   	age=console.nextInt();
   	 console.nextLine();
   	dob=console.nextLine();
   	companyname=console.nextLine();
    salary=console.nextInt();
    yearofwork=console.nextInt();
     console.nextLine();
    position=console.nextLine();
     console.nextLine();
    tax=console.nextInt();
    obj2.setval2(name,age,dob,companyname,salary,yearofwork,position,tax);
    obj2.show2();

    System.out.print("\nEnter info of SelfEmployed\n__________________ \n");
    SelfEmployed obj3 = new SelfEmployed();
    console.nextLine();
   	name=console.nextLine();
   	age=console.nextInt();
   	 console.nextLine();
   	dob=console.nextLine();
   	companyname=console.nextLine();
    salary=console.nextInt();
    yearofwork=console.nextInt();
    annualturnover=console.nextInt();
    numofworkers=console.nextInt();
    obj3.setval3(name,age,dob,companyname,salary,yearofwork,annualturnover,numofworkers);
    obj3.show3();
     

  }
}