import java.util.Scanner;

public class Ex0206_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//�߰� > ����â
		// ���ݰ���or ī�� ����
		//ī��> ����ó����( Math.random*10)+2
	//	11�̸� �������
		//12�� ���������
		
	//	�ٽ� �����
		
		
//		1.���θ� ȭ�鱸��
//		--��ǻ�� 130��, tv 100�� , ����Ʈ�� 90��
//		2.��ȣ�Է��� �޴´�.
//		--0���� ������ ���α׷� ����
//		3.��ǰ����
//		>�ܰ�� ��ǰ�ݾ��� ��
//		--�����ϸ� �˷��ְ� ����ȭ������ ���ư���.
//		>�ܰ��� ��ǰ �ݾ��� ����.
//		>��ǰ�ݾ��� 10%�� ����Ʈ�� ����
//		>���Ÿ�� ����
//
//		4.�ܰ�, ���Ÿ�� ���
		
		int ch=0;
		int ch_i=0;
		int my_bank=5000000;
		int com1=1300000;
		int tv1=1000000;
		int smartp1=900000;
		int point=0;//����Ʈ
		int charge=0;//�����ݾ�
		int ran=(int)(Math.random()*2)+10;
		String i="";//���Ÿ��
		
		Scanner scan=new Scanner(System.in);
		
		shopping :
		while(true) {
			System.out.println("---------------------------");
			System.out.println("[���� ��ǰ �춧�� ���̸�Ʈ o.<)r ~��]");
			System.out.println("---------------------------");
			System.out.println();
			System.out.println("���Ÿ� ���ϴ� ��ǰ ��ȣ�� �����ּ���");
			System.out.printf("1)��ǻ�� :%d 2)tv : %d 3)����Ʈ��: %d 4)�ܾ����� 5)����Ʈ��ȯ(���� 99)",com1,tv1,smartp1);
			System.out.println("---------------------------");
			
			ch=scan.nextInt();
			if(ch==99) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break shopping;
			}
			switch(ch) {
			
				case 1 :
					
					if(my_bank<com1) {
							System.out.println("�ܾ��� �����մϴ�.");
							continue shopping;
						}
						else {
							while(true) {
								System.out.println("��ǻ�� 1�븦 �����Ͽ����ϴ�.");
								System.out.println("�������� 1)ī����� 2)���ݰ���");
								int pay_select=scan.nextInt();
										System.out.println("����ó����");
										if((int)(Math.random()*2)==1) {
											my_bank-=com1;
											point+=(com1*0.1);
											i+=" ��ǻ�� 1��";
											break;
										}else {
											System.out.println("��������! �ٽ� �������ּ���");
											continue;			
										}
										
							}
						}
					
					
					
				case 2 :
						if(my_bank<tv1) {
							System.out.println("�ܾ��� �����մϴ�.");
							continue shopping;
						}
						else {
							System.out.println("tv 1�븦 �����Ͽ����ϴ�.");
							my_bank-=tv1;
							point+=(tv1*0.1);
							i+=" tv 1��";
							break;
						}
					
				case 3 :
					if(my_bank<smartp1) {
							System.out.println("�ܾ��� �����մϴ�.");
							continue shopping;
						}
						else {
							System.out.println("����Ʈ�� 1�븦 �����Ͽ����ϴ�.");
							my_bank-=smartp1;
							point+=(smartp1*0.1);
							i+=" ����Ʈ�� 1��";
							break;
						}
					
				case 4 :
					loop2 :while(true) {
					System.out.println("���� ����� �����ϼ���.");
					System.out.println("1)���ݰ���  2)ī�����");
					ch_i=scan.nextInt();
						
						switch(ch_i){
							
						case 1 :
							System.out.println("���ް����� �����Ͽ����ϴ�");
							System.out.println("������ �ݾ��� �Է��ϼ���");
							charge=scan.nextInt();
							my_bank+=charge;
							System.out.printf("������ �Ϸ�Ǿ����ϴ�. �����ݾ�%d %n",charge);
							break loop2;
							
						case 2 :
							System.out.println("ī������� �����Ͽ����ϴ�");
							System.out.println("������ �ݾ��� �Է��ϼ���");
							charge=scan.nextInt();
							System.out.println("�����Ͻðڽ��ϱ�? 1)yes 2)no");
							String yn=scan.next();
							
							if(yn.equals("yes")||yn.equals("1")){
								if(ran==11) {
									System.out.printf("������ �Ϸ�Ǿ����ϴ�. �����ݾ�%d %n",charge);
									break loop2;
									
								}
								else {
									System.out.println("���� ������ �߻��Ͽ����ϴ�. ����ȭ������ ���ư��ϴ�.");
									continue;
								}
								
								
							}else if(yn.equals("no")||yn.equals("2")) {
								System.out.println("������ ��ҵǾ����ϴ�.");
								continue;
							}
							else {
								System.out.println("�Է°��� �߸��Ǿ����ϴ�. ����ȭ������ ���ư��ϴ�.");
								continue;
							}
						
						default :	
							break;
						}
					}break;
				case 5 :	
					while(true) {
							System.out.println("���� ����Ʈ�� ?"+ point);
							System.out.println("����Ʈ ��ȯ�ݾ��� �Է��ϼ���");	
							int point_cash=scan.nextInt();
							if(point_cash<=point) {
								my_bank+=point_cash;
								point-=point_cash;
								System.out.printf("%d���� �����Ǿ����ϴ�. %n",point_cash);	
								break;	
							}else {
								System.out.println("����Ʈ ��ȯ�ݾ��� �ʹ� �����ϴ�. �ٽ�Ȯ�����ּ���");
								continue;
							}	
					}
					
				default :
					break;
				
			}
		

			System.out.printf("�����ܾ� %d ����Ʈ %d ���Ÿ�� %s %n",my_bank,point,i);
		
		}
		
		
		
	}

}
