import java.awt.Color;
import java.awt.Graphics;

public class Clouds
{
	int season, x;
	Color gray, darkGray;
	public Clouds(int season)
	{
		this.season = season;
		x = 0;
		gray = new Color(150, 150, 150);
		darkGray = new Color(100, 100, 100);
	}
	public void setSeason(int season)
	{
		this.season = season;
	}
	public void drawMe(Graphics g)
	{
		if (season == 0 || season == 4)
		{
			g.setColor(darkGray);
			for (int i = -5; i < 10; i++)
			{
				g.fillOval(x, -10, 40, 50);
				g.fillOval(x + 15, -5, 70, 60);
				g.fillOval(x + 65, -10, 50, 50);
				x = i * 80;
			}
		}
		else if (season == 1)
		{
			g.setColor(gray);
			for (int i = -5; i < 5; i++)
			{
				g.fillOval(x, -10, 40, 50);
				g.fillOval(x + 15, -5, 70, 60);
				g.fillOval(x + 65, -10, 50, 50);
				x = i * 150;
			}
		}
		else if (season == 3)
		{
			g.setColor(gray);
			for (int i = -5; i < 5; i++)
			{
				g.fillOval(x, -10, 40, 50);
				g.fillOval(x + 15, -5, 70, 60);
				g.fillOval(x + 65, -10, 50, 50);
				x = i * 150;
			}
		}
	}

}