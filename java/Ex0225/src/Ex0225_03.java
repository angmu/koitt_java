
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
		System.out.println("���� ��ĥ�ϱ� ����" + color);
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
		return "x��ǥ:" + x + "y��ǥ" + y;
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
		System.out.println("���� �׸��ϴ�.");
		System.out.println("x��ǥ:" + p1.x + "y��ǥ" + p1.y + "������" + r);
	}

//	class Triangle extends shape1 {
//		Point p1, Point p2, Point p3
//		p = new Point[] { p1, p2, p3 };
//
//		void draw() {
//			System.out.println("�ﰢ���� �׸��ϴ�");
//			System.out.println(
//					"(��ǥ 1: " + p[0].getXY() + "/��ǥ 2: " + p[1].getXY() + "/��ǥ 3: " + p[2].getXY() + "/����: " + color + ")");
//		}

//	}
}