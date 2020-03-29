import java.awt.event.*;

import javax.swing.*;
public class Swings10 {
	Swings10(){
		JFrame f = new JFrame("Checkbox Example");
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400, 100);
		JCheckBox checkbox1 = new JCheckBox("C++");
		checkbox1.setBounds(150, 100, 50, 50);
		JCheckBox checkbox2 = new JCheckBox("Java");
		checkbox2.setBounds(150, 150, 50, 50);
		f.add(checkbox1);
		f.add(checkbox2);
		f.add(label);
		checkbox1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				label.setText("C++ Checkbox: " + (e.getStateChange()==1?"checked":"Unchecked"));
			}
		});
		checkbox2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				label.setText("C++ Checkbox: " + (e.getStateChange()==1?"checked":"Unchecked"));
			}
		});
		f.setSize(450, 450);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Swings10();
	}

}
