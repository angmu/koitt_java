import java.util.Scanner;

public class Ex0210_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p199
		Scanner scan = new Scanner(System.in);
		// �ζǹ�ȣ ����
		int temp = 0;
		int ball_index = 0;
		int[] win_num = new int[6];// ��÷��ȣ
		int goal=0;
		int[] num = new int[6];// �ζ��Է¹�ȣ
		int success = 0;// �´� ���ڰ� �ִ��� ȱ��

		while (true) {
			for (int i = 0; i < 6; i++) {// 2���� �ζǹ�ȣ�� �Է¹���
				System.out.println("1~45 �� ���ϴ� ���ڸ� �Է��ϼ���");
				num[i] = scan.nextInt();
				if (!(num[i] >= 1 && num[i] <= 45)) {
					System.out.println("�߸��Է��Ͽ����ϴ�.");
					i--;
					continue;
				}
			}//for
			break;
		}
			// ��÷��ȣ�� �ζǹ�ȣȮ��
			int[] ball = new int[45];// �ζ�
			for (int i = 0; i < 45; i++) {
				ball[i] = i + 1;
			}
			// �ζ��ڸ���ȯ >>>�׽�Ʈ�Ҷ� �̰� �ּ�ó���ϰ� �ϸ� �ȴ�.
			for (int i = 0; i < 200; i++) {
				ball_index = (int) (Math.random() * 45);// �迭�� �ڸ��� �ǹ���..0~44����..''
				temp = ball[0];
				ball[0] = ball[ball_index];
				ball[ball_index] = temp;
			}
			//�ζǹ�ȣ�� �Է¹�ȣ Ȯ��
			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < 6; j++) {
					if (num[i] == ball[j]) {
						success++;
						win_num[i] = num[i];
					}
				}
			}//for
			// �ζǹ�ȣ ���
			System.out.println("�ζǹ�ȣ��?");

			for (int i = 0; i < 6; i++) {
				System.out.print(ball[i] + " ");
			}
			// ��÷Ȯ��
			
			System.out.println(success+"�� ���缭");
			if (success >= 0 && success<=2) {
				
				System.out.println("��÷�����ʾҽ��ϴ�.");
			} else {
				System.out.println("��÷�Ǿ����ϴ�.");
				switch(success) {
				case 3 :
					System.out.println("4�� ��÷�� : 5,000��");
					break;
				case 4 :
					System.out.println("3�� ��÷�� : 50,000��");
					break;
				case 5 :
					System.out.println("2�� ��÷�� : 1,500,000��");
					break;
				case 6 :
					System.out.println("1�� ��÷�� : 1,600,000,000��");	
					
					break;
				default: 
					break;
					
				}//switch
				for (int i = 0; i < win_num.length; i++) {
					if (!(win_num[i] == 0)) {
						System.out.println("��÷��ȣ :" + num[i]);
					}
				}
			}//else
			
			
			
			}// main
			
			
			
		}//class


