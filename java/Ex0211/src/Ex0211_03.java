import java.util.Scanner;

public class Ex0211_03 {

	public static void main(String[] args) {
		// /->������ %->������

		// 3���� �޾��� �Է��Ͽ� 3���� ��� ���. ��, �迭�� ���
		int[] money = new int[3];
		int[] coin = { 500, 100, 50, 10 };

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println((i+1)+"��° �������� �ٲٰ���� �ݾ��� �Է��ϼ���");
			money[i] = scan.nextInt();
		}
		for (int j = 0; j < 3; j++) {
			System.out.println("\n"+(j+1)+"��° �ٲ۱ݾ� : " + money[j] + "��");

			for (int i = 0; i < 4; i++) {
				System.out.println(coin[i] + "�� : " + money[j] / coin[i] + "��");
				money[j] %= coin[i];

			}
		}
		// �Ʒ����� ���� ���氡��

//		// 5890��->�Է�����
//		int money=0;
//		int[]coin= {500,100,50,10};
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("�������� �ٲٰ���� �ݾ��� �Է��ϼ���");
//		money=scan.nextInt();
//		System.out.println("�ٲ۱ݾ� : "+money+"��");
//
//		for(int i=0;i<4;i++) {
//			System.out.println(coin[i]+"�� : "+money/coin[i]+"��");
//			money%=coin[i];
//		
//		}
//
//		//		�Ʒ����� ���� ���氡��

//		// 5890��->500��¥�� ����, 100�� ���� 50����,10����
//		int money=5890;
//		int[]coin= {500,100,50,10};
//		for(int i=0;i<4;i++) {
//			System.out.println(coin[i]+"�� : "+money/coin[i]+"��");
//			money%=coin[i];
//		
//		}
//
		// �Ʒ����� ���� ���氡��
//		// /->������ %->������
//				// 5890��->500��¥�� ����, 100�� ���� 50����,10����
//				int money=5890;
//				int coin500=0;
//				int coin100=0;
//				int coin50=0;
//				int coin10=0;
//				}
//				coin500=money/500;
//				coin100=money%500/100;
//				coin50=money%500%100/50;
//				coin10=money%500%100%50/10;
//				
//				
//				
//				System.out.println(money+"���� �������� �ٲ����� �ʿ䰳��\n");
//				System.out.println("500�� "+coin500+"��");
//				System.out.println("100�� "+coin100+"��");
//				System.out.println("50�� "+coin50+"��");
//				System.out.println("10�� "+coin10+"��");
//				
//				

	}

}
