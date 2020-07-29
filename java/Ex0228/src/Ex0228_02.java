public class Ex0228_02 {

	public static void main(String[] args) {
		Buyer b = new Buyer();

		// 1. TV구매 2.컴퓨터구매 3.구매물품 출력
		// 1 -> b.buy(new Tv());
		// 2 -> b.buy(new Computer());

		b.buy(new Tv()); // TV 1대 구매
		System.out.println("TV1대 구매");
		b.buy(new Computer());
		System.out.println("컴퓨터 1대 구매");
		b.summary();

	}// 메소드

}

class Buyer {
	int money = 100000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;
	int sum = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("금액이 부족합니다.");
			System.out.println("금액을 충전하세요.");
			return;
		}
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		item[i] = p;
		i++;
	}

	// 출력
	void summary() {

		for (int j = 0; j < i; j++) {
			if (item[j] == null) {
				System.out.println("구매물품이 없습니다.");
			}
			System.out.print(item[j].name + ",");
			sum = sum + item[j].price;
		} // for
		System.out.println();
		System.out.println("총구매개수 : " + (i));
		System.out.println("총구매금액 : " + sum);
		System.out.println("보유금액 : " + money);
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
//		//1번 tv구매 2번 컴구매 3. 구매물품 출력
//		b.buy(new Tv());//Tv1대 구매
//		System.out.println("tv1대 구매");
//		b.buy(new Computer());//
//		System.out.println("com 1대 구매");
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
//			System.out.println("금액이부족합니다.");
//			System.out.println("금액을 중전하세오.");
//			return;
//		}
//		money=money-p.price;
//		bonusPoint=bonusPoint+p.bonusPoint;
//		item[i]=p;
//		i++;
//	}
//	//출력
//	void summary() {
//		for(int j=0;j<i;j++) {
//			if(item[j]==null) {
//				System.out.println("구매물품이 없습니다.");
//				System.out.print(item[j].name+",");
//				sum=sum+item[j].price;
//			}
//		}
//		System.out.println("총 구매개수: "+(i+1));
//		System.out.println("총 구매금액: "+sum);
//		System.out.println("보유 금액:"+money);
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