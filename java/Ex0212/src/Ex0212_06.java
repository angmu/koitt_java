import java.util.Scanner;

public class Ex0212_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ð�� 1�� 2�� �� ���(�Ҽ��� 1�ڸ�����)
		// 200�� ����
		// 3�� 200�� �̻��̸� �ٽ��Է� //�հ��� ��������

		String[] name = new String[3];
		int[][] score = new int[3][4];
		float[] ave = new float[3];
		String[] title = { " ", "1�����", "2�����", "�հ�", "��������", "���" };

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < name.length; i++) {
			
			System.out.println("������ �̸��� �Է��ϼ���");
			name[i] = scan.next();
			loop1: for (int j = 0; j < score[i].length - 2; j++) {

				System.out.printf("\n" + name[i] + " ������");
				switch (j) {
				case 0:
					System.out.printf("1�����");
					break;
				case 1:
					System.out.printf("2�����");
					break;
				}
				//�����Է�
				System.out.printf(" ������ �Է����ּ���%n");
				score[i][j] = scan.nextInt();
				if (score[i][j] > 200) {
					System.out.println("�Է°��� �߸��Ǿ����ϴ�. ������ 200���� �ѱ�� �����ϴ�.");
					j--;
					continue loop1;
				}
				//�հ��Է�
				score[i][2] += score[i][j];
			}
			//���������Է�
			if (score[i][0] >= score[i][1]) {
				score[i][3] = score[i][0];
			} else {
				score[i][3] = score[i][1];
			}
			//����Է�
			ave[i] = (float) ((score[i][0] + score[i][1]) /2.0);
		}
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		//���
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.printf("%.1f", ave[i]);
			System.out.println();
		}

//		// ��ð�� 1�� 2�� �� ���(�Ҽ��� 1�ڸ�����)
//		// 200�� ����
//		// 3�� 200�� �̻��̸� �ٽ��Է�
//
//		String[] name = new String[3];
//		int[][] score = new int[3][3];
//		float[] ave = new float[3];
//		String[] title = { " ", "1�����", "2�����", "��", "���" };
//
//		Scanner scan = new Scanner(System.in);
//
//		for (int i = 0; i < name.length; i++) {
//			System.out.println("������ �̸��� �Է��ϼ���");
//			name[i] = scan.next();
//			loop1: for (int j = 0; j < score[i].length - 1; j++) {
//
//				System.out.printf("\n" + name[i] + " ������");
//				switch (j) {
//				case 0:
//					System.out.printf("1�����");
//					break;
//				case 1:
//					System.out.printf("2�����");
//					break;
//				}
//				System.out.printf(" ������ �Է����ּ���%n");
//				score[i][j] = scan.nextInt();
//				if (score[i][j] > 200) {
//					System.out.println("�Է°��� �߸��Ǿ����ϴ�. ������ 200���� �ѱ�� �����ϴ�.");
//					j--;
//					continue loop1;
//				}
//				score[i][2] += score[i][j];
//			}
//			ave[i] = (float) (score[i][score[i].length - 1] / (score[i].length - 1));
////			ave[i]=(float)(score[i][2]/2);
//		}
//		for (int i = 0; i < title.length; i++) {
//			System.out.print(title[i] + "\t");
//		}
//		System.out.println();
//		for (int i = 0; i < score.length; i++) {
//			System.out.print(name[i] + "\t");
//			for (int j = 0; j < score[i].length; j++) {
//				System.out.print(score[i][j] + "\t");
//			}
//			System.out.printf("%.1f%n", ave[i]);
//			System.out.println();
//		}

	}

}
