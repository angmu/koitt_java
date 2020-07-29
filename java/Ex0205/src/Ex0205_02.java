import java.util.Scanner;

public class Ex0205_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두 수의 사칙연산 프로그램
//		1)더하기 2) 빼기 3) 곱하기 4) 나누기 원하는 숫자를 입력하세요(종료:0) 
//		1을 선택하게되면 두수를 입력하세요.(상위로 이동 0)
		Scanner scan=new Scanner(System.in);
		int btn=0;
		int input1=0;
		int input2=0;
		
		while(true) {
			System.out.println("사칙연산 출력형태 선택");
			System.out.println("1) 선택 더하기");
			System.out.println("2) 선택 빼기");
			System.out.println("3) 선택 곱하기");
			System.out.println("4) 선택 나누기");
			System.out.println("5) 원하는 단만 구구단 출력");
			System.out.println("원하는 메뉴를 선택하세요(종료 0)");
			btn=scan.nextInt();
			
			if(btn==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
						
			if(!(btn>=1||btn<=5)) {
				System.out.println("잘못된 수를 입력하였습니다.");
				continue;
			}
			if(btn==1) {
				while(true) {
					//1을 선택했을때
					System.out.println("덧셈을 실행합니다.(이전메뉴 0)");
					System.out.println("첫번째 숫자를 입력하세요");
					input1=scan.nextInt();
					if(input1==0) {
						System.out.println("선택페이지로 넘어갑니다.");
						System.out.println("-------------------");
						break;
					}
					System.out.println("두번째 숫자를 입력하세요");
					input2=scan.nextInt();
					
					System.out.println(input1+"+"+input2+"="+(input1+input2)+"입니다.");
				}
			}
			if(btn==2) {
				while(true) {
					//2을 선택했을때
					System.out.println("뺄셈을 실행합니다.(이전메뉴 0)");
					System.out.println("첫번째 숫자를 입력하세요");
					input1=scan.nextInt();
					if(input1==0) {
						System.out.println("선택페이지로 넘어갑니다.");
						System.out.println("-------------------");
						break;
					}
					System.out.println("두번째 숫자를 입력하세요");
					input2=scan.nextInt();
					
					System.out.println(input1+"-"+input2+"="+(input1-input2)+"입니다.");
				}
			}
			if(btn==3) {
				while(true) {
					//3을 선택했을때
					System.out.println("곱셈을 실행합니다.(이전메뉴 0)");
					System.out.println("첫번째 숫자를 입력하세요");
					input1=scan.nextInt();
					if(input1==0) {
						System.out.println("선택페이지로 넘어갑니다.");
						System.out.println("-------------------");
						break;
					}
					System.out.println("두번째 숫자를 입력하세요");
					input2=scan.nextInt();
					
					System.out.println(input1+"*"+input2+"="+(input1*input2)+"입니다.");
				}
			}
			if(btn==4) {
				while(true) {
					//4을 선택했을때
					System.out.println("나눗셈을 실행합니다.(이전메뉴 0)");
					System.out.println("첫번째 숫자를 입력하세요");
					input1=scan.nextInt();
					if(input1==0) {
						System.out.println("선택페이지로 넘어갑니다.");
						System.out.println("-------------------");
						break;
					}
					System.out.println("두번째 숫자를 입력하세요");
					input2=scan.nextInt();
					
					System.out.println(input1+"÷"+input2+"="+(input1/(double)input2)+"입니다.");
				}
			}
			if(btn==5) {
				while(true) {
					//5을 선택했을때
					System.out.println("구구단을 실행합니다.(이전메뉴 0)");
					System.out.println("원하는 단을 입력하세요");
					input1=scan.nextInt();
					if(input1==0) {
						System.out.println("선택페이지로 넘어갑니다.");
						System.out.println("-------------------");
						break;
					}
					else if(!(input1>=2||input1<=9)) {
						System.out.println("잘못입력하였습니다. 다시입력해주세요");
						continue;
					}
					else {
						System.out.println("["+input1+"단]");
						for(int i=input1;i<=input1;i++) {
							for(int j=1;j<=9;j++) {
								System.out.println(i+"*"+j+"="+(i*j));
							}
						}	
					}
				}
			}
		}
		
		
		
		
		
		
	}

}
