
public class Ex0226_01 extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();
	}

}

class Parent {
	int x = 20;// super�� ȣ��

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
			System.out.println("aaa�Ȱ����ϴ�.");
		}
	}
//	int x=50;// this�� ȣ��

//	void method() {
//		// �������Ҷ� ���� �Ⱥ������� ����ٿ�..
////		int x=20;//����
////		int x=50;//�ν��Ͻ�
//		int x = 100;
//		System.out.println("local x :" + x);//
//		System.out.println("�ν��Ͻ� x :" + this.x);
//		// �����̸��� ������ Ȥ�� �����̸��� �޼ҵ�� ����Ǿ����� ������ ���� ����ҰŸ� super.���� ���´ٸ�
//		System.out.println("���� x:" + super.x);
}
