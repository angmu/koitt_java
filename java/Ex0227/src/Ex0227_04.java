import java.util.Scanner;

public class Ex0227_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� �� ���α׷�
		// 1)�ҹ��� ���� 2)�ں� ���� 3)Ʈ�� ���� 4)�⺻������ 5)������κ��� 6)����
		//
		//
		Scanner scan = new Scanner(System.in);
		int select;
		FireEngine fe=new FireEngine();
		Embulance eb=new Embulance();
		Truck tr=new Truck();
		Car g=null;
		loop: while (true) {
			System.out.println("================================");
			System.out.println("���� �� ���α׷�");
			System.out.println("1)�ҹ�������");
			System.out.println("2)�ں深�� ����");
			System.out.println("3)Ʈ������");
			System.out.println("4)�⺻�� ����");
			System.out.println("5)������� ���ư���");
			System.out.println("6)����");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���>>>>>");
			select = scan.nextInt();
			switch (select) {
			case 1:
				System.out.println("�ҹ����� ����");
				fe.water();
				g=fe;
				break;
			case 2:
				System.out.println("�ں深���� ����");
				eb.siren();
				g=eb;
				break;
			case 3:
				System.out.println("Ʈ������");
				tr.stuff();
				g=tr;
				break;
			case 4:
				System.out.println("�⺻���� ����");
//				g=changec(g);
				g.drive();
				break;
			case 5:
				System.out.println("������� ����");
				back(g,fe,tr,eb);
				break;
			case 6:
				System.out.println("���α׷�����");
				break loop;
			default:
				System.out.println("�߸��Է��ߴٿ�");
				continue;
			}
		}

		// ����м� ��ü 1�� ����
		// ī��ü�� �ΰ�
		// ����̺�޼ҵ� ����.
//		�ٽ� �������ؼ� ���深��1�� ��ü�� �߰��� �־���.
		// ���̷��� �����غ�����

//		Embulance eb=new Embulance();
//		Embulance eb2=new Embulance();
//		Car c=null;
//		c=eb;
//		c.drive();
//		eb2=(Embulance)c;
//		eb2.siren();
		// ====================
//		FireEngine fe=new FireEngine();
//		if(fe instanceof FireEngine) {
//			System.out.println("FireEngine�� ��ü�� �½��ϴ�.");
//		}
//		if(fe instanceof Car) {
//			System.out.println("Car�� ��ü�� �½��ϴ�.");
//		}
//		if(fe instanceof Object) {
//			System.out.println("Object�� ��ü�� �½��ϴ�.");
//		}
//		

	}//// main

	
	static Car changec(Car g) {
		Car c1=new Car();
		g=c1;
		return g;
	}
	
	static void back(Car g,FireEngine fe,Truck tr,Embulance eb) {
		if(g instanceof FireEngine) {
			System.out.println("ó�������� ���� �ҹ���������");
			fe.water();
		}else if(g instanceof Truck) {
			System.out.println("ó�������� ���� Ʈ���̿�����");
			tr.stuff();
		}else {
			System.out.println("ó�� ������ ���� �ں深��������");
			eb.move();
		}
	}
}// class
