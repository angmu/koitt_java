import java.util.Scanner;
import java.util.Vector;

public class Ex0228_gangsanim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		User u = new User();
		loop: while (true) {
			System.out.println("1)컴퓨터  2)tv  3)냉장고  4)세탁기  5)에어컨  6)구매물품");
			System.out.println("7)보유금액,보너스포인트 출력  8)보유금액 충전 9)구매상품검색 10)원하는상품 취소 0)종료");
			System.out.println("원하는 번호를 선택하세요");
			switch (scan.nextInt()) {
			case 0:
				System.out.println("프로그램 종료");
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
				System.out.println("취소할 물건 선택");
				System.out.println("1)컴퓨터  2)tv 3)냉장고  4)세탁기  5)에어컨 (이전화면 99)");
				if(scan.nextInt()==99) {
					System.out.println("이전화면으로 돌아간다유");
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
	Vector<Product> cart=new Vector<Product>();//벡터에 프로덕트만 담을거라는 뜻
//	Product[] cart = new Product[10];

	int i = 0;

	// 구매추가
	void buy(Product p) {
		System.out.println("구매목록");
		if (money < p.price) {
			System.out.println("보유금액이 부족합니다.충전하세오");
			return;
		}
		System.out.println(p.name + "구매하엿습니다");
		money -= p.price;
		point += p.bonusPoint;
		cart.add(p);
//		cart[i++] = p;
	}

	// 물품출력
	void pro_print() {
		int sum = 0;
		System.out.println("구매뭉품출력");
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
		System.out.println("총 구매금액:" + sum);
	}

	// 보유금액출력
	void user_print() {

		System.out.println("보유금액출력");
		System.out.println(money);
	}

	// 구매충전
	void charge() {
		Scanner scan = new Scanner(System.in);
		System.out.println("금액충전합니다");
		System.out.println("원하는 금액을 입력하세요>> 카드결제");
		int charge_m = scan.nextInt();
		// 카드회사= card(num,card_num,price);
		// 회원번호 금액 true/false
		money += charge_m;
	}

	void search() {
		System.out.println("검색");
		int tv_count = 0;
		int com_count = 0;
		int wash_count = 0;
		int ref_count = 0;
		int a_count = 0;
		for (int j = 0; j < cart.length; j++) {
			if (cart[j] == null) {
				break;
			}
			if (cart[j].name.equals("티비")) {                                                              
				tv_count++;
			}else if (cart[j].name.equals("컴퓨터")) {
				com_count++;
			}else if (cart[j].name.equals("냉장고")) {
				ref_count++;
			}else if (cart[j].name.equals("에어컨")) {
				a_count++;
			}else if (cart[j].name.equals("세탁기")) {
				 wash_count++;
			}
		}
		System.out.println("tv 구매대수 :" + tv_count+"대");
		System.out.println("컴퓨터 구매대수 :" + com_count+"대");
		System.out.println("냉장고 구매대수 :" + ref_count+"대");
		System.out.println("에어컨 구매대수 :" + a_count+"대");
		System.out.println("세탁기 구매대수 :" + wash_count+"대");
	}
	
//	void delete() {
//		System.out.println("삭제-com");
//		int number=0;
//		for (int j = 0; j < cart.length; j++) {
//			if (cart[j] == null) {
//				break;
//			}
//			if (cart[j].name.equals("컴퓨터")) {
//				cart[j].name="";
//				cart[j].price=0;
//				number++;
//			}
//		}if(number!=0) {
//			System.out.println(number+"대 취소하였습니다.");
//		}else {
//			System.out.println("삭제할 제품이 없습니다.");
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
				//취소한 상품 금액 돌려주기
				money+=cart[j].price;
			}
		}if(number!=0) {
			System.out.println(bb+"제뭄을"+number+"대 취소하였습니다.");
		}else {
			System.out.println("삭제할 제품이 없습니다.");
		}
		
	}
	
	void deletek(int a) {
		String b="";
		switch(a) {
		case 1:
			b="컴퓨터";
			break;
		case 2:
			b="티비";
			break;
		case 3:
			b="냉장고";
			break;
		case 4:
			b="세탁기";
			break;
		case 5:
			b="에어컨";
		}
		delete(b);
	}
}

class Comn extends Product {
	Comn() {
		super("컴퓨터", 900, 90);
	}
}

class Tvn extends Product {
	Tvn() {
		super("티비", 1200, 120);
	}
}

class Refn extends Product {
	Refn() {
		super("냉장고", 800, 80);
	}
}

class Washn extends Product {
	Washn() {
		super("세탁기", 1700, 170);
	}
}

class Airn extends Product {
	Airn() {
		super("에어컨", 1100, 110);
	}
}