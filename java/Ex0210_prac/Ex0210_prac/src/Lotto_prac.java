import java.util.Scanner;

public class Lotto_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] user_input = new int[6];// �����Է�'
		int temp = 0;// ball����
		int ball_save = 0;// ball�����ڸ�
		int cnt = 0;// ���� ���ڰ���
		int cnt_b = 0;
		int[] ball_selec = new int[7];// �ζǹ�ȣ ����
		int[] win_num = new int[7];
		int[] ball = new int[45];
		int bonus = 7;

		Scanner scan = new Scanner(System.in);

		// �ζǹ�ȣ 1~45
		for (int j = 0; j < ball.length; j++) {
			ball[j] = j + 1;
		}
//		// �ζǹ�ȣ ����
//		for (int j = 0; j < 200; j++) {
//			ball_save = (int) (Math.random() * 45);
//			temp = ball[0];
//			ball[0] = ball[ball_save];
//			ball[ball_save] = temp;
//		}
		// �ζǹ�ȣ ����
		for (int j = 0; j < 7; j++) {
			ball_selec[j] = ball[j];
		}
		for (int i = 0; i < user_input.length; i++) {

			System.out.println("1~45�� ������ 1���� ���ÿ�");
			user_input[i] = scan.nextInt();
			if (!(user_input[i] >= 1 && user_input[i] <= 45)) {
				System.out.println("�߸��� ��ȣ�Դϴ� �ٽ� ������");
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
			System.out.println("�ζǹ�ȣ��?");

			for (int i = 0; i < 7; i++) {
				System.out.print(ball_selec[i] + " ");
			}
			System.out.println(cnt+"�� ���缭");
			if (cnt >= 0 && cnt<=2) {
				
				System.out.println("��÷�����ʾҽ��ϴ�.");
			} else {
				System.out.println("��÷�Ǿ����ϴ�.");
				switch (cnt) {
				case 3:
					System.out.println("5�� ��÷ ���:5õ��");
					break;
				case 4:
					System.out.println("4�� ��÷ ���:10����");
					break;
				case 5:
					if (cnt_b > 0 && cnt != 6) {
						System.out.println("2�� ��÷ ��� 5õ����");
						System.out.println("���ʽ� ��÷��ȣ :" + win_num[6]);
						break;
					} else {
						System.out.println("3�� ��÷ ��� 150����");
						break;
					}
				case 6:
					System.out.println("1�� ��÷ ��� 16���");
					break;
				default:
					break;
			}// switch
		}

	}

}
