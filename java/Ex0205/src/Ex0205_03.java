import java.util.Scanner;

public class Ex0205_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int select=0;
		int num1=0;
		int num2=0;
		loop1:
		while(true) { //전체시스템
			System.out.println("[사칙연산 프로그램] (종료 99)");
			System.out.println("-------------");
			System.out.println("1) 구구단");//더하기에서 구구단으루 변경
			System.out.println("2) 뻬기");
			System.out.println("3) 곱하기");
			System.out.println("4) 나누기");
			System.out.println("5) 더하기");
		
			select=scan.nextInt();
			
			if(select==99) {
				break;
			}
			if(!(select>=1||select<=9)) {
				System.out.println("1~4까지의 숫자를 입력하세요");
				continue;
			}
			switch(select) {
				case 1 :
					loop2:	
					while(true) {
						System.out.println("1)원하는 단만 출력.");
						System.out.println("2)원하는 단부터  출력.");
						System.out.println("원하는 번호를 입력하세요.");
												
						num1=scan.nextInt();
						
						if(num1==0) {
							System.out.println("상위로 이동합니다.");
							continue loop1;
						}
						
						else if(num1==99) {
							break loop1;
						}
						switch(num1) {
						
							case 1:
								System.out.println("원하는 단 숫자를 입력하세요 (상위이동 0, 종료 99)");
								
								num2=scan.nextInt();
								
								if(num2==0) {
									continue loop2;
								}
								else if(num2==99) {
									break loop1;
								}
								for(int i=num2;i<=num2;i++) {
									for(int j=1;j<=9;j++) {
										System.out.println(i+"*"+j+"="+i*j);
									}
					}
								
							default :
								break;
								
					}
			}//case1	
						
//						System.out.println("더하고싶은 두수를 입력하세요.(상위이동 :0, 시스템종료:99)");
//						if(num1==0) {
//							continue loop1;
//						}
//						else if(num1==99) {
//							break loop1;
//						}
//						num1=scan.nextInt();
//						System.out.println("1개 더 입력하세요.");
//						num2=scan.nextInt();
//						System.out.println("두수의 합"+num1+num2);
						
				case 2 :
					while(true) {
						System.out.println("빼고싶은 두수를 입력하세요.(상위이동 :0, 시스템종료:99)");
						if(num1==0) {
							continue loop1;
						}
						else if(num1==99) {
							break loop1;
						}
						num1=scan.nextInt();
						System.out.println("1개 더 입력하세요.");
						num2=scan.nextInt();
						System.out.println("두수의 차"+(num1-num2));
						}//case2
				case 3 :
					while(true) {
						System.out.println("곱하고싶은 두수를 입력하세요.(상위이동 :0, 시스템종료:99)");
						if(num1==0) {
							continue loop1;
						}
						else if(num1==99) {
							break loop1;
						}
						num1=scan.nextInt();
						System.out.println("1개 더 입력하세요.");
						num2=scan.nextInt();
						System.out.println("두수의 곱"+(num1*num2));
						}//case3
				case 4 :
					while(true) {
						System.out.println("곱하고싶은 두수를 입력하세요.(상위이동 :0, 시스템종료:99)");
						if(num1==0) {
							continue loop1;
						}
						else if(num1==99) {
							break loop1;
						}
						num1=scan.nextInt();
						System.out.println("1개 더 입력하세요.");
						num2=scan.nextInt();
						System.out.println("두수의 나눗셈"+(num1/(double)num2));
						}//case4
					
				default :	
					break;
			
			}
			System.out.println("프로그램을 종료합니다");
			
		}//while
		
		
		
		
		
	}//main

}//class
