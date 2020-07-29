import java.util.Scanner;

public class Ex0204_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100 입력값과  랜덤값을 비교하여 입력값이 크면 랜덤숫자는 입력값보다 작습니다, 작으면 반대로 메세질 띄우는 형태로 만들것. 0을 입력하면 프로그램이 종료.
		//답
		int input=0;
		String save="";
		int check=(int)(Math.random()*100)+1;
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("1-100숫자를 입력하세요 0을 누르면 종료합니다.");
			
			input=scan.nextInt();
			save=save+input+" ";
			if(input==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(input==check) {
				
				System.out.printf("당첨되었습니다. 당첨번호 :%d 입력한 번호 :%s",check,save);
				break;
			}
			else if(input>check) {
				
				System.out.println("입력숫자가 큽니다. 작은수를 입력하세요");
				
			}
			else if(input<check) {
	
				System.out.println("입력숫자가 작습니다. 큰수를 입력하세요");
				
			}
			System.out.println("입력한 번호 :" +save);
			
			
		}	//while
		
		
		
		
		
//		//while로 풀어본 것..
//		Scanner scan=new Scanner(System.in);
//		int i;
//		int ch=(int)(Math.random()*100)+1;
//		System.out.println("1~100까지의 숫자중 맘에드는 숫자를 입력하세요 0을 누르면 프로그램을 종료합니다.");
//		while(true) {
//			
//			i=scan.nextInt();
//			
//			if(i>ch) {
//				
//				System.out.println("랜덤숫자는 입력값보다 작습니다.");	
//				System.out.println("1~100까지의 숫자중 맘에드는 숫자를 입력하세요 0을 누르면 프로그램을 종료합니다.");
//			}
//			else if(i==0){
//				System.out.println("프로그램을 종료합니다");
//				break;
//			}
//			
//			else {
//				if(i<ch) {
//				System.out.println("랜덤숫자는 입력값보다 큽니다.");
//				System.out.println("1~100까지의 숫자중 맘에드는 숫자를 입력하세요 0을 누르면 프로그램을 종료합니다.");}
//				else {
//				System.out.println("정답입니다.");
//				break;
//				}
//			}
//
//			
//		}
		
		
		
		
		
		
		//멋대로 do while로 해부러따..=ㅂ=;;;;
//		Scanner scan=new Scanner(System.in);
//		int i;
//		int ch=(int)(Math.random()*100)+1;
//		
//		do {
//			System.out.println("1~100까지의 숫자중 맘에드는 숫자를 입력하세요 0을 누르면 프로그램을 종료합니다.");
//			i=scan.nextInt();
//			if(i>ch) {
//				System.out.println("랜덤숫자는 입력값보다 작습니다.");			
//			}
//			else if(i==0){
//				System.out.println("프로그램을 종료합니다");
//				break;
//			}
//			
//			else {
//				if(i<ch) {
//				System.out.println("랜덤숫자는 입력값보다 큽니다.");}
//				else {
//				System.out.println("정답입니다.");
//				break;
//			}
//
//			
//		}
//		while(!(i==ch));
		
		
	}

}
