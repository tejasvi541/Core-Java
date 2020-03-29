import javax.swing.*;
public class Swings1 {

	public static void main(String[] args) {
		// \
		JFrame f = new JFrame();//creating instance of JFrame.
		
		JButton b = new JButton("Click Here"); // creating instance of click button.
		b.setBounds(12, 10, 100000, 20); // x axis, y axis ,width,height.
	
		f.add(b); //adding button to JFrame.
		
		f.setSize(400, 500);// width and height
		f.setLayout(null);
		f.setVisible(true);//making frame visible
		}

}
