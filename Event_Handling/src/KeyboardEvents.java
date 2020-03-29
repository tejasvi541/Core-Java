import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class KeyboardEvents extends Applet implements KeyListener {
	char ch;
	String str="";
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {
		ch = e.getKeyChar();
		if(ch=='a')
			str = "a for apple";
		else if(ch=='e') 
			str = "e for Elephant";
		else if(ch=='i')
			str = "i for icecream";
		else if(ch=='o')
			str = "o for owl";
		else if(ch=='u')
			str = "u for umbrella";
		else
			str = "Type onle vowels";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(str, 100, 200);
		showStatus("You typed " + ch + "Character");
	}
	
}
