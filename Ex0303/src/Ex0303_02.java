
public class Ex0303_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.methodA(new B());//* //^
		
	}

}
class A{
//	public void methodA(B b) {//*
//		System.out.println("methodAȣ��");
//		b.methodB();
//	}
	
	
	public void methodA(I i) {
		System.out.println("methodAȣ��");
		i.methodB();
	}
	
	
}
class B implements I{//Ŭ�����̸��� ����� *�� ���� �� �ٲ���Ѵ�. //�������̽��� ���� �� ^�κи� ����
	public void methodB() {
		System.out.println("methodB�� ȣ��Ǿ����ϴ�");
	}
}

interface I{
	public void methodB();
}