import java.util.Scanner;

public class Ex0205_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for문을 사용해서 합계를 구할것.
		//5의 배수만 제외해서 숫자의 합을 구하는 프로그램
		//2~40까지 숫자를 더하는데>> 5의 배수는 제외하고 합계를 구하시오
		//총 몇번 더하기를 햇는지도 함께 출력을 해보세요

		int check=0;
		int sum=0;
		int i=0;
		int num2=0;
		int num1=0;
		int i2=0;
		int age=0;//나이
		String jumin="";//주민번호
		String mf="";//남녀
		Scanner scan=new Scanner(System.in);
		loop1:
		while(true) {
		
			System.out.println("[종합선물 프로그램]");
			System.out.println("1> 두수를 더하는 프로그램");
			System.out.println("2> 주민번호 나이계산프로그램");
			System.out.println("3> 주민번호 남여 확인 프로그램");
			System.out.println("원하는 번호를 입력하세요. (종료 : 99)");
			
			check =scan.nextInt();
			
			if(check==99) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}
			else if(!(check>=1&&check<=3)) {
				System.out.println("1~3까지의 수를 입력해주세요");
				continue;
			}
		
			
			switch(check) {
			
			
				case 1 : //두수의 합
					//99를 누르면 종료되게 무한루프		
					while(true) {
						System.out.println("더하려고하는 구간의 수를 2개 입력하시오 (죵료 99 상위 0)");
						num1=scan.nextInt();
						
						if(num1==99) {
							System.out.println("프로그램을 종료합니다.");
							break loop1;
						}
						if(num1==0) {
							System.out.println("프로그램을 종료합니다.");
							continue loop1;
						}
						
						//num이 num2보다 크면 치환하는 반복문
						while(true) {
							System.out.println("더하려고하는 구간의 수를 1개 더 입력하시오");
							num2=scan.nextInt();
							
							if(num1>num2) {//5>2
								i2=num2;
								num2=num1;
								num1=i2;
								break;
							}else {
								break;
							}
						}
						for(i=num1;i<=num2;i++) {
							
							sum+=i;
						}
						System.out.println(num1+"부터"+num2+"까지의 합계 :"+sum);	
					}
					
				case 2 :
					//주민번호 나이계산
					while(true) {
						//ex)880101-1011198
						System.out.println("주민번호를 입력해주세요 (상위이동 :0, 종료 : 99)");
						jumin=scan.next();//이또한..next로 바꿔야 하는가..;ㅁ;
						
						if(jumin.equals("99")) {
							System.out.println("프로그램을 종료합니다.");
							break loop1;
						}
						if(jumin.equals("0")) {
							System.out.println("상위메뉴로 이동합니다.");
							continue loop1;
						}
						
						//jumin번호 계산
						//charAt(0)
						if(jumin.charAt(7)=='1'||jumin.charAt(7)=='2') {
							String ju_check=19+jumin.substring(0,2);
							//자를 부분,자를부분+1의 수를 입력하면 String의 형태로 가져온다. 위의 예시대로면 88을 가져온다.
							age=2020-Integer.parseInt(ju_check)+1;
						}else if(jumin.charAt(7)=='3'||jumin.charAt(7)=='4'){
							String ju_check=20+jumin.substring(0,2);
							//자를 부분,자를부분+1의 수를 입력하면 String의 형태로 가져온다. 위의 예시대로면 88을 가져온다.
							age=2020-Integer.parseInt(ju_check)+1;
						}else {
							System.out.println("주민번호가 잘못되었습니다. 다시입력해주십시오");
							continue;
						}
						
						//7번째 문자를 비교하여 1,2일 경우  주민 앞 2자리 앞에 19를 써주고 3,4일 경우 주민 앞 2자리 앞에 20을 써준다. 
						System.out.println("귀하의 나이는 "+age+"입니다");
						
						
					}
					
					
					
					
				case 3 :
					//주민번호 남녀구분
					while(true) {
						//ex)880101-1011198
						System.out.println("주민번호를 입력해주세요 (상위이동 :0, 종료 : 99)");
						jumin=scan.next();//이또한..next로 바꿔야 하는가..;ㅁ;
						if(jumin.equals("99")) {
							System.out.println("프로그램을 종료합니다.");
							break loop1;
						}
						if(jumin.equals("0")) {
							System.out.println("상위메뉴로 이동합니다.");
							continue loop1;
						}
						
						//jumin번호 계산
						//charAt(0)
						if(jumin.charAt(7)=='1'||jumin.charAt(7)=='3') {
							mf="남자";
						}else if(jumin.charAt(7)=='2'||jumin.charAt(7)=='4'){
							mf="여자";
						}else {
							System.out.println("주민번호가 잘못되었습니다. 다시입력해주십시오");
							continue;
						}
						
						//7번째 문자를 비교하여 1,2일 경우  주민 앞 2자리 앞에 19를 써주고 3,4일 경우 주민 앞 2자리 앞에 20을 써준다. 
						System.out.println("귀하의 성별운 "+mf+"입니다");
						
						
					}
					
					
				default :
			
			}//스위치
			
			
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int sum=0;
//		int i=0;
//		int num2=0;
//		int num1=0;
//		int i2=0;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("더하려고하는 구간의 수를 2개 입력하시오");
//		num1=scan.nextInt();
//		//num이 num2보다 크면 치환하는 반복문
//		while(true) {
//			System.out.println("더하려고하는 구간의 수를 1개 더 입력하시오");
//			num2=scan.nextInt();
//			
//			if(num1>num2) {//5>2
//				i2=num2;
//				num2=num1;
//				num1=i2;
//				break;
//			}else {
//				break;
//			}
//		}
//		for(i=num1;i<=num2;i++) {
//			
//			sum+=i;
//		}
//		System.out.println(num1+"부터"+num2+"까지의 합계 :"+sum);	
//		
		
		
		
		
		
//		int sum=0;
//		int i=0;
//		int num2=0;
//		int num1=0;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("더하려고하는 구간의 수를 2개 입력하시오");
//		num1=scan.nextInt();
//		//num이 num2보다 클때 다시 입력을 받는 반복문
//		while(true) {
//			System.out.println("더하려고하는 구간의 수를 1개 더 입력하시오");
//			num2=scan.nextInt();
//			
//			if(num1>num2) {//5>2
//				System.out.println(num1+"의 숫자보다 큰 수를 넣으시오");
//			}else {
//				break;
//			}
//		}
//		for(i=num1;i<=num2;i++) {
//			
//			sum+=i;
//		}
//		System.out.println((i-1)+"번째"+"합계 :"+sum);	
//		
		
//		
//		int sum=0;
//		int i=0;
//
//		for(i=1;i<=50;i++) {
//			
//			sum+=i;
//		}
//		System.out.println((i-1)+"번째 수의 합계 :"+sum);	
	
	
	
//		int sum=0;
//		int i=0;
//		int cnt=0;
//		for(i=2;i<=40;i++) {
//			
//			if(i%5==0) {
//				continue;
//			}
//			sum+=i;
//			cnt++;
//		}
//		System.out.println("합계 :"+sum);
//		System.out.println("더한 횟수 :"+(cnt));
//	

	
	
	
	}

}
