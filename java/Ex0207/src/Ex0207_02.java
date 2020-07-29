import java.util.Scanner;

public class Ex0207_02 {
	public static void main(String[] args) {
		
		//가위바위보 게임  p150
		//횟수를 지정하면 그거만큼만 가위바위보를 실행
		//이긴횟수 보여주기
		//승률추가
		//로그인
		
		String id="aaa";
		String pass="1234";
		int user=0;//자신이 선택한 가위바위보
		int com=0;//컴퓨터가 선택한 가위바위보
		int win=0;//user가 이긴횟수
		int draw=0;//무승부
		int lose=0;//패배
		int count=0;//패배
		int i2=0;
		int p=0;
		
		Scanner scan=new Scanner(System.in);
			
		loop1 :
		while(true) {
				System.out.println("게임하기 전에 로그인 해주세요");
				
				while(true) {
				System.out.println("id를 입력해주세요");
				String id_ch=scan.next();
						
				if(!(id.equals(id_ch))) {
					if(i2>5) {
					System.out.println("틀린횟수가 너무 많습니다. 프로그램을 종료합니다.");
					break loop1;
					}
					System.out.println("id가 일치하지 않습니다.");
					i2++;
					continue;
					}break;
				}
				while(true) {
				System.out.println("password를 입력해주세요");
				String pass_ch=scan.next();
				
				if(!(pass.equals(pass_ch))) {
					if(p>5) {
						System.out.println("틀린횟수가 너무 많습니다. 프로그램을 종료합니다.");
						break loop1;
					}
					System.out.println("password가 일치하지 않습니다.");
					p++;
					continue;
					}break;
				}
			System.out.println("반복횟수를 입력하세요.>>");
			count=scan.nextInt();
			for(int i=1;i<=count;i++) {
					
					
					System.out.println("가위(1), 바위(2), 보(3) 중에 하나르 선택하세요");
					user=scan.nextInt();
					
					if(user<1||user>3) {
						System.out.println("숫자를 잘못 넣었습니다. (1~3까지만)");
						i--; //잊지말기..
						continue;
						
					}
					
					
					com=(int)(Math.random()*3)+1;
					System.out.println(i+"번째 판 승자는?");
					//1-3 = -2(승자) 1-1 =0 (무승부) 1-2=-1(패배)
					//2-1 =  1(승자) 2-2 =0 (무승부) 2-3=-1(패배)
					//3-2 =  1(승자) 3-3 =0 (무승부) 3-1=-2(패배)
					//-2 or 1이면 승리, 0이면 무승부 , -1or -2는 패배
					
					switch(user-com) {
					
					case -2 : case 1 :
						System.out.println("사용자가 승리");
						win++;
						break ;
					case 0 :
						System.out.println("사용자와 컴퓨터 무승부");
						draw++;
						break;
					case -1 : case 2 :
						System.out.println("컴퓨터가 승리");
						lose++;
						break;
					default :
						break;
						
					
					}
				}//for
			break;
		}	//while	
		System.out.println("게임횟수 :"+count);
		System.out.println("승리 횟수 :"+win);
		System.out.println("무승부 횟수 :"+draw);
		System.out.println("패배 횟수 :"+lose);
		System.out.printf("승률 : %.1f",(float)win/count);

			
		
		
		
		
		
		
//		int user,com;
//		int i=0;
//		int win=0;
//		int loose=0;
//		int draw=0;
//		int cnt=0;
//		
//
//		Scanner scan=new Scanner(System.in);
//		System.out.println("[가위바위보 게임]");
//		System.out.println("가위바위보를 실행할 횟수를 입력하세요 (종료 0)");
//		cnt=scan.nextInt();
//		
//		while(true) {
//			if(cnt==0) {
//				System.out.println("가위바위보를 종료합니다.");
//				break;
//			}
//			if(i==cnt) {
//				System.out.println("가위바위보를 종료합니다.");
//				break;
//			}
//			System.out.println("1.가위 2.바위 3.보 중 하나를 입력하세요 (종료 0)");
//			user=scan.nextInt();
//			com=(int)(Math.random()*3)+1;
//			if(user==0) {
//				System.out.println("가위바위보를 종료합니다.");
//			}
//			else {
//				
//				switch(user) {
//				
//				case(1) :
//					
//					if(user==com) {
//						draw++;
//						System.out.printf("%d회차 무승부%n",i);
//					}else if(com==2) {
//						loose++;
//						System.out.printf("%d회차 패배%n",i);
//					}else {
//						win++;
//						System.out.printf("%d회차 승리%n",i);
//					}
//					break;
//				
//				case(2) :
//					
//					if(user==com) {
//						draw++;
//						System.out.printf("%d회차 무승부%n",i);
//					}else if(com==3) {
//						loose++;
//						System.out.printf("%d회차 패배%n",i);
//					}else {
//						win++;
//						System.out.printf("%d회차 승리%n",i);
//					}
//					break;
//				
//				case(3) :
//					
//					if(user==com) {
//						draw++;
//						System.out.printf("%d회차 무승부%n",i);
//					}else if(com==1) {
//						loose++;
//						System.out.printf("%d회차 패배%n",i);
//					}else {
//						win++;
//						System.out.printf("%d회차 승리%n",i);
//					}
//					
//					
//				default :
//					System.out.println("잘못입력하였습니다. 다시 입력해주세요");
//					continue;
//				}i++;
//			}
//		
//		
//		}System.out.printf("가위바위보 시행 횟수 %d회 승리 %d 패배 %d 무승부 %d  종합승률%f",i,win,loose,draw,win/i);
		
	}//main
}//class
