import java.util.Scanner;

public class Ex0210_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ī����� ��
		
		int[]user_card=new int[10];
		int user_select=0;//������ ������ ī��迭��ȣ
		int[]com_card=new int[10];
		int com_index=0;//��ī�� �迭 ��������
		int temp=0;//�迭������ ���º���
		int win=0;//�̱�Ƚ��
		int lose=0;//��Ƚ��
		int draw=0;//���º�
		
		for(int i=0;i<10;i++) {
			user_card[i]=i+1; //1~10���� �����Է�
			com_card[i]=i+1;
			
		}
		for(int i=0;i<10;i++) {
		com_index=(int)(Math.random()*10);//��ī�� �迭 ��ȣ			
		temp=com_card[0];
		com_card[0]=com_card[com_index];
		com_card[com_index]=temp;
		}
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("ī�� 1~10�� 1���� �̾��ּ���");
			System.out.println("1)1 2)2 3)3 4)4 5)5 6)6 7)7 8)8 9)9 10)10 ");
			user_select=scan.nextInt();
			if(user_select>10) {
				System.out.println("�߸���ī���Դϴ�. �ٽó��ּ���");
				continue;
			}
			if(user_card[user_select-1]==0) {
				System.out.println("�ߺ��� ī���Դϴ�. �ٽó��ּ���");
				continue;
			}
			
			
			System.out.println("����ī�� :"+(user_card[user_select-1])+" ��ī�� :"+com_card[i]);
			
			if(user_card[user_select-1]-com_card[i]>0) {
				System.out.println(i+"��° :�¸�");
				win++;
				user_card[user_select-1]=0;
			}else if(user_card[user_select-1]==com_card[i]) {
				System.out.println(i+"��° :���º�");
				draw++;
				user_card[user_select-1]=0;
			}else {
				System.out.println(i+"��° :�й�");
				lose++;
				user_card[user_select-1]=0;
			}//if
			
		}//for
		System.out.printf("�·� :%.1f",(float)win/10*100.0);
		
		
	}

}
