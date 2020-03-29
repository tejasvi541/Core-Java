import javax.swing.*;
public class Swings3 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Swings3(){
		JButton b = new JButton ("click");
		b.setBounds(20, 10, 100, 20);
		add(b);
		setSize(400, 500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Swings3();
	}

}
