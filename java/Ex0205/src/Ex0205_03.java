import java.util.Scanner;

public class Ex0205_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int select=0;
		int num1=0;
		int num2=0;
		loop1:
		while(true) { //��ü�ý���
			System.out.println("[��Ģ���� ���α׷�] (���� 99)");
			System.out.println("-------------");
			System.out.println("1) ������");//���ϱ⿡�� ���������� ����
			System.out.println("2) ����");
			System.out.println("3) ���ϱ�");
			System.out.println("4) ������");
			System.out.println("5) ���ϱ�");
		
			select=scan.nextInt();
			
			if(select==99) {
				break;
			}
			if(!(select>=1||select<=9)) {
				System.out.println("1~4������ ���ڸ� �Է��ϼ���");
				continue;
			}
			switch(select) {
				case 1 :
					loop2:	
					while(true) {
						System.out.println("1)���ϴ� �ܸ� ���.");
						System.out.println("2)���ϴ� �ܺ���  ���.");
						System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.");
												
						num1=scan.nextInt();
						
						if(num1==0) {
							System.out.println("������ �̵��մϴ�.");
							continue loop1;
						}
						
						else if(num1==99) {
							break loop1;
						}
						switch(num1) {
						
							case 1:
								System.out.println("���ϴ� �� ���ڸ� �Է��ϼ��� (�����̵� 0, ���� 99)");
								
								num2=scan.nextInt();
								
								if(num2==0) {
									continue loop2;
								}
								else if(num2==99) {
									break loop1;
								}
								for(int i=num2;i<=num2;i++) {
									for(int j=1;j<=9;j++) {
										System.out.println(i+"*"+j+"="+i*j);
									}
					}
								
							default :
								break;
								
					}
			}//case1	
						
//						System.out.println("���ϰ���� �μ��� �Է��ϼ���.(�����̵� :0, �ý�������:99)");
//						if(num1==0) {
//							continue loop1;
//						}
//						else if(num1==99) {
//							break loop1;
//						}
//						num1=scan.nextInt();
//						System.out.println("1�� �� �Է��ϼ���.");
//						num2=scan.nextInt();
//						System.out.println("�μ��� ��"+num1+num2);
						
				case 2 :
					while(true) {
						System.out.println("������� �μ��� �Է��ϼ���.(�����̵� :0, �ý�������:99)");
						if(num1==0) {
							continue loop1;
						}
						else if(num1==99) {
							break loop1;
						}
						num1=scan.nextInt();
						System.out.println("1�� �� �Է��ϼ���.");
						num2=scan.nextInt();
						System.out.println("�μ��� ��"+(num1-num2));
						}//case2
				case 3 :
					while(true) {
						System.out.println("���ϰ���� �μ��� �Է��ϼ���.(�����̵� :0, �ý�������:99)");
						if(num1==0) {
							continue loop1;
						}
						else if(num1==99) {
							break loop1;
						}
						num1=scan.nextInt();
						System.out.println("1�� �� �Է��ϼ���.");
						num2=scan.nextInt();
						System.out.println("�μ��� ��"+(num1*num2));
						}//case3
				case 4 :
					while(true) {
						System.out.println("���ϰ���� �μ��� �Է��ϼ���.(�����̵� :0, �ý�������:99)");
						if(num1==0) {
							continue loop1;
						}
						else if(num1==99) {
							break loop1;
						}
						num1=scan.nextInt();
						System.out.println("1�� �� �Է��ϼ���.");
						num2=scan.nextInt();
						System.out.println("�μ��� ������"+(num1/(double)num2));
						}//case4
					
				default :	
					break;
			
			}
			System.out.println("���α׷��� �����մϴ�");
			
		}//while
		
		
		
		
		
	}//main

}//class
