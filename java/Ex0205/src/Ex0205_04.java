import java.util.Scanner;

public class Ex0205_04 {
	public static void main(String[] args) {
		//1,�ݿø�
		//2.�ø�
		//3.����
		//4.�ݿø��ڸ���
		//���ϴ¹�ȣ ����,
		//�Ǽ��� �޴´�..
		//
		//>>3.1454->3, 4.523->5
		//0������ �����̵� 99�� ����
		
		int btn=0;
		double input1=0;
		Scanner scan=new Scanner(System.in);

		loop1 : while(true) {
			System.out.println("�Ҽ��� �ڸ��� ���α׷� (���� 99)");
			System.out.println("1.�ݿø�");
			System.out.println("2.�ø�");
			System.out.println("3.����");
			System.out.println("4.�ݿø��ڸ��� ����");
			btn=scan.nextInt();
			if(btn==0) {
				System.out.println("������ �̵��մϴ�.");
				continue loop1;
			}
			if(btn==99) {
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;
			}
			if(!(btn>=1&&btn<=4)) {
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;
			}
			switch(btn) {
				case 1 :
					while(true) {
						System.out.println("�ݿø��� �����߽��ϴ�.����Ͻ� �Ǽ��� �Է����ּ���. (�����̵� 0 ���� 99)");
						input1=scan.nextDouble();
						if(input1==0) {
							System.out.println("������ �̵��մϴ�.");
							continue loop1;
						}
						if(input1==99) {
							System.out.println("���α׷��� �����մϴ�.");
							break loop1;
						}
						System.out.println("�ݿø��� :"+Math.round(input1));
					}
				case 2 :
					while(true) {
						System.out.println("�ø��� �����߽��ϴ�.����Ͻ� �Ǽ��� �Է����ּ���. (�����̵� 0 ���� 99)");
						input1=scan.nextDouble();
						if(input1==0) {
							System.out.println("������ �̵��մϴ�.");
							continue loop1;
						}
						if(input1==99) {
							System.out.println("���α׷��� �����մϴ�.");
							break loop1;
						}
						System.out.println("�ø��� :"+Math.ceil(input1));
					}
				case 3 :
					while(true) {
						System.out.println("�ø��� �����߽��ϴ�.����Ͻ� �Ǽ��� �Է����ּ���. (�����̵� 0 ���� 99)");
						input1=scan.nextDouble();
						if(input1==0) {
							System.out.println("������ �̵��մϴ�.");
							continue loop1;
						}
						if(input1==99) {
							System.out.println("���α׷��� �����մϴ�.");
							break loop1;
						}
						System.out.println("������ :"+Math.floor(input1));
					}
				
				case 4 :
					while(true) {
						System.out.println("�ø��� �����߽��ϴ�.����Ͻ� �Ǽ��� �Է����ּ���. (�����̵� 0 ���� 99)");
						input1=scan.nextDouble();
						if(input1==0) {
							System.out.println("������ �̵��մϴ�.");
							continue loop1;
						}
						if(input1==99) {
							System.out.println("���α׷��� �����մϴ�.");
							break loop1;
						}
						System.out.println("�Ҽ��� ��°�ڸ����� �ݿø� �ұ��?");
						btn=scan.nextInt();
						if(!(btn>=1&&btn<=3)) {
							System.out.println("1~3������ �����մϴ�.");
							continue;
						}
							switch(btn) {
							
								case 1:
									System.out.println("�Ҽ��� ù°�ڸ����� �ݿø��� �� :"+Math.round(btn));
									break;
								case 2:
									System.out.println("�Ҽ��� ��°�ڸ����� �ݿø��� �� :"+Math.round(btn*10)/10.0);
									break;
								case 3:
									System.out.println("�Ҽ��� ù°�ڸ����� �ݿø��� �� :"+Math.round(btn*100)/100.0);
									break;
								case 4:
									System.out.println("�Ҽ��� ù°�ڸ����� �ݿø��� �� :"+Math.round(btn*1000)/1000.0);
									break;
								default :
							
							
							
						}
						
						
						
						
						
						
					}	
					
					
					
				default :
					System.out.println();
			}//����ġ
			
			
			
		}//loop1
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		int btn=0;
//		double input1=0;
//		int btn2=0;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("�Ҽ��� �ڸ��� ���α׷� (���� 99)");
//		System.out.println("1.�ݿø�");
//		System.out.println("2.�ø�");
//		System.out.println("3.����");
//		System.out.println("4.���ϴ� �Ҽ��� �ݿø�");
//
//		btn=scan.nextInt();
//		loop1 : while(true) {
//			
//			switch(btn) {
//				case 1 :
//					while(true) {
//						System.out.println("�ݿø��� �����߽��ϴ�.����Ͻ� �Ǽ��� �Է����ּ���. (�����̵� 0 ���� 99)");
//						input1=scan.nextDouble();
//						if(input1==0) {
//							System.out.println("������ �̵��մϴ�.");
//							continue loop1;
//						}
//						else if(input1==99) {
//							System.out.println("���α׷��� �����մϴ�.");
//							break loop1;
//						}
//						System.out.println(Math.round(input1));
//					}
//				case 2 :
//					while(true) {
//						System.out.println("�ø��� �����߽��ϴ�.����Ͻ� �Ǽ��� �Է����ּ���. (�����̵� 0 ���� 99)");
//						input1=scan.nextDouble();
//						if(input1==0) {
//							System.out.println("������ �̵��մϴ�.");
//							continue loop1;
//						}
//						else if(input1==99) {
//							System.out.println("���α׷��� �����մϴ�.");
//							break loop1;
//						}
//						System.out.println(Math.ceil(input1));
//					}
//				case 3 :
//					while(true) {
//						System.out.println("�ø��� �����߽��ϴ�.����Ͻ� �Ǽ��� �Է����ּ���. (�����̵� 0 ���� 99)");
//						input1=scan.nextDouble();
//						if(input1==0) {
//							System.out.println("������ �̵��մϴ�.");
//							continue loop1;
//						}
//						else if(input1==99) {
//							System.out.println("���α׷��� �����մϴ�.");
//							break loop1;
//						}
//						System.out.println(Math.floor(input1));
//					}
//				case 4 :	
//					while(true) {
//						System.out.println("�ݿø�(�ڸ�������)�� �����߽��ϴ�.����Ͻ� �Ǽ��� �Է����ּ���. (�����̵� 0 ���� 99)");
//						input1=scan.nextDouble();
//						if(input1==0) {
//							System.out.println("������ �̵��մϴ�.");
//							continue loop1;
//						}
//						else if(input1==99) {
//							System.out.println("���α׷��� �����մϴ�.");
//							break loop1;
//						}
//						System.out.println("�ø��ڸ��� �Է��ϼ���");
//						btn2=scan.nextInt();
//						
//						//System.out.println(Math.round(input1*));
//					}
//					
//				case 99 :
//					System.out.println("���α׷��� �����մϴ�.");
//					break loop1;
//					
//				default :
//					System.out.println("�ٽ� �����ϼ���");
//			}//����ġ
//			
//			
//			
//		}//loop1
		
		
		
		
	}
}
