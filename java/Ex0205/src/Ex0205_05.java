import java.util.Scanner;

public class Ex0205_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[넓이계산]
		//1사각형넓이
		//2삼각형넓이
		//3원넓이 (파이=3.14)
		
		Scanner scan=new Scanner(System.in);
		int btn=0;
		double h=0;
		double v=0;
		double w=0;
		
loop1	:	while(true) {
			System.out.println("[넓이계산프로그램] 넓이는 소숫점 2째자리까지만 계산됩니다. (종료 99)");
			System.out.println("1.사각형넓이");
			System.out.println("2.삼각형넓이");
			System.out.println("3.원넓이");
			
			btn=scan.nextInt();
			if(btn==99) {
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			}
			if(!(btn>=1&&btn<=3)) {
				System.out.println("1~3까지만 선택가능합니다.");
				continue loop1;
			}
			switch(btn) {
			
				case 1 : 
					while(true) {
						System.out.println("사각형넓이를 선택했습니다. 가로를 입력하세요.(종료 99 상위메뉴 0)");
						
						h=scan.nextDouble();
						if(h==99) {
							System.out.println("프로그램을 종료합니다.");
							break loop1;
						}
						if(h==0) {
							continue loop1;
						}
						System.out.println("높이를 입력하세요.");
						v=scan.nextDouble();
						w=h*v;
						System.out.println("사각형 넓이 :"+Math.round(w*100)/100.0);
					}
				case 2 : 
					while(true) {
						System.out.println("삼각형넓이를 선택했습니다. 가로를 입력하세요.(종료 99 상위메뉴 0)");
						
						h=scan.nextDouble();
						if(h==99) {
							System.out.println("프로그램을 종료합니다.");
							break loop1;
						}
						if(h==0) {
							continue loop1;
						}
						System.out.println("높이를 입력하세요.");
						v=scan.nextDouble();
						w=h*v*0.5;
						System.out.println("삼각형 넓이 :"+Math.round(w*100)/100.0);
					}
				case 3 : 
					while(true) {
						System.out.println("원넓이를 선택했습니다.(원넓이는 소숫점 2째자리까지 계산됩니다.)");
						System.out.println("반지름을 입력하세요.(종료 99 상위메뉴 0)");
						h=scan.nextDouble();
						if(h==99) {
							System.out.println("프로그램을 종료합니다.");
							break loop1;
						}
						if(h==0) {
							continue loop1;
						}
						w=h*h*3.14;
						System.out.println("원 넓이 :"+Math.round(w*100)/100.0);
					}	
				default :
					;
			} 
		}
		
	}

}
