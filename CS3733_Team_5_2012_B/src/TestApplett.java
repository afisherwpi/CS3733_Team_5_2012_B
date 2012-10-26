import java.applet.Applet;
import java.awt.HeadlessException;
import java.awt.Graphics;


public class TestApplett extends Applet 
{
	
	public void paint(Graphics g)
	{
		g.drawString("Hello", 20, 30);
	}

	public TestApplett() throws HeadlessException 
	{
		// TODO Auto-generated constructor stub
	}

}
