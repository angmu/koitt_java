import java.util.Scanner;

public class Ex0206_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자신의 계좌 1개
		//쇼핑몰에서 1개의 상품을 구매
		//계좌에서 상품가격을 빼주는 프로그램을 만들어봅시다.
		
		int my_bank=5000000; //계좌 잔액
		int p_num=0;
		int com1=1300000;
		int tv1=1000000;
		int smartp1=880000;
		int point=0;
		String list1="";
		
		Scanner scan=new Scanner(System.in);
		
		Loop1 :
		while(true) {
		System.out.println("-----------------------------");
		System.out.println("[하이마트 쇼핑]");
		System.out.println("-----------------------------");
		System.out.printf("1.컴퓨터(%d)    2.TV(%d)  3.스마트폰(%d) 4.금액충전 %n",com1,tv1,smartp1);
		System.out.println("구매하고 싶은 상품을 선택하세요.>> (쇼핑종료 99)");
		
		p_num=scan.nextInt(); //구매상품 번호
		
		if(p_num==99) {
			System.out.println("쇼핑을 종료합니다. ");
			break; 
		}
		
		switch(p_num) {
		
		case 1:
			if(!(my_bank-com1<=0)) {
			my_bank-=com1;// my_bank=my_bank-1250000; 
			point+=(com1*0.1);
			System.out.println("컴퓨러 1대를 구매했습니다");
			System.out.printf("상품의 가격은 :%d 포인트 :%d %n",com1,point);
			list1+=" 컴퓨터 1대";//공백 안하면 ...다 붙어서 나온다 흑흑..
			break;}
			else {
				System.out.println("돈이 부족합니다 잔액을 충전해주세요");
				continue Loop1;
			}
			//아래처럼 써도된다 'ㅂ'
//			if(my_bank<com1) {
//			System.out.println("돈이 부족합니다 잔액을 충전해주세요");
//			continue Loop1;}
//			else {	
//				my_bank-=com1;// my_bank=my_bank-1250000; 
//				System.out.println("컴퓨러 1대를 구매했습니다");
//				System.out.printf("상품의 가격은 :%d %n",com1);
//				break;
//				}
		case 2:
			if(!(my_bank-tv1<=0)) {
			my_bank-=tv1;// my_bank=my_bank-990000; 
			point+=(tv1*0.1);
			System.out.println("TV 1대를 구매했습니다");
			System.out.printf("상품의 가격은 :%d 포인트 :%d %n",tv1,point);
			list1+=" TV 1대";
			break;}
			else {
				System.out.println("돈이 부족합니다 잔액을 충전해주세요");
				continue Loop1;
			}
		case 3:
			if(!(my_bank-smartp1<=0)) {
			my_bank-=smartp1;// my_bank=my_bank-880000; 
			point+=(tv1*0.1);
			System.out.println("스마트폰 1대를 구매했습니다");
			System.out.printf("상품의 가격은 :%d 포인트 :%d %n",smartp1,point);
			list1+=" 스마트폰 1대";
			break;}
			else {
			System.out.println("돈이 부족합니다 잔액을 충전해주세요");
			continue Loop1;
		}
			
		case 4:	
			System.out.println("충전할 금액을 입력하세요");
			int charge=scan.nextInt();
			my_bank+=charge;//my_bank=my_bank+scan.nextInt()
			System.out.printf("%d원이 충전되었습니다.%n 잔액 %d",charge,my_bank);
				
		default:	
			break;
		
		}System.out.println("계좌잔고는 "+my_bank+"원");
		System.out.println("구매목록 "+list1);
		}
		
		
		
		//-------------------------------
		
		
//		int my_bank=5000000; //계좌 잔액
//		int p_num=0;
//		int com1=1300000;
//		int tv1=1000000;
//		int smartp1=880000;
//		
//		
//		Scanner scan=new Scanner(System.in);
//		
//		Loop1 :
//		while(true) {
//		System.out.println("[하이마트 쇼핑]");
//		System.out.printf("1.컴퓨터(%d)    2.TV(%d)  3.스마트폰(%d) 4.금액충전",com1,tv1,smartp1);
//		System.out.print("구매하고 싶은 상품을 선택하세요.>> (쇼핑종료 99)");
//		
//		p_num=scan.nextInt(); //구매상품 번호
//		
//		if(p_num==99) {
//			System.out.println("쇼핑을 종료합니다. ");
//			break; 
//		}
//		
//		switch(p_num) {
//		
//		case 1:
//			if(!(my_bank-com1<=0)) {
//			my_bank-=com1;// my_bank=my_bank-1250000; 
//			System.out.println("컴퓨러 1대를 구매했습니다");
//			System.out.printf("상품의 가격은 :%d %n",com1);
//			break;}
//			else {
//				System.out.println("돈이 부족합니다 잔액을 충전해주세요");
//				continue Loop1;
//			}
//			//아래처럼 써도된다 'ㅂ'
////			if(my_bank<com1) {
////			System.out.println("돈이 부족합니다 잔액을 충전해주세요");
////			continue Loop1;}
////			else {	
////				my_bank-=com1;// my_bank=my_bank-1250000; 
////				System.out.println("컴퓨러 1대를 구매했습니다");
////				System.out.printf("상품의 가격은 :%d %n",com1);
////				break;
////				}
//		case 2:
//			if(!(my_bank-tv1<=0)) {
//			my_bank-=tv1;// my_bank=my_bank-990000; 
//			System.out.println("TV 1대를 구매했습니다");
//			System.out.printf("상품의 가격은 :%d %n",tv1);
//			break;}
//			else {
//				System.out.println("돈이 부족합니다 잔액을 충전해주세요");
//				continue Loop1;
//			}
//		case 3:
//			if(!(my_bank-smartp1<=0)) {
//			my_bank-=smartp1;// my_bank=my_bank-880000; 
//			System.out.println("스마트폰 1대를 구매했습니다");
//			System.out.printf("상품의 가격은 :%d %n",smartp1);
//			break;}
//			else {
//			System.out.println("돈이 부족합니다 잔액을 충전해주세요");
//			continue Loop1;
//		}
//			
//		case 4:	
//			System.out.println("충전할 금액을 입력하세요");
//			int charge=scan.nextInt();
//			my_bank+=charge;//my_bank=my_bank+scan.nextInt()
//			System.out.printf("%d원이 충전되었습니다.%n 잔액 %d",charge,my_bank);
//				
//		default:	
//			break;
//		
//		}System.out.println("계좌잔고는 "+my_bank+"원");
//		
//		
//		}
		
		
		
		
		//---------------------
		
//		int my_bank=5000000; //계좌 잔액
//		int p_num=0;
//		
//		
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("[하이마트 쇼핑]");
//		System.out.println("1.컴퓨터(125만원)    2.TV(99만원)  3.스마트폰(88만원)");
//		System.out.print("구매하고 싶은 상품을 선택하세요.>>");
//		
//		p_num=scan.nextInt(); //구매상품 번호
//		
//		switch(p_num) {
//		
//		case 1:
//			my_bank-=1250000;// my_bank=my_bank-1250000; 
//			System.out.println("컴퓨러 1대를 구매했습니다");
//			System.out.println("상품의 가격은 :1,250,000원");
////			System.out.println("계좌잔고는 "+my_bank+"원"); //>>> case마다 똑같이 들어가는 구문이므로 바깥으로 빼면 좋다.
//			break;
//		case 2:
//			my_bank-=990000;// my_bank=my_bank-990000; 
//			System.out.println("TV 1대를 구매했습니다");
//			System.out.println("상품의 가격은 :990,000원");
////			System.out.println("계좌잔고는 "+my_bank+"원");
//			break;
//		case 3:
//			my_bank-=880000;// my_bank=my_bank-880000; 
//			System.out.println("스마트폰 1대를 구매했습니다");
//			System.out.println("상품의 가격은 :880,000원");
////			System.out.println("계좌잔고는 "+my_bank+"원");
//			break;
//		default:	
//			break;
//		
//		}
//		
		
		
	}

}
