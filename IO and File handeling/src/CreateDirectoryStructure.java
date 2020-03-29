import java.io.*;
public class CreateDirectoryStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dname = "E:/mytmp/mydir/mymy";
		File d = new File(dname);
		//d.mkdir(); //path in dname doesnt exist so this will not work
		d.mkdirs();//full path structure will be created automatically.
		
	}

}
