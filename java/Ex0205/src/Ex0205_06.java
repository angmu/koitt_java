import java.util.Scanner;

public class Ex0205_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//���ڸ��߱����α׷�
		//���� 5���� �������� �޾Ƽ� ������ �ڸ����� ���Ͽ� ��� �­����� Ȯ��.
		//3���̻� ������ 100����. 2���̻� ������ 10����, 1���̻������ 1����
		//������� > ������ ***** �Է¼� ***** ������ �Է� *�� , ��� *����
		
		
	    //�ϳ��ϳ� ���� ��� 0~9����
	    int ran1=(int)(Math.random()*10);
	    int ran2=(int)(Math.random()*10);
	    int ran3=(int)(Math.random()*10);
	    int ran4=(int)(Math.random()*10);
	    int ran5=(int)(Math.random()*10);
	    //���������� �ߺ����� �ʵ���..
	    //2������ 1������ ������ �ٽ÷���, 3������ 1���̳� 2���� ������ �ٽ÷���~~�̷�������..��
	    
	    
	    
	    int count=0;
	    //�Է�
	    Scanner scan=new Scanner(System.in);
		
	    System.out.println("[���ڸ��߱����]");
	    System.out.println("�ټ��ڸ� ���ڸ� �Է��ϼ���");
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
	    
	    System.out.println("������ :"+ran1+ran2+ran3+ran4+ran5);

	    System.out.println("�Է¼� :"+input);

	    System.out.println("�������Է� :"+count);
	    
	    switch(count) {
	    case 0:
	    	System.out.println("��ݾ���");
	    	break;	    
	    case 1:
	    	System.out.println("��� :1����");
	    	break;
	    case 2:
	    	System.out.println("��� :10����");
	    	break;
	    case 3 :case 4 :case 5:
	    	System.out.println("��� :100����");	
	    	break;
	    default : 
	    	;
	    }
	    
	}
	}

