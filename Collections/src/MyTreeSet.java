import java.util.*;
public class MyTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("YOYO");
		ts.add("YOY");
		ts.add("YO");
		ts.add("Y");
		ts.add("YO");
		ts.add("YOY");
		ts.add("YOYO");
		ts.add("___________");
		System.out.println(ts);
	}

}
//No duplication + sorted.