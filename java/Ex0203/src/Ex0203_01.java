import java.util.Scanner;

public class Ex0203_01 {

	public static void main(String[] args) {
		
		//콘솔화면에서 값을 입력받아 출력하는 클래스 Scanner,출력하는 메소드 scan.next***()
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			//nextInt는  화면으로 숫자를 입력받는 메소드
//		float kor=scan.nextFloat(); // 실수인지 정수인지 입력받는 변수를 확인을 해서 nextInt,nextLine 등으로 바꿔쓸수있다..(앞의 변수선언 모양도 같이 변경해야한다.)
			System.out.println("국어점수를 입력해주세요.");
			
			String kor=scan.nextLine();//문자열을 받아서 그대로 출력해라
			System.out.println("영어점수를 입력해주세요.");
			
			String eng=scan.nextLine();
			
			
			int kor1=Integer.parseInt(kor);//숫자로 바뀌어서 대입이된다  scan.parseInt(뒤의 변수를 int로 변환하는 메소드이다.)
			int eng1=Integer.parseInt(eng);
			
			System.out.println("국어와 영어점수의 합 :"+(kor1+eng1));
//			System.out.println("국어와 영어점수의 합 :"+(kor+eng)); //그냥합하게 되면 10099로 숫자가 더해지지않고 그냥 붙어서 나온다.
			
//		System.out.println("국어점수 :"+kor);//console에서 입력을 받으면 출력을 할수있게된다.
		}
		
//
//		String str =new String();
//		int a=5;
//		

//		//☆☆☆☆형변환 복습.
//		char c1='a'//97
//		char c2=(char)(c1+1); //+를 입력하면 자동적으로 int로 변환되기때문에 문자로 출력하고 싶다면 꼭 char를 입력하여 형고정을 시켜줘야 한다.
//		System.out.println("c1 출력 :"+c1);
//		System.out.println("c1 출력 :"+c2);
//		//문자형 변수 char 문자열변수 string
////
		
		
//		byte a=10;
//		byte b=7;
//		byte c=(byte) (a+b);
//		System.out.println(c); //그냥하게되면 에러가 난다.해서 (byte)라고 앞에 붙여주고 값을 괄호안에 넣어줘야 에러안나고 byte로 변환되어 나온다.
	}

}
