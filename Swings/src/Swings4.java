import javax.swing.*;
import java.awt.event.*;
public class Swings4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Button Example");
		final JTextField tf = new JTextField();
		tf.setBounds(50,100,95,30);
		JButton b = new JButton("Click Here");
		b.setBounds(50,100,95,30);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tf.setText("Welcome here to my workplace");}
		});
		f.add(b);
		f.add(tf);
		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
	}

}
