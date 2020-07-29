public class Ex0228_02 {

	public static void main(String[] args) {
		Buyer b = new Buyer();

		// 1. TV���� 2.��ǻ�ͱ��� 3.���Ź�ǰ ���
		// 1 -> b.buy(new Tv());
		// 2 -> b.buy(new Computer());

		b.buy(new Tv()); // TV 1�� ����
		System.out.println("TV1�� ����");
		b.buy(new Computer());
		System.out.println("��ǻ�� 1�� ����");
		b.summary();

	}// �޼ҵ�

}

class Buyer {
	int money = 100000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;
	int sum = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ݾ��� �����մϴ�.");
			System.out.println("�ݾ��� �����ϼ���.");
			return;
		}
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		item[i] = p;
		i++;
	}

	// ���
	void summary() {

		for (int j = 0; j < i; j++) {
			if (item[j] == null) {
				System.out.println("���Ź�ǰ�� �����ϴ�.");
			}
			System.out.print(item[j].name + ",");
			sum = sum + item[j].price;
		} // for
		System.out.println();
		System.out.println("�ѱ��Ű��� : " + (i));
		System.out.println("�ѱ��űݾ� : " + sum);
		System.out.println("�����ݾ� : " + money);
	}

}

class Product {
	String name;
	int price;
	int bonusPoint;

	Product() {

	}

	Product(String name, int price, int bonusPoint) {
		this.name = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}

}

class Tv extends Product {

	Tv() {
//  super("TV",1000,1000/10);
		name = "Tv";
		price = 1000;
		bonusPoint = (int) (price / 10);
	}

}

class Computer extends Product {

	Computer() {
		name = "Computer";
		price = 900;
		bonusPoint = (int) (price / 10);
	}
}

//
//public class Ex0228_02 {
//	public static void main(String[] args) {
//		Tv t=new Tv();
//		Buyer b=new Buyer();
//		Computer c=new Computer();
//		//1�� tv���� 2�� �ı��� 3. ���Ź�ǰ ���
//		b.buy(new Tv());//Tv1�� ����
//		System.out.println("tv1�� ����");
//		b.buy(new Computer());//
//		System.out.println("com 1�� ����");
//		b.summary();
//	}
//}
//
//
//
//class Buyer{
//	int money=100000;
//	int bonusPoint=0;
//	Product[] item=new Product[10];
//	int i=0;
//	int sum=0;
//	
//	
//	void buy(Product p) {
//		if(money<p.price) {
//			System.out.println("�ݾ��̺����մϴ�.");
//			System.out.println("�ݾ��� �����ϼ���.");
//			return;
//		}
//		money=money-p.price;
//		bonusPoint=bonusPoint+p.bonusPoint;
//		item[i]=p;
//		i++;
//	}
//	//���
//	void summary() {
//		for(int j=0;j<i;j++) {
//			if(item[j]==null) {
//				System.out.println("���Ź�ǰ�� �����ϴ�.");
//				System.out.print(item[j].name+",");
//				sum=sum+item[j].price;
//			}
//		}
//		System.out.println("�� ���Ű���: "+(i+1));
//		System.out.println("�� ���űݾ�: "+sum);
//		System.out.println("���� �ݾ�:"+money);
//		
//	}
//	
//}
//class Product{
//	int price;
//	String name;
//	int bonusPoint;
//	
//	Product(){
//		
//	}
//	
//	Product(String name,int price,int bonusPoint){
//		this.name=name;
//		this.price=price;
//		this.bonusPoint=bonusPoint;
//	}
//	
//}
//
//
//
//class Tv extends Product{
//	Tv(){
//		super("TV",1000,1000/10);
////		price=1000;
////		name="Tv";
////		bonusPoint=(int)(price/10);
//	}
//}
//
//class Computer extends Product{
//	int price;
//	String name;
//	int bonusPoint;
//	
//	Computer(){
//		super("COMPUTER",900,900/10);
////		price=1000;
////		name="Computer";
////		bonusPoint=(int)(price/10);
//	}
//}