import java.util.Scanner;

public class Ex0207_01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);//��ü ���� 
		
		//�ֹι�ȣ�� �޾Ƽ�
		//�¾ ���� Ȯ���ؼ�
		//12, 1, 2>�ܿ￡ �¾����
		//3,4,5>���� �¾����
		//6,7,8>������ �¾����
		//9,10,11>������ �¾����
		
		//���� 1>switch ,���� 2>if��

		String month1="";
		int month=0;
		String jumin="";//string�� ������ ������ �ʿ��ϴ� �ظ��ϸ� ������ ������ ������� �����ʱ�ȭ�� �ϴ°��� ����.
		
		System.out.println("[�¾ ������ �˾ƺ��� ���α׷�]");
		System.out.println("�ֹι�ȣ�� �Է����ּ���");
		jumin=scan.nextLine();
		month1=jumin.substring(2,4);
		month=Integer.parseInt(month1);
		
		
//		int month=0;
//		String jumin="";//string�� ������ ������ �ʿ��ϴ� �ظ��ϸ� ������ ������ ������� ������ �����ϴ°��� ����.
//		
//		System.out.println("[�¾ ������ �˾ƺ��� ���α׷�]");
//		System.out.println("�ֹι�ȣ�� �Է����ּ���");
//		jumin=scan.nextLine();
//		month=Integer.parseInt(jumin.substring(2,4));
//		System.out.println("�¾ �� :"+month+"��");
////		switch(month) {
////		
////			case 12:case 1:case 2:
////				System.out.println("�ܿ￡ �¾����");
////				break;
////			case 3:case 4:case 5:
////				System.out.println("���� �¾����");
////				break;
////			case 6:case 7:case 8:
////				System.out.println("������ �¾����");
////				break;
////			case 9:case 10:case 11:
////				System.out.println("������ �¾����");
////				break;	
////			default :
////				System.out.println("����Է��Ͽ����ϴ�.");
////				break;
////		
////		
////		}
//		
//		if(month==12||month>=1&&month<=2) {
//			System.out.println("�ܿ￡ �¾����");
//		}else if(month>=3&&month<=5) {
//			System.out.println("���� �¾����");
//		}else if(month>=6&&month<=8) {
//			System.out.println("������ �¾����");
//		}else if(month>=9&&month<=11) {
//			System.out.println("������ �¾����");
//		}else {
//			System.out.println("����Է��Ͽ����ϴ�.");
//		}
//		
//		
//		
		
		
		
		//String str=new String();

//		//�ֹι�ȣ�� �Է¹޾Ƽ� ���̸� ����ϴ� ���α׷�
//				//880101-1101111
//				//��Ʈ������ �޾ƾ���, charAt(7)
//				//String�޼ҵ� >>substring(0,2)
//		
//				
//				System.out.println("[����Ȯ�� ���α׷�]");
//				System.out.println("�ֹι�ȣ�� �Է��ϼ���");
//				String jumin=scan.nextLine();
//				String age="";
//				
//				
//				if(jumin.charAt(7)=='3'||jumin.charAt(7)=='4') {
//					//Ȥ�� 20-�⵵+1 �ص��ȴ�.
//					//int age_1=20-Integer.parseInt(age)+1;
//					age="20"+jumin.substring(0,2);
//					System.out.println(age);
//					int age_1=Integer.parseInt(age);
//					System.out.println("������ ���̴� "+(2020-age_1+1));
//				}
//				else if(jumin.charAt(7)=='1'||jumin.charAt(7)=='2') {
//					//Ȥ�� 100-�⵵+20+1 �ص��ȴ�.
//					//int age_1=100-Integer.parseInt(age)+20+1;
//					age="19"+jumin.substring(0,2);
//					int age_1=Integer.parseInt(age);
//					System.out.println("������ ���̴� "+(2020-age_1+1)); //���ڰ���ϴ� �κ��� ��ȣ �����ָ� ���� String�� ������ String�� �Ǿ� ���̰���� ����� �ȵ�.
//				}
//				else{
//					System.out.println("�Է��� �ֹι�ȣ�� �߸��Ǿ����ϴ�.");
//				}
//				
//				
		
		
//		//�ֹι�ȣ�� �Է¹޾Ƽ� �������� �ƴ��� �Ǵ��ϴ� ���α׷�
//		//880101-1101111
//		//��Ʈ������ �޾ƾ���, charAt(7)
//		
//		System.out.println("[����Ȯ�� ���α׷�]");
//		System.out.println("�ֹι�ȣ�� �Է��ϼ���");
//		String jumin=scan.nextLine();
//		int ju=jumin.charAt(7)+'0';
//		
//		if(ju==1||ju==3) {
//			System.out.println("������ ������ �����Դϴ�.");
//		}
//		else if(ju==2||ju==4) {
//			System.out.println("������ ������ �����Դϴ�.");
//		}
//		else{
//			System.out.println("�Է��� �ֹι�ȣ�� �߸��Ǿ����ϴ�.");
//		}
//		
//		
		
		
		
		
		
		
//		System.out.println("[0���� ���α׷�]");//println>����Ű ���� , printf>�����������(���͹�����), print (�׳ɿ����� ���)
//		
//			System.out.println("������ ���ڸ� �Է����ּ���");
//			int i=scan.nextInt();
//
//			//1���� ũ�� 1�̴� 0 �̴� 0���� �۴�
//			if(i>1) {
//				System.out.println("�Է��� ���ڴ� 1���� Ů�ϴ�.");
//			}
//			else if(i==1){
//				System.out.println("�Է��� ���ڴ� 1�Դϴ�.");
//					
//			}
//			else if(i==0){
//				System.out.println("�Է��� ���ڴ� 0�Դϴ�.");
//					
//			}
//			else{
//				System.out.println("�Է��� ���ڴ� 0���� �۽��ϴ�.");
//					
//			}
//			
//			
			
			
			
			
			
			
			
			
			//			//0���� ũ�� 0�̴� 0���� �۴�
//			if(i==0) {
//				System.out.println("�Է��� ���ڴ� 0 �Դϴ�.");
//			}
//			else if(i>0){
//				System.out.println("�Է��� ���ڴ� 0���� Ů�ϴ�.");
//					
//			}
//			else{
//				System.out.println("�Է��� ���ڴ� 0���� �۽��ϴ�.");
//					
//			}
//			
			
			
			
//			if(i==0) {
//				System.out.println("�Է��� ���ڴ� 0 �Դϴ�.");
//			}
//			else{
//				System.out.println("�Է��� ���ڴ� 0�� �ƴմϴ�.");
//					
//			}
//		
		
		
		

	}///main

}//class
