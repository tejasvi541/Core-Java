import java.util.*;
public class MyVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("A");
		v.add("B");
		v.add(1,"E");//Insert element at specific index
		System.out.println(v);
		
		int cap = v.capacity();
		System.out.println("Vector Capacity: " + cap);//10 is default
		
		Vector v1 = new Vector(100);//Setting initial capacity to avoid resizing when you knw eexpected count of elements.
		System.out.println("Vector capacity: " +v1.capacity());
		
		System.out.println("Vector contains Z ? " + v.contains("Z"));
		
		System.out.println("Element at 1 = " + v.elementAt(1));
		
		Vector<Integer> v2 = new Vector<Integer>();
		for(int i = 0 ; i<11;i++) {
			System.out.println(i);
			v2.add(new Integer(i+1));
			
		}
		v2.insertElementAt(new Integer(20), 2);
		for(int i = 0; i <v2.size();i++) {
			System.out.println(v2.get(i));
		}
	//We can also use it through list insted of vector
		java.util.List<Integer> v3= new Vector<Integer>();
		// Benifit is that now if we change vector to array list as below , it doesnt need any change in further code.
		//java.util.List<Integer> v3 = new java.util.ArrayList();
		v3.add(0, new Integer(25));
		System.out.println(v3.get(0));
		
	}

}
