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
			System.out.println("상성 초특가 세일! (구매종료 :0)");
			System.out.println("1)삼성 tv구매");
			System.out.println("2)삼성 냉장고구매");
			System.out.println("3)삼성 에어컨구매");
			System.out.println("4)잔액확인");
			System.out.println("원하는 번호를 누르라요>>>");
			select=scan.nextInt();
			switch(select) {
			
			case 0:
				System.out.println("쇼핑을 종료합니다");
				break loop;
			case 1:
				//조상에 있는 참조변수로 자손에있는
					//sam[count]=new SamsungTv(); 
								//위의 sam[count] 대신 new SamsungTv();로 썻다리 '3'
					tv_c+=user.buy(new SamsungTv());
				break;
			case 2:
					//re[ref_count]=new Ref(); 
								//위의 re[ref_count] 대신 new SamsungTv();로 썻다리 '3'
					ref_c+=user.buy(new Ref());
				break;
			case 3:
					//re[ref_count]=new Ref(); 
								//위의 re[ref_count] 대신 new SamsungTv();로 썻다리 '3'
					con_c+=user.buy(new Condi());
				break;
			case 4:
				System.out.println("잔액확인을 선택\t");
				user.money_now();
				break;
			default:
				System.out.println("잘못된 번호를 입렷했서라");
				continue loop;
			
			}//switch
		} // while
		
		System.out.println();
		user.money_now();
		System.out.println("<구매내역>\t");
		System.out.printf("냉장고 %d, Tv %d, 에어컨 %d",ref_c,tv_c,con_c);
	}// main

}// class

class User {
	int money = 10000;
	String name = "홍길동";
	static int count = 0,ref_count=0,con_count=0;// tv구매수
	
	//Product를 상속받는 class를 집어넣기 때문에 1개로 아래쪽의 것을 커버가능//Object로 받으면 같은이름의 변수가 있을경우 형변환이 필요하기 때문에 Product를 따로 만든것!
	int buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이부족합니다.");
		}
		else{System.out.println(p.name+"을 구매하였습니다.");
		// 유저가 티비 1개를 구매
		money -= p.price;
		p.buy++;
		}
		return p.buy;
	}
	

//	void buy(SamsungTv t) {
//		
//		// 유저가 티비 1개를 구매
//		System.out.println("삼성 TV를 1개 구매했습니다");
//		money -= t.price;
//	}
//	void buy(Ref r) {
//		
//		// 유저가 티비 1개를 구매
//		System.out.println("삼성 냉장고를 1개 구매했습니다");
//		money -= r.price;
//	}
//	void buy(Condi c) {
//		
//		// 유저가 티비 1개를 구매
//		System.out.println("삼성 에어컨를 1개 구매했습니다");
//		money -= c.price;
//	}
	
	void money_now() {
		System.out.println("현재 유저가 가지고 있는 금액: " + money);
		
	}
}