import java.util.Scanner;

public class Ex0203_03 {
	public static void main(String[] args) {
		//main 치고 ctrl+스페이스바 치믄 뾰롱하고 나오는 메인!!
		
		Scanner scan= new Scanner(System.in);
		System.out.println("원하는 첫번째 숫자를 입력하세요.");
		int input1=scan.nextInt();
		System.out.println("원하는 두번째 숫자를 입력하세요.");
		int input2=scan.nextInt();
		
		int hap=input1+input2;
		int minus =input1-input2;
		double g1 =input1*input2;
		double di= input1/input2;
		
		System.out.println("두수의 합 :"+hap);
		System.out.println("두수의 차 :"+minus);
		System.out.println("두수의 곱 :"+g1);
		System.out.println("두수의 나누기 :"+di);
		
		
		
		
	}
}
