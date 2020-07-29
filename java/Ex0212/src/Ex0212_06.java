import java.util.Scanner;

public class Ex0212_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 양궁경기 1차 2차 합 평균(소숫점 1자리까지)
		// 200점 만점
		// 3명 200점 이상이면 다시입력 //합계대신 최종점수

		String[] name = new String[3];
		int[][] score = new int[3][4];
		float[] ave = new float[3];
		String[] title = { " ", "1차경기", "2차경기", "합계", "최종점수", "평균" };

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < name.length; i++) {
			
			System.out.println("선수의 이름을 입력하세요");
			name[i] = scan.next();
			loop1: for (int j = 0; j < score[i].length - 2; j++) {

				System.out.printf("\n" + name[i] + " 선수의");
				switch (j) {
				case 0:
					System.out.printf("1차경기");
					break;
				case 1:
					System.out.printf("2차경기");
					break;
				}
				//점수입력
				System.out.printf(" 득점을 입력해주세요%n");
				score[i][j] = scan.nextInt();
				if (score[i][j] > 200) {
					System.out.println("입력값이 잘못되었습니다. 점수는 200점을 넘길수 없습니다.");
					j--;
					continue loop1;
				}
				//합계입력
				score[i][2] += score[i][j];
			}
			//최종점수입력
			if (score[i][0] >= score[i][1]) {
				score[i][3] = score[i][0];
			} else {
				score[i][3] = score[i][1];
			}
			//평균입력
			ave[i] = (float) ((score[i][0] + score[i][1]) /2.0);
		}
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		//출력
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.printf("%.1f", ave[i]);
			System.out.println();
		}

//		// 양궁경기 1차 2차 합 평균(소숫점 1자리까지)
//		// 200점 만점
//		// 3명 200점 이상이면 다시입력
//
//		String[] name = new String[3];
//		int[][] score = new int[3][3];
//		float[] ave = new float[3];
//		String[] title = { " ", "1차경기", "2차경기", "합", "평균" };
//
//		Scanner scan = new Scanner(System.in);
//
//		for (int i = 0; i < name.length; i++) {
//			System.out.println("선수의 이름을 입력하세요");
//			name[i] = scan.next();
//			loop1: for (int j = 0; j < score[i].length - 1; j++) {
//
//				System.out.printf("\n" + name[i] + " 선수의");
//				switch (j) {
//				case 0:
//					System.out.printf("1차경기");
//					break;
//				case 1:
//					System.out.printf("2차경기");
//					break;
//				}
//				System.out.printf(" 득점을 입력해주세요%n");
//				score[i][j] = scan.nextInt();
//				if (score[i][j] > 200) {
//					System.out.println("입력값이 잘못되었습니다. 점수는 200점을 넘길수 없습니다.");
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
