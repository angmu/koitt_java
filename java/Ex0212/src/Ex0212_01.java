import java.util.Scanner;

public class Ex0212_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ζǹ�ȣ ����

		int[] lotto = new int[45];
		int temp = 0;
		int lotto_index = 0;

		// �ɼ��� ���� ��
		int[] user = new int[6];
		int[] user_index = new int[6];
		int win = 0;


		Scanner scan = new Scanner(System.in);

		System.out.println("\n[�ζǹ�ȣ ���߱� ���α׷�]");
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		
		for (int i = 0; i < lotto.length; i++) {
			lotto_index = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[lotto_index];
			lotto[lotto_index] = temp;
		}
		for (int i = 0; i < user.length; i++) {
			for (int j = 0; j < user_index.length; j++) {
				System.out.println((i + 1) + "��° ���ڸ� �Է��ϼ���");
				user[i] = scan.nextInt();
				if(!(user[i]>=1&&user[i]<=45)) {
					System.out.println("�߸��� �����Դϴ�. �ٽ��Է����ּ���");
					continue;
				}
				if (user[i] == user_index[j]) {
					System.out.println("�ߺ��� �����Դϴ�. �ٽ��Է����ּ���");
					continue;
				}
				user_index[j] = user[i];
			}
		}
		System.out.print("�ζ� ��ȣ  : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		for (int i = 0; i < user.length; i++) {
			for (int j = 0; j < 6; j++) {
				if(user[i]==lotto[j]) {
					System.out.println("��÷��ȣ : "+user[i]);
					win++;
				}
			}
		}
		switch(win) {
		
		case 0: case 1: 
			System.out.println("�ƽ��Ե� ��÷���� �ʾҽ��ϴ�.");
			break;
		case 2:
			System.out.println("�����մϴ� 5�� �Դϴ�. ��� 5õ���� �����ϼ���");
			break;
		case 3:
			System.out.println("�����մϴ� 4�� �Դϴ�. ��� 10������ �����ϼ���");
			break;
		case 4:
			System.out.println("�����մϴ� 3�� �Դϴ�. ��� 100������  �����ϼ���");
			break;
		case 5:
			System.out.println("�����մϴ� 2�� �Դϴ�. ��� 1����� �����ϼ���");
			break;
		case 6:
			System.out.println("�����մϴ� 1�� �Դϴ�. ��� 10����� �����ϼ���");
			break;
			
			
		}
		
	}

}
