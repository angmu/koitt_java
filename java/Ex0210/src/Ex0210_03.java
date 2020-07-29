import java.util.Scanner;

public class Ex0210_03 {
	public static void main(String[] args) {
		// 1~10까지의 카드를 만들어서 비교하여
		// 배열로 1~10까지의 숫자카드.
		// 컴퓨터 배열 ~10까지의 숫자카드 >랜덤으루 배열의숫자를 섞는다.
		// 비교 후 누가 이겻나 :3

		int win = 0;
		int draw = 0;
		int lose = 0;
		int temp = 0;
		int count = 0;// 게임을 시행하고 싶은 횟수
		int[] com = new int[10];// 컴카드
		int com_ran = 0;// 컴배열
		int[] user = new int[10];// 유저카드
		int ch = 0;// 유저가 정한 수

		Scanner scan = new Scanner(System.in);

		System.out.println("컴퓨터와 함께하는 카드게임");
		for (int i = 0; i < 10; i++) {
			com[i] = (int) (Math.random() * 10) + 1;
			user[i] = (int) (Math.random() * 10) + 1;
			user[i] = user[i] + 1;

		}

		for (int i = 0; i < 200; i++) {
			com_ran = (int) (Math.random() * 10);
			temp = com[0];
			com[0] = com[com_ran];
			com[com_ran] = temp;
		}

		for (int j = 0; j < 10; j++) {
			System.out.println("원하는 숫자를 입력하세요 1~10");
			ch = scan.nextInt() - 1;
			if (ch > 10) {
				System.out.println("잘못냈습니다.");
				j--;
				continue;
			}
			user[ch] = 0;
			if (user[j] == 0) {
				System.out.println("이미 낸 카드입니다.");
				j--;
				continue;
			}

			else {
				count++;
				if (user[j] > com[j]) {
					win++;
					System.out.println("당신이 이겼습니다.");
				} else if (user[j] == com[j]) {
					draw++;
					System.out.println("당신이 이겼습니다.");
				} else {
					lose++;
					System.out.println("컴퓨터가 이겼습니다.");
				}

			}

		} // for
		System.out.printf("%n총 승부 횟수 %d 승리 %d 패배 %d 무승부 %d 승률%.1f", count, win, lose, draw,
				win / (float) count * 100.0);

	}// main

}// class
