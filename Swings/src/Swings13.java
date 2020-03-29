import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Swings13 {
	JFrame f;
	Swings13(){
		f = new JFrame("ComboBox example");
		final JLabel label = new JLabel();
			label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400,100);
		JButton b =new JButton("Show");
		b.setBounds(200,100,75,20);
		String languages[] = {"C","C++","C#","Java","PHP"};
		final JComboBox cb = new JComboBox(languages);
		cb.setBounds(50,100,90,20);
		f.add(cb);
		f.add(b);
		f.add(label);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,400);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e ) {
				
				String data= "Programming language selected: "+ cb.getItemAt(cb.getSelectedIndex());
				label.setText(data);
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swings13();
	}

}
