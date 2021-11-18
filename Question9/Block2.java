import java.awt.Point;

public class Block2{
	private Rectangle[] rectangles = new Rectangle[4];

	public Block2(Point p){
		rectangles[0] = new Rectangle(p);
		rectangles[1] = new Rectangle(new Point(p.x, p.y + Rectangle.HEIGHT));
		rectangles[2] = new Rectangle(new Point(p.x, p.y + 2 *Rectangle.HEIGHT));
		rectangles[3] = new Rectangle(new Point(p.x, p.y + 3 * Rectangle.HEIGHT));
	}
	public Block2(int x, int y){
		this(new Point(x, y));
	}

	public void translate(int x, int y){
		for(int i = 0; i < rectangles.length; i++)
			rectangles[i].translate(x, y);
	}

	public String toString(){
		return rectangles[0] + "\n" + rectangles[1] + "\n" + rectangles[2] + "\n" + rectangles[3];
	}
}