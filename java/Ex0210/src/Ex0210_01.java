import java.util.Scanner;

public class Ex0210_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���������� ������ ��������
		int select = 0;// 1��° ���ú���
		int com = 0;// com�� �� ����������
		int user = 0;// user �� �� ����������

		int win = 0;// �̱�Ƚ��
		int draw = 0;// ���Ƚ��
		int lose = 0;// ��Ƚ��
		int count = 10;// ���������� �� Ƚ��

//		int[] confirm=new int[10];
		String[] confirm = new String[10];// ����Ȯ��

		Scanner scan = new Scanner(System.in);
		while (true) {

			System.out.println("-----------------");
			System.out.println("����������/����Ȯ�����α׷�");
			System.out.println("-----------------");
			System.out.println("1)���������� ����  2)����Ȯ��");
			System.out.println("��ȣ�� �������ּ��� (���� 0)");

			select = scan.nextInt();
			if (select == 0) {
				System.out.println("�ý�������");
				break;
			}
			switch (select) {

			case 1:
				System.out.println("����������");
				for (int i = 0; i < count; i++) {

					if (i >= 10) {
						System.out.println("������ �����մϴ�");

						break;
					}

					com = (int) (Math.random() * 3) + 1;

					System.out.println("[���������� ����]");
					System.out.println("1)���� 2)���� 3)�� �߿� 1���� ����ּ��� (���� 0��)");
					user = scan.nextInt();
					if (user == 0) {
						System.out.println("������ �����մϴ�");
						break;
					}
					if (!(user >= 1 && user <= 3)) {
						System.out.println("�߸��Է��Ͽ����ϴ�.");
						count--;
						continue;
					}
					switch (user - com) {
					// 1 3 -2
					case 0:
						System.out.println("�����ϴ�.");
						confirm[i] = "���º�";
						draw++;
						break;
					case -2:
					case 1:
						System.out.println("�̰���ϴ�.");
						confirm[i] = "�¸�";
						win++;
						break;
					case -1:
					case 2:
						System.out.println("�����ϴ�.");
						confirm[i] = "�й�";
						lose++;
						break;

					default:
						continue;
					}// user-com switch
				} // for
				System.out.printf("%d�� �� �¸� %d, �й�%d, ���º� %d �·�%.1f %n", count, win, lose, draw,
						win / (float) count * 100.0);

				break;

			case 2:
				System.out.println("����Ȯ�� START");
				for (int i = 0; i < 10; i++) {
					System.out.println((i + 1) + "��° ���д� ?" + confirm[i]);
				}
				System.out.printf("%d�� �� �¸� %d, �й�%d, ���º� %d �·�%.1f%n", count, win, lose, draw,
						win / (float) count * 100.0);
				break;

			}// select switch

		} // while

//		//1���� 100 ������ �迭�� �����ϰ� �迭�� �� ���� 
//		//������ 0��������� sum
//		//1���� ������ sum ... 100�� ������ sum�� �ٸ� �迭��ҿ� ����
//		
//		int []score=new int[100];
//		int[]sum=new int[100];
//		
//		for(int i=0;i<100;i++) {
//			score[i]=i+1;
//			if(i==0) {
//				sum[i]=0+score[i];
//			}else {
//			sum[i]+=sum[i-1]+score[i];}///�迭�� 0���� �����ϱ⶧���� -1��ä�� ���θ� ������ �߹Ƿ� i=0�϶� 0�� ������ ���Ҽ��ֵ���..�Ѵ�.. 
//			System.out.println(score[i]+"�� ������� �� :"+sum[i]);
//		}
//		

//		//100���� ���ڸ� 1~100�����ؼ� ������ �迭�� �����غ�����
//		
//		int[] score= new int[100];
//		for(int i=0;i<100;i++) {
//			score[i]=(i+1);
//			System.out.println(score[i]);
//		}

//		int[] score1=new int[5];
//		score1[0]=100;
//		score1[1]=90;
//		score1[2]=80;
//		score1[3]=70;
//		score1[4]=60;
//		
//		int score2= {100,90,80,70,60};
//		
//		int []score3;
//		score3=new int[] {100,90,80,70,60};//���� ���̿� ���ڸ� ���� �ʴ´�.

		// 1���� 6������ �������� 5��

//		int[] score=new int[5];//5���� ������ �������
//		for(int i= 0;i<5;i++) {
//			score[i]=(int)(Math.random()*6)+1;
//			System.out.println((i+1)+"�� ������ :"+score[i]);
//		}
//		
//		int[] total;
//		total=new int[5];
//		total[0]=1; //���� �ٷ� ����,>new int[5];�� ���� ������ �������

//		//���� �ٿ��������մ�
//		int[]total=new int[5];

		// �Ʒ����� �迭�� ���� ^^
//		int ran1=(int)(Math.random()*6)+1;
//		int ran2=(int)(Math.random()*6)+1;
//		int ran3=(int)(Math.random()*6)+1;
//		int ran4=(int)(Math.random()*6)+1;
//		int ran5=(int)(Math.random()*6)+1;
//		
//		System.out.println("1���� 6���� ������ �������� 5�� :"+ran1+" "+ran2+" "+ran3+" "+ran4+" "+ran5);
//		
	}

}
