import java.util.Scanner;

public class Ex0205_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�� ���� ��Ģ���� ���α׷�
//		1)���ϱ� 2) ���� 3) ���ϱ� 4) ������ ���ϴ� ���ڸ� �Է��ϼ���(����:0) 
//		1�� �����ϰԵǸ� �μ��� �Է��ϼ���.(������ �̵� 0)
		Scanner scan=new Scanner(System.in);
		int btn=0;
		int input1=0;
		int input2=0;
		
		while(true) {
			System.out.println("��Ģ���� ������� ����");
			System.out.println("1) ���� ���ϱ�");
			System.out.println("2) ���� ����");
			System.out.println("3) ���� ���ϱ�");
			System.out.println("4) ���� ������");
			System.out.println("5) ���ϴ� �ܸ� ������ ���");
			System.out.println("���ϴ� �޴��� �����ϼ���(���� 0)");
			btn=scan.nextInt();
			
			if(btn==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
						
			if(!(btn>=1||btn<=5)) {
				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
				continue;
			}
			if(btn==1) {
				while(true) {
					//1�� ����������
					System.out.println("������ �����մϴ�.(�����޴� 0)");
					System.out.println("ù��° ���ڸ� �Է��ϼ���");
					input1=scan.nextInt();
					if(input1==0) {
						System.out.println("������������ �Ѿ�ϴ�.");
						System.out.println("-------------------");
						break;
					}
					System.out.println("�ι�° ���ڸ� �Է��ϼ���");
					input2=scan.nextInt();
					
					System.out.println(input1+"+"+input2+"="+(input1+input2)+"�Դϴ�.");
				}
			}
			if(btn==2) {
				while(true) {
					//2�� ����������
					System.out.println("������ �����մϴ�.(�����޴� 0)");
					System.out.println("ù��° ���ڸ� �Է��ϼ���");
					input1=scan.nextInt();
					if(input1==0) {
						System.out.println("������������ �Ѿ�ϴ�.");
						System.out.println("-------------------");
						break;
					}
					System.out.println("�ι�° ���ڸ� �Է��ϼ���");
					input2=scan.nextInt();
					
					System.out.println(input1+"-"+input2+"="+(input1-input2)+"�Դϴ�.");
				}
			}
			if(btn==3) {
				while(true) {
					//3�� ����������
					System.out.println("������ �����մϴ�.(�����޴� 0)");
					System.out.println("ù��° ���ڸ� �Է��ϼ���");
					input1=scan.nextInt();
					if(input1==0) {
						System.out.println("������������ �Ѿ�ϴ�.");
						System.out.println("-------------------");
						break;
					}
					System.out.println("�ι�° ���ڸ� �Է��ϼ���");
					input2=scan.nextInt();
					
					System.out.println(input1+"*"+input2+"="+(input1*input2)+"�Դϴ�.");
				}
			}
			if(btn==4) {
				while(true) {
					//4�� ����������
					System.out.println("�������� �����մϴ�.(�����޴� 0)");
					System.out.println("ù��° ���ڸ� �Է��ϼ���");
					input1=scan.nextInt();
					if(input1==0) {
						System.out.println("������������ �Ѿ�ϴ�.");
						System.out.println("-------------------");
						break;
					}
					System.out.println("�ι�° ���ڸ� �Է��ϼ���");
					input2=scan.nextInt();
					
					System.out.println(input1+"��"+input2+"="+(input1/(double)input2)+"�Դϴ�.");
				}
			}
			if(btn==5) {
				while(true) {
					//5�� ����������
					System.out.println("�������� �����մϴ�.(�����޴� 0)");
					System.out.println("���ϴ� ���� �Է��ϼ���");
					input1=scan.nextInt();
					if(input1==0) {
						System.out.println("������������ �Ѿ�ϴ�.");
						System.out.println("-------------------");
						break;
					}
					else if(!(input1>=2||input1<=9)) {
						System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ��Է����ּ���");
						continue;
					}
					else {
						System.out.println("["+input1+"��]");
						for(int i=input1;i<=input1;i++) {
							for(int j=1;j<=9;j++) {
								System.out.println(i+"*"+j+"="+(i*j));
							}
						}	
					}
				}
			}
		}
		
		
		
		
		
		
	}

}
