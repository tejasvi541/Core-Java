package PackageB;
import PackageBTest.*;


/*class B extends BTest {
	void updateData()
	{
		//super.a=22;
		super.b=33;
		super.c=11;
		super.d=202;
	}
}*/

public class BClass {

	public static void main(String[] args) {
		BTest obj1 = new BTest();
		obj1.setval();
		obj1.showData();
		//obj1.a=50; // This will show error as we cannot 
		obj1.b=50;
		//obj1.c=30;
		//obj1.d=33;
		obj1.showData();
		//B obj2 = new B();
		//obj2.updateData();
		//obj2.showData();
	}
}
