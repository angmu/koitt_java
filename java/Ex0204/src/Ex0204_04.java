import java.util.Scanner;

public class Ex0204_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100 �Է°���  �������� ���Ͽ� �Է°��� ũ�� �������ڴ� �Է°����� �۽��ϴ�, ������ �ݴ�� �޼��� ���� ���·� �����. 0�� �Է��ϸ� ���α׷��� ����.
		//��
		int input=0;
		String save="";
		int check=(int)(Math.random()*100)+1;
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("1-100���ڸ� �Է��ϼ��� 0�� ������ �����մϴ�.");
			
			input=scan.nextInt();
			save=save+input+" ";
			if(input==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else if(input==check) {
				
				System.out.printf("��÷�Ǿ����ϴ�. ��÷��ȣ :%d �Է��� ��ȣ :%s",check,save);
				break;
			}
			else if(input>check) {
				
				System.out.println("�Է¼��ڰ� Ů�ϴ�. �������� �Է��ϼ���");
				
			}
			else if(input<check) {
	
				System.out.println("�Է¼��ڰ� �۽��ϴ�. ū���� �Է��ϼ���");
				
			}
			System.out.println("�Է��� ��ȣ :" +save);
			
			
		}	//while
		
		
		
		
		
//		//while�� Ǯ� ��..
//		Scanner scan=new Scanner(System.in);
//		int i;
//		int ch=(int)(Math.random()*100)+1;
//		System.out.println("1~100������ ������ ������� ���ڸ� �Է��ϼ��� 0�� ������ ���α׷��� �����մϴ�.");
//		while(true) {
//			
//			i=scan.nextInt();
//			
//			if(i>ch) {
//				
//				System.out.println("�������ڴ� �Է°����� �۽��ϴ�.");	
//				System.out.println("1~100������ ������ ������� ���ڸ� �Է��ϼ��� 0�� ������ ���α׷��� �����մϴ�.");
//			}
//			else if(i==0){
//				System.out.println("���α׷��� �����մϴ�");
//				break;
//			}
//			
//			else {
//				if(i<ch) {
//				System.out.println("�������ڴ� �Է°����� Ů�ϴ�.");
//				System.out.println("1~100������ ������ ������� ���ڸ� �Է��ϼ��� 0�� ������ ���α׷��� �����մϴ�.");}
//				else {
//				System.out.println("�����Դϴ�.");
//				break;
//				}
//			}
//
//			
//		}
		
		
		
		
		
		
		//�ڴ�� do while�� �غη���..=��=;;;;
//		Scanner scan=new Scanner(System.in);
//		int i;
//		int ch=(int)(Math.random()*100)+1;
//		
//		do {
//			System.out.println("1~100������ ������ ������� ���ڸ� �Է��ϼ��� 0�� ������ ���α׷��� �����մϴ�.");
//			i=scan.nextInt();
//			if(i>ch) {
//				System.out.println("�������ڴ� �Է°����� �۽��ϴ�.");			
//			}
//			else if(i==0){
//				System.out.println("���α׷��� �����մϴ�");
//				break;
//			}
//			
//			else {
//				if(i<ch) {
//				System.out.println("�������ڴ� �Է°����� Ů�ϴ�.");}
//				else {
//				System.out.println("�����Դϴ�.");
//				break;
//			}
//
//			
//		}
//		while(!(i==ch));
		
		
	}

}
