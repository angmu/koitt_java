
public class Ex0206_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 책 >>p38 2-5의 것..
		String url="www.codechobo.com";
		
		float f1=.10f;//0.10,1.0e-1 
		float f2=1e1f;//10.0,1.0e,1.0e+1  //e* >>*만큼 10의 제곱
		float f3=3.14e3f;//유효값이 8자리까지의 숫자를 표현가능(.포함)
		double d=1.23456789;//유효값이 16자리까지의 숫자를 표현가능(.포함)
		
		System.out.printf("f1=%f, %e, %g%n",f1,f1,f1);//%e 지수로 표현,%g 보기편한거를 출력해라
		System.out.printf("f2=%f, %e, %g%n",f2,f2,f2);
		System.out.printf("f3=%f, %e, %g%n",f3,f3,f3);
		
		System.out.printf("d=%f%n",d);
		System.out.printf("d=%14.10f%n",d);//전체 14자리 중 소수점 밑의 자리를 10자리로 출력
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n",url);
		System.out.printf("[%20s]%n",url);
		System.out.printf("[%-20s]%n",url);//빈공백을 오른쪽에,, 글자 왼쪽정렬
		System.out.printf("[%.8s]%n",url);//왼쪽에서 8글자만  출력
		
		
		
	}

}
