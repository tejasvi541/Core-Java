import javax.swing.*;
import java.awt.*;
public class Swings16 {
	JFrame f;
	Swings16(){
		f=new JFrame();
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b11 = new JButton("1");
		JButton b21= new JButton("2");
		JButton b31= new JButton("3");
		JButton b41= new JButton("4");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b11);
		f.add(b21);
		f.add(b31);
		f.add(b41);
		f.setLayout(new FlowLayout(FlowLayout.RIGHT));
		f.setSize(300,300);
	
		f.setVisible(true);
	}
		public static void main(String args[]) {
			new Swings16();
		}
}
