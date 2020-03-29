import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*
 * <APPLET CODE = "AppletKeyboard.class" WIDTH=600 HEIGHT=500
 * </APPLET>
 */
public class TextFieldKeyboardEvent extends Applet implements KeyListener {
	TextField t,tt,tp,tr;
	public void init() {
		t = new TextField(20);
		t.addKeyListener(this);
		tt= new TextField(70);
		tr= new TextField(70);
		tp = new TextField(70);
		add(t);
		add(tt);
		add(tp);
		add(tr);
	}
	public void keyTyped(KeyEvent e) {
		tt.setText("KeyTyped " + e.getKeyChar());
		
	}
	public void keyRealeased(KeyEvent e) {
		tr.setText("Key Realeased " + e.getKeyChar());
	}
	public void keyPressed(KeyEvent e) {
		int kc;
		String s;
		kc=e.getKeyCode();
		s=e.getKeyText(kc);
		tp.setText(s);
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}