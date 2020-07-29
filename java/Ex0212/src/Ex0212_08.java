import java.util.Scanner;

public class Ex0212_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//성적처리프로그램
		//이름 국어 영어 수학 합게 평균
		String[] name=new String[3];
		int [][] score=new int[3][4];
		//{0,0}{0,1}{0,2}점수 {0,3}합계
		double[] avg=new double[3];
		String[] subject= {"이름","국어","영어","수학","합계","평균"};
		
		Scanner scan=new Scanner(System.in);
		//입력폼
		for(int i=0;i<name.length;i++) {
			//이름입력
			System.out.println((i+1)+"번 학생의 이름을 입력해주세오");
			name[i]=scan.next();
			for(int j=0;j<score[i].length-1;j++) {
				//점수입력
				System.out.println(subject[j+1]+"점수를 입력하세오");
				score[i][j]=scan.nextInt();
				//합계입력
//				score[i][3]+=score[i][j];
				score[i][score[i].length-1]+=score[i][j];
			}
//			avg[i]=score[i][3]/3.0;//합계/3 하는거오 ㅏ같음.
			avg[i]=score[i][score.length-1]/(score[i].length-1);		
		}
		
//		출력
		for(int i=0;i<subject.length;i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<score.length;i++) {
			//이름출력
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				//점수출력
				System.out.print(score[i][j]+"\t");
			}
			//평균출력
			System.out.print(avg[i]+"\n");
		}
		
		
		
	}

}
