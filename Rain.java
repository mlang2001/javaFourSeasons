import java.awt.Color;
import java.awt.Graphics;

public class Rain
{
	int x, y;
	Color blue;

	public Rain()
	{
		x = (int)(Math.random() * 799);
		y = (int)(Math.random() * 596);
		blue = new Color(0, 0, 200);
	}
	public void drawMe(Graphics g)
	{
		g.setColor(blue);
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