   import java.awt.*;  // to use Graphics, Color
	// Rememeber you need to have DrawingPanel.java compiled in your directory

   public class PointTest {
      public static void main(String[] args) {
		
		   DrawingPanel p = new DrawingPanel(300, 200);
         Graphics g = p.getGraphics();
			
        	// create two Point objects
         Point p1 = new Point(50,30);
			
         Point p2 = new Point(20,80);
			p2.setColor(Color.BLUE);
      	
			// plot those two points with a connecting line & test them
			//g.drawLine(p1.x, p1.y, p2.x, p2.y); 
			p1.draw(g);
			p2.draw(g);
		  	System.out.println("Distance Between p1 & p2 is: " + p1.distance(p2));
		  	System.out.println("Are p1 and p2 Vertical? " + p1.isVertical(p2));
			System.out.println();
			
			// Now shift p2 by 30, 20 and change its color to green
			p2.translate(30, 20);
			p2.setColor(Color.GREEN);
			
			// Now plot those two points again & test them
			//g.drawLine(p1.x, p1.y, p2.x, p2.y); 
			p2.draw(g);
		  	System.out.println("Now the Distance Between p1 & p2 is: " + p1.distance(p2));
		  	System.out.println("Now are p1 and p2 Vertical? " + p1.isVertical(p2));
			
      }
   	     
   }
