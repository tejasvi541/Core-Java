/*APPLET.CODE=App4.class.Width=600.HEIGHT=100>
  <PARAM NAME = message VALUE = "Parameters Passed in Applet">
  <PARAM NAME = owner VALUE = "YOYOYOYOYYO">
  </APPLET>
 */
import java.applet.*;
import java.awt.*;
public class App4 extends Applet {
  String par;
  public void init()
  {
	 par = getParameter("message");
  }
  
  public void paint(Graphics g)
  {
	
	  g.drawString(par, 100, 100);
	  g.drawString(getParameter("owner"), 100, 100);
  }
}


