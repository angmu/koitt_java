import java.util.Scanner;

public class Ex0212_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �̸� ���� ���� ���� ���� �հ�

		String[] name = new String[3];
		int[][] score = new int[3][5];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			System.out.println("�̸��� �Է����ּ���");
			name[i] = scan.next();
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.printf(name[i] + "�л��� ");
				switch(j) {
				case 0:System.out.printf("���� ");
				break;
				case 1:System.out.printf("���� ");
				break;
				case 2:System.out.printf("���� ");
				break;
				case 3:System.out.printf("���� ");
				break;
				
				}
				
				System.out.printf("������ �Է����ּ���%n");
				score[i][j] = scan.nextInt();
				score[i][4] += score[i][j];
			}
		}

		System.out.println("\t����\t����\t����\t����\t�հ�");
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
