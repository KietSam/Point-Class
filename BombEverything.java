import java.awt.*;
import java.util.*;
import java.io.*;
public class BombEverything {
	public static void main (String[]args) throws FileNotFoundException{
		DrawingPanel p = new DrawingPanel(200, 200);
      Graphics g = p.getGraphics();
		Scanner input = new Scanner(new File("cities.txt"));
		Scanner console = new Scanner(System.in);
		int numCities = input.nextInt();
		Point[] cities = new Point[numCities];
		for (int x = 0; x < cities.length; x++){
			int xValue = input.nextInt();
			int yValue = input.nextInt();
			cities[x] = new Point(xValue,yValue);
			cities[x].draw(g);
		}
		System.out.print("Blast site x? ");
		int xBlast = console.nextInt();
		System.out.print("Blast site y? ");
		int yBlast = console.nextInt();
		System.out.print("Blast radius? ");
		int radius = console.nextInt();
		System.out.print("Kaboom!");
		g.drawOval(xBlast-radius,yBlast-radius,radius*2,radius*2);
		for (int x = 0; x < cities.length; x++){
			if (cities[x].getX() <= (xBlast+radius) && cities[x].getX() >= (xBlast-radius) && cities[x].getY() <= (yBlast+radius) && cities[x].getY() >= (xBlast-radius)){
				cities[x].setColor(Color.RED);
				cities[x].draw(g);
			}
		}
	}
}