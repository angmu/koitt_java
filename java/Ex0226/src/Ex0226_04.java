import java.util.Scanner;

public class Ex0226_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Card c11=new Card();
		
		
		
		//ī�����
		Deck d=new Deck();
		Card[] user=new Card[7];
		Card[] com=new Card[7];
		int u_count=0,c_count=0,count=0;//����ī�尳��,��ī�尳��,��üī���ε���
		int u_win=0,c_win=0;//��������
		loop:
		while(true) {
			if(u_count==7) {
				System.out.println("7���� ī�带 ��� �����Ͽ����ϴ�");
				System.out.println("���Ӱ�� ���");
				System.out.println("===============================");
				break loop;
			}
			Scanner scan=new Scanner(System.in);
			System.out.println("ī����� (���� 0)");
			System.out.println("====================");
			System.out.println("1)���ӽ���");
			System.out.println("2)1���߰�");
			System.out.println("���ϴ� ��ȣ�� �����ϼ���");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				if(u_count>=3) {
					System.out.println("�̹� ���۵� �����Դϴ�.");
					continue loop;
				}
				d.suffle();
				System.out.println("3�徿 �̾ư��⸦ ����.");
				System.out.println("����");
				for(int i=0;i<3;i++) {
					user[u_count]=d.cardCh(count);
					u_count++;
					count++;
				}
				for(int i=0;i<u_count;i++) {
					System.out.print(user[i]+" ");
				}System.out.println();
				System.out.println("��ǻ��");
				for(int i=0;i<3;i++) {
					com[c_count]=d.cardCh(count);
					c_count++;
					count++;
				}
				for(int i=0;i<c_count;i++) {
					System.out.print(com[i]+" ");
				}System.out.println();
				break;
			case 2:
				if(u_count>=7) {
					System.out.println("ī�带 �ʹ� ���� ������ �ֽ��ϴ�.");
					continue loop;
				}
				System.out.println("����");
				user[u_count]=d.cardCh(count);
				u_count++;
				count++;
				for(int i=0;i<u_count;i++) {
					System.out.print(user[i]+" ");
				}System.out.println();
				System.out.println("��ǻ��");
				com[c_count]=d.cardCh(count);
				c_count++;
				count++;
				for(int i=0;i<c_count;i++) {
					System.out.print(com[i]+" ");
				}System.out.println();
				break;
			case 0:
				System.out.println("��������");
				break loop;
			default:
				System.out.println("�߸��Է��Ͽ����ϴ�.");
				continue;
			}
			
			
			
			
		}//while
		//����ī��
		System.out.println("����ī��");
		for(int i=0;i<u_count;i++) {
			System.out.print(user[i]+" ");
			if(user[i].kind==3) {
				u_win++;
			}
		}System.out.println();
		System.out.println("��ī��");
		for(int i=0;i<c_count;i++) {
			System.out.print(com[i]+" ");
			if(com[i].kind==3) {
				c_win++;
			}
		}System.out.println();
		
		//clover�� ������ �����ڴ�?
		
		System.out.println("���� Ŭ�ι� ����"+u_win);
		System.out.println("��ǻ�� Ŭ�ι� ����"+c_win);
		
		if(u_win>c_win) {
			System.out.println("�����¸�");
		}else if(u_win==c_win) {
			System.out.println("���º�");
		} else {
			System.out.println("�����й�");                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		}
		
		
		
		
	}

}//class

