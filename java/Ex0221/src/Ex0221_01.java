import java.util.Scanner;

public class Ex0221_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1���� 10�迭
		// 1~45 �迭 ����� ���ֱ�
		// 10���� �迭�� �־���
		// �ߺ���� x

		int[] lotto = new int[45];
		int[] lotto2 = new int[10];
		
		int select = 0, result = 0;
		while (true) {
			
			select = main_pArr();//main print
			switch (select) {
			case 1:
				System.out.println("���ֱ� �Ϸ�");
				// 45�� �ֱ�
				ball(lotto);
				break;
			case 2:
				System.out.println("������ �Ϸ�");
				// ������
				ball_sh(lotto);
				break;
			case 3:
				System.out.println("������ �Ϸ�");
				// ���̱�
				lotto(lotto, lotto2);
				break;
			case 4:
				System.out.println("���õ� ��");
				// �� ����Ʈ
				print2(lotto2);
				break;
			case 5:
				System.out.println("���õ� ���� ���̴ٿ�");
				result = sumArr(lotto2);
				System.out.println(result);
				break;
			case 6:
				int[]lotto3=new int[10];
				lotto(lotto2, lotto3);
				System.out.println("������");
				print2(lotto3);//������
				System.out.println("���� �̻ڰ� �����޴ٿ�");
				sortArr2(lotto2);
				print2(lotto2);//������
//				System.out.println("������");
//				print2(lotto2);//������
//				System.out.println("���� �̻ڰ� �����޴ٿ�");
//				sortArr(lotto2);
//				print2(lotto2);//������
				break;
			default:
				System.out.println("��ȣ �߸��־��ٿ�");
				break;
			}

		}

	}// main

	static int main_pArr() {
		Scanner scan = new Scanner(System.in);
		int select = 0;
		System.out.println("=================");
		System.out.println("�ζ� ���� �̴´ٿ�");
		System.out.println("1. ���ֱ�");
		System.out.println("2. ������");
		System.out.println("3. ������(10��)");
		System.out.println("4. ��÷���");
		System.out.println("5. ���� ��");
		System.out.println("6. �� ����");
		System.out.println("���ϴ� ��ȣ�� �Է��ض��");
		select=scan.nextInt();
		scan.nextLine();
		return select;
	}

	static void ball(int[] lotto) {
//		for (int i = 0; i < lotto.length; i++) {
		for (int i:lotto) {	//���� �������̴ٿ� ������ �� �Ⱦ��ٿ�.(�迭�϶��� ����)
			lotto[i] = i + 1;
		}
	}

	static void ball_sh(int[] lotto) {
		for (int i = 0; i < 200; i++) {
			int lotto_index, temp = 0;
			lotto_index = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[lotto_index];
			lotto[lotto_index] = temp;
		}
	}

	static void lotto(int[] lotto, int[] lotto2) {
		for (int i = 0; i < lotto2.length; i++) {
			lotto2[i] = lotto[i];
		}
	}

	static void print2(int[] lotto2) {
		for (int i = 0; i < lotto2.length; i++) {
			System.out.print(lotto2[i] + " ");
		}
		System.out.println();
	}

	static int sumArr(int[] lotto2) {
		int result = 0;
		for (int i = 0; i < lotto2.length; i++) {
			result += lotto2[i];
		}
		return result;
	}
	//�׳� ������ �ٲٴ°�
	static void sortArr(int[] lotto2) {
		for (int i = 0; i < lotto2.length - 1; i++) {
			boolean boo=false;
			for (int j = 0; j < lotto2.length - i - 1; j++) {
				if (lotto2[j] > lotto2[j + 1]) {
					int temp = lotto2[j];
					lotto2[j] = lotto2[j + 1];
					lotto2[j + 1] = temp;
					boo=true;
				}
			}
			//j�ۿ� �־� �ȴٿ�!
			if(boo==false) {
				break;
			}
		}
	}
	//�迭�� �����Ͽ� ������ ���
	static int[] sortArr2(int[] lotto2) {
		for (int i = 0; i < lotto2.length - 1; i++) {
			boolean boo=false;
			for (int j = 0; j < lotto2.length - i - 1; j++) {
				if (lotto2[j] > lotto2[j + 1]) {
					int temp = lotto2[j];
					lotto2[j] = lotto2[j + 1];
					lotto2[j + 1] = temp;
					boo=true;
				}
			}
			//for j�ۿ� �־� �ȴٿ�!
			if(boo==false) {
				break;
			}
		}return lotto2;
	}
}// class
