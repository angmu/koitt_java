import java.util.Scanner;

public class Ex0207_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���Ǳ� ���α׷�
		// 1)��Ŀ��(Ŀ�� 10g) 100��, 2)���Ŀ��(Ŀ��7g ����5g) 300��, 3)��(Ŀ�� 5g ���� 5g) 200��,
		// 4)��ũĿ��(Ŀ��4 ���� 3 ����2) 100��
		// ���Ǳ� ��� ��� :Ŀ�� 100, ���� 50, ���� 70
		// **Ŀ�ǰ� ���Խ��ϴ� �� ���
		// 9)�����ڸ�� , ���̵�� ����� ������ ���Ǳ� ������� �� x���� �ȷȽ��ϴ�.
		// ���� ��ᰡ ������ �����Դϴ� �����ڿ��� �������ּ��� ��� ���
		
		//ctrl+a >��ctrl+shift+f (�ڵ�����)
		
		
//		//���Ǳ� ���α׷� <2020.02.07 ���α׷� ������Ʈ>
//		
//		String id="aaa";
//		String pass="1234";
//		
//		
//		int coffee_amount=100;//Ŀ�����
//		int sugar_amount=50;//�������
//		int milk_amount=70;//�������
//		
//		int total_sale=0;//�� �Ǹŷ�
//		int total_price=0;//�� �Ǹűݾ�
//		
//		int order_num=0;
//		int input_price=0;//���Աݾ�
//		final int BLACK_PRICE=100;//��Ŀ�� ����
//		final int SUGAR_PRICE=300;//���Ŀ�� ����
//		final int LATTE_PRICE=200;//�� ����
//		final int MILK_PRICE=100;//��ũĿ�� ����
//		boolean black_check=false;
//		boolean sugar_check=false;
//		boolean latte_check=false;
//		boolean milk_check=false;
//		
//		Scanner scan=new Scanner(System.in);
//		
//		
//		while(true) {
//			
//		System.out.println("-------------------------");
//		System.out.println("         Ŀ�����Ǳ�                      ");
//		System.out.println("-------------------------");
//		if(black_check==false) {
//			System.out.println("1)��Ŀ�� -100��");
//		}
//		System.out.println("2)���Ŀ�� -100��");
//		System.out.println("3)ī��� -100��");
//		System.out.println("4)��ũĿ�� -100��");
//		System.out.println("9)������");
//		System.out.println("0)�ý�������");
//		System.out.println("-------------------------");
//		System.out.println("���ð� ���� Ŀ�� ��ȣ�� �Է��ϼ���.>>");
//		order_num=scan.nextInt();
//		
//		switch (order_num) {
//		
//		case 1:
//			if(!(coffee_amount>10)) {
//				System.out.println("Ŀ�ǰ� �����մϴ�. �����ڿ��� �������ּ���");
//				black_check=!(black_check); //false->true , true->false
//				continue;
//			}
//			coffee_amount-=10;//Ŀ������� 10����
//			total_sale++;//���Ǹŷ� 1�� ����
//			total_price+=100;//���Ǹűݾ� 100 ����
//			input_price-=100;//���Աݾ� 100 ����
//			System.out.println("��Ŀ�� 1���� ���Խ��ϴ�. �����ο� Ŀ�� 1���� ��⼼��");
//			System.out.println("coffee_amount"+coffee_amount);
//			System.out.println("sugar_amount"+sugar_amount);
//			System.out.println("milk_amount"+milk_amount);
//			System.out.println("total_price"+total_price);
//			System.out.println("input_price"+input_price);
//			
//			
//			break;
//		case 2:
//			break;
//		case 3:
//			break;
//		case 4:
//			break;
//		case 9:
//			System.out.println("������ ���̵� �Է��ϼ���");
//			String check_id=scan.next();
//			if(id.equals(check_id)) {
//				System.out.println("���̵� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���");
//				continue;
//				
//			}
//			String check_pass=scan.next();
//			if(pass.equals(check_pass)) {
//				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���");
//				continue;
//				
//			}
//			
//			
//			
//			break;
//		case 0:
//			System.out.println("�ý�������");
//			break;
//		
//		default:
//			System.out.println("�ý��ۿ���");
//			break;
//			
//		}//switch
//		
//		
//		
//		
//		
//		System.out.println("-------------------------");
//	}//while
//		
//		
		
		
		
		Scanner scan=new Scanner(System.in);
		
		int coffee=100;
		int sugar=50;
		int milk=70;
		int input=0;
		int	input2=0;
		int money=0;
		int jan=0;
		int tr=0;
		String menu1="��Ŀ��";
		String menu2="���Ŀ��";
		String menu3="ī���";
		String menu4="��ũĿ��";
		
		String id="aaa";
		String pd="1234";
		
		System.out.println("[���Ǳ� ���α׷�]");
	loop1:	while(true) {
			System.out.println();
			System.out.printf("�޴��� �����ϼ��� (���� 0) %n1)%s -100�� %n2)%s -300�� %n3)%s -200�� %n4)%s -100�� %n9)������",menu1,menu2,menu3,menu4);
			input=scan.nextInt();
			jan++;
			
			
			
			switch(input) {
				case 0: 
					jan--;
					System.out.println("���Ǳ� ���α׷��� �����մϴ�.");
					break loop1;
				case 1:
					if(coffee<10) {
						System.out.println("���� ��ᰡ ������ �����Դϴ� �����ڿ��� �������ּ���");
						jan--;
						continue;
					}
					System.out.println("��Ŀ�ǰ� 1�� ���Խ��ϴ�.");
					coffee-=10;
					money+=100;
					break;
				case 2:
					if(coffee<7||sugar<5) {
						System.out.println("���� ��ᰡ ������ �����Դϴ� �����ڿ��� �������ּ���");
						continue;
					}
					System.out.println("���Ŀ�ǰ� 1�� ���Խ��ϴ�.");
					coffee-=7;
					sugar-=5;
					money+=300;
					break;
				case 3:
					if(coffee<5||milk<5) {
						System.out.println("���� ��ᰡ ������ �����Դϴ� �����ڿ��� �������ּ���");
						jan--;
						continue;
					}
					System.out.println("ī��󶼰� 1�� ���Խ��ϴ�.");
					coffee-=5;
					milk-=5;
					money+=200;
					break;
				case 4:
					if(coffee<4||sugar<2||milk<3) {
						System.out.println("���� ��ᰡ ������ �����Դϴ� �����ڿ��� �������ּ���");
						jan--;
						continue;
					}
					System.out.println("��ũĿ�ǰ� 1�� ���Խ��ϴ�.");
					coffee-=4;
					milk-=3;
					sugar-=2;
					money+=100;
					break;
				case 9:
					jan--;
					System.out.println("�����ڸ�带 �����Ͽ����ϴ�.");
					System.out.println("����Ȯ���� �ʿ��մϴ� �α����� ���ּ���");
					while(true) {
						if(tr>4) {
							System.out.println("���������� �α��� �õ��� �����ϴ�. �޴�����ȭ������ ���ư��ϴ�.");
							continue loop1;
						}
						System.out.print("���̵� �Է����ּ���");
						String id_ch=scan.next();
						
						if(!(id.equals(id_ch))) {
							System.out.printf("���̵� Ʋ�Ƚ��ϴ� (���� %dȸ) �ٽ� ",tr);
							tr++;
							continue;
						}
						while(true) {
							if(tr>4) {
								System.out.println("���������� �α��� �õ��� �����ϴ�. �޴�����ȭ������ ���ư��ϴ�.");
								continue loop1;
							}
							System.out.print("��й�ȣ�� �Է����ּ���");
							String pd_ch=scan.next();
							
							if(!(pd.equals(pd_ch))) {
								System.out.printf("��й�ȣ�� Ʋ�Ƚ��ϴ� (���� %dȸ) �ٽ� ",tr);
								tr++;
								continue;
							}
							break;
						}
						System.out.println();
						System.out.println("�α��� ����\n������� �����ڴ�");
						
						loop2: while(true) {
							System.out.println();
							System.out.println("���Ͻô� �޴��� �����ϼ��� \n1)���Ȯ��\n2)�Ǹ���Ȳ Ȯ��\n0)�����ڸ�� ����");
							
							input2=scan.nextInt();
							switch(input2) {
							
							case 0 :
								System.out.println("�����ڸ�带 �����մϴ�");
								continue loop1;
							case 1 :
								System.out.printf("[���Ȯ��] %nĿ�� : %d g %n���� : %d g %n���� : %d g",coffee,sugar,milk);
								System.out.println();
								break;
							case 2 :
								System.out.printf("[�Ǹ���Ȳ] %n*���Ǹż� :%d ��%n*���Ǹűݾ� :%d ��",jan,money);
								System.out.println();
								break;
								
							default:
								System.out.println("�߸������߽��ϴ�.\n ");
								break;
								
							}
						}
					}
					
					
				default :
					System.out.println("�޴��� �߸� �����Ͽ����ϴ�\n");
			
			
			}//switch
			
			
		}//while loop1

	}// main

}// class
