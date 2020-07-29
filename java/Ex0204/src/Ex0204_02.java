import java.util.Scanner;

public class Ex0204_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~10까지의 난수를 찾~
		int input_num=0;//입력한 숫자
//		int input_num2=0;
		String out="";//종료할때 확인하는 문자열
		int ch=(int)(Math.random()*10)+1;//랜덤숫자
		int count=1;//총 4번동안 체크하는 변수
		String save="";//입력한 숫자렬 저장하는 문자열
		Scanner scan=new Scanner(System.in);//객체선언
//	while변경전	
//		
//		System.out.println("1~100까지의 숫자를 입력하세요");
//		input_num=scan.nextInt();
//		if(ch==input_num) {
//			System.out.printf("당첨입니다.당첨번호 %d 입력번호 %d%n",ch,input_num);
//		}
//		else {
//			System.out.printf("당첨되지않았습니다.당첨번호 %d 입력번호 %d%n",ch,input_num);
//			System.out.println("1~10까지의 숫자를 입력하세요");
//			input_num2=scan.nextInt();
//			if(ch==input_num2) {
//				System.out.printf("당첨입니다.당첨번호 %d 입력번호 %d%n",ch,input_num);
//			}
//			else {
//				System.out.printf("당첨되지않았습니다.당첨번호 %d 입력번호 %d%n",ch,input_num2);
//			}
//			
//		}
//		System.out.println("시스템이 종료되었습니다.");
		
		//위의 것을 while로 변환
		
//		while(true) {
//			System.out.println("1~10까지의 숫자를 입력하세요");
//			input_num=scan.nextInt();			
//			if(ch==input_num) {
//				System.out.printf("당첨입니다.당첨번호 %d 입력번호 %d%n",ch,input_num);
//				break;//당첨되면 빠져나올수 있도록..
//			}else{
//				System.out.println("당첨되지않았습니다.다시도전하세요");
//				
//			}
//		}
		
//		//x누르면 종료되게
//		while(true) {
//			System.out.println("1~10까지의 숫자를 입력하세요");
//			input_num=scan.nextInt();			
//			if(ch==input_num) {
//				System.out.printf("당첨입니다.당첨번호 %d 입력번호 %d%n",ch,input_num);
//				break;//당첨되면 빠져나올수 있도록..
//			}else{
//				System.out.println("당첨되지않았습니다.다시도전하세요");
//				
//			}
//			System.out.println("종료하고 싶다면 x를 눌러주세요");
//			out=scan.next();//next와 nextLine의 차이. 콘솔창에서 enter도 입력받았다고 인식함..next는 엔터키는 빼고 입력으로 취급.	
////			char out2=out.charAt(0); 
////			if(out2=='x'||out2=='X'){ //char 비교는 ==으로 가능
////					System.out.println("프로그램을 종료합니다.");
////			break;}
//			if(out.equals("x")||out.equals("X")){//스트링은 .equals로 비교
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//		}
		
		
		//입력횟수 4번 제한//입력한 수가 순차출력되도록..
					
				while(count<=4) {//4번까지 반복문
					//while은 true로 내비두고 for 나 if로..
					System.out.println("1~10까지의 숫자를 입력하세요");
					input_num=scan.nextInt();//입력한 숫자
					save=save+""+input_num;//save + input_num(저장하는 문자열)
					
					
					if(ch==input_num) {
						System.out.println("당첨입니다");
						break;//당첨되면 빠져나올수 있도록..
					}else{
						System.out.println("당첨되지않았습니다.다시도전하세요");
						
					}
					//프로그램 종료확인
					System.out.println("종료하고 싶다면 x를 눌러주세요");
					out=scan.next();//문자열을 입력받는 명령어, next와 nextLine의 차이. 콘솔창에서 enter도 입력받았다고 인식함..next는 엔터키는 빼고 입력으로 취급.	
					char out2=out.charAt(0); //문자비교
					if(out2=='x'||out2=='X'){ //char 비교는 ==으로 가능
							System.out.println("프로그램을 종료합니다.");
					break;}
//					if(out.equals("x")||out.equals("X")){//스트링은 .equals로 비교
//						System.out.println("프로그램을 종료합니다.");
//						break;
//						
//					}
					count++;
					
				}
				System.out.printf("랜덤번호 %d 입력번호%s :",ch,save);
		
		
		
		
		
		
		
//		int i=10;
//		while(i>=0) {
//			System.out.println(i--);
//		}
		
		
//		for(int i=10;i>=0;i--) {
//			System.out.println(i);
//		}//위의 while문을 for문으루 수정
//		
//		
		
		
		
		
		
//		//중첩for문 3개 찍기.
//		
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				for(int k=1;k<=3;k++) {
//					System.out.println(""+i+j+k);
//					
//				}
//			}
//			
//		}
		
		
		
		
//		//*이 줄어들게
//		for(int i=10;i>=1;i--) {
//			for(int j=i;j>=1;j--) {
//				System.out.printf("*");
//			}
//			
//			System.out.println();
//		}
		
		
		
//		//*이 늘어나게
//		for(int i=1;i<=10;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.printf("*");
//			}
//			
//			System.out.println();
//		}
//		
		
		
		
		//* 10개 찍기. (가로 10개 세로 10개)
		
//		for(int i=1;i<=10;i++) {
//			for(int j=1;j<=10;j++) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
////		
//		
		
//		//2*1 2*3/ 2*5
//		
//		int i,j;
//		for(i=1;i<=9;i+=2) {//홀수만
//			for(j=2;j<=9;j++) {
//				System.out.printf("%d*%d=%d ",j,i,i*j);
//			}
//		}
//		
//		
		
		
//		//반장 부반장 랜덤뽑기.
//		int ch=(int)(Math.random()*25)+1;
//		System.out.println("반장선출번호 :"+ch);
//	
//		
		
		
//		//for문을 이용해서 구구단을 만드는것
//		int i;//혹은 2개를 한꺼번에 선언가능 ex)int i,j;
//		int j;
//		for(i=2;i<=9;i++) {
//			System.out.println("["+i+"단출력 ]");
//			for(j=1;j<=9;j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//			System.out.println("---------------------------");
//		}
		
//		//for문을 이용해서 구구단을 만드는것 printf
//				int i;//혹은 2개를 한꺼번에 선언가능 ex)int i,j;
//				int j;
//				for(i=2;i<=9;i++) {
//					System.out.println("["+i+"단출력 ]");
//					for(j=1;j<=9;j++) {
//						System.out.printf("%d*%d=%d ",i,j,i*j);
//					}
//					System.out.println();//뒤의 줄을 밑에찍히게 하도록 만든 공백.
//					System.out.println("---------------------------");
//				}
//				
		
		//for문을 이용해서 구구단을 만드는것 printf (세로줄)
//	이따한다유int i;//혹은 2개를 한꺼번에 선언가능 ex)int i,j;
//		int j;
//		for(i=2;i<=9;i++) {
//			for(j=1;j<=9;j++) {
//			if(j==1) {System.out.printf("[%d단]  ",j);}
//			
//			}
//			for(j=1;j<=9;j++) {
//				
//				System.out.printf("%d*%d=%2d   ",j,i,i*j);//위와 달리 i와 j의 위치를 바꾸면 가능 맨끝의 2d를 함으로써 곱한값의 자릿수가 맞게 정렬
//			}
//			System.out.println();//
//		}

		
		
		
//		int sum=0;
//		int i=0;
//		for(i=2;i<=100;i +=2) {//혹은 i++ 를 i+=2로 변경, i=0하면 된다. 위에 i를 정의 내렷다면 for문에서는 int i 라고 선언하지말고 그냥 i=1이렇게 대입해야한다.
//			if(i%2==0) { //만약 3의 배수라면?? %3==0
//				sum +=i;
//			}
//		}
//		System.out.println("2의 배수의 합 :"+sum);
//		System.out.println("마지막 숫자값 :"+(i-2));//그냥하면 102가된다.. 2를 빼줘야함..
		
		
		
		
//		//for(;;){} <-무한반복.(while도 형태가 같음)
//		//1~100까지의 2의 배수만 더한 값을 구하여라
//		int sum=0;
//		for(int i=1;i<=100;i++) {//혹은 i++ 를 i+=2로 변경, i=0하면 된다.
//			if(i%2==0) { //만약 3의 배수라면?? %3==0
//				sum +=i;
//			}
//		}
//		System.out.println("2의 배수의 합 :"+sum);
		//위의 상태로는 System.out.println("마지막 숫자값 :"+i);를 밑에 썻을때 i 출력이 안된다. for문 안에 출력값을 넣거나 i를밖에 미리 선언해야한다.
		
		
		
//		//합계를 구하는 반복문(for문)| 형태 : for(초기화;조건식;증감식){}//변수나 조건을 2개이상 지정할수있다.
//		int sum=0;//합계 변수
//		for(int i=1;i<=10;i++) {
//			sum +=i;//sum=sum+i //for문 중괄호 안에 if문이 들어갈 수 있다.
//		}
//		System.out.println("1~10까지의 합 :"+sum);
//		
		
		
		
//		//4부터 10까지의 변수 난수발생.
//		int ox=(int)(Math.random()*7)+4;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("4~10까지의숫자중 1개를 입력하세요");
//		int input=scan.nextInt();
//		if (input==ox) {
//			System.out.printf("당첨되었습니다. 입력된 수 %d, 랜덤난수 %d",input,ox);
//		}else {
//			System.out.printf("당첨되지않았습니다. 입력된 수 %d, 랜덤난수 %d",input,ox);
//		}
//		
		
		
		
		
//		//입력값을 3개를 받고 1~45중의 난수 1개를 맞추는 게임.
//		int ox=(int)(Math.random()*45)+1;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("1~45 중 숫자를 1개 골라 입력하세요");//중복되는 이부분들을 반복문이라 생각한다.
//		int input1=scan.nextInt();
//		System.out.println("1~45 중 숫자를 1개 골라 입력하세요");
//		int input2=scan.nextInt();
//		System.out.println("1~45 중 숫자를 1개 골라 입력하세요");
//		int input3=scan.nextInt();
//		if (ox==input1||ox==input2||ox==input3) {
//			System.out.printf("입력한수 %d %d %d 랜덤난수 %d 당첨되었습니다.", input1, input2, input3, ox);
//			
//		}else {
//			System.out.printf("입력한수 %d %d %d 랜덤난수 %d 당첨되지않았습니다.", input1, input2, input3, ox);
//			
//		}
		
		
		
		
//		//o,x 1,2(컴퓨터의 난수가 1인지 2인지 맞추는 함수
//		
//		int ox =(int)(Math.random()*2)+1;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("1과 2중 생각하는 번호를 입력하세요");
//		int ox_true=scan.nextInt();
//		if(ox==ox_true) {
//			System.out.printf("정답입니다.랜덤난수 %d",ox);
//		}else {
//			System.out.printf("오답입니다. 랜덤난수%d",ox);
//		}
//		
		
		
		//Math.random();클래스!
		
//		double ran = Math.random();//random은 0.0~1.0까지 난수로 ..
//		System.out.println("랜덤난수 :"+ran);//double은 15째 자리까지만 정확도가 있다.
		
//		double ran = Math.random()+1;//+1을 하면 1부터 시작
//		System.out.println("랜덤난수 :"+ran);//double은 15째 자리까지만 정확도가 있다.
		
		
		
//		double ran = Math.random()*10;//*10을해주면 0~10까지의 난수로 ..
//		System.out.println("랜덤난수 :"+ran);//
		
//		int ran = (int)(Math.random()*10);//정수값을 원하면 int 형변환 필요.
//		System.out.println("랜덤난수 :"+ran);//
		
//		int ran = (int)(Math.random()*10)+1;//1~10까지 원하면 +1을 해준다.
//		System.out.println("랜덤난수 :"+ran);//
		
//		int ran = (int)(Math.random()*20)+1;//1~20까지 원하면 *20)+1을 해준다. 만약 2~20까지면 *19)+2를 해준다. 3~20까지면 *18)+3을 해준다.
//		System.out.println("랜덤난수 :"+ran);//
		
		
		
	}

}
