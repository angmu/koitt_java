import java.util.Scanner;
import java.util.Vector;

public class Ex0228_gangsanim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		User u = new User();
		loop: while (true) {
			System.out.println("1)��ǻ��  2)tv  3)�����  4)��Ź��  5)������  6)���Ź�ǰ");
			System.out.println("7)�����ݾ�,���ʽ�����Ʈ ���  8)�����ݾ� ���� 9)���Ż�ǰ�˻� 10)���ϴ»�ǰ ��� 0)����");
			System.out.println("���ϴ� ��ȣ�� �����ϼ���");
			switch (scan.nextInt()) {
			case 0:
				System.out.println("���α׷� ����");
				break loop;
			case 1:
				u.buy(new Comn());
				break;
			case 2:
				u.buy(new Tvn());
				break;
			case 3:
				u.buy(new Refn());
				break;
			case 4:
				u.buy(new Washn());
				break;
			case 5:
				u.buy(new Airn());
				break;
			case 6:
				u.pro_print();
				break;
			case 7:
				u.user_print();
				break;
			case 8:
				u.charge();
				break;
			case 9:
				u.search();
				break;
			case 10:
				System.out.println("����� ���� ����");
				System.out.println("1)��ǻ��  2)tv 3)�����  4)��Ź��  5)������ (����ȭ�� 99)");
				if(scan.nextInt()==99) {
					System.out.println("����ȭ������ ���ư�����");
					break;
				}
				u.deletek(scan.nextInt());
				break;
			default:
				continue loop;
			}
		}
	}

}

class User {
	int money = 10000;
	int point;
	Vector<Product> cart=new Vector<Product>();//���Ϳ� ���δ�Ʈ�� �����Ŷ�� ��
//	Product[] cart = new Product[10];

	int i = 0;

	// �����߰�
	void buy(Product p) {
		System.out.println("���Ÿ��");
		if (money < p.price) {
			System.out.println("�����ݾ��� �����մϴ�.�����ϼ���");
			return;
		}
		System.out.println(p.name + "�����Ͽ����ϴ�");
		money -= p.price;
		point += p.bonusPoint;
		cart.add(p);
//		cart[i++] = p;
	}

	// ��ǰ���
	void pro_print() {
		int sum = 0;
		System.out.println("���Ź�ǰ���");
		for (int j = 0; j < cart.size(); j++) {//cart.length
//			if (cart[j] == null) {
//				break;
//			}
			Product p=(Product)cart.get(i);
			System.out.print(p.name + " ");//cart[j]
			sum += p.price;//cart[j]
//			sum += cart[j].price;
		}
		System.out.println();
		System.out.println("�� ���űݾ�:" + sum);
	}

	// �����ݾ����
	void user_print() {

		System.out.println("�����ݾ����");
		System.out.println(money);
	}

	// ��������
	void charge() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ݾ������մϴ�");
		System.out.println("���ϴ� �ݾ��� �Է��ϼ���>> ī�����");
		int charge_m = scan.nextInt();
		// ī��ȸ��= card(num,card_num,price);
		// ȸ����ȣ �ݾ� true/false
		money += charge_m;
	}

	void search() {
		System.out.println("�˻�");
		int tv_count = 0;
		int com_count = 0;
		int wash_count = 0;
		int ref_count = 0;
		int a_count = 0;
		for (int j = 0; j < cart.length; j++) {
			if (cart[j] == null) {
				break;
			}
			if (cart[j].name.equals("Ƽ��")) {                                                              
				tv_count++;
			}else if (cart[j].name.equals("��ǻ��")) {
				com_count++;
			}else if (cart[j].name.equals("�����")) {
				ref_count++;
			}else if (cart[j].name.equals("������")) {
				a_count++;
			}else if (cart[j].name.equals("��Ź��")) {
				 wash_count++;
			}
		}
		System.out.println("tv ���Ŵ�� :" + tv_count+"��");
		System.out.println("��ǻ�� ���Ŵ�� :" + com_count+"��");
		System.out.println("����� ���Ŵ�� :" + ref_count+"��");
		System.out.println("������ ���Ŵ�� :" + a_count+"��");
		System.out.println("��Ź�� ���Ŵ�� :" + wash_count+"��");
	}
	
//	void delete() {
//		System.out.println("����-com");
//		int number=0;
//		for (int j = 0; j < cart.length; j++) {
//			if (cart[j] == null) {
//				break;
//			}
//			if (cart[j].name.equals("��ǻ��")) {
//				cart[j].name="";
//				cart[j].price=0;
//				number++;
//			}
//		}if(number!=0) {
//			System.out.println(number+"�� ����Ͽ����ϴ�.");
//		}else {
//			System.out.println("������ ��ǰ�� �����ϴ�.");
//		}
//	}
	
	void delete(String bb) {
		int number=0;
		for (int j = 0; j < cart.length; j++) {
			if (cart[j] == null) {
				break;
			}
			if (cart[j].name.equals(bb)) {
				cart[j].name="";
				cart[j].price=0;
				number++;
				//����� ��ǰ �ݾ� �����ֱ�
				money+=cart[j].price;
			}
		}if(number!=0) {
			System.out.println(bb+"������"+number+"�� ����Ͽ����ϴ�.");
		}else {
			System.out.println("������ ��ǰ�� �����ϴ�.");
		}
		
	}
	
	void deletek(int a) {
		String b="";
		switch(a) {
		case 1:
			b="��ǻ��";
			break;
		case 2:
			b="Ƽ��";
			break;
		case 3:
			b="�����";
			break;
		case 4:
			b="��Ź��";
			break;
		case 5:
			b="������";
		}
		delete(b);
	}
}

class Comn extends Product {
	Comn() {
		super("��ǻ��", 900, 90);
	}
}

class Tvn extends Product {
	Tvn() {
		super("Ƽ��", 1200, 120);
	}
}

class Refn extends Product {
	Refn() {
		super("�����", 800, 80);
	}
}

class Washn extends Product {
	Washn() {
		super("��Ź��", 1700, 170);
	}
}

class Airn extends Product {
	Airn() {
		super("������", 1100, 110);
	}
}