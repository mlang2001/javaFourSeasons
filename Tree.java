import java.awt.Color;
import java.awt.Graphics;

public class Tree
{
	int x, season;
	int branches[], xArray[], yArray[];
	Color green, brown, orange;
	public Tree(int season)
	{
		x = (int)(Math.random() * 799);
		xArray = new int[4];
		yArray = new int[4];
		green = new Color(0, 155, 0);
		orange = new Color(235, 140, 0);
		brown = new Color(130, 100, 80);
		this.season = season;
	}
	public void setSeason(int season)
	{
		this.season = season;
	}
	public void drawMe(Graphics g)
	{
		g.setColor(brown);
		g.fillRect(x, 500, 15, 50);

		if (season == 0 || season == 4)
		{
			xArray[0] = x - 12;
	        yArray[0] = 505;	 
	        //Point 2
	        xArray[1] = x - 10;
	        yArray[1] = 510;
	        //Point 3
	        xArray[2] = x;
	        yArray[2] = 505;
	        //Point 4
	        xArray[3] = x + 2;
	        yArray[3] = 500;

	        g.fillPolygon(xArray, yArray, 4);


	        xArray[0] = x;
	        yArray[0] = 500;
	        //Point 2
	        xArray[1] = x - 2;
	        yArray[1] = 485;	 
	        //Point 3
	        xArray[2] = x + 3;
	        yArray[2] = 482;
	        //Point 4
	        xArray[3] = x + 5;
	        yArray[3] = 500;

	        g.fillPolygon(xArray, yArray, 4);


	        xArray[0] = x + 8;
	        yArray[0] = 500;
	        //Point 2
	        xArray[1] = x + 12;
	        yArray[1] = 490;	 
	        //Point 3
	        xArray[2] = x + 15;
	        yArray[2] = 491;
	        //Point 4
	        xArray[3] = x + 12;
	        yArray[3] = 500;

	        g.fillPolygon(xArray, yArray, 4);


	        xArray[0] = x + 14;
	        yArray[0] = 500;
	        //Point 2
	        xArray[1] = x + 18;
	        yArray[1] = 487;	 
	        //Point 3
	        xArray[2] = x + 20;
	        yArray[2] = 490;
	        //Point 4
	        xArray[3] = x + 15;
	        yArray[3] = 505;

	        g.fillPolygon(xArray, yArray, 4);


	        xArray[0] = x + 15;
	        yArray[0] = 500;
	        //Point 2
	        xArray[1] = x + 23;
	        yArray[1] = 493;	 
	        //Point 3
	        xArray[2] = x + 25;
	        yArray[2] = 495;
	        //Point 4
	        xArray[3] = x + 15;
	        yArray[3] = 505;

	        g.fillPolygon(xArray, yArray, 4);
		}
		else if (season == 1)
		{
			g.setColor(green);
			g.fillOval(x - 15, 500, 20, 20);
			g.fillOval(x - 10, 480, 30, 35);
			g.fillOval(x + 10, 500, 20, 20);
			g.fillOval(x + 10, 490, 20, 20);				
		}
		else if (season == 2)
		{
			g.setColor(green);
			g.fillOval(x - 15, 500, 20, 20);
			g.fillOval(x - 10, 480, 30, 35);
			g.fillOval(x + 10, 500, 20, 20);
			g.fillOval(x + 10, 490, 20, 20);
		}
		else if (season == 3)
		{
			g.setColor(orange);
			g.fillOval(x - 15, 500, 20, 20);
			g.fillOval(x - 10, 480, 30, 35);
			g.fillOval(x + 10, 500, 20, 20);
			g.fillOval(x + 10, 490, 20, 20);
		}
	}
}