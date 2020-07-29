import java.util.Scanner;

public class Ex0219_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p271
		Scanner scan=new Scanner(System.in);
		long result=0;
		System.out.println("원하는 숫자를 입력하세요>>");
		result=factorial(scan.nextInt());
		System.out.println("결과값 :"+result);
	}
	
	static Long factorial(int n) {
		long result=0;
		if(n==1) {
			result=1;
		}else {
			result=n*factorial(n-1);
		}
		return result;
	}
	
}
