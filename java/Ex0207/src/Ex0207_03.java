import java.util.Scanner;

public class Ex0207_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�α���
//		�α����� 5ȸ�̻� ���н� ���α׷� ����
//		1���� �Է��� ������ ���ڸ� ���ϴ� ���α׷�
		String id="aaa";//id
		String pd="1234";//���
		int tr=0;//�α��� ����Ƚ��
		int sum=0;//�հ�
		int input=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("[�ڵ��������α׷�]");
		System.out.println("�α����� �ʿ��մϴ�.");
		
	loop1:	while(true) {

			
			
			
			System.out.println("\n���̵� �Է����ּ���");
			String id_ch=scan.next();
			if(!(id.equals(id_ch))) {
				tr++;
				if(tr>4) {
					System.out.println("Ʋ��Ƚ���� �ʹ� �����ϴ�. ���α׷��� �����մϴ�.");
					break loop1;
				}
				System.out.println("���̵� Ʋ�Ƚ��ϴ�."+tr+"ȸ ����");
				continue;}
			while(true) {
				System.out.println("\n��й�ȣ�� �Է����ּ���");
				String pd_ch=scan.next();
				if(!(pd.equals(pd_ch))) {
					tr++;
					if(tr>4) {
						System.out.println("Ʋ��Ƚ���� �ʹ� �����ϴ�. ���α׷��� �����մϴ�.");
						break loop1;
					}
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�."+tr+"ȸ ����");
					continue;
				}break;
			}
			
			System.out.println("\n�α��ο� �����߽��ϴ�");
			
			while(true) {
				System.out.println("\n1���� ���ϴ� ���ڱ����� ���� ���ϴ� ���α׷��Դϴ�.");
				System.out.println("���ϴ� ���ڸ� �Է��ϼ��� (���� 0)");
				input=scan.nextInt();
				if(input==0) {
					System.out.println("���α׷��� �����մϴ�");
					break loop1;
				}
				for(int i=1;i<=input;i++) {
					sum+=i;
				}System.out.printf("1���� %d������ ������ �� : %d%n",input,sum);
			}
			
			
		}//while 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
