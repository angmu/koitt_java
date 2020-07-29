import java.util.Scanner;

public class Ex0207_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자판기 프로그램
		// 1)블랙커피(커피 10g) 100원, 2)흑당커피(커피7g 설탕5g) 300원, 3)라떼(커피 5g 우유 5g) 200원,
		// 4)밀크커피(커피4 우유 3 설탕2) 100원
		// 자판기 재료 재고 :커피 100, 설탕 50, 우유 70
		// **커피가 나왔습니다 로 출력
		// 9)관리자모드 , 아이디랑 비번이 맞으면 자판기 재료재고와 총 x잔이 팔렸습니다.
		// 현재 재료가 부족한 상태입니다 관리자에게 연락해주세요 라고 출력
		
		//ctrl+a >ㅊctrl+shift+f (자동정렬)
		
		
//		//자판기 프로그램 <2020.02.07 프로그램 업데이트>
//		
//		String id="aaa";
//		String pass="1234";
//		
//		
//		int coffee_amount=100;//커피재고
//		int sugar_amount=50;//설탕재고
//		int milk_amount=70;//우유재고
//		
//		int total_sale=0;//총 판매량
//		int total_price=0;//총 판매금액
//		
//		int order_num=0;
//		int input_price=0;//투입금액
//		final int BLACK_PRICE=100;//블랙커피 가격
//		final int SUGAR_PRICE=300;//흑당커피 가격
//		final int LATTE_PRICE=200;//라떼 가격
//		final int MILK_PRICE=100;//밀크커피 가격
//		boolean black_check=false;
//		boolean sugar_check=false;
//		boolean latte_check=false;
//		boolean milk_check=false;
//		
//		Scanner scan=new Scanner(System.in);
//		
//		
//		while(true) {
//			
//		System.out.println("-------------------------");
//		System.out.println("         커피자판기                      ");
//		System.out.println("-------------------------");
//		if(black_check==false) {
//			System.out.println("1)블랙커피 -100원");
//		}
//		System.out.println("2)흑당커피 -100원");
//		System.out.println("3)카페라떼 -100원");
//		System.out.println("4)밀크커피 -100원");
//		System.out.println("9)관리자");
//		System.out.println("0)시스켐종료");
//		System.out.println("-------------------------");
//		System.out.println("마시고 싶은 커피 번호를 입력하세요.>>");
//		order_num=scan.nextInt();
//		
//		switch (order_num) {
//		
//		case 1:
//			if(!(coffee_amount>10)) {
//				System.out.println("커피가 부족합니다. 관리자에게 연락해주세요");
//				black_check=!(black_check); //false->true , true->false
//				continue;
//			}
//			coffee_amount-=10;//커피재고향 10감소
//			total_sale++;//총판매량 1잔 증가
//			total_price+=100;//총판매금액 100 증가
//			input_price-=100;//쿠입금액 100 감소
//			System.out.println("블랙커피 1잔이 나왔습니다. 여유로운 커피 1잔을 즐기세요");
//			System.out.println("coffee_amount"+coffee_amount);
//			System.out.println("sugar_amount"+sugar_amount);
//			System.out.println("milk_amount"+milk_amount);
//			System.out.println("total_price"+total_price);
//			System.out.println("input_price"+input_price);
//			
//			
//			break;
//		case 2:
//			break;
//		case 3:
//			break;
//		case 4:
//			break;
//		case 9:
//			System.out.println("관리자 아이디를 입력하세요");
//			String check_id=scan.next();
//			if(id.equals(check_id)) {
//				System.out.println("아이디가 일치하지 않습니다. 다시 입력해주세요");
//				continue;
//				
//			}
//			String check_pass=scan.next();
//			if(pass.equals(check_pass)) {
//				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
//				continue;
//				
//			}
//			
//			
//			
//			break;
//		case 0:
//			System.out.println("시스템종료");
//			break;
//		
//		default:
//			System.out.println("시스템오류");
//			break;
//			
//		}//switch
//		
//		
//		
//		
//		
//		System.out.println("-------------------------");
//	}//while
//		
//		
		
		
		
		Scanner scan=new Scanner(System.in);
		
		int coffee=100;
		int sugar=50;
		int milk=70;
		int input=0;
		int	input2=0;
		int money=0;
		int jan=0;
		int tr=0;
		String menu1="블랙커피";
		String menu2="흑당커피";
		String menu3="카페라떼";
		String menu4="밀크커피";
		
		String id="aaa";
		String pd="1234";
		
		System.out.println("[자판기 프로그램]");
	loop1:	while(true) {
			System.out.println();
			System.out.printf("메뉴를 선택하세요 (종료 0) %n1)%s -100원 %n2)%s -300원 %n3)%s -200원 %n4)%s -100원 %n9)관리자",menu1,menu2,menu3,menu4);
			input=scan.nextInt();
			jan++;
			
			
			
			switch(input) {
				case 0: 
					jan--;
					System.out.println("자판기 프로그램을 종료합니다.");
					break loop1;
				case 1:
					if(coffee<10) {
						System.out.println("현재 재료가 부족한 상태입니다 관리자에게 연락해주세요");
						jan--;
						continue;
					}
					System.out.println("블랙커피가 1잔 나왔습니다.");
					coffee-=10;
					money+=100;
					break;
				case 2:
					if(coffee<7||sugar<5) {
						System.out.println("현재 재료가 부족한 상태입니다 관리자에게 연락해주세요");
						continue;
					}
					System.out.println("흑당커피가 1잔 나왔습니다.");
					coffee-=7;
					sugar-=5;
					money+=300;
					break;
				case 3:
					if(coffee<5||milk<5) {
						System.out.println("현재 재료가 부족한 상태입니다 관리자에게 연락해주세요");
						jan--;
						continue;
					}
					System.out.println("카페라떼가 1잔 나왔습니다.");
					coffee-=5;
					milk-=5;
					money+=200;
					break;
				case 4:
					if(coffee<4||sugar<2||milk<3) {
						System.out.println("현재 재료가 부족한 상태입니다 관리자에게 연락해주세요");
						jan--;
						continue;
					}
					System.out.println("밀크커피가 1잔 나왔습니다.");
					coffee-=4;
					milk-=3;
					sugar-=2;
					money+=100;
					break;
				case 9:
					jan--;
					System.out.println("관리자모드를 선택하였습니다.");
					System.out.println("권한확인이 필요합니다 로그인을 해주세요");
					while(true) {
						if(tr>4) {
							System.out.println("비정상적인 로그인 시도가 많습니다. 메뉴선택화면으로 돌아갑니다.");
							continue loop1;
						}
						System.out.print("아이디를 입력해주세요");
						String id_ch=scan.next();
						
						if(!(id.equals(id_ch))) {
							System.out.printf("아이디가 틀렸습니다 (실패 %d회) 다시 ",tr);
							tr++;
							continue;
						}
						while(true) {
							if(tr>4) {
								System.out.println("비정상적인 로그인 시도가 많습니다. 메뉴선택화면으로 돌아갑니다.");
								continue loop1;
							}
							System.out.print("비밀번호를 입력해주세요");
							String pd_ch=scan.next();
							
							if(!(pd.equals(pd_ch))) {
								System.out.printf("비밀번호가 틀렸습니다 (실패 %d회) 다시 ",tr);
								tr++;
								continue;
							}
							break;
						}
						System.out.println();
						System.out.println("로그인 성공\n어서오세요 관리자님");
						
						loop2: while(true) {
							System.out.println();
							System.out.println("원하시는 메뉴를 선택하세요 \n1)재고확인\n2)판매현황 확인\n0)관리자모드 종료");
							
							input2=scan.nextInt();
							switch(input2) {
							
							case 0 :
								System.out.println("관리자모드를 종료합니다");
								continue loop1;
							case 1 :
								System.out.printf("[재고확인] %n커피 : %d g %n설탕 : %d g %n우유 : %d g",coffee,sugar,milk);
								System.out.println();
								break;
							case 2 :
								System.out.printf("[판매현황] %n*총판매수 :%d 잔%n*총판매금액 :%d 원",jan,money);
								System.out.println();
								break;
								
							default:
								System.out.println("잘못선택했습니다.\n ");
								break;
								
							}
						}
					}
					
					
				default :
					System.out.println("메뉴를 잘못 선택하였습니다\n");
			
			
			}//switch
			
			
		}//while loop1

	}// main

}// class
