import java.util.Scanner;

public class Ex0225_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Circle c=new Circle();
//		c.draw();
//		//���� 150,30 ������ 200
//		Point p=new Point(150,30);
//		Circle c2=new Circle(p,200);
//		c2.draw();
//		//0,0 ������ 50
//		Point p1=new Point(0,0);
//		Circle c3=new Circle(p1,50);
//		c3.draw();
//		//300,300 ������ 70
//		Point p2=new Point(300,300);
//		Circle c4=new Circle(p,70);
//		c4.draw();

		// (100,100)(200,200)(300,300)
		// 50,60,70 ������
		// for ������
//		Point[]p3= new Point[3];
//		Circle[] c5=new Circle[3];
//		for(int i=0;i<p3.length;i++) {
//			p3[i]=new Point(100*(i+1),100*(i+1));
//			c5[i]=new Circle(p3[i],50+10*i);
//			c5[i].draw();
//		}
//		//��ü�� �迭�� ������ �ִٿ� '-'
//		Point[]pp= new Point[] {new Point(100,100),new Point(200,200),new Point(300,300)};
//		int[] r= {50,60,70};
//		Circle[] cc=new Circle[3];
//		for(int i=0;i<cc.length;i++) {
//			cc[i]=new Circle(pp[i],r[i]);
//			cc[i].draw();
//		}
//		
		// ��ĵ. ���� 60,50 ������ �� 3��

//		Scanner scan = new Scanner(System.in);
//		Circle[] c = new Circle[3];
//		Point[] pp = new Point[3];
//		int[] num = new int[3];
//		String[] sub= {"x��ǥ","y��ǥ","������"};
//
//		for (int j = 0; j < c.length; j++) {
//			System.out.println((j+1)+"��° �� �����");
//			for (int i = 0; i < num.length; i++) {
//				System.out.println(sub[i]+" ���� �Է��ϼ���");
//				num[i] = scan.nextInt();
//			}
//			pp[j] = new Point(num[0], num[1]);
//			c[j] = new Circle(pp[j], num[2]);
////			c[j].draw();
//		}
		//����Է¹ް� ����Ϸ��� ��ο츦 �Ʒ��� ���ٿ�
//		for (int j = 0; j < c.length; j++) {
//			c[j].draw();
//		}
		
		
		//============================
		//triangle//p318
		
		Triangle t1= new Triangle();
		t1.draw();
		
		//�����Է�. 20,20/40,100,/30,10
		
		Point[] p=new Point[]{new Point(20,20),new Point(40,100),new Point(30,10)};
		Triangle t2=new Triangle(p[0],p[1],p[2]);
		t2.draw();
		
		
	}//main

}//Ŭ����

//�����׸��� Ŭ����
class Shape {
	String color = "black";

	void draw() {
		System.out.println("���� �׸��ϴ�");
		System.out.println("���� ����:" + color);
	}
}

//��ǥ�� Ŭ����
class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
//		x=0;
//		y=0;
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getXY() {
		return "(" + "x�� ��ǥ:" + x + ",y�� ��ǥ:" + y + ")";
	}
}

//�����׸��� class
class Circle extends Shape {
	Point center;// Point p
	int r;

	Circle() {// �⺻ ������
		center = new Point(0, 0);// Point p�� ��������
		r = 100;
	}

	// Circle c1=new Circle(p1,50);
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	void draw() {
		System.out.println("���� �׸��ϴ�");
		System.out.println("(" + "����:" + center.x + "," + center.y + "/������ :" + r + "/���� : " + color + ")");
	}
}

//�ﰢ���׸���
class Triangle extends Shape {
	Point[] p = new Point[3];

	Triangle() {
		this(new Point(0, 0), new Point(100, 0), new Point(0, 100));
//		p[0]=new Point(0,0);
//		p[1]=new Point(100,0);
//		p[2]=new Point(0,100);
//		p[0].x=0;
//		p[0].y=0;

	}

	Triangle(Point[] p) {
		this.p = p;
	}

	Triangle(Point p1, Point p2, Point p3) {
		p = new Point[] { p1, p2, p3 };
	}

	void draw() {
		System.out.println("�ﰢ���� �׸��ϴ�");
		System.out.println(
				"(��ǥ 1: " + p[0].getXY() + "/��ǥ 2: " + p[1].getXY() + "/��ǥ 3: " + p[2].getXY() + "/����: " + color + ")");
	}
}