import java.awt.*; 
public class Point {
	private int x;
	private int y;
	private Color point_color;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Point(){
		x = 0;
		y = 0;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int new_x){
		x = new_x;
	}
	
	public void setY(int new_y){
		y = new_y;
	}
	
	public void draw(Graphics g){
		g.setColor(point_color);
		g.fillOval(x,y,3,3);
		g.drawString("(" + x + "b, " + y + ")", x, y);
		
	}
	
	public void setColor (Color myColor){
		point_color = myColor;
	}
	
	public boolean isVertical(Point other){
		if (x == other.x){
			return true;
		}
		return false;
	}
	
	public double distance(Point other){
		return Math.sqrt(Math.pow(other.x - x,2) + Math.pow(other.y - y,2));
	}
	
	public void translate(int dx, int dy){
		x += dx;
		y += dy;
	}
	
	public void setLocation(int new_x, int new_y){
		x = new_x;
		y = new_y;
		//set the fields to the parameters
	}
	
	public double distanceFromOrigin(){
		return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
		//determine the distance from the point to the origin
	}
	
	public String toString() {
		return "("+ x + ", " + y + ")";
	}
}