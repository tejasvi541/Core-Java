import javax.swing.*;
public class Swings2 {
	JFrame f;
	Swings2(){
		f = new JFrame();
		JButton b = new JButton ("click");
		b.setBounds(20, 10, 100, 20);
		f.add(b);
		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
			new Swings2();
	}

}
