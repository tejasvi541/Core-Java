import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Swings12 extends JFrame implements ActionListener {
	JRadioButton rb1,rb2;
	JButton b ;
	Swings12(){
		rb1 = new JRadioButton("Male");
		rb1.setBounds(100,50,100,40);
		rb2 = new JRadioButton("Female");
		rb2.setBounds(100,100,100,30);
		ButtonGroup bg = new ButtonGroup ();
		bg.add(rb1);
		bg.add(rb2);
		add(b);
		setSize(300,300);
		setVisible(true);
		setLayout(null);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(rb1.isSelected()) {
			JOptionPane.showMessageDialog(this, "You are male");
		}
		if(rb2.isSelected()) {
			JOptionPane.showMessageDialog(this, "You are Female");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swings12();
	}

}
