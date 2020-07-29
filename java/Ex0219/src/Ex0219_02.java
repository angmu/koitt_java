import java.util.Scanner;

public class Ex0219_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.최대 값 구하기 (3개의 숫자를 넣어서 1 최대값 2 최소값
		// 2. 절대값 구하기(1개의 숫자를 넣어서 절대값 구하기)
		// 3. 제곱값 구하기(첫번째숫자 5, 제곱수 2를 넣으면 5*5=25
		// 원하는 번호를 선택하세오>>
		int result, min = 0;

		Scanner scan = new Scanner(System.in);
		loop1: while (true) {
			print();// 화면출력메소드

			switch (scan.nextInt()) {

			case 1:
				max();// 최대값 구하기 메소드
				break;

			case 2:
				min();// 최소값 메소드
				break;

			case 3:
				abs();
				break;

			case 4:
				pow();
				break;
			case 99:
				break loop1;
			default:
				break;

			}
		} // while
	}// main

	// 화면출력 메소드
	static void print() {
		System.out.println("------------------");
		System.out.println("무튼 잡학다식한 프로그램:D");
		System.out.println("------------------");
		System.out.println("1)최대값 구하기 2)최소값 구하기 3)절대값 구하기 4)제곱값구하기 (이전화면 99, 종료 0)");
		System.out.println("원하는 번호를 선택하세오>>");
	}
	static int[] for_int(int []s_num) {
		Scanner scan=new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("숫자를 입력하세오");
			s_num[i] = scan.nextInt();
			if (s_num[i] == 99) {
				break;// 이전화면이동
			} else if (s_num[i] == 0) {
				break;
			}
		} // for
		return s_num;
	}
	// 최대값메소드
	static void max() {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int[] s_num = new int[3];
		while (true) {// 최대값무한반복
			System.out.println("최대값 구하기 선택 (이전화면 99, 종료 0)");
			s_num=for_int(s_num);//입력3개 메소드-배열주소
			if (s_num[0] == 99) {
				break ;// 이전화면이동
			} else if (s_num[0] == 0) {
				break ;
			}
				// 최대값구하기
				// Math.max(Math.max(1,2),3);
			max = Math.max(Math.max(s_num[0], s_num[1]), s_num[2]);
			System.out.println("최대값 :" + max);
		}
	}

	static void min() {
		Scanner scan = new Scanner(System.in);
		int min = 0;
		int[] s_num = new int[3];
		while (true) {// 최소값무한반복
			System.out.println("최소값 구하기 선택 (이전화면 99, 종료 0)");
			s_num=for_int(s_num);//입력3개 메소드-배열주소
			if (s_num[0] == 99) {
				break ;// 이전화면이동
			} else if (s_num[0] == 0) {
				break ;
			}
				// 최소값구하기
				// Math.min(Math.max(1,2),3);
			min = Math.min(Math.min(s_num[0], s_num[1]), s_num[2]);
			System.out.println("최소값 :" + min);
		}
	}
	
	static void abs() {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int[] s_num = new int[3];
		loop2: while (true) {// 최대값무한반복
			System.out.println("절대값 구하기 선택 (이전화면 99, 종료 0)");
			for (int i = 0; i < 1; i++) {
				System.out.println("숫자를 입력하세오");
				s_num[i] = scan.nextInt();
				if (s_num[i] == 99) {
					break loop2;// 이전화면이동
				} else if (s_num[i] == 0) {
					break loop2;
				}
			} // for
				// 절대값구하기
				// Math.abs(3);
			result = Math.abs(s_num[0]);
			System.out.println("절대값 :" + result);
		}
	}
	
	static void pow() {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int[] s_num = new int[3];
		String[]title= {"제곱할 수","제곱할 횟수"};
		loop2: while (true) {// 최대값무한반복
			System.out.println("제곱 구하기 선택 (이전화면 99, 종료 0)");
			for (int i = 0; i < 2; i++) {
				System.out.println(title[i]+"를 입력하세오");
				s_num[i] = scan.nextInt();
				if (s_num[i] == 99) {
					break loop2;// 이전화면이동
				} else if (s_num[i] == 0) {
					break loop2;
				}
			} // for
				// 절대값구하기
				// Math.max(Math.max(1,2),3);
//			result = Math.pow(s_num[0], s_num[1]);
			System.out.println("절대값 :" + result);
		}
	}

//		//1.최대 값 구하기 (3개의 숫자를 넣어서 1 최대값 2 최소값
//		//2. 절대값 구하기(1개의 숫자를 넣어서 절대값 구하기)
//		//3. 제곱값 구하기(첫번째숫자 5, 제곱수 2를 넣으면 5*5=25
//		//원하는 번호를 선택하세오>>
//		int result=0;
//		int []input=new int[3];
//		Scanner scan=new Scanner(System.in);
//		while(true) {
//			System.out.println("------------------");
//			System.out.println("무튼 잡학다식한 프로그램:D");
//			System.out.println("------------------");
//			System.out.println("1)최소값 구하기 2)최소값 구하기 3)절대값 구하기 4)제곱값구하기");
//			System.out.println("원하는 번호를 선택하세오>>");
//			switch(scan.nextInt()) {
//			
//			case 1:
//				System.out.println("최소값 구하기");
//				for(int i=0;i<input.length;i++) {
//					System.out.println((i+1)+"번째 숫자를 입력하세오");
//					input[i]=scan.nextInt();
//				}
//				break;
//			case 2:
//				System.out.println("최소값 구하기");
//				for(int i=0;i<input.length;i++) {
//					System.out.println((i+1)+"번째 숫자를 입력하세오");
//					input[i]=scan.nextInt();
//				}
//				break;
//			case 3:
//				System.out.println("절대값 구하기");
//				for(int i=0;i<1;i++) {
//					System.out.println("원하는 숫자를 입력하세오");
//					input[i]=scan.nextInt();
//				}
//				result=abs_arr(input[0]);
//				System.out.println("결과 값:"+result);
//				break;
//			case 4:
//				System.out.println("제곱값 구하기");
//				for(int i=0;i<2;i++) {
//					System.out.println("원하는 숫자를 입력하세오");
//					input[i]=scan.nextInt();
//				}
//				result=Squ(input[0],input[1]);
//				System.out.println("결과 값:"+result);
//				break;
//			default:
//				break;
//			
//			}
//		}//while
//		

	// 아래는 내가 푼것
	static int max(int a, int b, int c) {
		return a;
	}

	static int mini(int a, int b, int c) {
		return a;
	}

	static int abs_arr(int a) {
		if (a < 0) {
			a = -a;
		}
		return a;
	}

	static int Squ(int a, int b) {
		int c = a;
		for (int i = 0; i < b - 1; i++) {
			a *= c;
		}
		return a;
	}

}// class
