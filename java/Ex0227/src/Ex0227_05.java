import java.util.Scanner;

public class Ex0227_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungTv[] sam = new SamsungTv[10];
		Ref[]re=new Ref[10];
		Condi[]con=new Condi[10];
		User user = new User();
		Scanner scan = new Scanner(System.in);
		int select;
		int con_c=0,ref_c=0,tv_c=0;
		
		
		loop:
		while (true) {
			System.out.println("==================");
			System.out.println("�� ��Ư�� ����! (�������� :0)");
			System.out.println("1)�Ｚ tv����");
			System.out.println("2)�Ｚ �������");
			System.out.println("3)�Ｚ ����������");
			System.out.println("4)�ܾ�Ȯ��");
			System.out.println("���ϴ� ��ȣ�� �������>>>");
			select=scan.nextInt();
			switch(select) {
			
			case 0:
				System.out.println("������ �����մϴ�");
				break loop;
			case 1:
				//���� �ִ� ���������� �ڼտ��ִ�
					//sam[count]=new SamsungTv(); 
								//���� sam[count] ��� new SamsungTv();�� ���ٸ� '3'
					tv_c+=user.buy(new SamsungTv());
				break;
			case 2:
					//re[ref_count]=new Ref(); 
								//���� re[ref_count] ��� new SamsungTv();�� ���ٸ� '3'
					ref_c+=user.buy(new Ref());
				break;
			case 3:
					//re[ref_count]=new Ref(); 
								//���� re[ref_count] ��� new SamsungTv();�� ���ٸ� '3'
					con_c+=user.buy(new Condi());
				break;
			case 4:
				System.out.println("�ܾ�Ȯ���� ����\t");
				user.money_now();
				break;
			default:
				System.out.println("�߸��� ��ȣ�� �Է��߼���");
				continue loop;
			
			}//switch
		} // while
		
		System.out.println();
		user.money_now();
		System.out.println("<���ų���>\t");
		System.out.printf("����� %d, Tv %d, ������ %d",ref_c,tv_c,con_c);
	}// main

}// class

class User {
	int money = 10000;
	String name = "ȫ�浿";
	static int count = 0,ref_count=0,con_count=0;// tv���ż�
	
	//Product�� ��ӹ޴� class�� ����ֱ� ������ 1���� �Ʒ����� ���� Ŀ������//Object�� ������ �����̸��� ������ ������� ����ȯ�� �ʿ��ϱ� ������ Product�� ���� �����!
	int buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��̺����մϴ�.");
		}
		else{System.out.println(p.name+"�� �����Ͽ����ϴ�.");
		// ������ Ƽ�� 1���� ����
		money -= p.price;
		p.buy++;
		}
		return p.buy;
	}
	

//	void buy(SamsungTv t) {
//		
//		// ������ Ƽ�� 1���� ����
//		System.out.println("�Ｚ TV�� 1�� �����߽��ϴ�");
//		money -= t.price;
//	}
//	void buy(Ref r) {
//		
//		// ������ Ƽ�� 1���� ����
//		System.out.println("�Ｚ ����� 1�� �����߽��ϴ�");
//		money -= r.price;
//	}
//	void buy(Condi c) {
//		
//		// ������ Ƽ�� 1���� ����
//		System.out.println("�Ｚ �������� 1�� �����߽��ϴ�");
//		money -= c.price;
//	}
	
	void money_now() {
		System.out.println("���� ������ ������ �ִ� �ݾ�: " + money);
		
	}
}