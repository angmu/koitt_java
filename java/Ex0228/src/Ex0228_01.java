
public class Ex0228_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1=new Child1();
		Parent1 p1=new Parent1();
		Parent1 p2=new Child1();//������
		
		System.out.println("Parent�� ��ü. �������� �� : "+p1.getX());
		p1.method();
		System.out.println("Parent�� �޼ҵ�. �������� �� : "+p1.getX());
		System.out.println("===============================");
		System.out.println("Child�� ��ü. �������� �� : "+c1.getX());
		c1.method();
		System.out.println("Child�� ��ü. �������� �� : "+c1.getX());
		System.out.println("===============================");
		System.out.println("p2�� ��ü. �������� �� : "+p2.getX());
		p2.method();
		System.out.println("p2�� ��ü. �������� �� : "+p2.getX());
				
		
		//private���� ��ġ�� ��)
		
//		Parent�� ��ü. �������� �� : 100
//		�θ�Ŭ������ �޼ҵ��Դϴ�
//		Parent�� �޼ҵ�. �������� �� : 100
//		===============================
//		Child�� ��ü. �������� �� : 200
//		�ڼ�Ŭ������ �޼ҵ��Դϴ�.
//		Child�� ��ü. �������� �� : 200
//		===============================
//		p2�� ��ü. �������� �� : 100 //�ڼղ�
//		�θ�Ŭ������ �޼ҵ��Դϴ�.//�θ�
//		p2�� ��ü. �������� �� : 100

	}

}

class Parent1{
	private int x=100;
	void method() {
		System.out.println("�θ�Ŭ������ �޼ҵ��Դϴ�");
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
	void method() {//�������̵�
		System.out.println("�ڼ�Ŭ������ �޼ҵ��Դϴ�.");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	void method(int x) {//�����ε�
		System.out.println("�ڼ�Ŭ������ �޼ҵ�2�Դϴ�.");
	}
}