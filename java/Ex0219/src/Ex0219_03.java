import java.util.Scanner;

public class Ex0219_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ���ϱ� ���α׷�
		//1. ���簢�� input2
		//2. �ﰢ�� input2
		//3. ������
		//4. ���簢�� 
		//5. ��
		//while /switch >>�޼ҵ� �и�
		
//		Scanner scan=new Scanner(System.in);
//		int num=0,num2=0;
//		int input=0;
//		int result=0;
//		loop:
//		while(true) {
//			print();//����Ʈ
//			switch(scan.nextInt()) {
//			
//			case 0:
//				System.out.println("���α׷��� �����մϴ�.");
//				break loop;
//			case 1:
//				System.out.println("�簢�� ���̸� ����");
//				num=input();
//				num2=input();
//				System.out.println("���̴�? "+result);
//				break;
//			case 2:
//				System.out.println("�ﰢ�� ���̸� ����");
//				num=input();
//				num2=input();
//				System.out.println("���̴�? "+result);
//				break;
//			case 3:
//				System.out.println("������ ���̸� ����");
//				num=input();
//				num2=input();
//				System.out.println("���̴�? "+result);
//				break;
//			case 4:
//				System.out.println("���簢�� ���̸� ����");
//				num=input();
//				System.out.println("���̴�? "+result);
//				break;
//			case 5:
//				System.out.println("�� ���̸� ����");
//				num=input();
//				System.out.println("���̴�? "+result);
//				break;
//				
//			default:
//				System.out.println("�߸��Է��Ͽ����ϴ�.");
//				continue;
//			
//			
//			}
//			
//		}//while
//		
//		
//		
//	}//main
//
//	static void print() {
//		System.out.println("=============");
//		System.out.println("���� ���ϱ� ���α׷�");
//		System.out.println("=============");
//		System.out.println("1)���簢��  2)�ﰢ��  3)������");
//		System.out.println("4)���簢��  5)��");
//		System.out.println("���ϴ� �޴��� �����ϼ��� (���� 0)>>>");
//	}
//	
//	
//	static int input() {
//		int[] input=new int[2];
//		int result=0;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("���ڸ� �Է����ּ���");
//		input[0]=scan.nextInt();
//		System.out.println("���ڸ� �Է����ּ���");
//		input[1]=scan.nextInt();
//		result=input[0]*input[1];
//		return result;
//	}
	//-----------------------������� ������
		
		
		
		
		Scanner scan=new Scanner(System.in);
		int[] num=new int[2];
		int input=0;
		int result=0;
		loop:
		while(true) {
			print();//����Ʈ
			switch(scan.nextInt()) {
			
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				break loop;
			case 1:
				System.out.println("�簢�� ���̸� ����");
				num=input();
				System.out.println("���̴�? "+num[0]*num[1]);
				break;
			case 2:
				System.out.println("�ﰢ�� ���̸� ����");
				num=input();
				System.out.println("���̴�? "+0.5*num[0]*num[1]);
				break;
			case 3:
				System.out.println("������ ���̸� ����");
				num=input();
				System.out.println("���̴�? "+0.5*4*num[0]*num[1]);
				break;
			case 4:
				System.out.println("���簢�� ���̸� ����");
				num=input();
				System.out.println("���̴�? "+num[0]*num[0]);
				break;
			case 5:
				System.out.println("�� ���̸� ����");
				num=input();
				System.out.println("���̴�? "+3.14*num[0]*num[0]);
				break;
				
			default:
				System.out.println("�߸��Է��Ͽ����ϴ�.");
				continue;
			
			
			}
			
		}//while
		
		
		
	}//main

	static void print() {
		System.out.println("=============");
		System.out.println("���� ���ϱ� ���α׷�");
		System.out.println("=============");
		System.out.println("1)���簢��  2)�ﰢ��  3)������");
		System.out.println("4)���簢��  5)��");
		System.out.println("���ϴ� �޴��� �����ϼ��� (���� 0)>>>");
	}
	
	
	static int[] input() {
		int[] input=new int[2];
		Scanner scan=new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���");
		input[0]=scan.nextInt();
		System.out.println("���ڸ� �Է����ּ���");
		input[1]=scan.nextInt();
		return input;
	}
	
	//=================
//		Scanner scan=new Scanner(System.in);
//		int num,num2=0;
//		int result=0;
//		loop:
//		while(true) {
//			print();//����Ʈ
//			switch(scan.nextInt()) {
//			
//			case 0:
//				System.out.println("���α׷��� �����մϴ�.");
//				break loop;
//			case 1:
//				System.out.println("�簢�� ���̸� ����");
//				num=input();
//				num2=input();
//				System.out.println("���̴�? "+num*num2);
//				break;
//			case 2:
//				System.out.println("�ﰢ�� ���̸� ����");
//				num=input();
//				num2=input();
//				System.out.println("���̴�? "+0.5*num*num2);
//				break;
//			case 3:
//				System.out.println("������ ���̸� ����");
//				num=input();
//				num2=input();
//				System.out.println("���̴�? "+0.5*4*num*num2);
//				break;
//			case 4:
//				System.out.println("���簢�� ���̸� ����");
//				num=input();
//				System.out.println("���̴�? "+num*num);
//				break;
//			case 5:
//				System.out.println("�� ���̸� ����");
//				num=input();
//				System.out.println("���̴�? "+3.14*num*num);
//				break;
//				
//			default:
//				System.out.println("�߸��Է��Ͽ����ϴ�.");
//				continue;
//			
//			
//			}
//			
//		}//while
//		
//		
//		
//	}//main
//
//	static void print() {
//		System.out.println("=============");
//		System.out.println("���� ���ϱ� ���α׷�");
//		System.out.println("=============");
//		System.out.println("1)���簢��  2)�ﰢ��  3)������");
//		System.out.println("4)���簢��  5)��");
//		System.out.println("���ϴ� �޴��� �����ϼ��� (���� 0)>>>");
//	}
//	
//	
//	static int input() {
//		int input=0;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("���ڸ� �Է����ּ���");
//		input=scan.nextInt();
//		
//		return input;
//	}
	
}//class
