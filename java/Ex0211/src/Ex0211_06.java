import java.util.Scanner;

public class Ex0211_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5,5> 0�� 1�� ����, 1��÷ 0 ��
		// 10������ Ƚ���� ��÷, ��Ƚ������

		String[][] score = new String[5][5];// ��÷������
		int[][] board = new int[5][5];// ������
		int[][] board_index = new int[5][5];// �ߺ���ǥ �Ÿ���
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

		System.out.println("[��ǥ�� ��� ��÷�Ǵ� ����]");
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
				System.out.println("0~4�߿� ���Ͻô� x��ǥ�� �Է��ϼ��� (���� 99)");
				x_input = scan.nextInt();
				if (x_input == 99) {
					System.out.println("���α׷��� �����մϴ�");
					break loop1;
				}
				if (!(x_input >= 0 && x_input <= 4)) {
					System.out.println("�߸��Է��Ͽ����ϴ�.");
					continue;
				}
				System.out.println("0~4�߿� ���Ͻô� y��ǥ�� �Է��ϼ���");
				y_input = scan.nextInt();
				if (!(y_input >= 0 && y_input <= 4)) {
					System.out.println("�߸��Է��Ͽ����ϴ�.");
					continue;
				}
				if (board_index[x_input][y_input] == 3) {
					System.out.println("�ߺ��� ��ǥ�Դϴ�. �ٽ� �Է����ּ���");
					continue;
				}
				if (board[x_input][y_input] == 1) {
					score[x_input][y_input] = "��÷";
					board_index[x_input][y_input] = 3;
					cnt++;
					win++;
				} else {
					score[x_input][y_input] = "��";
					board_index[x_input][y_input] = 3;
					lose++;
					cnt++;
				}
			}
			System.out.println(win + lose + "���� �õ� ��" + "��÷" + win + "ȸ" + "��" + lose + "ȸ");
		}
		// while

	}// main

}// class
