import java.util.Scanner;

public class Ex0206_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//추가 > 결제창
		// 현금결제or 카드 결제
		//카드> 결제처리중( Math.random*10)+2
	//	11이면 정상결제
		//12면 비정상결제
		
	//	다시 물어볼것
		
		
//		1.쇼핑몰 화면구현
//		--컴퓨터 130만, tv 100만 , 스마트폰 90만
//		2.번호입력을 받는다.
//		--0번을 누르면 프로그램 종료
//		3.제품구매
//		>잔고와 제품금액을 비교
//		--부족하면 알려주고 이전화면으로 돌아간다.
//		>잔고에서 제품 금액을 뺀다.
//		>제품금액의 10%를 포인트로 지급
//		>구매목록 저장
//
//		4.잔고, 구매목록 출력
		
		int ch=0;
		int ch_i=0;
		int my_bank=5000000;
		int com1=1300000;
		int tv1=1000000;
		int smartp1=900000;
		int point=0;//포인트
		int charge=0;//충전금액
		int ran=(int)(Math.random()*2)+10;
		String i="";//구매목록
		
		Scanner scan=new Scanner(System.in);
		
		shopping :
		while(true) {
			System.out.println("---------------------------");
			System.out.println("[전자 제품 살때는 하이마트 o.<)r ~★]");
			System.out.println("---------------------------");
			System.out.println();
			System.out.println("구매를 원하는 상품 번호를 눌러주세요");
			System.out.printf("1)컴퓨터 :%d 2)tv : %d 3)스마트폰: %d 4)잔액충전 5)포인트전환(종료 99)",com1,tv1,smartp1);
			System.out.println("---------------------------");
			
			ch=scan.nextInt();
			if(ch==99) {
				System.out.println("이용해주셔서 감사합니다.");
				break shopping;
			}
			switch(ch) {
			
				case 1 :
					
					if(my_bank<com1) {
							System.out.println("잔액이 부족합니다.");
							continue shopping;
						}
						else {
							while(true) {
								System.out.println("컴퓨터 1대를 구매하였습니다.");
								System.out.println("결제선택 1)카드결제 2)현금결제");
								int pay_select=scan.nextInt();
										System.out.println("결제처리중");
										if((int)(Math.random()*2)==1) {
											my_bank-=com1;
											point+=(com1*0.1);
											i+=" 컴퓨터 1대";
											break;
										}else {
											System.out.println("결제에러! 다시 결제해주세요");
											continue;			
										}
										
							}
						}
					
					
					
				case 2 :
						if(my_bank<tv1) {
							System.out.println("잔액이 부족합니다.");
							continue shopping;
						}
						else {
							System.out.println("tv 1대를 구매하였습니다.");
							my_bank-=tv1;
							point+=(tv1*0.1);
							i+=" tv 1대";
							break;
						}
					
				case 3 :
					if(my_bank<smartp1) {
							System.out.println("잔액이 부족합니다.");
							continue shopping;
						}
						else {
							System.out.println("스마트폰 1대를 구매하였습니다.");
							my_bank-=smartp1;
							point+=(smartp1*0.1);
							i+=" 스마트폰 1대";
							break;
						}
					
				case 4 :
					loop2 :while(true) {
					System.out.println("충전 방법을 선택하세요.");
					System.out.println("1)현금결제  2)카드결제");
					ch_i=scan.nextInt();
						
						switch(ch_i){
							
						case 1 :
							System.out.println("현급결제를 선택하였습니다");
							System.out.println("충전할 금액을 입력하세요");
							charge=scan.nextInt();
							my_bank+=charge;
							System.out.printf("충전이 완료되었습니다. 충전금액%d %n",charge);
							break loop2;
							
						case 2 :
							System.out.println("카드결제를 선택하였습니다");
							System.out.println("충전할 금액을 입력하세요");
							charge=scan.nextInt();
							System.out.println("결제하시겠습니까? 1)yes 2)no");
							String yn=scan.next();
							
							if(yn.equals("yes")||yn.equals("1")){
								if(ran==11) {
									System.out.printf("충전이 완료되었습니다. 충전금액%d %n",charge);
									break loop2;
									
								}
								else {
									System.out.println("결제 오류가 발생하였습니다. 결제화면으로 돌아갑니다.");
									continue;
								}
								
								
							}else if(yn.equals("no")||yn.equals("2")) {
								System.out.println("결제가 취소되었습니다.");
								continue;
							}
							else {
								System.out.println("입력값이 잘못되었습니다. 결제화면으로 돌아갑니다.");
								continue;
							}
						
						default :	
							break;
						}
					}break;
				case 5 :	
					while(true) {
							System.out.println("현재 포인트는 ?"+ point);
							System.out.println("포인트 전환금액을 입력하세요");	
							int point_cash=scan.nextInt();
							if(point_cash<=point) {
								my_bank+=point_cash;
								point-=point_cash;
								System.out.printf("%d원이 충전되었습니다. %n",point_cash);	
								break;	
							}else {
								System.out.println("포인트 전환금액이 너무 많습니다. 다시확인해주세요");
								continue;
							}	
					}
					
				default :
					break;
				
			}
		

			System.out.printf("통장잔액 %d 포인트 %d 구매목록 %s %n",my_bank,point,i);
		
		}
		
		
		
	}

}
