
public class Ex0228_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1=new Child1();
		Parent1 p1=new Parent1();
		Parent1 p2=new Child1();//다형성
		
		System.out.println("Parent의 객체. 참조변수 값 : "+p1.getX());
		p1.method();
		System.out.println("Parent의 메소드. 참조변수 값 : "+p1.getX());
		System.out.println("===============================");
		System.out.println("Child의 객체. 참조변수 값 : "+c1.getX());
		c1.method();
		System.out.println("Child의 객체. 참조변수 값 : "+c1.getX());
		System.out.println("===============================");
		System.out.println("p2의 객체. 참조변수 값 : "+p2.getX());
		p2.method();
		System.out.println("p2의 객체. 참조변수 값 : "+p2.getX());
				
		
		//private으로 고치기 전)
		
//		Parent의 객체. 참조변수 값 : 100
//		부모클래스의 메소드입니다
//		Parent의 메소드. 참조변수 값 : 100
//		===============================
//		Child의 객체. 참조변수 값 : 200
//		자손클래스의 메소드입니다.
//		Child의 객체. 참조변수 값 : 200
//		===============================
//		p2의 객체. 참조변수 값 : 100 //자손꺼
//		부모클래스의 메소드입니다.//부모꺼
//		p2의 객체. 참조변수 값 : 100

	}

}

class Parent1{
	private int x=100;
	void method() {
		System.out.println("부모클래스의 메소드입니다");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}

class Child1 extends Parent1{
	private int x=200;
	void method() {//오버라이딩
		System.out.println("자손클래스의 메소드입니다.");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	void method(int x) {//오버로딩
		System.out.println("자손클래스의 메소드2입니다.");
	}
}