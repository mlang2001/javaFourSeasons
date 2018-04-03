import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
 
public class Scenery extends JPanel
{
 	int season;
 	Rain[] rain;
 	Snow[] snow;
 	Mountain[] mountain;
 	Tree[] tree;
 	Clouds clouds;
 	Background background;
    Bird bird;
 	Color red = new Color(255, 0, 0);
 	/*
 	seasons:
 	0 = winter
 	1 = spring
 	2 = summer
 	3 = fall
 	*/

 	public Scenery()
 	{
 		season = 0;
 		rain = new Rain[100];
 		snow = new Snow[500];
 		mountain = new Mountain[4];
 		tree = new Tree[10];
 		clouds = new Clouds(season);
        bird = new Bird();
 		background = new Background(season);

 		for(int i = 0; i < rain.length; i++)
 		{
 			rain[i] = new Rain();
 		}

 		for(int i = 0; i < snow.length; i++)
 		{
 			snow[i] = new Snow();
 		}
 		
 		for(int i = 0; i < mountain.length; i++)
 		{
 			mountain[i] = new Mountain(season);
 		}

 		for(int i = 0; i < tree.length; i++)
 		{
 			tree[i] = new Tree(season);
 		}
 		
 	}
     
    public Dimension getPreferredSize() 
    {
        //Sets the size of the panel
        return new Dimension(800,600);
    }
 
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Font title = new Font("Impact", Font.BOLD, 50);
	 	g.setFont(title);
        background.drawMe(g);
        if(season == 0 || season == 4)
        {
        	for(int i = 0; i < mountain.length; i++)
 			{
 				mountain[i].drawMe(g);
 			}
 			for(int i = 0; i < tree.length; i++)
	 		{
	 			tree[i].drawMe(g);
	 		}
			for(int i = 0; i < snow.length; i++)
 			{
 				snow[i].drawMe(g);
 			}	
 			clouds.drawMe(g);

	 		g.setColor(red);
	 		g.drawString("Winter", 50, 100);
        }
        else if(season == 1)
        {
        	for(int i = 0; i < mountain.length; i++)
 			{
 				mountain[i].drawMe(g);
 			}
 			for(int i = 0; i < tree.length; i++)
	 		{
	 			tree[i].drawMe(g);
	 		}
			for(int i = 0; i < rain.length; i++)
 			{
 				rain[i].drawMe(g);
 			}
 			clouds.drawMe(g);
 			
	 		g.setColor(red);
	 		g.drawString("Spring", 50, 100);
        } 
        else if(season == 2)
        {
        	for(int i = 0; i < mountain.length; i++)
 			{
 				mountain[i].drawMe(g);
 			}
 			for(int i = 0; i < tree.length; i++)
	 		{
	 			tree[i].drawMe(g);
	 		}

	 		g.setColor(red);
	 		g.drawString("Summer", 50, 100);
        } 
        else if(season == 3)
        {
        	for(int i = 0; i < mountain.length; i++)
 			{
 				mountain[i].drawMe(g);
 			}
 			clouds.drawMe(g);
 			for(int i = 0; i < tree.length; i++)
	 		{
	 			tree[i].drawMe(g);
	 		}
	 		g.setColor(red);
	 		g.drawString("Fall", 50, 100);
        } 
        bird.drawMe(g);
    }
 
    public void animate()
    {
 		int count = 0;
        while(true)
        {
        	for(int i = 0; i < rain.length; i++)
 			{
 				rain[i].move();
 			}
 			
 			for(int i = 0; i < snow.length; i++)
 			{
 				snow[i].move();
 			}

 			count++;
 			if (count == 500)
 			{
 				season++;
 				for(int i = 0; i < tree.length; i++)
		 		{
		 			tree[i].setSeason(season);
		 		}
		 		for(int i = 0; i < mountain.length; i++)
		 		{
		 			mountain[i].setSeason(season);
		 		}
		 		clouds.setSeason(season);
		 		background.setSeason(season);
 				count = 0;
 			}
 			if(season > 3)
 			{
 				season = 0;
 			}
            bird.move();
            //wait for .01 second
            try {
                Thread.sleep(10);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            //repaint the graphics drawn
            repaint();
        }
    }  
}