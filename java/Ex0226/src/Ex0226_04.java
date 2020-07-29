import java.util.Scanner;

public class Ex0226_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Card c11=new Card();
		
		
		
		//카드게임
		Deck d=new Deck();
		Card[] user=new Card[7];
		Card[] com=new Card[7];
		int u_count=0,c_count=0,count=0;//유저카드개수,컴카드개수,전체카드인덱스
		int u_win=0,c_win=0;//개수세기
		loop:
		while(true) {
			if(u_count==7) {
				System.out.println("7장의 카드를 모두 선택하였습니다");
				System.out.println("게임결과 출력");
				System.out.println("===============================");
				break loop;
			}
			Scanner scan=new Scanner(System.in);
			System.out.println("카드게임 (종료 0)");
			System.out.println("====================");
			System.out.println("1)게임시작");
			System.out.println("2)1장추가");
			System.out.println("원하는 번호를 선택하세오");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				if(u_count>=3) {
					System.out.println("이미 시작된 게임입니다.");
					continue loop;
				}
				d.suffle();
				System.out.println("3장씩 뽑아가기를 선택.");
				System.out.println("유저");
				for(int i=0;i<3;i++) {
					user[u_count]=d.cardCh(count);
					u_count++;
					count++;
				}
				for(int i=0;i<u_count;i++) {
					System.out.print(user[i]+" ");
				}System.out.println();
				System.out.println("컴퓨터");
				for(int i=0;i<3;i++) {
					com[c_count]=d.cardCh(count);
					c_count++;
					count++;
				}
				for(int i=0;i<c_count;i++) {
					System.out.print(com[i]+" ");
				}System.out.println();
				break;
			case 2:
				if(u_count>=7) {
					System.out.println("카드를 너무 많이 가지고 있습니다.");
					continue loop;
				}
				System.out.println("유저");
				user[u_count]=d.cardCh(count);
				u_count++;
				count++;
				for(int i=0;i<u_count;i++) {
					System.out.print(user[i]+" ");
				}System.out.println();
				System.out.println("컴퓨터");
				com[c_count]=d.cardCh(count);
				c_count++;
				count++;
				for(int i=0;i<c_count;i++) {
					System.out.print(com[i]+" ");
				}System.out.println();
				break;
			case 0:
				System.out.println("게임종료");
				break loop;
			default:
				System.out.println("잘못입력하였습니다.");
				continue;
			}
			
			
			
			
		}//while
		//최종카드
		System.out.println("유저카드");
		for(int i=0;i<u_count;i++) {
			System.out.print(user[i]+" ");
			if(user[i].kind==3) {
				u_win++;
			}
		}System.out.println();
		System.out.println("컴카드");
		for(int i=0;i<c_count;i++) {
			System.out.print(com[i]+" ");
			if(com[i].kind==3) {
				c_win++;
			}
		}System.out.println();
		
		//clover의 개수가 많은자는?
		
		System.out.println("유저 클로버 개수"+u_win);
		System.out.println("컴퓨터 클로버 개수"+c_win);
		
		if(u_win>c_win) {
			System.out.println("유저승리");
		}else if(u_win==c_win) {
			System.out.println("무승부");
		} else {
			System.out.println("유저패배");                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		}
		
		
		
		
	}

}//class

