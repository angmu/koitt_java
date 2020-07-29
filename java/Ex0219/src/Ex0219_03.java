import java.util.Scanner;

public class Ex0219_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//넓이 구하기 프로그램
		//1. 직사각형 input2
		//2. 삼각형 input2
		//3. 마름모
		//4. 정사각형 
		//5. 원
		//while /switch >>메소드 분리
		
//		Scanner scan=new Scanner(System.in);
//		int num=0,num2=0;
//		int input=0;
//		int result=0;
//		loop:
//		while(true) {
//			print();//프린트
//			switch(scan.nextInt()) {
//			
//			case 0:
//				System.out.println("프로그램을 종료합니다.");
//				break loop;
//			case 1:
//				System.out.println("사각형 넓이를 선택");
//				num=input();
//				num2=input();
//				System.out.println("넓이는? "+result);
//				break;
//			case 2:
//				System.out.println("삼각형 넓이를 선택");
//				num=input();
//				num2=input();
//				System.out.println("넓이는? "+result);
//				break;
//			case 3:
//				System.out.println("마름모 넓이를 선택");
//				num=input();
//				num2=input();
//				System.out.println("넓이는? "+result);
//				break;
//			case 4:
//				System.out.println("정사각형 넓이를 선택");
//				num=input();
//				System.out.println("넓이는? "+result);
//				break;
//			case 5:
//				System.out.println("원 넓이를 선택");
//				num=input();
//				System.out.println("넓이는? "+result);
//				break;
//				
//			default:
//				System.out.println("잘못입력하였습니다.");
//				continue;
//			
//			
//			}
//			
//		}//while
//		
//		
//		
//	}//main
//
//	static void print() {
//		System.out.println("=============");
//		System.out.println("넓이 구하기 프로그램");
//		System.out.println("=============");
//		System.out.println("1)직사각형  2)삼각형  3)마름모");
//		System.out.println("4)정사각형  5)원");
//		System.out.println("원하는 메뉴를 선택하세요 (종료 0)>>>");
//	}
//	
//	
//	static int input() {
//		int[] input=new int[2];
//		int result=0;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요");
//		input[0]=scan.nextInt();
//		System.out.println("숫자를 입력해주세요");
//		input[1]=scan.nextInt();
//		result=input[0]*input[1];
//		return result;
//	}
	//-----------------------결과값만 보내기
		
		
		
		
		Scanner scan=new Scanner(System.in);
		int[] num=new int[2];
		int input=0;
		int result=0;
		loop:
		while(true) {
			print();//프린트
			switch(scan.nextInt()) {
			
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			case 1:
				System.out.println("사각형 넓이를 선택");
				num=input();
				System.out.println("넓이는? "+num[0]*num[1]);
				break;
			case 2:
				System.out.println("삼각형 넓이를 선택");
				num=input();
				System.out.println("넓이는? "+0.5*num[0]*num[1]);
				break;
			case 3:
				System.out.println("마름모 넓이를 선택");
				num=input();
				System.out.println("넓이는? "+0.5*4*num[0]*num[1]);
				break;
			case 4:
				System.out.println("정사각형 넓이를 선택");
				num=input();
				System.out.println("넓이는? "+num[0]*num[0]);
				break;
			case 5:
				System.out.println("원 넓이를 선택");
				num=input();
				System.out.println("넓이는? "+3.14*num[0]*num[0]);
				break;
				
			default:
				System.out.println("잘못입력하였습니다.");
				continue;
			
			
			}
			
		}//while
		
		
		
	}//main

	static void print() {
		System.out.println("=============");
		System.out.println("넓이 구하기 프로그램");
		System.out.println("=============");
		System.out.println("1)직사각형  2)삼각형  3)마름모");
		System.out.println("4)정사각형  5)원");
		System.out.println("원하는 메뉴를 선택하세요 (종료 0)>>>");
	}
	
	
	static int[] input() {
		int[] input=new int[2];
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		input[0]=scan.nextInt();
		System.out.println("숫자를 입력해주세요");
		input[1]=scan.nextInt();
		return input;
	}
	
	//=================
//		Scanner scan=new Scanner(System.in);
//		int num,num2=0;
//		int result=0;
//		loop:
//		while(true) {
//			print();//프린트
//			switch(scan.nextInt()) {
//			
//			case 0:
//				System.out.println("프로그램을 종료합니다.");
//				break loop;
//			case 1:
//				System.out.println("사각형 넓이를 선택");
//				num=input();
//				num2=input();
//				System.out.println("넓이는? "+num*num2);
//				break;
//			case 2:
//				System.out.println("삼각형 넓이를 선택");
//				num=input();
//				num2=input();
//				System.out.println("넓이는? "+0.5*num*num2);
//				break;
//			case 3:
//				System.out.println("마름모 넓이를 선택");
//				num=input();
//				num2=input();
//				System.out.println("넓이는? "+0.5*4*num*num2);
//				break;
//			case 4:
//				System.out.println("정사각형 넓이를 선택");
//				num=input();
//				System.out.println("넓이는? "+num*num);
//				break;
//			case 5:
//				System.out.println("원 넓이를 선택");
//				num=input();
//				System.out.println("넓이는? "+3.14*num*num);
//				break;
//				
//			default:
//				System.out.println("잘못입력하였습니다.");
//				continue;
//			
//			
//			}
//			
//		}//while
//		
//		
//		
//	}//main
//
//	static void print() {
//		System.out.println("=============");
//		System.out.println("넓이 구하기 프로그램");
//		System.out.println("=============");
//		System.out.println("1)직사각형  2)삼각형  3)마름모");
//		System.out.println("4)정사각형  5)원");
//		System.out.println("원하는 메뉴를 선택하세요 (종료 0)>>>");
//	}
//	
//	
//	static int input() {
//		int input=0;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요");
//		input=scan.nextInt();
//		
//		return input;
//	}
	
}//class
