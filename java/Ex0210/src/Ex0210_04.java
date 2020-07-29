import java.util.Scanner;

public class Ex0210_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 카드게임 답
		
		int[]user_card=new int[10];
		int user_select=0;//유저가 선택한 카드배열번호
		int[]com_card=new int[10];
		int com_index=0;//컴카드 배열 순번변수
		int temp=0;//배열섞을때 쓰는변수
		int win=0;//이긴횟수
		int lose=0;//진횟수
		int draw=0;//무승부
		
		for(int i=0;i<10;i++) {
			user_card[i]=i+1; //1~10까지 숫자입력
			com_card[i]=i+1;
			
		}
		for(int i=0;i<10;i++) {
		com_index=(int)(Math.random()*10);//컴카드 배열 번호			
		temp=com_card[0];
		com_card[0]=com_card[com_index];
		com_card[com_index]=temp;
		}
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("카드 1~10중 1개를 뽑아주세요");
			System.out.println("1)1 2)2 3)3 4)4 5)5 6)6 7)7 8)8 9)9 10)10 ");
			user_select=scan.nextInt();
			if(user_select>10) {
				System.out.println("잘못된카드입니다. 다시내주세요");
				continue;
			}
			if(user_card[user_select-1]==0) {
				System.out.println("중복된 카드입니다. 다시내주세요");
				continue;
			}
			
			
			System.out.println("유저카드 :"+(user_card[user_select-1])+" 컴카드 :"+com_card[i]);
			
			if(user_card[user_select-1]-com_card[i]>0) {
				System.out.println(i+"번째 :승리");
				win++;
				user_card[user_select-1]=0;
			}else if(user_card[user_select-1]==com_card[i]) {
				System.out.println(i+"번째 :무승부");
				draw++;
				user_card[user_select-1]=0;
			}else {
				System.out.println(i+"번째 :패배");
				lose++;
				user_card[user_select-1]=0;
			}//if
			
		}//for
		System.out.printf("승률 :%.1f",(float)win/10*100.0);
		
		
	}

}
