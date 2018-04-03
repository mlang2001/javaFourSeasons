import java.awt.Color;
import java.awt.Graphics;

public class Background
{
	int season;
	Color white, green, orange, blue, gray, yellow, lightBlue;
	public Background(int season)
	{
		this.season = season;
		white = new Color(230,230,230);
		green = new Color(0, 155, 0);
		orange = new Color(235, 140, 0);
		blue = new Color(80, 170, 255);
		lightBlue = new Color(190, 210, 230);
		gray = new Color(210, 210, 210);
		yellow = new Color(255, 255, 100);
	}
	public void setSeason(int season)
	{
		this.season = season;
	}
	public void drawMe(Graphics g)
	{
		if (season == 0 || season == 4)
		{
			g.setColor(gray);
			g.fillRect(0, 0, 800, 600);
			g.setColor(white);
			g.fillRect(0, 550, 800, 50);
		}
		else if (season == 1)
		{
			g.setColor(blue);
			g.fillRect(0, 0, 800, 600);
			g.setColor(green);
			g.fillRect(0, 550, 800, 50);
		}
		else if (season == 2)
		{
			g.setColor(blue);
			g.fillRect(0, 0, 800, 600);
			g.setColor(green);
			g.fillRect(0, 550, 800, 50);
			g.setColor(yellow);
			g.fillOval(750, -10, 70, 70);
		}
		else if (season == 3)
		{
			g.setColor(lightBlue);
			g.fillRect(0, 0, 800, 600);
			g.setColor(orange);
			g.fillRect(0, 550, 800, 50);
		}
	}

}