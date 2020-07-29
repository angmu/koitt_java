import java.util.Scanner;//아래 스캔을 쓰려면 위에도 이케 스캔표시를 해야한다..자동으로 입력이 되었다 '0';;

public class Ex0203_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //void를 찾으면 main 을 찾을수 있다.
		
		
		
		
		
		//예제. 2의 배수? 2의 배수, 2의 배수 아님.
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int a1=a%2;//%숫자는 숫자로 나눈나머지를 바로 계산해서 나머지만 저장.
		System.out.println(a1==0?"2의배수":"2의배수가 아님");
		
		
		
//		//예제.회원번호 4자리를 입력받아서 회원등급을 구분하는 것. vip 10 gold 20 silver 30
//		
//		//답
//		Scanner scan=new Scanner(System.in);
//		System.out.println("회원번호를 입력하세요");
//		String member=scan.nextLine();
//		int num=member.charAt(0)-'0';
//		String str=num==1?"vip등급":num==2?"gold등급":"silver등급";
//		
//		
//		System.out.printf("회원의 등급은 %s입니다.",str);
//		
//		
		
//		연습
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("회원번호를 입력하세요");
//		String point=scan.nextLine();
//		char a=point.charAt(0);
//		int a1=a-'0';
//		
//		System.out.println("회원의 등급은?"+(a1==1?"vip":(a1==2?"gold":"silver")));
//		
		
		
		
		
		
		
//		//예제. 점수가 60점 이상이면 합격, 60점 미만이면 불합격
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("점수를 입력해주세요");
//		int score=scan.nextInt();
//		
//		System.out.println("합격여부 :"+(score>=60?"합격":"불합격"));
//		
		
		
		
		
		
		
//		//예제. 입력받은 수가 양수면 양수라는 글자가, 음수면 음수라는 글자가, 0이면 0이라고  출력되도록 한다.
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요");
//		int x=scan.nextInt();
//		System.out.println("x는?"+(x>0?"양수":(x<0?"음수":"0")));//실행 단축키 ctrl+f11
//		
//		
		
		
		
		
		
//		//절대값을 출력하는 것.
//		Scanner scan=new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int x=scan.nextInt();
//		System.out.println("x의 절대값은 ?"+(x>=0?x:-x));
//		
//		//예제. 실수 소숫점 5째자리 숫자를 입력받아서 4째자리에서 반올림한 값을 출력하시오.
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("소숫점 5자리 까지 값이 있는 실수를 입력하시오");
//		double input1=scan.nextDouble();
//		System.out.println("소숫점 4자리 값"+(Math.round(input1*1000))/1000.0);//나눈값에 그냥1000을 해버리면 정수가 되버린다. 나누는 수에 .0 혹은 d를 붙이면 정상적으로 출력된다.
//		
		
		
		//반올림, 올림 ,버림..
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("실수를 입력하세요");
//		
//		double num1= scan.nextDouble();
//		System.out.println("round 무엇일까요?"+Math.round(num1));//반올림
//		System.out.println("ceil 무엇일까요?"+Math.ceil(num1));//올림
//		System.out.println("floor 무엇일까요?"+Math.floor(num1));//버림
//		
	}

}
