
public class Ex0227_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car();
		Car c2=null;
		FireEngine f=null;
		FireEngine f2=new FireEngine();
		
		c.drive();
		c=f2;
		c.drive();
		f=(FireEngine)c;
		f.water();
//		
//		c.drive();
//		c2=f2;//����ȯ ����
//		f=(FireEngine)c2;
//		//���� ������ ���������޴��� �����Ѵ�.
//		//FireEngine f=new FireEngine();
//		f.water();//���⿡���� �������������� ����������.
		
//		c.drive();
//		c2=f2;//����ȯ ����
//		f=(FireEngine)c;
//		//FireEngine f=new Car(); <<���� //����ȯ�� �߾ c�� ����Car()�� ����Ǿ���`�� ������ ������ ��ü�� �޴°��� �Ǿ� ������ ����.
//		//�ڼ��� ���������� ������ ��ü�� �����ϴ°��� �ȵȴ�.
//		f.water();//���⿡���� �������������� ����������.
		
		
		
		
//		Car c= new Car();
//		FireEngine f=new FireEngine();
//		System.out.println("[������]");
//		Car c2=new FireEngine();//������
////		FireEngine f2=new Car();//�Ұ�
//		FireEngine f2=new FireEngine();
//		FireEngine f3=null;
//		c=f2;//����ȯ �������� (water�� ���Ұ�)
//		f3=(FireEngine)c;//����ȯ �����Ұ� (water ��밡��)
//		f3.water();
//		
//		c.drive();
//		c.stop();
//		System.out.println("[�ҹ���]");
//		f.drive();
//		f.stop();
//		f.water();
		
	}

	

	

}

class Car{
	String color;
	int door;
	void drive() {//240�̻� ����������
		System.out.println("������ ������ ���!");
	}
	
	void stop() {
		System.out.println("�극��ũ�� ������ ����!");
	}
}

class FireEngine extends Car{
	public void water(){
		System.out.println("���� �߻�");
	}
}

class Embulance extends Car{
	public void siren() {
		System.out.println("���̷��� �︳�ϴ�");
	}
	public void move() {
		System.out.println("����� �ű�ϴ�");
	}
}
class Truck extends Car{
	public void stuff() {
		System.out.println("������ �ű�ϴ�.");
	}
}