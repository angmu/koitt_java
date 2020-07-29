
public class Ex0225_03 {
	public static void main(String[] args) {
		
//		Circle1 c=new Circle1(50,100);
//		Point1 p=new Point1(p,200);
//	Circle1 c=new Circle1();
//	Point1 p=new Point1();
//	p.x=50;
//	p.y=100;
//	c.p1=p;
//	c.r=200;
//	c.draw();
	}
}

class shape1 {
	String color = "pink";

	void draw() {
		System.out.println("µµ¸é »öÄ¥ÇÏ±â »ö»ó" + color);
	}

}

class Point1 {
	int x;
	int y;

	Point1() {
		this(50, 100);
//		x=50;
//		y=100;
	}

	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getXY() {
		return "xÁÂÇ¥:" + x + "yÁÂÇ¥" + y;
	}
}

class Circle1 extends shape1 {
	Point1 p1;
	int r;

	Circle1() {
		this(new Point1(), 200);
	}

	Circle1(Point1 p1, int r) {
		p1 = new Point1();
		this.r = r;
	}

	void draw() {
		System.out.println("¿øÀ» ±×¸³´Ï´Ù.");
		System.out.println("xÁÂÇ¥:" + p1.x + "yÁÂÇ¥" + p1.y + "¹ÝÁö¸§" + r);
	}

//	class Triangle extends shape1 {
//		Point p1, Point p2, Point p3
//		p = new Point[] { p1, p2, p3 };
//
//		void draw() {
//			System.out.println("»ï°¢ÇüÀ» ±×¸³´Ï´Ù");
//			System.out.println(
//					"(ÁÂÇ¥ 1: " + p[0].getXY() + "/ÁÂÇ¥ 2: " + p[1].getXY() + "/ÁÂÇ¥ 3: " + p[2].getXY() + "/»ö»ó: " + color + ")");
//		}

//	}
}