import java.util.Scanner;
public class Ex0203_06 {

	public static void main(String[] args) {
		
		
		//두수를 입력받고 계산부호 및 결과값을 출력.????????????
		
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째숫자를 입력하세요");
		int a=scan.nextInt();
		System.out.println("두번째숫자를 입력하세요");
		int b=scan.nextInt();
		System.out.println("사칙연산을 입력하세요");
		String op1=scan.next();
		int op=op1.charAt(0);
		float result=0;
				
		switch(op) {
			case '+' :
				result =a+b;
				System.out.println((int)(result));
				break;
			case '-' :
				result =a-b;
				System.out.println((int)(result));
				break;
			case '*' :
				result =a*b;
				System.out.println((int)(result));
				break;
			case '/' :
				result =a/b;
				System.out.println((float)(result));
				break; //나눗셈이 잘 안된다..ㅜㅜㅠㅜㅠ
				
			default :
				System.out.println("바르게 입렷하지 않았습니다.");
		}		
		
		
		
//		//예제 90점이상이면 a학점> 95점이상은 a+, 80점이상이면 b학점...c d f
//		Scanner scan=new Scanner(System.in);
//		System.out.println("점수를 입력하면 학점이 나옵니다.");
//		int score=scan.nextInt();
//		char hak='A';
//		char sh='+';
//		
//		if(score>=90) {
//				hak='A';
//			if(score>=95) {
//				sh='+';
//			}
//			else {
//				sh='-';
//			}
//		}
//		else if (score>=80){
//			 hak='B';
//			if(score>=85) {
//				sh='+';
//			}
//			else {
//				sh='-';
//			}
//		}
//		else if (score>=70){
//			hak='C';
//			if(score>=75) {
//				sh='+';
//			}
//			else {
//				sh='-';
//			}
//		}
//		else if (score>=60){
//			hak='D';
//			if(score>=65) {
//				sh='+';
//			}
//			else {
//				sh='-';
//			}
//		}
//		else {
//			hak='F';
//			}
//			
//		System.out.printf("당신의 학점은 :%c%c",hak, sh);
//		
//		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");
//		int num=scan.nextInt();
//		
//		if(num<-1 || num>3 && num<5) {//&&(and)는||(or)구문보다 더 우선된다. &&먼저 처리!!
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
		
		
		
		
//		//생년월일 (8자)를 받아서  비교하여 20세 이상이면 이벤트 당첨이 되었습니다. 출력(유럽왕복비행기표 당첨)
//				Scanner scan=new Scanner(System.in);
//				System.out.println("태어난 년도를 입력해주세요.");
//				int event_year=scan.nextInt();
//				int event=2020-event_year+1;//나이
//				
//				if (event>=20){
//					System.out.println("유럽왕복티켓에 당첨되었습니다.");
//					
//				}else {
//					System.out.println("아쉽게도 당첨되지 않았습니다.");
//				
//				}
		
		
		
		
//		//예제. 아이디 비번 일치여부id = c /pass 123456
//		
//		//답
//				String id="aaa";//변수>데이터값이 저장되는데 반해 객체의 경우 데이터의 주소가 저장이된다.
//				int pass=12345;
//				Scanner scan=new Scanner(System.in);
//				System.out.println("아이디를 입력하세요");
//				String id_ch=scan.nextLine();
//				
//				System.out.println("패스워드를 입력하세요");
//				int pass_ch=scan.nextInt();
//				
//				
//				
//				if (id_ch.equals(id)){//8개의 변수가 아닌것은 같은것을 확인할때 equals메소드를 사용한다.
//					System.out.println("id가 있습니다.");
//					if(pass_ch==pass) {//if구문안에 if넣기 가능.
//						System.out.println("로그인되었습니다.");
//					}
//					else {
//						System.out.println("패스워드가 일치하지 않습니다.");
//					}
//				}else {
//					System.out.println("id가 일치하지 않습니다.");
//					System.out.println("다시 입력해주세요.");
//				}
//				
		
//		//푼것
//		Scanner scan=new Scanner(System.in);
//		System.out.println("아이디를 입력하세요");
//		String id1=scan.nextLine();
//		char id=charAt(0);
//		char id2='c';
//		System.out.println("패스워드를 입력하세요");
//		int pd=scan.nextInt();
//		
//		
//		
//		if ((id==id2)&&(pd==123456)) {
//			System.out.println("로그인에 성공하였습니다.");
//		}else if(pd!=123456) {
//			System.out.println("비밀번호가 틀립니다.");
//		}else if(id!=id2) {
//			System.out.println("아이디가 틀립니다.");
//		}
//		else {
//			System.out.println("아이디 혹은 비밀번호가 틀립니다.");
//		}
		
		
		
		
		
		
		
		
//		//양수 , 0, 음수
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요");
//		int x=scan.nextInt();
//		
//		if(x>0) {
//			System.out.println("양수");
//		}
//		else if(x==0){
//
//			System.out.println("0");
//		}
//		else {
//			System.out.println("음수");
//		
//		}
//		
		
		
		
		
		
		
		
		
		
		
//		//90 A 80B 70C 60D F
//		Scanner scan=new Scanner(System.in);
//
//		System.out.println("점수를 입력하세요");
//		int score=scan.nextInt();
//		
//		score /=10;//score=score/10;
//		switch(score) {
//		case 9: case 10://case에 해당하는것을 다 넣어줘야함..
//			System.out.println("당신의 학점은 :"+"A");
//		break;
//
//		case 8:
//			System.out.println("당신의 학점은 :"+"B");
//		break;
//
//		case 7:
//			System.out.println("당신의 학점은 :"+"C");
//		break;
//
//		case 6:
//			System.out.println("당신의 학점은 :"+"D");
//		break;
//
//		default:
//			System.out.println("당신의 학점은 :"+"F");
//	}

		
//		
//		switch(score) {
//			case 90: case 91: case 92://case엔 범위가 안들어가고 값만 들어가는데.. 해서 만약 이방법으로 하면 case에 해당하는것을 다 넣어줘야함..해서 위처험 하는게 좋다..
//				System.out.println("당신의 학점은 :"+"A");
//			break;
//
//			case 80:
//				System.out.println("당신의 학점은 :"+"B");
//			break;
//
//			case 70:
//				System.out.println("당신의 학점은 :"+"C");
//			break;
//
//			case 60:
//				System.out.println("당신의 학점은 :"+"D");
//			break;
//
//			default:
//				System.out.println("당신의 학점은 :"+"F");
//		}
//		
		
		
//		if(score>=90) {
//			System.out.println("당신의 학점은 :"+"A");
//		}
//		else if(score>=80) {
//			System.out.println("당신의 학점은 :"+"B");
//		}else if(score>=70) {
//			System.out.println("당신의 학점은 :"+"C");
//		}else if(score>=60) {
//			System.out.println("당신의 학점은 :"+"D");
//		}else {
//			System.out.println("당신의 학점은 :"+"F");
//		}
//		
		
		
		
		
		
		
//		Scanner scan= new Scanner(System.in);
//		System.out.println("당신의 점수를 입력하세요");
//		int check=scan.nextInt();
//		
//		System.out.println(check>=60?"합격":"붎합격");	
		
//		//예제 재시험 합격 불합격
//		
//		if(check>60) {
//			System.out.println("합격");}
//		else if(check==60) {
//			System.out.println("재시험");
//		}
//		else {
//			System.out.println("불합격");} //if 와 else 각각의 중괄호 안에 구문이 1줄씩만 있다면 모든 중괄호를 생략가능하다.
		
		
		
		
//		if(check>=60) 
//			System.out.println("합격");
//		else 
//			System.out.println("불합격"); //if 와 else 각각의 중괄호 안에 구문이 1줄씩만 있다면 모든 중괄호를 생략가능하다.
//		
		
		
		
		
//		Scanner scan= new Scanner(System.in);
//		System.out.println("핸드폰번호를 입력하세요");
//		int check=scan.nextInt();

//		//아래것을 switch문으루 바꿈 ,, 문자와 숫자 까지 가능.(문자열은 불가??)
//		
//		switch(check){
//			case 1:
//				System.out.println("sk입니다.");
//				break;//각 케이스마다 break라고 멈춤표시를 안하면 밑의케이스에 break가 나올때까지 계속 찍어낸다..엉엉
//			case 6:
//				System.out.println("KTF입니다.");
//				break;
//			case 9:
//				System.out.println("LG입니다.");
//				break;
//			default:
//				System.out.println("잘못된 번호입니다.");
//				
//		}
		
//		//if조건문 . 조건을 비교하여 출력. 순차처리방식으로 조건이 많으면 속도가 느려지는 단접이 있다.
//		if(check==1) {
//			System.out.println("sk텔레콤입니다.");}
//		else if(check==6) {
//			System.out.println("KTF입니다.");}
//		else if(check==9) {
//			System.out.println("LG입니다.");}
//		else {
//			System.out.println("잘못된 번호입니다.");
//		}//if문 //if만 있어도 혹은 if+ else 까지만 있어도 된다. 중간에 다른 조건을 넣고싶다면 else if를 추가해서 중간에 넣어준다. ,,예전에는 if에 숫자만 들어왔으나 지금은 문자열, 문자, 숫자 다 가능.
	
		
	}//main

	
}// class
