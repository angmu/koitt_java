import java.util.Scanner;

public class Ex0207_02 {
	public static void main(String[] args) {
		
		//���������� ����  p150
		//Ƚ���� �����ϸ� �װŸ�ŭ�� ������������ ����
		//�̱�Ƚ�� �����ֱ�
		//�·��߰�
		//�α���
		
		String id="aaa";
		String pass="1234";
		int user=0;//�ڽ��� ������ ����������
		int com=0;//��ǻ�Ͱ� ������ ����������
		int win=0;//user�� �̱�Ƚ��
		int draw=0;//���º�
		int lose=0;//�й�
		int count=0;//�й�
		int i2=0;
		int p=0;
		
		Scanner scan=new Scanner(System.in);
			
		loop1 :
		while(true) {
				System.out.println("�����ϱ� ���� �α��� ���ּ���");
				
				while(true) {
				System.out.println("id�� �Է����ּ���");
				String id_ch=scan.next();
						
				if(!(id.equals(id_ch))) {
					if(i2>5) {
					System.out.println("Ʋ��Ƚ���� �ʹ� �����ϴ�. ���α׷��� �����մϴ�.");
					break loop1;
					}
					System.out.println("id�� ��ġ���� �ʽ��ϴ�.");
					i2++;
					continue;
					}break;
				}
				while(true) {
				System.out.println("password�� �Է����ּ���");
				String pass_ch=scan.next();
				
				if(!(pass.equals(pass_ch))) {
					if(p>5) {
						System.out.println("Ʋ��Ƚ���� �ʹ� �����ϴ�. ���α׷��� �����մϴ�.");
						break loop1;
					}
					System.out.println("password�� ��ġ���� �ʽ��ϴ�.");
					p++;
					continue;
					}break;
				}
			System.out.println("�ݺ�Ƚ���� �Է��ϼ���.>>");
			count=scan.nextInt();
			for(int i=1;i<=count;i++) {
					
					
					System.out.println("����(1), ����(2), ��(3) �߿� �ϳ��� �����ϼ���");
					user=scan.nextInt();
					
					if(user<1||user>3) {
						System.out.println("���ڸ� �߸� �־����ϴ�. (1~3������)");
						i--; //��������..
						continue;
						
					}
					
					
					com=(int)(Math.random()*3)+1;
					System.out.println(i+"��° �� ���ڴ�?");
					//1-3 = -2(����) 1-1 =0 (���º�) 1-2=-1(�й�)
					//2-1 =  1(����) 2-2 =0 (���º�) 2-3=-1(�й�)
					//3-2 =  1(����) 3-3 =0 (���º�) 3-1=-2(�й�)
					//-2 or 1�̸� �¸�, 0�̸� ���º� , -1or -2�� �й�
					
					switch(user-com) {
					
					case -2 : case 1 :
						System.out.println("����ڰ� �¸�");
						win++;
						break ;
					case 0 :
						System.out.println("����ڿ� ��ǻ�� ���º�");
						draw++;
						break;
					case -1 : case 2 :
						System.out.println("��ǻ�Ͱ� �¸�");
						lose++;
						break;
					default :
						break;
						
					
					}
				}//for
			break;
		}	//while	
		System.out.println("����Ƚ�� :"+count);
		System.out.println("�¸� Ƚ�� :"+win);
		System.out.println("���º� Ƚ�� :"+draw);
		System.out.println("�й� Ƚ�� :"+lose);
		System.out.printf("�·� : %.1f",(float)win/count);

			
		
		
		
		
		
		
//		int user,com;
//		int i=0;
//		int win=0;
//		int loose=0;
//		int draw=0;
//		int cnt=0;
//		
//
//		Scanner scan=new Scanner(System.in);
//		System.out.println("[���������� ����]");
//		System.out.println("������������ ������ Ƚ���� �Է��ϼ��� (���� 0)");
//		cnt=scan.nextInt();
//		
//		while(true) {
//			if(cnt==0) {
//				System.out.println("������������ �����մϴ�.");
//				break;
//			}
//			if(i==cnt) {
//				System.out.println("������������ �����մϴ�.");
//				break;
//			}
//			System.out.println("1.���� 2.���� 3.�� �� �ϳ��� �Է��ϼ��� (���� 0)");
//			user=scan.nextInt();
//			com=(int)(Math.random()*3)+1;
//			if(user==0) {
//				System.out.println("������������ �����մϴ�.");
//			}
//			else {
//				
//				switch(user) {
//				
//				case(1) :
//					
//					if(user==com) {
//						draw++;
//						System.out.printf("%dȸ�� ���º�%n",i);
//					}else if(com==2) {
//						loose++;
//						System.out.printf("%dȸ�� �й�%n",i);
//					}else {
//						win++;
//						System.out.printf("%dȸ�� �¸�%n",i);
//					}
//					break;
//				
//				case(2) :
//					
//					if(user==com) {
//						draw++;
//						System.out.printf("%dȸ�� ���º�%n",i);
//					}else if(com==3) {
//						loose++;
//						System.out.printf("%dȸ�� �й�%n",i);
//					}else {
//						win++;
//						System.out.printf("%dȸ�� �¸�%n",i);
//					}
//					break;
//				
//				case(3) :
//					
//					if(user==com) {
//						draw++;
//						System.out.printf("%dȸ�� ���º�%n",i);
//					}else if(com==1) {
//						loose++;
//						System.out.printf("%dȸ�� �й�%n",i);
//					}else {
//						win++;
//						System.out.printf("%dȸ�� �¸�%n",i);
//					}
//					
//					
//				default :
//					System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
//					continue;
//				}i++;
//			}
//		
//		
//		}System.out.printf("���������� ���� Ƚ�� %dȸ �¸� %d �й� %d ���º� %d  ���ս·�%f",i,win,loose,draw,win/i);
		
	}//main
}//class
