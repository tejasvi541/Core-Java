/*APPLET.CODE=App3.class.Width=600.HEIGHT=100>
  </APPLET>
 */
import java.applet.*;
import java.awt.*;
public class App3 extends Applet {
  String status;
  public void init()
  {
	  setBackground(Color.blue);
	  setForeground(Color.yellow);
  }
  
  public void stop()
  {
	  setBackground(Color.yellow);
	  setForeground(Color.blue);
	  }
  public void paint(Graphics g)
  {
	  status += "Paint() Called";
	  g.drawString(status, 100, 100);
  }
  public void destory()
  {
	  System.out.println("Destroy method called");
  }
}

