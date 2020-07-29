import java.util.Scanner;

public class Lotto_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] user_input = new int[6];// 유저입력'
		int temp = 0;// ball저장
		int ball_save = 0;// ball변수자리
		int cnt = 0;// 동일 숫자개수
		int cnt_b = 0;
		int[] ball_selec = new int[7];// 로또번호 추출
		int[] win_num = new int[7];
		int[] ball = new int[45];
		int bonus = 7;

		Scanner scan = new Scanner(System.in);

		// 로또번호 1~45
		for (int j = 0; j < ball.length; j++) {
			ball[j] = j + 1;
		}
//		// 로또번호 섞기
//		for (int j = 0; j < 200; j++) {
//			ball_save = (int) (Math.random() * 45);
//			temp = ball[0];
//			ball[0] = ball[ball_save];
//			ball[ball_save] = temp;
//		}
		// 로또번호 추출
		for (int j = 0; j < 7; j++) {
			ball_selec[j] = ball[j];
		}
		for (int i = 0; i < user_input.length; i++) {

			System.out.println("1~45의 숫자중 1개를 고르시오");
			user_input[i] = scan.nextInt();
			if (!(user_input[i] >= 1 && user_input[i] <= 45)) {
				System.out.println("잘못된 번호입니다 다시 고르세요");
				i--;
				continue;
			}

		} // for
			for (int i = 0; i < user_input.length; i++) {
				for (int j = 0; j < 7; j++) {
					if (user_input[i] == ball_selec[j]) {
						cnt++;
						win_num[i] = user_input[i];
					}
					if (user_input[i] == ball_selec[6]) {
						cnt_b++;
						win_num[i] = ball_selec[6];
					}
				}
			}
			System.out.println("로또번호는?");

			for (int i = 0; i < 7; i++) {
				System.out.print(ball_selec[i] + " ");
			}
			System.out.println(cnt+"개 맞춰서");
			if (cnt >= 0 && cnt<=2) {
				
				System.out.println("당첨되지않았습니다.");
			} else {
				System.out.println("당첨되었습니다.");
				switch (cnt) {
				case 3:
					System.out.println("5등 당첨 상금:5천원");
					break;
				case 4:
					System.out.println("4등 당첨 상금:10만원");
					break;
				case 5:
					if (cnt_b > 0 && cnt != 6) {
						System.out.println("2등 당첨 상금 5천만원");
						System.out.println("보너스 당첨번호 :" + win_num[6]);
						break;
					} else {
						System.out.println("3등 당첨 상금 150만원");
						break;
					}
				case 6:
					System.out.println("1등 당첨 상금 16억원");
					break;
				default:
					break;
			}// switch
		}

	}

}
