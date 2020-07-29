import java.util.Scanner;

public class Ex0219_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		int[] input=new int[2];
		int result=0;//아래쪽 메서드의 result와 같은게 아님. 값만 넘어오는것임..ㅇ.ㅇ
		double result_1=0;
		
		while(true) {
			System.out.println("[사칙연산프로그램]");
			System.out.println("--------------");
			System.out.println("1. 더하기  2. 빼기  3. 곱하기  4. 나누기");
			System.out.println("원하는 프로그램 선택>>>");
			switch(scan.nextInt()) {
			case 1:
				System.out.println("더하기 프로그램");
				input=print(input);
				//메서드 호출!(static메서드라 클래스명을 안써도되지만 썻다리..'ㅂ'
				result=Ex0219_01.add(input[0],input[1]);
				System.out.println("결과값 :"+result);
				break;
			case 2:
				System.out.println("빼기 프로그램");
				input=print(input);
				//메서드 호출!(static메서드라 클래스명을 안써도되지만 썻다리..'ㅂ'
				result=Ex0219_01.subtract(input[0],input[1]);
				System.out.println("결과값 :"+result);
				break;
			case 3:
				System.out.println("곱하기 프로그램");
				input=print(input);
				//메서드 호출!(static메서드라 클래스명을 안써도되지만 썻다리..'ㅂ'
				result=Ex0219_01.gob(input[0],input[1]);
				System.out.println("결과값 :"+result);
				break;
				
			case 4:
				System.out.println("나누기 프로그램");
				input=print(input);
				//메서드 호출!(static메서드라 클래스명을 안써도되지만 썻다리..'ㅂ'
				result_1=Ex0219_01.nanu((double)input[0],input[1]);
				System.out.println("결과값 :"+result_1);
				break;
				
			default:
				break;
			
			}
			
		}
	}//main

	//프린트메서드
	static int[] print(int[] input) { //이미 input이란 형태에 값이 있으므로 반환할 필요없어서 void로 변경가는
		Scanner scan=new Scanner(System.in);
		System.out.println("1번째 숫자를 입력하세요>>");
		input[0]=scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요>>");
		input[1]=scan.nextInt();
		return input;
	}
	
	//더하기 메서드
	static int add(int a,int b) {
		return a+b;
	}
	
	//빼기 메서드
	static int subtract(int a,int b) {
		return a-b;
	}
	//곱하기 메서드
	static int gob(int a,int b) {
		return a*b;
	}
	//나누기 메서드
	static double nanu(double a,int b) {
		return a/b;
	}
	
		
		
		
		//1. 메소드(프로그램 길이가 짧으면 안빼도 된다요..:D
		//1-1 (값을 전달받)
//		Scanner scan=new Scanner(System.in);
//		int input1=0,input2=0;
//		int result=0;//아래쪽 메서드의 result와 같은게 아님. 값만 넘어오는것임..ㅇ.ㅇ
//		double result_1=0;
//		
//		while(true) {
//			System.out.println("[사칙연산프로그램]");
//			System.out.println("--------------");
//			System.out.println("1. 더하기  2. 빼기  3. 곱하기  4. 나누기");
//			System.out.println("원하는 프로그램 선택>>>");
//			switch(scan.nextInt()) {
//			case 1:
//				System.out.println("더하기 프로그램");
//				System.out.println("더하고 싶은 숫자를 입력하세요>>");
//				input1=scan.nextInt();
//				System.out.println("더하고 싶은 숫자를 1개 더 입력하세요>>");
//				input2=scan.nextInt();
//				//메서드 호출!(static메서드라 클래스명을 안써도되지만 썻다리..'ㅂ'
//				result=Ex0219_01.add(input1,input2);
//				System.out.println("결과값 :"+result);
//				break;
//			case 2:
//				System.out.println("빼기 프로그램");
//				System.out.println("빼고 싶은 숫자를 입력하세요>>");
//				input1=scan.nextInt();
//				System.out.println("뺄 숫자를 입력하세요>>");
//				input2=scan.nextInt();
//				//메서드 호출!(static메서드라 클래스명을 안써도되지만 썻다리..'ㅂ'
//				result=Ex0219_01.subtract(input1,input2);
//				System.out.println("결과값 :"+result);
//				break;
//			case 3:
//				System.out.println("곱하기 프로그램");
//				System.out.println("곱하고 싶은 숫자를 입력하세요>>");
//				input1=scan.nextInt();
//				System.out.println("곱할 숫자를 1개더 입력하세요>>");
//				input2=scan.nextInt();
//				//메서드 호출!(static메서드라 클래스명을 안써도되지만 썻다리..'ㅂ'
//				result=Ex0219_01.gob(input1,input2);
//				System.out.println("결과값 :"+result);
//				break;
//				
//			case 4:
//				System.out.println("나누기 프로그램");
//				System.out.println("나누고 싶은 숫자를 입력하세요>>");
//				input1=scan.nextInt();
//				System.out.println("나눌 숫자를 입력하세요>>");
//				input2=scan.nextInt();
//				//메서드 호출!(static메서드라 클래스명을 안써도되지만 썻다리..'ㅂ'
//				result_1=Ex0219_01.nanu((double)input1,input2);
//				System.out.println("결과값 :"+result_1);
//				break;	
//				
//			default:
//				break;
//			
//			}
//			
//		}
//	}//main
//
//	//더하기 메서드
//	static int add(int a,int b) {
//		int result=0;
//		result=a+b;
//		return result;
//	}
//	
//	//빼기 메서드
//	static int subtract(int a,int b) {
//		int result=0;
//		result=a-b;
//		return result;
//	}
//	//곱하기 메서드
//	static int gob(int a,int b) {
//		int result=0;
//		result=a*b;
//		return result;
//	}
//	//나누기 메서드
//	static double nanu(double a,int b) {
//		double result=0;
//		result=a/b;
//		return result;
//	}
//	
	
	
}//class
