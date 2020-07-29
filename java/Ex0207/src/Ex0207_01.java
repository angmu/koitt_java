import java.util.Scanner;

public class Ex0207_01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);//객체 생성 
		
		//주민번호를 받아서
		//태어난 월을 확인해서
		//12, 1, 2>겨울에 태어낫군요
		//3,4,5>봄에 태어낫군요
		//6,7,8>여름에 태어낫군요
		//9,10,11>가을에 태어낫군요
		
		//예제 1>switch ,예제 2>if문

		String month1="";
		int month=0;
		String jumin="";//string은 저장할 공간이 필요하니 왠만하면 상위에 공간을 만들어줄 변수초기화를 하는거이 좋다.
		
		System.out.println("[태어난 계절을 알아보는 프로그램]");
		System.out.println("주민번호를 입력해주세오");
		jumin=scan.nextLine();
		month1=jumin.substring(2,4);
		month=Integer.parseInt(month1);
		
		
//		int month=0;
//		String jumin="";//string은 저장할 공간이 필요하니 왠만하면 상위에 공간을 만들어줄 변수를 선언하는거이 좋다.
//		
//		System.out.println("[태어난 계절을 알아보는 프로그램]");
//		System.out.println("주민번호를 입력해주세오");
//		jumin=scan.nextLine();
//		month=Integer.parseInt(jumin.substring(2,4));
//		System.out.println("태어난 달 :"+month+"월");
////		switch(month) {
////		
////			case 12:case 1:case 2:
////				System.out.println("겨울에 태어낫군요");
////				break;
////			case 3:case 4:case 5:
////				System.out.println("봄에 태어낫군요");
////				break;
////			case 6:case 7:case 8:
////				System.out.println("여름에 태어낫군요");
////				break;
////			case 9:case 10:case 11:
////				System.out.println("가을에 태어낫군요");
////				break;	
////			default :
////				System.out.println("장못입력하였습니다.");
////				break;
////		
////		
////		}
//		
//		if(month==12||month>=1&&month<=2) {
//			System.out.println("겨울에 태어낫군요");
//		}else if(month>=3&&month<=5) {
//			System.out.println("봄에 태어낫군요");
//		}else if(month>=6&&month<=8) {
//			System.out.println("여름에 태어낫군요");
//		}else if(month>=9&&month<=11) {
//			System.out.println("가을에 태어낫군요");
//		}else {
//			System.out.println("장못입력하였습니다.");
//		}
//		
//		
//		
		
		
		
		//String str=new String();

//		//주민번호를 입력받아서 나이를 계산하는 프로그램
//				//880101-1101111
//				//스트링으로 받아야함, charAt(7)
//				//String메소드 >>substring(0,2)
//		
//				
//				System.out.println("[성병확인 프로그램]");
//				System.out.println("주민번호를 입력하세오");
//				String jumin=scan.nextLine();
//				String age="";
//				
//				
//				if(jumin.charAt(7)=='3'||jumin.charAt(7)=='4') {
//					//혹은 20-년도+1 해도된다.
//					//int age_1=20-Integer.parseInt(age)+1;
//					age="20"+jumin.substring(0,2);
//					System.out.println(age);
//					int age_1=Integer.parseInt(age);
//					System.out.println("귀하의 나이는 "+(2020-age_1+1));
//				}
//				else if(jumin.charAt(7)=='1'||jumin.charAt(7)=='2') {
//					//혹은 100-년도+20+1 해도된다.
//					//int age_1=100-Integer.parseInt(age)+20+1;
//					age="19"+jumin.substring(0,2);
//					int age_1=Integer.parseInt(age);
//					System.out.println("귀하의 나이는 "+(2020-age_1+1)); //숫자계산하는 부분을 괄호 안해주면 앞의 String과 함쳐져 String이 되어 나이계산이 제대로 안됨.
//				}
//				else{
//					System.out.println("입력한 주민번호가 잘못되었습니다.");
//				}
//				
//				
		
		
//		//주민번호를 입력받아서 남자인지 아닌지 판단하는 프로그램
//		//880101-1101111
//		//스트링으로 받아야함, charAt(7)
//		
//		System.out.println("[성병확인 프로그램]");
//		System.out.println("주민번호를 입력하세오");
//		String jumin=scan.nextLine();
//		int ju=jumin.charAt(7)+'0';
//		
//		if(ju==1||ju==3) {
//			System.out.println("귀하의 성별은 남성입니다.");
//		}
//		else if(ju==2||ju==4) {
//			System.out.println("귀하의 성별은 여성입니다.");
//		}
//		else{
//			System.out.println("입력한 주민번호가 잘못되었습니다.");
//		}
//		
//		
		
		
		
		
		
		
//		System.out.println("[0구분 프로그램]");//println>엔터키 포함 , printf>출력형태지정(엔터미포함), print (그냥옆으로 출력)
//		
//			System.out.println("임의의 숫자를 입력해주세요");
//			int i=scan.nextInt();
//
//			//1보다 크다 1이다 0 이다 0보다 작다
//			if(i>1) {
//				System.out.println("입력한 숫자는 1보다 큽니다.");
//			}
//			else if(i==1){
//				System.out.println("입력한 숫자는 1입니다.");
//					
//			}
//			else if(i==0){
//				System.out.println("입력한 숫자는 0입니다.");
//					
//			}
//			else{
//				System.out.println("입력한 숫자는 0보다 작습니다.");
//					
//			}
//			
//			
			
			
			
			
			
			
			
			
			//			//0보다 크다 0이다 0보다 작다
//			if(i==0) {
//				System.out.println("입력한 숫자는 0 입니다.");
//			}
//			else if(i>0){
//				System.out.println("입력한 숫자는 0보다 큽니다.");
//					
//			}
//			else{
//				System.out.println("입력한 숫자는 0보다 작습니다.");
//					
//			}
//			
			
			
			
//			if(i==0) {
//				System.out.println("입력한 숫자는 0 입니다.");
//			}
//			else{
//				System.out.println("입력한 숫자는 0이 아닙니다.");
//					
//			}
//		
		
		
		

	}///main

}//class
