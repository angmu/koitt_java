import java.util.Scanner;

public class Ex0203_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//콘솔창으로 입력받는 객체선언.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("국어점수를 입력해라");
		int kor=scan.nextInt();
		System.out.println("영어점수를 입력해라");
		int eng=scan.nextInt();
		System.out.println("수학점수를 입력해라");
		int math=scan.nextInt();
		
		double avg=(kor+eng+math)/3;
		System.out.println("국어,영어,수학의 평균 :"+avg);
		
		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("국어점수를 입력하세요.");
//		int kor=scan.nextInt();
//		System.out.println("영어점수를 입력하세요.");
//		int eng=scan.nextInt();
//		
//		double avg=(kor+eng)/2;
//		System.out.println("평균: "+avg);
//		
		
		
		
		
		
		
	}

}
