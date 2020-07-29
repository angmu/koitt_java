import java.util.Scanner;

public class Ex0212_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이름 국어 영어 수학 과학 합계

		String[] name = new String[3];
		int[][] score = new int[3][5];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			System.out.println("이름을 입력해주세요");
			name[i] = scan.next();
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.printf(name[i] + "학생의 ");
				switch(j) {
				case 0:System.out.printf("국어 ");
				break;
				case 1:System.out.printf("영어 ");
				break;
				case 2:System.out.printf("수학 ");
				break;
				case 3:System.out.printf("과학 ");
				break;
				
				}
				
				System.out.printf("점수를 입력해주세요%n");
				score[i][j] = scan.nextInt();
				score[i][4] += score[i][j];
			}
		}

		System.out.println("\t국어\t영어\t수학\t과학\t합계");
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
