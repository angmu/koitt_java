import java.util.Scanner;

public class Ex0218_05 {

	public static void main(String[] args) {
		// �ζ� ��÷��ȣ ȸ��, ��÷��ȣ 6��,���ʽ���ȣ 1��(10��)
		// ���� �Է��� ��ȣ class// ȸ����ȣ 6��,��ġ����,���,�ݾ�
		// �Է�>ȸ���Է�>��ȣ 6�ڸ� �Է�
		// ȸ�� �˻��ؼ�-> � ��ġ?, �������?, �ݾ���?
		// 1�� 10��-6�� ,2�� 1��-5��+���ʽ� 3�� 1õ����-5�� 4�� 1�ʸ���-4�� 5�� 1����-3��
		// 1�� �ϴµ� 1000��//�ܰ� 1����
		
		int bonus_ball = 0;
		int same = 0;
		Scanner scan = new Scanner(System.in);
		// �ζǹ�ȣ
		int[] ball = new int[45];// �� 45��
		User_lotto[] me = new User_lotto[10];
		// 1~45�Է�
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}

		// ��������
		for (int i = 0; i < 6; i++) {
			bonus_ball = (int) (Math.random() * 45) + 1;
			if (bonus_ball == ball[i]) {
				bonus_ball = (int) (Math.random() * 45) + 1;
				i--;
				continue;
			}
		}
		// ��������
		shuffle(ball);

		// �����Է�
		System.out.println("�ζ� ��÷����");
		for (int i = 0; i < 6; i++) {
			me[i] = new User_lotto();
			for (int j = 0; j < 6; j++) {
				System.out.println((i + 1) + "��° ���ϴ� ��ȣ�� �����ּ���");
				me[i].myball[j] = scan.nextInt();
				// �ζǹ�ȣ�� �Է¹�ȣ ��
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
				System.out.println("��÷���� �ʾҽ��ϴ�.");
				break;
			}

		}
		// ��÷��ȣ
		System.out.print("��÷��ȣ :");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println("�Է¹�ȣ : 10��");
		for (int i = 0; i < me.length; i++) {
			System.out.print((i + 1) + "ȸ�� �Է¹�ȣ :");
			for (int j = 0; j < me[i].myball.length; j++) {
				System.out.print(me[i].myball[j] + " ");
			}
			System.out.print(" "+me[i].same_num);
			System.out.print(" " + me[i].rank);
			System.out.print(" " + me[i].reward);
			System.out.println();
		}
	}// main
	
	
	//���� �޼ҵ�
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
