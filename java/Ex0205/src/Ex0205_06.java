import java.util.Scanner;

public class Ex0205_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//숫자맞추기프로그램
		//숫자 5개를 연속으로 받아서 랜덤수 자릿수랑 비교하여 몇개를 맞췃는지 확인.
		//3개이상 맞으면 100만원. 2개이상 맞으면 10만원, 1개이상맞으면 1만원
		//출력형태 > 랜덤수 ***** 입력수 ***** 같은수 입력 *개 , 상금 *만원
		
		
	    //하나하나 받을 경우 0~9랜덤
	    int ran1=(int)(Math.random()*10);
	    int ran2=(int)(Math.random()*10);
	    int ran3=(int)(Math.random()*10);
	    int ran4=(int)(Math.random()*10);
	    int ran5=(int)(Math.random()*10);
	    //랜덤수들이 중복되지 않도록..
	    //2번수가 1번수랑 같으면 다시랜덤, 3번수가 1번이나 2번과 같으면 다시랜덤~~이런식으루..ㅜ
	    
	    
	    
	    int count=0;
	    //입력
	    Scanner scan=new Scanner(System.in);
		
	    System.out.println("[숫자맞추기게임]");
	    System.out.println("다섯자리 숫자를 입력하세요");
	    String input=scan.nextLine();
	    
	    //input,charAt(0)	
	    if(ran1==(input.charAt(0)-'0')) {
	    	count++;
	    }	
	    if(ran2==(input.charAt(1)-'0')) {
	    	count++;
	    }
	    if(ran3==(input.charAt(2)-'0')) {
	    	count++;
	    }
	    if(ran4==(input.charAt(3)-'0')) {
	    	count++;
	    }
	    if(ran5==(input.charAt(4)-'0')) {
	    	count++;
	    }
	    
	    System.out.println("랜덤수 :"+ran1+ran2+ran3+ran4+ran5);

	    System.out.println("입력수 :"+input);

	    System.out.println("같은수입력 :"+count);
	    
	    switch(count) {
	    case 0:
	    	System.out.println("상금없음");
	    	break;	    
	    case 1:
	    	System.out.println("상금 :1만원");
	    	break;
	    case 2:
	    	System.out.println("상금 :10만원");
	    	break;
	    case 3 :case 4 :case 5:
	    	System.out.println("상금 :100만원");	
	    	break;
	    default : 
	    	;
	    }
	    
	}
	}

