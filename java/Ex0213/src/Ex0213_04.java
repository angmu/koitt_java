import java.util.Scanner;

public class Ex0213_04 {

	public static void main(String[] args) {
		// 1~100������ ���� 1���� �������� �̱�.
		// �������� ������ ���ڸ� ���ߴ� ����.
		// �Է��� ���ڰ� ���������� ũ�� ���ڰ� Ů�ϴ�. �ٽ��Է�.
		// ������ �۽��ϴ�. �ٽ��Կ�
		// ������ ����!
		// ---�ɼ�
		// ������ x���Դϴ�. �ڽ��� �Է��� ���ڸ� ��� ���.
		// �ִ� 20������.

		int ran = (int) (Math.random() * 100 + 1);//������
		int cnt = 0;// �õ�Ƚ��
		int[] input = new int[20];// �����Է°�
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ��߱� ����");
		loop:while (true) {
			for (int i = 0; i < input.length; i++) {
				//----�̰� ���ϰ� ���� while(true)�� while(cnt<20)���� �ᵵ�ȴ�. �̰�� input.length��� count��, i��� count�� ����.
				if(cnt==input.length) {
					System.out.println("���ߴµ� �����Ͽ����ϴ�");
					System.out.println("������ "+ran+"�Դϴ�.");
					break loop;
				}
				//----
				System.out.println("1~100������ ���� �� 1���� �Է��ϼ���");
				input[i] = scan.nextInt();
				if (!(input[i] >= 1 && input[i] <= 100)) {
					System.out.println("�߸��Է��Ͽ����ϴ�.");
					i--;
					continue;
				}
				cnt++;//���Ϳ� �ɸ��� �׸��ϵ���..
				if(input[i]>ran) {
					System.out.println("�Է��� ���� Ů�ϴ�"+input[i]+"���� �������� �Է����ּ���");
				}else if(input[i]==ran) {
					System.out.println("����!!");
					System.out.println("������ "+ran+"�Դϴ�.");
					System.out.println(cnt+"��° ������ϴ�");
					break loop;
				}else {
					System.out.println("�Է��� ���� �۽��ϴ�."+input[i]+"���� ū ���� �Է����ּ���");
				}
				
			}
		}//while
		System.out.print("�õ�Ƚ�� ");
		for(int i=0;i<cnt;i++) {
			int num=i+1;
			System.out.printf("%2d ",num);
		}
		System.out.println();
		System.out.print("�Է¼��� ");
		//
		for(int i=0;i<cnt;i++) {
			System.out.printf("%2d ",input[i]);
		}

	}

}
