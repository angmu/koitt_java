import java.util.Scanner;

public class Ex0213_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �л��������α׷�
		// 1.�л������߰�, 2,�л����� ����, 3.�л���������,0 ����
		// 1. ���������Է�
		// ���� ���� �հ�
		// 3����� ���� �Է�
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է¹��� �л��� ���� �Է��ϼ���");
		int input=scan.nextInt();
		
		String[] name = new String[input];// �̸�
		int[][] score = new int[input][4];// ����
		double[] avg = new double[input];// ���
		int[] rank = new int[input];// ���
		String[] subject = { "�̸�", "����", "����", "����", "�հ�", "���", "���" };
		int rank_count = 0;
		// �̸��Է�
		// �����Է�
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "��° �л��� �̸��� �Է��ϼ���");
			name[i] = scan.next();
			//name[i] = name[i].trim();// ������ �����ִ� �޼ҵ�
			// String >> charAt subString toUppercase toLowercase
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.println(name[i] + " �л��� " + subject[j + 1] + " ������ �Է��ϼ���");
				score[i][j] = scan.nextInt();
				// ��ȿ���˻�(�߿��Ѱ��� �������� �˻�, ���߿��Ѱ��� �����ʿ��� ��ȿ���˻縦 �ؾ���..
				if (!(score[i][j] >= 0 && score[i][j] <= 100)) {
					System.out.println("�����Է��� �߸��Ǿ����ϴ�.");
					j--;
					continue;
				}
				// �հ�=�հ�+�߰�����= �հ�+=�߰�����
				score[i][score[i].length - 1] += score[i][j];
			} // ���
			avg[i] = score[i][score[i].length - 1] / (double)(score[i].length - 1);
		}
		// ������
		for (int i = 0; i < score.length; i++) {
			rank_count = 1;
			for (int j = 0; j < score.length; j++) {
				if (score[i][score[i].length - 1] < score[j][score[i].length - 1]) {
					rank_count++;
				} // score[0][2]<score[0][2]+1 //�ٲ�� ���� ���� �� �κ��̴� ''!(����������� ���� 1�� ���̴� ����.
				  // score[0][2]<score[1][2]+1
				  // score[0][2]<score[2][2]+1
			}
			rank[i] = rank_count;
		}

		// �������
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		// �������
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(avg[i] + "\t");
			System.out.print(rank[i] + "\t\n");
		}
	}

}
