
public class Ex0226_01 extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();
	}

}

class Parent {
	int x = 20;// super로 호출

	Parent() {
		super();
	}
}

class Child extends Parent {
	Child() {
		super();
	}

	String a = "aaa";
	String b = "aaa";

	void method() {
		if (a.equals(b)) {
			System.out.println("aaa똑같습니다.");
		}
	}
//	int x=50;// this로 호출

//	void method() {
//		// 컴파일할때 이케 안보이지만 생긴다요..
////		int x=20;//조상
////		int x=50;//인스턴스
//		int x = 100;
//		System.out.println("local x :" + x);//
//		System.out.println("인스턴스 x :" + this.x);
//		// 같은이름의 변수로 혹은 같은이름의 메소드로 선언되었을때 조상의 것을 사용할거면 super.으로 들고온다리
//		System.out.println("조상 x:" + super.x);
}
