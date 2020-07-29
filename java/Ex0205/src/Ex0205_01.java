import java.util.Scanner;

public class Ex0205_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scan=new Scanner(System.in);
//		int select=0;
//		int dan=0;	
//LOOP1:	while(true){
//			System.out.println("구구단 출력형태 선택");
//			System.out.println("1) 선택 구구단만 출력");
//			System.out.println("2) 선택 구구단만 출력");
//			System.out.println("원하는 메뉴를 선택하세요(종료 0)");
//			
//			select=scan.nextInt();
//			
//			if(select==0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			if(!(select>=1&&select<=2)) {
//				System.out.println("숫자를 잘못 입력하였습니다. 다시 입력하세요");
//				System.out.println();
//			}
//			while(true){ //1번 선택했을때
//				System.out.println("단만 출력하는 것을 선택했습니다.");
//				System.out.println("원하는 단을 입력하세요.(상위이동0)");
//				dan=scan.nextInt();
//				
//				if(dan==0) {
//					System.out.println("선택페이지로 넘어갑니다.");
//					System.out.println("-------------------");
//					break;
//				}
//				while(true){
//					System.out.println("출력하고 싶은 단을 입력해주세요(종료 0)");
//					dan=scan.nextInt();
//					if(dan==0) {
//						System.out.println("프로그램을 종료합니다.");
//						break;
//					}
//					if(!(dan>=1&&dan<=9)) {
//						System.out.println("1~9까지의 숫자를 입력하세요");
//						continue;//1~9까지의 수가 아니면 다시 while실행
//					}
//					for(int i=dan;i<=dan;i++) {
//						if(j%3==0||j%2==0) {
//							continue;
//						}
//						for(int j=1;j<=9;j++) {
//							System.out.println(i+"*"+j+"="+i*j);
//						}
//						System.out.println("---------------");
//					}
//				
//			}
//			
//		}//while 1
		
		
		
		
		//3의 배수와 2의 배수 빼고
		
//		Scanner scan=new Scanner(System.in);
//		int dan=0;	
//		while(true){
//			System.out.println("출력하고 싶은 단을 입력해주세요(종료 0)");
//			dan=scan.nextInt();
//			if(dan==0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			if(!(dan>=1&&dan<=9)) {
//				System.out.println("1~9까지의 숫자를 입력하세요");
//				continue;//1~9까지의 수가 아니면 다시 while실행
//			}
//			for(int i=dan;i<=dan;i++) {
//				if(j%3==0||j%2==0) {
//					continue;
//				}
//				for(int j=1;j<=9;j++) {
//					System.out.println(i+"*"+j+"="+i*j);
//				}
//				System.out.println("---------------");
//			}
//			
//		}
		
		
//		//while문을 이용하여 0일때 종료하고 예제 두 수를 입력받아서 5와 7을 빼고 출력하도록
//		Scanner scan=new Scanner(System.in);
//		int dan=0;	
//		while(true){
//			System.out.println("출력하고 싶은 단을 입력해주세요(종료 0)");
//			dan=scan.nextInt();
//			if(dan==0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			if(!(dan>=1&&dan<=9)) {
//				System.out.println("1~9까지의 숫자를 입력하세요");
//				continue;//1~9까지의 수가 아니면 다시 while실행
//			}
//			for(int i=dan;i<=dan;i++) {
//				if(j==5||j==7) {
//					continue;
//				}
//				for(int j=1;j<=9;j++) {
//					System.out.println(i+"*"+j+"="+i*j);
//				}
//				System.out.println("---------------");
//			}
//			
//		}
		
		
		
//		//while문을 이용하여 0일때 종료하고 
//		Scanner scan=new Scanner(System.in);
//		int dan=0;	
//		while(true){
//			System.out.println("출력하고 싶은 단을 입력해주세요(종료 0)");
//			dan=scan.nextInt();
//			if(dan==0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			if(!(dan>=1&&dan<=9)) {
//				System.out.println("1~9까지의 숫자를 입력하세요");
//				continue;//1~9까지의 수가 아니면 다시 while실행
//			}
//			for(int i=dan;i<=dan;i++) {
//				for(int j=1;j<=9;j++) {
//					System.out.println(i+"*"+j+"="+i*j);
//				}
//				System.out.println("---------------");
//			}
//			
//		}
//		
		
		
		
//		//예제 1의 답. +출력하고싶지않은수
//		
//				Scanner scan=new Scanner(System.in);
//				System.out.println("출력하고 싶지않은 단을 입력해주세요");
//				int dan=scan.nextInt();
//				for(int i=dan;i<=dan;i++) {
//					for(int j=1;j<=9;j++) {
//						if(j==dan) {
//							continue; //continue를 쓰면 조건값일때는 건너뛰어서 출력하지않고 다음회차로 바로 넘어감, 여기서는 j가 5이거나 7일때는 출력되지않음
//						}
//						System.out.println(i+"*"+j+"="+i*j);
//						
//					}
//					System.out.println("---------------");
//				}
						
		
		
		
//		//예제 1의 답.
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("출력하고 싶은 단의 숫자를 입력해주세요");
//		int dan=scan.nextInt();
//
//		for(int i=dan;i<=dan;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//			System.out.println("---------------");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
//		//예제3. 1~9 사이의 숫자입력이 아닐시, 다시 입력하게..
//		
//		Scanner scan=new Scanner(System.in);
//		
//		
//		int i;
//		for (;i<=9;i++) {
//			System.out.println("출력하고 싶은 단의 숫자를 입력해주세요");
//			i=scan.nextInt();
//			if(i>=10||i==0) {
//				System.out.println("잘못된 숫자를 입력하였습니다");
//				break;
//			}
//			for(int j=1;j<=9;j++) {
//			System.out.println(i+"*"+j+"="+i*j);
//			}
//			
//		}
		
		
		
//		//예제2, 구구단을 출력하되 입력된 수포함해서 이후의 단만 출력되게 한다
//		
//		Scanner scan=new Scanner(System.in);
//
//		System.out.println("출력하고 싶은 단의 숫자를 입력해주세요");
//		int i=scan.nextInt();
//		for (;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//			System.out.println(i+"*"+j+"="+i*j);
//			}
//			
//		}
		
		//예제1, 구구단을 출력하되 입력된 수의 단만 출력되게 한다
		
//		Scanner scan=new Scanner(System.in);
//				
//		
//		for (;;) {
//			System.out.println("출력하고 싶은 단의 숫자를 입력해주세요");
//			int i=scan.nextInt();
//			for(int j=1;j<=9;j++) {
//			System.out.println(i+"*"+j+"="+i*j);}
//		}
		
		
		
		
		
		//-------------------------------------
		
//		Loop1 : for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(j==5) {
//					break Loop1; //break의 경우 아예 for를 빠져나가서 2x1~2x4까지만 출력 
//				}
//				System.out.println(i+"*"+j+"="+i*j);
//				
//			}
//			System.out.println("---------------");
//		}
//		
		
		
		//---------------------------------

//		Loop1 : for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(j==5) {
//					continue Loop1; //바깥쪽 for문의 이름을 지정하면 j가 5이후로는 출력되지않음 
//				}
//				System.out.println(i+"*"+j+"="+i*j);
//				
//			}
//			System.out.println("---------------");
//		}
//		
//		
		
		
		
		
		//---------------------
		
//		
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(j==5||j==7) {
//					continue; //continue를 쓰면 조건값일때는 건너뛰어서 출력하지않고 다음회차로 바로 넘어감, 여기서는 j가 5이거나 7일때는 출력되지않음
//				}
//				System.out.println(i+"*"+j+"="+i*j);
//				
//			}
//			System.out.println("---------------");
//		}
//		
		
		//---------------------
		
//		
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(j==5) {
//					break; //break에 이름을 따로 지정안하면 j있는 for반복문을 빠져나와 구구단이 4단까지만 찍힌다.
//				}
//				System.out.println(i+"*"+j+"="+i*j);
//				
//			}
//			System.out.println("---------------");
//		}
//		
		
	}

}
