
public class Ex0303_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.methodA(new B());//* //^
		
	}

}
class A{
//	public void methodA(B b) {//*
//		System.out.println("methodA호출");
//		b.methodB();
//	}
	
	
	public void methodA(I i) {
		System.out.println("methodA호출");
		i.methodB();
	}
	
	
}
class B implements I{//클래스이름을 변경시 *된 것을 다 바꿔야한다. //인터페이스로 받을 시 ^부분만 변경
	public void methodB() {
		System.out.println("methodB가 호출되었습니다");
	}
}

interface I{
	public void methodB();
}