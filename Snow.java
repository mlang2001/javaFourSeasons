import java.awt.Color;
import java.awt.Graphics;

public class Snow
{
	int x, y;
	Color white;

	public Snow()
	{
		x = (int)(Math.random() * 799);
		y = (int)(Math.random() * 596);
		white = new Color(230,230,230);
	}
	public void drawMe(Graphics g)
	{
		g.setColor(white);
		g.fillRect(x, y, 2, 5);
	}
	public void move()
	{
		y++;
		if(y > 600)
		{
			y = -5;
			x = (int)(Math.random() * 799);
		}
	}
}