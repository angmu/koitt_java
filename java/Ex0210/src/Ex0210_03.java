import java.util.Scanner;

public class Ex0210_03 {
	public static void main(String[] args) {
		// 1~10������ ī�带 ���� ���Ͽ�
		// �迭�� 1~10������ ����ī��.
		// ��ǻ�� �迭 ~10������ ����ī�� >�������� �迭�Ǽ��ڸ� ���´�.
		// �� �� ���� �̰䳪 :3

		int win = 0;
		int draw = 0;
		int lose = 0;
		int temp = 0;
		int count = 0;// ������ �����ϰ� ���� Ƚ��
		int[] com = new int[10];// ��ī��
		int com_ran = 0;// �Ĺ迭
		int[] user = new int[10];// ����ī��
		int ch = 0;// ������ ���� ��

		Scanner scan = new Scanner(System.in);

		System.out.println("��ǻ�Ϳ� �Բ��ϴ� ī�����");
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
			System.out.println("���ϴ� ���ڸ� �Է��ϼ��� 1~10");
			ch = scan.nextInt() - 1;
			if (ch > 10) {
				System.out.println("�߸��½��ϴ�.");
				j--;
				continue;
			}
			user[ch] = 0;
			if (user[j] == 0) {
				System.out.println("�̹� �� ī���Դϴ�.");
				j--;
				continue;
			}

			else {
				count++;
				if (user[j] > com[j]) {
					win++;
					System.out.println("����� �̰���ϴ�.");
				} else if (user[j] == com[j]) {
					draw++;
					System.out.println("����� �̰���ϴ�.");
				} else {
					lose++;
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}

			}

		} // for
		System.out.printf("%n�� �º� Ƚ�� %d �¸� %d �й� %d ���º� %d �·�%.1f", count, win, lose, draw,
				win / (float) count * 100.0);

	}// main

}// class
