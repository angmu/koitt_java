import java.util.Scanner;

public class Ex0205_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scan=new Scanner(System.in);
//		int select=0;
//		int dan=0;	
//LOOP1:	while(true){
//			System.out.println("������ ������� ����");
//			System.out.println("1) ���� �����ܸ� ���");
//			System.out.println("2) ���� �����ܸ� ���");
//			System.out.println("���ϴ� �޴��� �����ϼ���(���� 0)");
//			
//			select=scan.nextInt();
//			
//			if(select==0) {
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			}
//			if(!(select>=1&&select<=2)) {
//				System.out.println("���ڸ� �߸� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���");
//				System.out.println();
//			}
//			while(true){ //1�� ����������
//				System.out.println("�ܸ� ����ϴ� ���� �����߽��ϴ�.");
//				System.out.println("���ϴ� ���� �Է��ϼ���.(�����̵�0)");
//				dan=scan.nextInt();
//				
//				if(dan==0) {
//					System.out.println("������������ �Ѿ�ϴ�.");
//					System.out.println("-------------------");
//					break;
//				}
//				while(true){
//					System.out.println("����ϰ� ���� ���� �Է����ּ���(���� 0)");
//					dan=scan.nextInt();
//					if(dan==0) {
//						System.out.println("���α׷��� �����մϴ�.");
//						break;
//					}
//					if(!(dan>=1&&dan<=9)) {
//						System.out.println("1~9������ ���ڸ� �Է��ϼ���");
//						continue;//1~9������ ���� �ƴϸ� �ٽ� while����
//					}
//					for(int i=dan;i<=dan;i++) {
//						if(j%3==0||j%2==0) {
//							continue;
//						}
//						for(int j=1;j<=9;j++) {
//							System.out.println(i+"*"+j+"="+i*j);
//						}
//						System.out.println("---------------");
//					}
//				
//			}
//			
//		}//while 1
		
		
		
		
		//3�� ����� 2�� ��� ����
		
//		Scanner scan=new Scanner(System.in);
//		int dan=0;	
//		while(true){
//			System.out.println("����ϰ� ���� ���� �Է����ּ���(���� 0)");
//			dan=scan.nextInt();
//			if(dan==0) {
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			}
//			if(!(dan>=1&&dan<=9)) {
//				System.out.println("1~9������ ���ڸ� �Է��ϼ���");
//				continue;//1~9������ ���� �ƴϸ� �ٽ� while����
//			}
//			for(int i=dan;i<=dan;i++) {
//				if(j%3==0||j%2==0) {
//					continue;
//				}
//				for(int j=1;j<=9;j++) {
//					System.out.println(i+"*"+j+"="+i*j);
//				}
//				System.out.println("---------------");
//			}
//			
//		}
		
		
//		//while���� �̿��Ͽ� 0�϶� �����ϰ� ���� �� ���� �Է¹޾Ƽ� 5�� 7�� ���� ����ϵ���
//		Scanner scan=new Scanner(System.in);
//		int dan=0;	
//		while(true){
//			System.out.println("����ϰ� ���� ���� �Է����ּ���(���� 0)");
//			dan=scan.nextInt();
//			if(dan==0) {
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			}
//			if(!(dan>=1&&dan<=9)) {
//				System.out.println("1~9������ ���ڸ� �Է��ϼ���");
//				continue;//1~9������ ���� �ƴϸ� �ٽ� while����
//			}
//			for(int i=dan;i<=dan;i++) {
//				if(j==5||j==7) {
//					continue;
//				}
//				for(int j=1;j<=9;j++) {
//					System.out.println(i+"*"+j+"="+i*j);
//				}
//				System.out.println("---------------");
//			}
//			
//		}
		
		
		
//		//while���� �̿��Ͽ� 0�϶� �����ϰ� 
//		Scanner scan=new Scanner(System.in);
//		int dan=0;	
//		while(true){
//			System.out.println("����ϰ� ���� ���� �Է����ּ���(���� 0)");
//			dan=scan.nextInt();
//			if(dan==0) {
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			}
//			if(!(dan>=1&&dan<=9)) {
//				System.out.println("1~9������ ���ڸ� �Է��ϼ���");
//				continue;//1~9������ ���� �ƴϸ� �ٽ� while����
//			}
//			for(int i=dan;i<=dan;i++) {
//				for(int j=1;j<=9;j++) {
//					System.out.println(i+"*"+j+"="+i*j);
//				}
//				System.out.println("---------------");
//			}
//			
//		}
//		
		
		
		
//		//���� 1�� ��. +����ϰ����������
//		
//				Scanner scan=new Scanner(System.in);
//				System.out.println("����ϰ� �������� ���� �Է����ּ���");
//				int dan=scan.nextInt();
//				for(int i=dan;i<=dan;i++) {
//					for(int j=1;j<=9;j++) {
//						if(j==dan) {
//							continue; //continue�� ���� ���ǰ��϶��� �ǳʶپ ��������ʰ� ����ȸ���� �ٷ� �Ѿ, ���⼭�� j�� 5�̰ų� 7�϶��� ��µ�������
//						}
//						System.out.println(i+"*"+j+"="+i*j);
//						
//					}
//					System.out.println("---------------");
//				}
						
		
		
		
//		//���� 1�� ��.
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("����ϰ� ���� ���� ���ڸ� �Է����ּ���");
//		int dan=scan.nextInt();
//
//		for(int i=dan;i<=dan;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//			System.out.println("---------------");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
//		//����3. 1~9 ������ �����Է��� �ƴҽ�, �ٽ� �Է��ϰ�..
//		
//		Scanner scan=new Scanner(System.in);
//		
//		
//		int i;
//		for (;i<=9;i++) {
//			System.out.println("����ϰ� ���� ���� ���ڸ� �Է����ּ���");
//			i=scan.nextInt();
//			if(i>=10||i==0) {
//				System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�");
//				break;
//			}
//			for(int j=1;j<=9;j++) {
//			System.out.println(i+"*"+j+"="+i*j);
//			}
//			
//		}
		
		
		
//		//����2, �������� ����ϵ� �Էµ� �������ؼ� ������ �ܸ� ��µǰ� �Ѵ�
//		
//		Scanner scan=new Scanner(System.in);
//
//		System.out.println("����ϰ� ���� ���� ���ڸ� �Է����ּ���");
//		int i=scan.nextInt();
//		for (;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//			System.out.println(i+"*"+j+"="+i*j);
//			}
//			
//		}
		
		//����1, �������� ����ϵ� �Էµ� ���� �ܸ� ��µǰ� �Ѵ�
		
//		Scanner scan=new Scanner(System.in);
//				
//		
//		for (;;) {
//			System.out.println("����ϰ� ���� ���� ���ڸ� �Է����ּ���");
//			int i=scan.nextInt();
//			for(int j=1;j<=9;j++) {
//			System.out.println(i+"*"+j+"="+i*j);}
//		}
		
		
		
		
		
		//-------------------------------------
		
//		Loop1 : for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(j==5) {
//					break Loop1; //break�� ��� �ƿ� for�� ���������� 2x1~2x4������ ��� 
//				}
//				System.out.println(i+"*"+j+"="+i*j);
//				
//			}
//			System.out.println("---------------");
//		}
//		
		
		
		//---------------------------------

//		Loop1 : for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(j==5) {
//					continue Loop1; //�ٱ��� for���� �̸��� �����ϸ� j�� 5���ķδ� ��µ������� 
//				}
//				System.out.println(i+"*"+j+"="+i*j);
//				
//			}
//			System.out.println("---------------");
//		}
//		
//		
		
		
		
		
		//---------------------
		
//		
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(j==5||j==7) {
//					continue; //continue�� ���� ���ǰ��϶��� �ǳʶپ ��������ʰ� ����ȸ���� �ٷ� �Ѿ, ���⼭�� j�� 5�̰ų� 7�϶��� ��µ�������
//				}
//				System.out.println(i+"*"+j+"="+i*j);
//				
//			}
//			System.out.println("---------------");
//		}
//		
		
		//---------------------
		
//		
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(j==5) {
//					break; //break�� �̸��� ���� �������ϸ� j�ִ� for�ݺ����� �������� �������� 4�ܱ����� ������.
//				}
//				System.out.println(i+"*"+j+"="+i*j);
//				
//			}
//			System.out.println("---------------");
//		}
//		
		
	}

}
