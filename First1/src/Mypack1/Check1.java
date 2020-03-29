package Mypack1;
import java.util.*;
class check2{
	void show(String x) {
		System.out.println("My name is: " + x);
	}
}
public class Check1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String str = console.nextLine();
		check2 obj = new check2();
		obj.show(str);
	}

}
