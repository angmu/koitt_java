import java.util.Scanner;

public class Ex0203_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//예제 3번의 숫자를 입력받아서 printf 사용해서
		//5+4+2=11
		
		Scanner scan= new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int a=scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int b=scan.nextInt();
		System.out.println("세번째 숫자를 입력하세요.");
		int c=scan.nextInt();
				
		
		int d=a+b+c;
		int e=a-b-c;
		int f=a*b*c;
		float g=(float)a/b/c;
		
		
		System.out.printf("첫번째숫자 :%d, 두번째 숫자:%d, 세번째숫자 :%d,세 수의 합 :%d,세수의 차 :%d, 세수의 곱:%d,세수의 나눗셈 :%.2f",a,b,c,d,e,f,g);
		
		
		
		
		
		
		
		
//		//printf
//		
//		System.out.println(10.0/3); //실수지만 f가없으므로 10.0은 double이다. /출력하는 소숫점자리수를 조절할수 없음.자동으로 값마다 enter키가 먹혀있어서 줄바꿈이 알아서 됨.
//		
//		int a=5;
//		int b=10;
//		
//		System.out.printf("첫번째변수 :%d, 두번째 변수 :%d%n",a,b);//입력받는 수만큼 %d를 써주면 여러값을 출력가능하다.
		
		
		
//		//정수 %d, 실수 %f, 문자%c, 문자열%s
//		//%n 개행문자
//		System.out.printf("자릿수 배치 :%.2f%n",10.0/3);//.2를하면 소숫점 2째자리까지 나오게 하라는 뜻이다. ,, %n을 쓰면 줄바꿈이 일어난다.
//		System.out.printf("자릿수 배치 :%5.2f%n",10.0/3);//. 앞에있는 숫자는 소숫점자리포함해서 5자리까지 출력하라는 뜻이다. 
//		System.out.printf("자릿수 배치 :%-5.2f%n",10.0/3);//. 앞에있는 숫자 앞에 -를 붙이면 좌측정렬이 된다.
//		
		
		
		
//		
//		//예제2 숫자7개를 한번에 받아서 
//		//첫번때숫자:
//		//두번째 숫자:...
//		//각각의 숫자를 더해보세요.
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("7자리 숫자를 입력하세요");
//		String ch=scan.nextLine();
//		char input1=ch.charAt(0);
//		char input2=ch.charAt(1);
//		char input3=ch.charAt(2);
//		char input4=ch.charAt(3);
//		char input5=ch.charAt(4);
//		char input6=ch.charAt(5);		
//		char input7=ch.charAt(6);
//		
//		int a=input1-'0';
//		int b=input2-'0';
//		int c=input3-'0';
//		int d=input4-'0';
//		int e=input5-'0';
//		int f=input6-'0';
//		int g=input7-'0';
//		
//		int sum=a+b+c+d+e+f+g;
//		
//		System.out.println("첫번째 숫자 :"+a);
//		System.out.println("두번째 숫자 :"+b);
//		System.out.println("세번째 숫자 :"+c);
//		System.out.println("네번째 숫자 :"+d);
//		System.out.println("다섯번째 숫자 :"+e);
//		System.out.println("여섯번째 숫자 :"+f);
//		System.out.println("일곱번째 숫자 :"+g);
//		
//		System.out.println("숫자의 합 :"+sum);
//		
//		
//		
		
		
//		//예제 두 숫자를 입력받아서 두개의 합을 구하는법
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요");
//		String ch=scan.nextLine();
//		char b=ch.charAt(0);
//		char a=ch.charAt(1);
//		
//		//int input=Integer.parseInt(ch);//숫자로 치환하는방법
//		
//		
//		int b1=b-'0';// '0'을 빼면 숫자로 치환이 된다. ''를 안쓰면 변환이 안된다..ㅠㅜ '0'을 한세트로 외우자.. +번외. 숫자를 문자열로 바꾸는법 7+""(큰따음표를 더한다)="7"
//		int a1=a-'0';
//		
//		int sum=(int)(b1+a1);
//		int minus=(int)(b1-a1);
//		double g1=(double)(b1*a1);
//		double di=(double)(b1/a1);
//		
//		
//		System.out.println("두수의 합 :"+sum);
//		System.out.println("두수의 차 :"+minus);
//		System.out.println("두수의 곱 :"+g1);
//		System.out.println("두수의 나누기 :"+di);
//		
//		
		
//	//	대소문자 치환
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("대문자를 입력해주세요.");
//		String ch =scan.nextLine();
//		char b =ch.charAt(0); //charAt 변수 문자열을 각각의 문자로 받을수 있는 메소드. ex)korea라는 단어가 있다면 괄호안의 숫자가 위치인데. k(0) o(1) r(2) e(3) a(4) 중에 지정하는 위치의 문자를 받는다. 1번째 문자는 0 이런식..
//		char c=(char)(b+32);
//		
//		System.out.println("입력한 대문자 :"+b);
//		System.out.println("변경된 소문자 :"+c);
//		
//		------
//		System.out.println("소문자를 입력해주세요.");
//		String ch1 =scan.nextLine();
//		char d =ch1.charAt(0); //charAt 변수 문자열을 각각의 문자로 받을수 있는 메소드. ex)korea라는 단어가 있다면 괄호안의 숫자가 위치인데. k(0) o(1) r(2) e(3) a(4) 중에 지정하는 위치의 문자를 받는다. 1번째 문자는 0 이런식..
//		char f=(char)(d-32);
//		
//		System.out.println("입력한 소문자 :"+d);
//		System.out.println("변경된 대문자 :"+f);
//		
		
		//오늘 배운것 정리.
		//1. 숫자입력,문자열 입력
		//2. 입력을>문자형변환, 문자열 숫자로 변환
		//3. 문자형을 숫자형으로 변환.
		//4. printf 여러개 변수를 동시출력하는 것. %d(정수) %f(실수) %c(문자) %s(문자열) %10.2f(소숫점2개 포함 10자리 출력)
		
		
	}

}
