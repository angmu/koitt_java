import java.util.Scanner;

public class Ex0225_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Circle c=new Circle();
//		c.draw();
//		//원점 150,30 반지름 200
//		Point p=new Point(150,30);
//		Circle c2=new Circle(p,200);
//		c2.draw();
//		//0,0 반지름 50
//		Point p1=new Point(0,0);
//		Circle c3=new Circle(p1,50);
//		c3.draw();
//		//300,300 반지름 70
//		Point p2=new Point(300,300);
//		Circle c4=new Circle(p,70);
//		c4.draw();

		// (100,100)(200,200)(300,300)
		// 50,60,70 반지름
		// for 문으루
//		Point[]p3= new Point[3];
//		Circle[] c5=new Circle[3];
//		for(int i=0;i<p3.length;i++) {
//			p3[i]=new Point(100*(i+1),100*(i+1));
//			c5[i]=new Circle(p3[i],50+10*i);
//			c5[i].draw();
//		}
//		//객체가 배열에 들어갈수도 있다요 '-'
//		Point[]pp= new Point[] {new Point(100,100),new Point(200,200),new Point(300,300)};
//		int[] r= {50,60,70};
//		Circle[] cc=new Circle[3];
//		for(int i=0;i<cc.length;i++) {
//			cc[i]=new Circle(pp[i],r[i]);
//			cc[i].draw();
//		}
//		
		// 스캔. 좌포 60,50 반지름 총 3개

//		Scanner scan = new Scanner(System.in);
//		Circle[] c = new Circle[3];
//		Point[] pp = new Point[3];
//		int[] num = new int[3];
//		String[] sub= {"x좌표","y좌표","반지름"};
//
//		for (int j = 0; j < c.length; j++) {
//			System.out.println((j+1)+"번째 원 만들기");
//			for (int i = 0; i < num.length; i++) {
//				System.out.println(sub[i]+" 값을 입력하세오");
//				num[i] = scan.nextInt();
//			}
//			pp[j] = new Point(num[0], num[1]);
//			c[j] = new Circle(pp[j], num[2]);
////			c[j].draw();
//		}
		//모두입력받고 출력하려면 드로우를 아래로 뺀다요
//		for (int j = 0; j < c.length; j++) {
//			c[j].draw();
//		}
		
		
		//============================
		//triangle//p318
		
		Triangle t1= new Triangle();
		t1.draw();
		
		//직접입력. 20,20/40,100,/30,10
		
		Point[] p=new Point[]{new Point(20,20),new Point(40,100),new Point(30,10)};
		Triangle t2=new Triangle(p[0],p[1],p[2]);
		t2.draw();
		
		
	}//main

}//클래스

//도형그리기 클래스
class Shape {
	String color = "black";

	void draw() {
		System.out.println("선을 그립니다");
		System.out.println("면의 색상:" + color);
	}
}

//좌표점 클래스
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
		return "(" + "x의 좌표:" + x + ",y의 좌표:" + y + ")";
	}
}

//원형그리기 class
class Circle extends Shape {
	Point center;// Point p
	int r;

	Circle() {// 기본 생성자
		center = new Point(0, 0);// Point p의 참조변수
		r = 100;
	}

	// Circle c1=new Circle(p1,50);
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	void draw() {
		System.out.println("원을 그립니다");
		System.out.println("(" + "원점:" + center.x + "," + center.y + "/반지름 :" + r + "/색상 : " + color + ")");
	}
}

//삼각형그리기
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
		System.out.println("삼각형을 그립니다");
		System.out.println(
				"(좌표 1: " + p[0].getXY() + "/좌표 2: " + p[1].getXY() + "/좌표 3: " + p[2].getXY() + "/색상: " + color + ")");
	}
}