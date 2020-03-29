/*APPLET.CODE=App2.class.Width=600.HEIGHT=100>
  </APPLET>
 */
import java.applet.*;
import java.awt.*;
public class App2 extends Applet {
  String status;
  public void init()
  {
	  status += "Init() called,";
  }
  public void start()
  {
	  status += "Start() called";
  }
  public void stop()
  {
	  status += "Stop() called";
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
