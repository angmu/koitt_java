import java.util.Scanner;

public class Ex0213_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ζǹ�ȣ

		int[] lotto = new int[45];
		int lotto_index = 0;
		int temp = 0;
		int[] user = new int[6];
		int success = 0;
		int bonus=0;

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		for (int i = 0; i < 200; i++) {
			lotto_index = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[lotto_index];
			lotto[lotto_index] = temp;
		}
//		System.out.println("�ζǹ�ȣ ��÷");
		for (int i = 0; i < 7; i++) {
			if(i==6) {
				System.out.print(" ���ʽ���ȣ :"+lotto[i]);
			}
			System.out.print(lotto[i] + " ");
		}
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < user.length; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.println((i + 1) + "��° ��ȣ�� ����ּ���");
				user[i] = scan.nextInt();
				if (user[i] == lotto[j]) {
					if(user[i] == lotto[7]) {
						System.out.println("��ġ�ϴ� ��ȣ : " + user[i]);
						bonus++;
						break;
					}
					System.out.println("��ġ�ϴ� ��ȣ : " + user[i]);
					success++;
					break;
				}
			}
		}
		switch(success) {
		case 0: case 1: case 2:
			System.out.println("��÷���� �ʾҽ��ϴ�.");
			break;
		case 3:
			System.out.println("5�� ��÷. ��� 5õ��");
			break;
		case 4:
			System.out.println("4�� ��÷. ��� 30����");
			break;
		case 5:
			if(bonus>0) {
				System.out.println("2�� ��÷. ��� 1���");
				break;
			}
			System.out.println("3�� ��÷. ��� 100����");
			break;
		case 6:
			System.out.println("1�� ��÷. ��� 10���");
			break;
		}
	}

}
