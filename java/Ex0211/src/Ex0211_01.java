import java.util.Scanner;

public class Ex0211_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// å���ִ� ����ζ� '��'
		//
		// char>int ��ȯ '0'�� ���ϰų� ���ش�.
		//
		
		
		
		// +�ɼ� 6���� ���ڸ� �Է¹޾Ƽ�
		// 1�� 10�� 6��/ 2�� 1�� 5�� /3�� �鸸�� 4�� /4�� 10���� 3�� /5�� 5õ�� 2��

		int[] ball = new int[45];// �ζǹ�ȣ
		int ball_index = 0;// �ζǹ�ȣ �ڸ���
		int temp = 0;// �ӽú���
		int[] user_ball = new int[6];// ��������(�Է¹޴°�)
		int score = 0;// ��������
		int[] user_index = new int[6];// ����(�񱳰�)

		Scanner scan = new Scanner(System.in);
		System.out.println("�ζǹ�ȣ ��÷");

		// �ζǹ�ȣ ���� 1~45
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		// �ζǹ�ȣ ����
		for (int i = 0; i < 300; i++) {
			ball_index = (int) (Math.random() * 45);
			temp = ball[0];
			ball[0] = ball[ball_index];
			ball[ball_index] = temp;

		}
		// ���� �ζǹ�ȣ �Է�
		for (int i = 0; i < 6; i++) {
			System.out.println("���ϴ� ����(1~45������ ����)�� �Է��ϼ���");
			user_ball[i] = scan.nextInt();
			for (int j = 0; j < 6; j++) {
				if (user_ball[i] == user_index[j]) {
					System.out.println("�ߺ��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���");
					i--;
					continue;
				}
			}
			if (!(user_ball[i] >= 1 && user_ball[i] <= 45)) {
				System.out.println("�Է°��� �߸��Ǿ����ϴ�.");
				i--;
				continue;
			}

			user_index[i] = user_ball[i];
		}

		// �ζǹ�ȣ ���
		System.out.println("�ζǹ�ȣ��");
		for (int i = 0; i < 6; i++) {
			System.out.printf(ball[i] + " ");

		}
		//���Ҷ��� for�� 2���Ἥ []���� ������ �ٸ��� ���� �ؾ� �񱳰� Ȯ���� �ȴ�,
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (ball[i] == user_ball[j]) {
					score++;
					System.out.printf("��÷��ȣ :" + ball[i]);
				}
			}
		}

		switch (score) {

		case 2:
			System.out.println(" 5�� ��÷ / ��� :5õ��");
			break;
		case 3:
			System.out.println(" 4�� ��÷ / ��� :����");
			break;
		case 4:
			System.out.println(" 3�� ��÷ / ��� :100����");
			break;
		case 5:
			System.out.println(" 2�� ��÷ / ��� :1���");
			break;
		case 6:
			System.out.println(" 1�� ��÷ / ��� :10���");
			break;
		default:
			System.out.println(" ��÷���� �ʾҽ��ϴ�.");
			break;
		}

	}

}
