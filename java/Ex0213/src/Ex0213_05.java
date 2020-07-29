import java.util.Scanner;

public class Ex0213_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생성적프로그램
		// 1.학생점수추가, 2,학생점수 수정, 3.학생점수삭제,0 종료
		// 1. 국어점수입력
		// 국어 영어 합계
		// 3명분의 점수 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력받을 학생의 수를 입력하세요");
		int input=scan.nextInt();
		
		String[] name = new String[input];// 이름
		int[][] score = new int[input][4];// 점수
		double[] avg = new double[input];// 평균
		int[] rank = new int[input];// 등수
		String[] subject = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		int rank_count = 0;
		// 이름입력
		// 점수입력
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번째 학생의 이름을 입력하세요");
			name[i] = scan.next();
			//name[i] = name[i].trim();// 공백을 없애주는 메소드
			// String >> charAt subString toUppercase toLowercase
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.println(name[i] + " 학생의 " + subject[j + 1] + " 점수를 입력하세요");
				score[i][j] = scan.nextInt();
				// 유효성검사(중요한것은 서버에서 검사, 덜중요한것은 유저쪽에서 유효성검사를 해야함..
				if (!(score[i][j] >= 0 && score[i][j] <= 100)) {
					System.out.println("점수입력이 잘못되었습니다.");
					j--;
					continue;
				}
				// 합계=합계+추가점수= 합계+=추가점수
				score[i][score[i].length - 1] += score[i][j];
			} // 평균
			avg[i] = score[i][score[i].length - 1] / (double)(score[i].length - 1);
		}
		// 등수계산
		for (int i = 0; i < score.length; i++) {
			rank_count = 1;
			for (int j = 0; j < score.length; j++) {
				if (score[i][score[i].length - 1] < score[j][score[i].length - 1]) {
					rank_count++;
				} // score[0][2]<score[0][2]+1 //바뀌는 곳은 앞의 행 부분이다 ''!(낮은등수에게 숫자 1을 멕이는 형식.
				  // score[0][2]<score[1][2]+1
				  // score[0][2]<score[2][2]+1
			}
			rank[i] = rank_count;
		}

		// 제목출력
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		// 점수출력
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
