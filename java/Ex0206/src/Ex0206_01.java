import java.util.Scanner;

public class Ex0206_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ڽ��� ���� 1��
		//���θ����� 1���� ��ǰ�� ����
		//���¿��� ��ǰ������ ���ִ� ���α׷��� �����ô�.
		
		int my_bank=5000000; //���� �ܾ�
		int p_num=0;
		int com1=1300000;
		int tv1=1000000;
		int smartp1=880000;
		int point=0;
		String list1="";
		
		Scanner scan=new Scanner(System.in);
		
		Loop1 :
		while(true) {
		System.out.println("-----------------------------");
		System.out.println("[���̸�Ʈ ����]");
		System.out.println("-----------------------------");
		System.out.printf("1.��ǻ��(%d)    2.TV(%d)  3.����Ʈ��(%d) 4.�ݾ����� %n",com1,tv1,smartp1);
		System.out.println("�����ϰ� ���� ��ǰ�� �����ϼ���.>> (�������� 99)");
		
		p_num=scan.nextInt(); //���Ż�ǰ ��ȣ
		
		if(p_num==99) {
			System.out.println("������ �����մϴ�. ");
			break; 
		}
		
		switch(p_num) {
		
		case 1:
			if(!(my_bank-com1<=0)) {
			my_bank-=com1;// my_bank=my_bank-1250000; 
			point+=(com1*0.1);
			System.out.println("��ǻ�� 1�븦 �����߽��ϴ�");
			System.out.printf("��ǰ�� ������ :%d ����Ʈ :%d %n",com1,point);
			list1+=" ��ǻ�� 1��";//���� ���ϸ� ...�� �پ ���´� ����..
			break;}
			else {
				System.out.println("���� �����մϴ� �ܾ��� �������ּ���");
				continue Loop1;
			}
			//�Ʒ�ó�� �ᵵ�ȴ� '��'
//			if(my_bank<com1) {
//			System.out.println("���� �����մϴ� �ܾ��� �������ּ���");
//			continue Loop1;}
//			else {	
//				my_bank-=com1;// my_bank=my_bank-1250000; 
//				System.out.println("��ǻ�� 1�븦 �����߽��ϴ�");
//				System.out.printf("��ǰ�� ������ :%d %n",com1);
//				break;
//				}
		case 2:
			if(!(my_bank-tv1<=0)) {
			my_bank-=tv1;// my_bank=my_bank-990000; 
			point+=(tv1*0.1);
			System.out.println("TV 1�븦 �����߽��ϴ�");
			System.out.printf("��ǰ�� ������ :%d ����Ʈ :%d %n",tv1,point);
			list1+=" TV 1��";
			break;}
			else {
				System.out.println("���� �����մϴ� �ܾ��� �������ּ���");
				continue Loop1;
			}
		case 3:
			if(!(my_bank-smartp1<=0)) {
			my_bank-=smartp1;// my_bank=my_bank-880000; 
			point+=(tv1*0.1);
			System.out.println("����Ʈ�� 1�븦 �����߽��ϴ�");
			System.out.printf("��ǰ�� ������ :%d ����Ʈ :%d %n",smartp1,point);
			list1+=" ����Ʈ�� 1��";
			break;}
			else {
			System.out.println("���� �����մϴ� �ܾ��� �������ּ���");
			continue Loop1;
		}
			
		case 4:	
			System.out.println("������ �ݾ��� �Է��ϼ���");
			int charge=scan.nextInt();
			my_bank+=charge;//my_bank=my_bank+scan.nextInt()
			System.out.printf("%d���� �����Ǿ����ϴ�.%n �ܾ� %d",charge,my_bank);
				
		default:	
			break;
		
		}System.out.println("�����ܰ�� "+my_bank+"��");
		System.out.println("���Ÿ�� "+list1);
		}
		
		
		
		//-------------------------------
		
		
//		int my_bank=5000000; //���� �ܾ�
//		int p_num=0;
//		int com1=1300000;
//		int tv1=1000000;
//		int smartp1=880000;
//		
//		
//		Scanner scan=new Scanner(System.in);
//		
//		Loop1 :
//		while(true) {
//		System.out.println("[���̸�Ʈ ����]");
//		System.out.printf("1.��ǻ��(%d)    2.TV(%d)  3.����Ʈ��(%d) 4.�ݾ�����",com1,tv1,smartp1);
//		System.out.print("�����ϰ� ���� ��ǰ�� �����ϼ���.>> (�������� 99)");
//		
//		p_num=scan.nextInt(); //���Ż�ǰ ��ȣ
//		
//		if(p_num==99) {
//			System.out.println("������ �����մϴ�. ");
//			break; 
//		}
//		
//		switch(p_num) {
//		
//		case 1:
//			if(!(my_bank-com1<=0)) {
//			my_bank-=com1;// my_bank=my_bank-1250000; 
//			System.out.println("��ǻ�� 1�븦 �����߽��ϴ�");
//			System.out.printf("��ǰ�� ������ :%d %n",com1);
//			break;}
//			else {
//				System.out.println("���� �����մϴ� �ܾ��� �������ּ���");
//				continue Loop1;
//			}
//			//�Ʒ�ó�� �ᵵ�ȴ� '��'
////			if(my_bank<com1) {
////			System.out.println("���� �����մϴ� �ܾ��� �������ּ���");
////			continue Loop1;}
////			else {	
////				my_bank-=com1;// my_bank=my_bank-1250000; 
////				System.out.println("��ǻ�� 1�븦 �����߽��ϴ�");
////				System.out.printf("��ǰ�� ������ :%d %n",com1);
////				break;
////				}
//		case 2:
//			if(!(my_bank-tv1<=0)) {
//			my_bank-=tv1;// my_bank=my_bank-990000; 
//			System.out.println("TV 1�븦 �����߽��ϴ�");
//			System.out.printf("��ǰ�� ������ :%d %n",tv1);
//			break;}
//			else {
//				System.out.println("���� �����մϴ� �ܾ��� �������ּ���");
//				continue Loop1;
//			}
//		case 3:
//			if(!(my_bank-smartp1<=0)) {
//			my_bank-=smartp1;// my_bank=my_bank-880000; 
//			System.out.println("����Ʈ�� 1�븦 �����߽��ϴ�");
//			System.out.printf("��ǰ�� ������ :%d %n",smartp1);
//			break;}
//			else {
//			System.out.println("���� �����մϴ� �ܾ��� �������ּ���");
//			continue Loop1;
//		}
//			
//		case 4:	
//			System.out.println("������ �ݾ��� �Է��ϼ���");
//			int charge=scan.nextInt();
//			my_bank+=charge;//my_bank=my_bank+scan.nextInt()
//			System.out.printf("%d���� �����Ǿ����ϴ�.%n �ܾ� %d",charge,my_bank);
//				
//		default:	
//			break;
//		
//		}System.out.println("�����ܰ�� "+my_bank+"��");
//		
//		
//		}
		
		
		
		
		//---------------------
		
//		int my_bank=5000000; //���� �ܾ�
//		int p_num=0;
//		
//		
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("[���̸�Ʈ ����]");
//		System.out.println("1.��ǻ��(125����)    2.TV(99����)  3.����Ʈ��(88����)");
//		System.out.print("�����ϰ� ���� ��ǰ�� �����ϼ���.>>");
//		
//		p_num=scan.nextInt(); //���Ż�ǰ ��ȣ
//		
//		switch(p_num) {
//		
//		case 1:
//			my_bank-=1250000;// my_bank=my_bank-1250000; 
//			System.out.println("��ǻ�� 1�븦 �����߽��ϴ�");
//			System.out.println("��ǰ�� ������ :1,250,000��");
////			System.out.println("�����ܰ�� "+my_bank+"��"); //>>> case���� �Ȱ��� ���� �����̹Ƿ� �ٱ����� ���� ����.
//			break;
//		case 2:
//			my_bank-=990000;// my_bank=my_bank-990000; 
//			System.out.println("TV 1�븦 �����߽��ϴ�");
//			System.out.println("��ǰ�� ������ :990,000��");
////			System.out.println("�����ܰ�� "+my_bank+"��");
//			break;
//		case 3:
//			my_bank-=880000;// my_bank=my_bank-880000; 
//			System.out.println("����Ʈ�� 1�븦 �����߽��ϴ�");
//			System.out.println("��ǰ�� ������ :880,000��");
////			System.out.println("�����ܰ�� "+my_bank+"��");
//			break;
//		default:	
//			break;
//		
//		}
//		
		
		
	}

}
