import java.util.Scanner;

public class Ex0206_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//숙제 
//		가위바위보 겡
//		가위1
//		바위2
//		보3
//		컴퓨터와 가위바위보 게임진행
//		10번 게임을 해서 총 몇번 이겻는지 확인하는 게임
//		1.승리
//		2.무승부
//		3.패배
//		4.승리
//		5.승리
//		
//		승리 7번 무승부 번 패배 번
		
		int win=0;//이겻을때
		int loose=0;//졌을때
		int dr=0;//비겻을때
		int you=0;
		int i=0;// 실행횟수
		
		Scanner scan=new Scanner(System.in);
		System.out.println("[컴퓨터와 함께하는 가위바위보게임]");
		System.out.println("가위바위보를 몇번 하고싶은지 입력해주세요 (종료 99)");
		int cnt=scan.nextInt();//실행하고싶은 횟수
		loop : while(true) {
			if (i>=cnt) {
				System.out.println("----------------------\n ");
				System.out.println(i+"번 가위바위보를 시행하여 게임을 종료합니다.");
				break loop;
			}
			if(cnt==99) {
				System.out.println("게임을 종료합니다.");
				break loop;
			}
			int com=(int)(Math.random()*3)+1;
			System.out.println("----------------------\n ");
			System.out.println("가위바위보! (종료 99)");
			System.out.println("1)가위 2)바위 3)보 ");
			you=scan.nextInt();
			
			
			
			if(you==99) {
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}
			if (!(you>=1&&you<=3)) {
				System.out.println("잘못 입력하였습니다.");
				continue loop;
			}
			
			
			
			
			switch(you){
				case 1 :
					i++;
				    if(com==you) {
				    	System.out.printf("%d라운드 무승부",i);
				    	dr++;
				    	break;
				    }	
				    else if(com==2) {
				    	System.out.printf("%d라운드 패배",i);
				    	loose++;
				    	break;
				    }
				    else {
				    	System.out.printf("%d라운드 승리",i);
				    	win++;
				    	break;
				    }
				case 2 :
					i++;
					 if(com==you) {
						 	System.out.printf("%d라운드 무승부",i);
					    	dr++;
					    	break;
					    }	
					    else if(com==1) {
					    	System.out.printf("%d라운드 패배",i);
					    	loose++;
					    	break;
					    }
					    else {
					    	System.out.printf("%d라운드 승리",i);
					    	win++;
					    	break;
					    }
				case 3 :
					i++;
					 if(com==you) {
						 	System.out.printf("%d라운드 무승부",i);
					    	dr++;
					    	break;
					    }	
					    else if(com==1) {
					    	System.out.printf("%d라운드 패배",i);
					    	loose++;
					    	break;
					    }
					    else {
					    	System.out.printf("%d라운드 승리",i);
					    	win++;
					    	break;
					    }
				default :
					break;
					
			}
		
		}System.out.printf("가위바위보 시행횟수 %d 승리 %d 패배 %d 무승부 %d",i,win,loose,dr);
		
	}

}
