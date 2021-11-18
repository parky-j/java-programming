import java.awt.Point;

public class test{
	public static void main(String[] args){
		Block1 b1 = new Block1(0, 0);
		System.out.println(b1);

		b1.translate(10,10);
		System.out.println(b1);
	}
}