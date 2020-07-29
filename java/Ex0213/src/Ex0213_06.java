import java.util.Scanner;

public class Ex0213_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이름 국어 영어 합계 평균
		String[]name=new String[3];
		int[][]score=new int[3][3];
		String[]subject= {"이름","국어","영어","합계","평균","등수"};
		double []avg=new double[3];
		int [] rank=new int[3];
		
		Scanner scan=new Scanner(System.in);
		//이름입력
		for(int i=0;i<name.length;i++) {
			System.out.println((i+1)+"번째 학생의 이름을 입력하세오");
			name[i]=scan.next();
			for(int j=0;j<score[i].length-1;j++) {
				//점수
				System.out.println(subject[j+1]+"과목의 점수를 입력하세오");
				score[i][j]=scan.nextInt();
				//합계
				score[i][score[i].length-1]+=score[i][j];
			}//평균
			avg[i]=score[i][score[i].length]/(double)(score[i].length-1);
			
		}
		
		//등수
		for(int i=0;i<score.length;i++) {
			rank[i]=1;
			for(int j=0;j<score.length;j++) {
				if(score[i][score.length]<score[j][score.length]) {
				rank[i]++;
				}
			}
		}//등수
		
		//----출력시작
		
		for(int i=0;i<subject.length;i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;i<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}System.out.print(avg[i]+"\t");
			System.out.println(rank[i]+"\t\n");
		}
	}

}
