import java.awt.Color;
import java.awt.Graphics;

public class Bird
{
	int x, y, speedX, speedY;
	int[] xArray, yArray;
	Color blue, yellow;

	public Bird()
	{
		x = 100;
		y = 100;
		xArray = new int[3];
		yArray = new int[3];
		speedX = (int)(Math.random() * 3 + 1);
		speedY = (int)(Math.random() * 3 + 1);
		blue = new Color(0, 0, 200);
		yellow = new Color(255, 140, 0);
	}
	public void drawMe(Graphics g)
	{
		if (speedX > 0)
		{
			g.setColor(blue);
			g.fillOval(x, y, 30, 10);

			//top wing
			//Point 1
			xArray[0] = x + 13;
	        yArray[0] = y + 9;
	 
	        //Point 2
	        xArray[1] = x + 23;
	        yArray[1] = y + 9;
	 
	        //Point 3
	        xArray[2] = x + 15;
	        yArray[2] = y + 20;

	        g.fillPolygon(xArray, yArray, 3);

	        //bottom wing
	        //Point 1
	        xArray[0] = x + 13;
	        yArray[0] = y + 1;
	 
	        //Point 2
	        xArray[1] = x + 22;
	        yArray[1] = y + 1;
	 
	        //Point 3
	        xArray[2] = x + 15;
	        yArray[2] = y - 10;

	        g.fillPolygon(xArray, yArray, 3);

	        //tail
	        //Point 1
	        xArray[0] = x - 5;
	        yArray[0] = y - 2;
	 
	        //Point 2
	        xArray[1] = x + 4;
	        yArray[1] = y + 5;
	 
	        //Point 3
	        xArray[2] = x - 5;
	        yArray[2] = y + 12;

	        g.fillPolygon(xArray, yArray, 3);

	        //beak
	        //Point 1
	        xArray[0] = x + 34;
	        yArray[0] = y + 5;
	 
	        //Point 2
	        xArray[1] = x + 34;
	        yArray[1] = y + 9;
	 
	        //Point 3
	        xArray[2] = x + 39;
	        yArray[2] = y + 7;

	        g.setColor(yellow);

	        g.fillPolygon(xArray, yArray, 3);

	        g.setColor(blue);

	        g.fillOval(x + 26, y, 9, 9);
		}
		else
		{
			g.setColor(blue);
			g.fillOval(x, y, 30, 10);

			//top wing
			//Point 1
			xArray[0] = x + 7;
	        yArray[0] = y + 9;
	 
	        //Point 2
	        xArray[1] = x + 16;
	        yArray[1] = y + 9;
	 
	        //Point 3
	        xArray[2] = x + 14;
	        yArray[2] = y + 20;

	        g.fillPolygon(xArray, yArray, 3);

	        //bottom wing
	        //Point 1
	        xArray[0] = x + 7;
	        yArray[0] = y + 1;
	 
	        //Point 2
	        xArray[1] = x + 16;
	        yArray[1] = y + 1;
	 
	        //Point 3
	        xArray[2] = x + 14;
	        yArray[2] = y - 10;

	        g.fillPolygon(xArray, yArray, 3);

	        //tail
	        //Point 1
	        xArray[0] = x + 35;
	        yArray[0] = y - 2;
	 
	        //Point 2
	        xArray[1] = x + 26;
	        yArray[1] = y + 5;
	 
	        //Point 3
	        xArray[2] = x + 35;
	        yArray[2] = y + 12;

	        g.fillPolygon(xArray, yArray, 3);

	        //beak
	        //Point 1
	        xArray[0] = x - 6;
	        yArray[0] = y + 5;
	 
	        //Point 2
	        xArray[1] = x - 6;
	        yArray[1] = y + 9;
	 
	        //Point 3
	        xArray[2] = x - 11;
	        yArray[2] = y + 7;

	        g.setColor(yellow);

	        g.fillPolygon(xArray, yArray, 3);

	        g.setColor(blue);

	        g.fillOval(x - 7, y, 9, 9);
		}
		
	}
	public void move() {
	    x = x + speedX ;
	    y = y + speedY ;

	    if (y > 500 || y < 0) {
	        if (speedY > 0) 
	        {
	            speedY = -(int)(Math.random() * 3 + 1);
	        } 
	        else 
	        {
	            speedY = (int)(Math.random() * 3 + 1);
	        }
	    }
	    if (x > 800 || x < 0) {
	        if (speedX > 0) 
	        {
	            speedX = -(int)(Math.random() * 3 + 1);
	            speedY = (int)(Math.random() * 3 + 1);
	        } 
	        else 
	        {
	            speedX = (int)(Math.random() * 3 + 1);
	            speedY = -(int)(Math.random() * 3 + 1);
	        }
	    }
	}
}