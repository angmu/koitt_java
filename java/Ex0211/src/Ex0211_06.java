import java.util.Scanner;

public class Ex0211_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5,5> 0과 1로 구성, 1당첨 0 꽝
		// 10번실행 횟수랑 당첨, 꽝횟수세기

		String[][] score = new String[5][5];// 당첨여부판
		int[][] board = new int[5][5];// 게임판
		int[][] board_index = new int[5][5];// 중복좌표 거르기
		int x_input = 0;
		int y_input = 0;
		int win = 0;
		int lose = 0;
		int cnt = 0;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = (int) (Math.random() * 2);
			}
		}
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = "?";
			}
		}
		Scanner scan = new Scanner(System.in);

		System.out.println("[좌표를 골라서 당첨되는 게임]");
		loop1: while (true) {
			System.out.print("\t0\t1\t2\t3\t4\n");
			for (int i = 0; i < score.length; i++) {
				System.out.print(i + "\t");
				for (int j = 0; j < score[i].length; j++) {
					System.out.print(score[i][j] + "\t");
				}
				System.out.println();
			}
			while (cnt < 10) {
				System.out.println("0~4중에 원하시는 x좌표를 입력하세요 (종료 99)");
				x_input = scan.nextInt();
				if (x_input == 99) {
					System.out.println("프로그램을 종료합니다");
					break loop1;
				}
				if (!(x_input >= 0 && x_input <= 4)) {
					System.out.println("잘못입력하였습니다.");
					continue;
				}
				System.out.println("0~4중에 원하시는 y좌표를 입력하세요");
				y_input = scan.nextInt();
				if (!(y_input >= 0 && y_input <= 4)) {
					System.out.println("잘못입력하였습니다.");
					continue;
				}
				if (board_index[x_input][y_input] == 3) {
					System.out.println("중복된 좌표입니다. 다시 입력해주세요");
					continue;
				}
				if (board[x_input][y_input] == 1) {
					score[x_input][y_input] = "당첨";
					board_index[x_input][y_input] = 3;
					cnt++;
					win++;
				} else {
					score[x_input][y_input] = "꽝";
					board_index[x_input][y_input] = 3;
					lose++;
					cnt++;
				}
			}
			System.out.println(win + lose + "번의 시도 중" + "당첨" + win + "회" + "꽝" + lose + "회");
		}
		// while

	}// main

}// class
