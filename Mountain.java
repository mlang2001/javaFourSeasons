import java.awt.Color;
import java.awt.Graphics;

public class Mountain
{
	int x, season;
	Color gray, white;
	int[] xArray; 
	int[] yArray;

	public Mountain(int season)
	{
		x = (int)(Math.random() * 599);
		this.season = season;

		xArray = new int[3];
        yArray = new int[3];

		gray = new Color(100, 100, 100);
		white = new Color(255, 255, 255);
	}
	public void setSeason(int season)
	{
		this.season = season;
	}
	public void drawMe(Graphics g)
	{
		//Point 1
        xArray[0] = x + 200;
        yArray[0] = 200;
 
        //Point 2
        xArray[1] = x;
        yArray[1] = 550;
 
        //Point 3
        xArray[2] = x + 400;
        yArray[2] = 550;

        g.setColor(gray);
 
        g.fillPolygon(xArray, yArray, 3);

		if (season == 0 || season == 4)
		{
			xArray[0] = x + 200;
	        yArray[0] = 200;
	 
	        //Point 2
	        xArray[1] = x + 142;
	        yArray[1] = 300;
	 
	        //Point 3
	        xArray[2] = x + 258;
	        yArray[2] = 300;

	        g.setColor(white);
	 
	        g.fillPolygon(xArray, yArray, 3);
		} 
		else
		{

		}  
	}
}