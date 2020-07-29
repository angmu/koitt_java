import java.util.Scanner;

public class Ex0217_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		성적처리 프로그램
//		( 기본 – 이름, 국어, 영어,수학,합계,평균,등수 )
//		( 옵션 – 1. 학생추가  2.학생출력  3.등수처리  0.종료 )
		Scanner scan = new Scanner(System.in);

		int[][] score = new int[10][4];
		String[] name = new String[10];
		int[] rank = new int[10];
		int rank_1 = 0;
		String[] subject = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		double[] avg = new double[10];
		int count = 0;
		int input = 0;
		String select = "";

		loop: while (true) {
			System.out.println("성적처리 프로그램");
			System.out.println("원하시는 번호를 입력하세요");
			System.out.println("1. 학생추가\t2. 성적출력\t3. 학생검색\t\n5. 등수처리\t0. 종료");
			input = scan.nextInt();
			switch (input) {
			case 0:
				System.out.println("프로그램 종료");
				break loop;
			case 1:
				System.out.println("학생추가를 선택");
				for (int i = count; i < name.length; i++) {
					System.out.println((i + 1) + "번째 학생의 이름을 입력하세요 (종료 0)");
					name[i] = scan.next();
					if (name[i].equals("0")) {
						System.out.println("점수입력을 종료합니다");
						i--;
						break loop;
					}
					for (int j = 0; j < score[i].length - 1; j++) {
						System.out.println(name[i] + "학생의 " + subject[j + 1] + " 점수를 입력하세요");
						score[i][j] = scan.nextInt();
						if (!(score[i][j] >= 0 && score[i][j] <= 100)) {
							System.out.println("점수를 잘못 입력했습니다");
							j--;
							continue;
						}

						// 합계
						score[i][score[i].length - 1] += score[i][j];
					}
					avg[i] = score[i][score[i].length - 1] / (double) (score[i].length - 1);
					count++;
				}
				break;
			case 2:
				System.out.println("성적출력을 선택");
				// 출력
				for (int i = 0; i < subject.length; i++) {
					System.out.print(subject[i] + "\t");
				}
				System.out.println();
				for (int i = 0; i < count; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.print(Math.round(avg[i] * 100) / 100 + "\t");
					System.out.println(rank[i] + "\t\n");

				}
				break;
			case 3:
				System.out.println("학생선택을 선택");
				System.out.println("원하는 학생의 이름을 입력하세요");
				select = scan.next();
				for (int i = 0; i < count; i++) {
					if (select.equals(name[i])) {
						for (int j = 0; j < subject.length; j++) {
							System.out.print(subject[j] + "\t");
						}System.out.println();
						System.out.print(name[i] + "\t");
						for (int j = 0; j < score[i].length; j++) {
							System.out.print(score[i][j] + "\t");
						}
						System.out.print(Math.round(avg[i] * 100) / 100 + "\t");
					}else {
						System.out.println("일치하는 학생이 없습니다.");
						continue loop;
					}
				}

				break;
//			case 4:
//				System.out.println("학생삭제를 선택");
//				break;
			case 5:
				System.out.println("등수처리를 선택");
				// 등수
				for (int i = 0; i < count; i++) {
					rank_1 = 1;
					for (int j = 0; j < count; j++) {
						if (score[i][score[i].length - 1] < score[j][score[i].length - 1]) {
							rank_1++;
						}
					}
					rank[i] = rank_1;
				}
				break;

			default:
				System.out.println("잘못선택하였습니다. 다시 입력해주세요");
				break;

			}
		}

//		//대소문자 변환
//		
//		String input="";
//		char result_1=' ';
//		String result="";
//		
//		
//		System.out.println("알파벳을 입력해주세오");
//		input=scan.nextLine();
//		for(int i=0;i<input.length();i++) {
//			if(input.charAt(i)>='a'&&input.charAt(i)<='z') {
//				result_1=(char)(input.charAt(i)-32);
//			}else if(input.charAt(i)>='A'&&input.charAt(i)<='Z') {
//				result_1=(char)(input.charAt(i)+32);
//			}else{
//				result_1=(char)(input.charAt(i));
//			}result+=result_1;
//		}
//		System.out.println("입력받은 문자 :"+input);
//		System.out.println("변환문자 :"+result);

	}

}
