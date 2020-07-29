import java.util.Scanner;

public class Ex0303_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String name="";
		int kor=0;
		int eng=0;
		
		System.out.println("이름을 입력하세오");
		name=scan.next();
		System.out.println("국어점수를 입력하세오");
		kor=scan.nextInt();
		try {
			System.out.println(5/0);//여기서 에러가 나서 캐치문으로 빠진다.
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();//어디에서 무슨에러가 났는지 알려준다.
			System.out.println();
		}
		System.out.println("영어점수을 입력하세오");
		eng=scan.nextInt();
		System.out.println(6);
	}

}
