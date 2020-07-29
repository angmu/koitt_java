import java.util.Scanner;

public class Ex0219_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("=============");
//		
//		System.out.println("4)정사각형  5)원");
//		System.out.println("원하는 메뉴를 선택하세요 (종료 0)>>>");
		
		Scanner scan=new Scanner(System.in);
		int result=0;
		double result_1=0;
		Area a1=new Area();
		System.out.println("사각형넓이 구하기 프로그램");
		System.out.println("=============");
		System.out.println("1)정사각형  2)직사각형  3)마름모");
		switch(scan.nextInt()) {
		case 1:
			System.out.println("정사각형넓이 계산");
			System.out.println("가로길이입력");
			a1.horiz=scan.nextInt();
			result=a1.square();
			System.out.println("넓이는 :"+result);
			break;
		case 2:
			System.out.println("직사각형넓이 계산");
			System.out.println("가로길이입력");
			a1.horiz=scan.nextInt();
			System.out.println("세로길이입력");
			a1.vert=scan.nextInt();
			result=a1.rect();
			System.out.println("넓이는 :"+result);
			break;
		case 3:
			System.out.println("마름모넓이 계산");
			System.out.println("가로길이입력");
			a1.horiz=scan.nextInt();
			System.out.println("높이입력");
			a1.height=scan.nextInt();
			result_1=a1.rhom();
			System.out.println("넓이는 :"+result_1);
			break;
		default:
			break;
			
		}
		
		
	}

}
