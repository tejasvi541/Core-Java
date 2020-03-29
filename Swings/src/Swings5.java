import java.awt.event.*;
import javax.swing.*;
public class Swings5 {
	Swings5(){
		JLabel  l1,l2;
		JFrame f = new JFrame("Button Example");
		JButton b = new JButton (new ImageIcon("e:\\button.png"));
		b.setBounds(200, 100, 250, 77);
		l1 = new JLabel("First Label");
		l1.setBounds(50, 50, 100, 30);
		l2= new JLabel("Second Label");
		l2.setBounds(50, 100, 100, 30);
		f.add(b);
		f.add(l1);
		f.add(l2);
		f.setSize(600, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swings5();
	}

}
