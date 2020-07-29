import java.util.Scanner;

public class Ex0212_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//성적처리 프로그램
		//이름 국어 영어 수학 합계 평균
		
		String[] name=new String[3];
		String[] subject= {"","국어","영어","수학","합계","평균"};
		int[][] score=new int[3][4];
		double[] ave=new double[3];
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<name.length;i++) {
			System.out.println("학생의 이름을 입력하세요");
			name[i]=scan.next();
			loop1:for(int j=0;j<score[i].length-1;j++) {
				System.out.println(name[i]+"의 "+(j+1)+"번째 점수를 입력하세요");
				score[i][j]=scan.nextInt();
				//합계
				if(!(score[i][j]>=0&&score[i][j]<=100)) {
					System.out.println("점수가 잘못되었습니다.");
					continue loop1;
				}
				score[i][3]+=score[i][j];
			}
			//평균
			ave[i]=(double)(score[i][3]/3.0);
		}
		
		for(int i=0;i<subject.length;i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println();
		//출력
		for(int i=0;i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.printf("%.1f",ave[i]);
			System.out.println();
		}
		
		
	}

}
