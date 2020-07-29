import java.util.Scanner;

public class Ex0304_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 1.주민번호를 입력받아 남자인지 여자인지 확인.
		int selec;
		while (true) {
			switch (selec = print()) {

			case 1:
				System.out.println("주민번호를 입력하세요 (-없이 숫자만 입력)");
				jumin(scan.nextLine());
				break;

			case 2:
				System.out.println("학번을 입력해주세요");
				major(scan.nextLine().charAt(0)+"");
				break;

			case 3:
				System.out.println("항공권 번호를 입력하세오");
				airport(scan.nextLine().substring(0,2));
				break;
			
				
			case 4:
				System.out.println("이메일을 입력하세오");
				email(scan.nextLine());
				break;
			case 5:
				System.out.println("비밀번호를 설정해주세요 (특수문자 !, \", #, $, %, &만 가능)");
				System.out.println("(특문 1개 대문자 1개 길이는 8자리 이상)");
				pass(scan.nextLine());
				break;
				
			case 6:
				System.out.println("주민번호를 분리");
				String a="010101-1234567";
				String[]r=a.split("-", 2);
				for(int i=0;i<r.length;i++) {
					System.out.println(r[i]);
				}
				break;
			case 7:
				System.out.println("전화번호를 분리");
				String b="010-0000-0000";
				String[]r2=b.split("-", 3);
				for(int i=0;i<r2.length;i++) {
					System.out.println(r2[i]);
				}
			case 8:
				System.out.println("비밀번호 공백없애기");
				String pw="   zbc bcx   ";
				System.out.println(pw);
				pw=pw.trim();
				System.out.println(pw);
				//중간공백 없애기
				pw=pw.replaceAll(" ","");
				System.out.println(pw);
				break;
			case 99:
				break;
			default:
				continue;

			}

		}

		// 2.학번을 입력받아 무슨과인지를 확인하시오
		// 컴퓨터 학과 c0001
		// 영문학과 e0002
		// 국문학과 k0003

		// 3.한국(kor),
	}// main

	static int print() {
		Scanner scan = new Scanner(System.in);
		System.out.println("잡학다식프로그램");
		System.out.println("1)성별확인프로그램	2)학과판별프로그램 	3)항공사확인 프로그램	4)이메일 입력	5)비밀번호 설정	6)주민번호 분리	7)전화번호를 분리 	8)비번공백날리기");
		System.out.println("원하는 번호를 입력하세요 (종료 99)>>");
		int selec = scan.nextInt();
		scan.nextLine();
		return selec;
	}
	
	static void jumin(String jumin) {
		//13자리로 안썻을때
		if(jumin.length()!=13) {
			System.out.println("잘못된 주민번호 입력. 다시입력해주세오");
			return;
		}
		//숫자만 입력 안했을때
		for(int i=0;i<jumin.length();i++) {
			if(!(jumin.charAt(i)-'0'>=0&&jumin.charAt(i)-'0'<=9)) {
				System.out.println("숫자만 입력가능합니다.");
				return;
			}
		}
		//주민번호 출력 -포함
		System.out.println(jumin.substring(0, 6)+"-"+jumin.substring(6, 13));
		if(jumin.charAt(6)=='2'||jumin.charAt(6)=='4') {
			System.out.println("귀하의 성별은 여성입니다.");
		}else if(jumin.charAt(6)=='1'||jumin.charAt(6)=='3') {
			System.out.println("귀하의 성별은 남성입니다.");
		}else {
			System.out.println("주민번호를 잘못 입력하였습니다.");
		}
	}
	static void major(String major) {
		if(major.equalsIgnoreCase("k")) {
			System.out.println("귀하의 학과는 국문학과입니다.");
		}else if(major.equalsIgnoreCase("c")) {
			System.out.println("귀하의 학과는 컴퓨터학과입니다.");
		}else if(major.equalsIgnoreCase("e")) {
			System.out.println("귀하의 학과는 영문학과입니다.");
		}else {
			System.out.println("해당하는 학과가 없습니다.");
		}
	}
	static void airport(String airport) {
		if(airport.equalsIgnoreCase("ke")) {
			System.out.println("귀하의 항공사는 대한항공입니다");
		}else if(airport.equalsIgnoreCase("oz")) {
			System.out.println("귀하의 항공사는 아시아나입니다.");
		}else {
			System.out.println("해당하는 항공사가 없습니다.");
		}
	}
	//이메일체크
	static void email(String a) {
		if(a.contains("@")==false||a.contains(".")==false) {
			System.out.println("이메일을 잘못 입력하였습니다. 다시 입력하세오");
			return;
		}
		System.out.println("귀하의 이메일주소는 "+a);
			
		}
	static void pass(String a) {
		int count=0;
		//trim
		if(!(a.length()>=8)) {
			System.out.println("비밀번호의 길이가 짧습니다.");
			return;
		}
		for(int i=0;i<a.length();i++) {
			//영어 대소문자,숫자 빼면 특수문자라고 친다요.
			if(!(a.charAt(i)>='A'&&a.charAt(i)<='Z'||a.charAt(i)>='!'&&a.charAt(i)<='&')) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("대문자나 특수문자가 1개이상 포함되어야 합니다.");
			return;
		}
		System.out.println("비밀번호가 잘 설졍되었습니다.");
			
		}
	//비밀번호 체크
	
}// class
