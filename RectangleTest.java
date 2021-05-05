import java.applet.*;
import java.awt.*;

public class RectangleTest extends Applet{
	int x , y, w, h;
	public void init( ){
		x = Integer.parseInt(getParameter ("xvalue"));
		y = Integer.parseInt(getParameter ("yvalue"));
		w = Integer.parseInt(getParameter ("wvalue"));
		h = Integer.parseInt(getParameter ("xvalue"));
	}
	public void paint (Graphics g ){
		g.drawRect (x,y,w,h);
}
}