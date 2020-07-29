import java.util.Scanner;

public class Ex0218_05 {

	public static void main(String[] args) {
		// 로또 당첨번호 회차, 당첨번호 6개,보너스번호 1개(10번)
		// 내가 입력한 번호 class// 회차번호 6개,일치개수,등수,금액
		// 입력>회차입력>번호 6자리 입력
		// 회차 검색해서-> 몇개 일치?, 몇등인지?, 금액은?
		// 1등 10억-6개 ,2등 1억-5개+보너스 3등 1천만원-5개 4등 1십만원-4개 5등 1만원-3개
		// 1판 하는데 1000원//잔고 1만원
		
		int bonus_ball = 0;
		int same = 0;
		Scanner scan = new Scanner(System.in);
		// 로또번호
		int[] ball = new int[45];// 공 45개
		User_lotto[] me = new User_lotto[10];
		// 1~45입력
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}

		// 랜덤추출
		for (int i = 0; i < 6; i++) {
			bonus_ball = (int) (Math.random() * 45) + 1;
			if (bonus_ball == ball[i]) {
				bonus_ball = (int) (Math.random() * 45) + 1;
				i--;
				continue;
			}
		}
		// 랜덤섞기
		shuffle(ball);

		// 유저입력
		System.out.println("로또 추첨시작");
		for (int i = 0; i < 6; i++) {
			me[i] = new User_lotto();
			for (int j = 0; j < 6; j++) {
				System.out.println((i + 1) + "번째 원하는 번호를 눌러주세오");
				me[i].myball[j] = scan.nextInt();
				// 로또번호와 입력번호 비교
				if (me[i].myball[i] == ball[j]) {
					me[i].success++;
				}
				if (me[i].myball[i] == bonus_ball) {
					me[i].success_1++;
				}
			}
			me[i].same_num = same;
			switch (me[i].success) {
			case 3:
				me[i].rank = 5;
				me[i].reward = 10000;
				break;
			case 4:
				me[i].rank = 4;
				me[i].reward = 100000;
				break;
			case 5:
				if (me[i].success_1 == 1) {
					me[i].rank = 2;
					me[i].reward = 10000000;
					break;
				}
				me[i].rank = 3;
				me[i].reward = 10000000;
				break;
			case 6:
				me[i].rank = 1;
				me[i].reward = 1000000000;
				break;
			default:
				System.out.println("당첨되지 않았습니다.");
				break;
			}

		}
		// 당첨번호
		System.out.print("당첨번호 :");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println("입력번호 : 10번");
		for (int i = 0; i < me.length; i++) {
			System.out.print((i + 1) + "회차 입력번호 :");
			for (int j = 0; j < me[i].myball.length; j++) {
				System.out.print(me[i].myball[j] + " ");
			}
			System.out.print(" "+me[i].same_num);
			System.out.print(" " + me[i].rank);
			System.out.print(" " + me[i].reward);
			System.out.println();
		}
	}// main
	
	
	//섞기 메소드
	static void shuffle(int[] ball){
		int temp = 0;
		int ball_index = 0;
		for (int i = 0; i < 300; i++) {
		ball_index = (int) (Math.random() * 45);
		temp = ball[0];
		ball[0] = ball[ball_index];
		ball[ball_index] = temp;
	}
	}
}// class
