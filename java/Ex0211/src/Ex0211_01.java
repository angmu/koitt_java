import java.util.Scanner;

public class Ex0211_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 책에있는 쉬운로뜨 'ㅂ'
		//
		// char>int 변환 '0'을 더하거나 빼준다.
		//
		
		
		
		// +옵션 6개의 숫자를 입력받아서
		// 1등 10억 6개/ 2등 1억 5개 /3등 백만원 4개 /4등 10만원 3개 /5등 5천원 2개

		int[] ball = new int[45];// 로또번호
		int ball_index = 0;// 로또번호 자릿수
		int temp = 0;// 임시변수
		int[] user_ball = new int[6];// 유저변수(입력받는값)
		int score = 0;// 맞은개수
		int[] user_index = new int[6];// 유저(비교값)

		Scanner scan = new Scanner(System.in);
		System.out.println("로또번호 추첨");

		// 로또번호 생성 1~45
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		// 로또번호 섞기
		for (int i = 0; i < 300; i++) {
			ball_index = (int) (Math.random() * 45);
			temp = ball[0];
			ball[0] = ball[ball_index];
			ball[ball_index] = temp;

		}
		// 유저 로또번호 입력
		for (int i = 0; i < 6; i++) {
			System.out.println("원하는 숫자(1~45까지의 숫자)를 입력하세요");
			user_ball[i] = scan.nextInt();
			for (int j = 0; j < 6; j++) {
				if (user_ball[i] == user_index[j]) {
					System.out.println("중복된 번호입니다. 다시 입력해주세요");
					i--;
					continue;
				}
			}
			if (!(user_ball[i] >= 1 && user_ball[i] <= 45)) {
				System.out.println("입력값이 잘못되었습니다.");
				i--;
				continue;
			}

			user_index[i] = user_ball[i];
		}

		// 로또번호 출력
		System.out.println("로또번호는");
		for (int i = 0; i < 6; i++) {
			System.out.printf(ball[i] + " ");

		}
		//비교할때는 for를 2개써서 []안의 변수가 다르게 들어가게 해야 비교가 확실히 된다,
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (ball[i] == user_ball[j]) {
					score++;
					System.out.printf("당첨번호 :" + ball[i]);
				}
			}
		}

		switch (score) {

		case 2:
			System.out.println(" 5등 당첨 / 상금 :5천원");
			break;
		case 3:
			System.out.println(" 4등 당첨 / 상금 :만원");
			break;
		case 4:
			System.out.println(" 3등 당첨 / 상금 :100만원");
			break;
		case 5:
			System.out.println(" 2등 당첨 / 상금 :1억원");
			break;
		case 6:
			System.out.println(" 1등 당첨 / 상금 :10억원");
			break;
		default:
			System.out.println(" 당첨되지 않았습니다.");
			break;
		}

	}

}
