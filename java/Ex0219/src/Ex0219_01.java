import java.util.Scanner;

public class Ex0219_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		int[] input=new int[2];
		int result=0;//�Ʒ��� �޼����� result�� ������ �ƴ�. ���� �Ѿ���°���..��.��
		double result_1=0;
		
		while(true) {
			System.out.println("[��Ģ�������α׷�]");
			System.out.println("--------------");
			System.out.println("1. ���ϱ�  2. ����  3. ���ϱ�  4. ������");
			System.out.println("���ϴ� ���α׷� ����>>>");
			switch(scan.nextInt()) {
			case 1:
				System.out.println("���ϱ� ���α׷�");
				input=print(input);
				//�޼��� ȣ��!(static�޼���� Ŭ�������� �Ƚᵵ������ ���ٸ�..'��'
				result=Ex0219_01.add(input[0],input[1]);
				System.out.println("����� :"+result);
				break;
			case 2:
				System.out.println("���� ���α׷�");
				input=print(input);
				//�޼��� ȣ��!(static�޼���� Ŭ�������� �Ƚᵵ������ ���ٸ�..'��'
				result=Ex0219_01.subtract(input[0],input[1]);
				System.out.println("����� :"+result);
				break;
			case 3:
				System.out.println("���ϱ� ���α׷�");
				input=print(input);
				//�޼��� ȣ��!(static�޼���� Ŭ�������� �Ƚᵵ������ ���ٸ�..'��'
				result=Ex0219_01.gob(input[0],input[1]);
				System.out.println("����� :"+result);
				break;
				
			case 4:
				System.out.println("������ ���α׷�");
				input=print(input);
				//�޼��� ȣ��!(static�޼���� Ŭ�������� �Ƚᵵ������ ���ٸ�..'��'
				result_1=Ex0219_01.nanu((double)input[0],input[1]);
				System.out.println("����� :"+result_1);
				break;
				
			default:
				break;
			
			}
			
		}
	}//main

	//����Ʈ�޼���
	static int[] print(int[] input) { //�̹� input�̶� ���¿� ���� �����Ƿ� ��ȯ�� �ʿ��� void�� ���氡��
		Scanner scan=new Scanner(System.in);
		System.out.println("1��° ���ڸ� �Է��ϼ���>>");
		input[0]=scan.nextInt();
		System.out.println("2��° ���ڸ� �Է��ϼ���>>");
		input[1]=scan.nextInt();
		return input;
	}
	
	//���ϱ� �޼���
	static int add(int a,int b) {
		return a+b;
	}
	
	//���� �޼���
	static int subtract(int a,int b) {
		return a-b;
	}
	//���ϱ� �޼���
	static int gob(int a,int b) {
		return a*b;
	}
	//������ �޼���
	static double nanu(double a,int b) {
		return a/b;
	}
	
		
		
		
		//1. �޼ҵ�(���α׷� ���̰� ª���� �Ȼ��� �ȴٿ�..:D
		//1-1 (���� ���޹�)
//		Scanner scan=new Scanner(System.in);
//		int input1=0,input2=0;
//		int result=0;//�Ʒ��� �޼����� result�� ������ �ƴ�. ���� �Ѿ���°���..��.��
//		double result_1=0;
//		
//		while(true) {
//			System.out.println("[��Ģ�������α׷�]");
//			System.out.println("--------------");
//			System.out.println("1. ���ϱ�  2. ����  3. ���ϱ�  4. ������");
//			System.out.println("���ϴ� ���α׷� ����>>>");
//			switch(scan.nextInt()) {
//			case 1:
//				System.out.println("���ϱ� ���α׷�");
//				System.out.println("���ϰ� ���� ���ڸ� �Է��ϼ���>>");
//				input1=scan.nextInt();
//				System.out.println("���ϰ� ���� ���ڸ� 1�� �� �Է��ϼ���>>");
//				input2=scan.nextInt();
//				//�޼��� ȣ��!(static�޼���� Ŭ�������� �Ƚᵵ������ ���ٸ�..'��'
//				result=Ex0219_01.add(input1,input2);
//				System.out.println("����� :"+result);
//				break;
//			case 2:
//				System.out.println("���� ���α׷�");
//				System.out.println("���� ���� ���ڸ� �Է��ϼ���>>");
//				input1=scan.nextInt();
//				System.out.println("�� ���ڸ� �Է��ϼ���>>");
//				input2=scan.nextInt();
//				//�޼��� ȣ��!(static�޼���� Ŭ�������� �Ƚᵵ������ ���ٸ�..'��'
//				result=Ex0219_01.subtract(input1,input2);
//				System.out.println("����� :"+result);
//				break;
//			case 3:
//				System.out.println("���ϱ� ���α׷�");
//				System.out.println("���ϰ� ���� ���ڸ� �Է��ϼ���>>");
//				input1=scan.nextInt();
//				System.out.println("���� ���ڸ� 1���� �Է��ϼ���>>");
//				input2=scan.nextInt();
//				//�޼��� ȣ��!(static�޼���� Ŭ�������� �Ƚᵵ������ ���ٸ�..'��'
//				result=Ex0219_01.gob(input1,input2);
//				System.out.println("����� :"+result);
//				break;
//				
//			case 4:
//				System.out.println("������ ���α׷�");
//				System.out.println("������ ���� ���ڸ� �Է��ϼ���>>");
//				input1=scan.nextInt();
//				System.out.println("���� ���ڸ� �Է��ϼ���>>");
//				input2=scan.nextInt();
//				//�޼��� ȣ��!(static�޼���� Ŭ�������� �Ƚᵵ������ ���ٸ�..'��'
//				result_1=Ex0219_01.nanu((double)input1,input2);
//				System.out.println("����� :"+result_1);
//				break;	
//				
//			default:
//				break;
//			
//			}
//			
//		}
//	}//main
//
//	//���ϱ� �޼���
//	static int add(int a,int b) {
//		int result=0;
//		result=a+b;
//		return result;
//	}
//	
//	//���� �޼���
//	static int subtract(int a,int b) {
//		int result=0;
//		result=a-b;
//		return result;
//	}
//	//���ϱ� �޼���
//	static int gob(int a,int b) {
//		int result=0;
//		result=a*b;
//		return result;
//	}
//	//������ �޼���
//	static double nanu(double a,int b) {
//		double result=0;
//		result=a/b;
//		return result;
//	}
//	
	
	
}//class
