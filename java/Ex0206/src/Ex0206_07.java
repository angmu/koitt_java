import java.util.Scanner;

public class Ex0206_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ö ��ݰ�� ���α׷�
//		1.��������д�����, 2.���ο�. 3�ŵ��� 4.������ 5 �ű� 6 ���7�뷮�� 8��� 9���� 10 ���￪ 11��û 12 ���� 13 ����3�� 14 ����5�� 15 ���빮 16 ���� 17�ż��� 18 ���⵿ 19 û���� 20 ȸ��
//		
		
//		����Ͻ� ���� �Է��ϼ���(���� 0)
//		�����Ͻ� ���� �Է��ϼ���(���� 0)
//		
//		ex)
//		��߿�: ��������д�����
//		������: �ű�
//			
//			5-1  +1  = 5���� (+1�� �� ������Ѵ�.)
// 		Math.abs(1-5) <<���밪�� ���ϴ� �޼ҵ�
//		�������
//		�⺻��� 1250��
//		5����
//		10���� 100���߰�
//		15���� 200���߰�
//		20���� 300�� �߰� ////Ǯ�� >>>5�� ������ �ø��ϸ� �������� �� 1 2 3 4�� �ȴ�.
//		
		
		int price=1250;//�⺻��
		int cal=0;
		int count=0;//�� ����
		int start=0;//���
		int finish=0;//����
		int time=0;
		String yn="";//�ٽý���
		
		Scanner scan=new Scanner(System.in);
		
	   loop:while(true) {
			System.out.println("[����ö ��� ���α׷�]");
			System.out.println("���񽺰� �����Ǵ� �� : \n1.��������д����� 2.���ο� 3.�ŵ���  4.������ 5.�ű�\n6.��� 7.�뷮�� 8.��� 9.���� 10.���￪\n11.��û 12.���� 13.����3�� 14.����5�� 15.���빮\n16.���� 17.�ż��� 18.���⵿ 19.û���� 20.ȸ��");
			System.out.println("\n����Ͻ� ���� �ش��ϴ� ��ȣ�� �Է��ϼ��� (����0)");
			start=scan.nextInt();
			
			if(start==0) {
				System.out.println("���α׷��� �����մϴ�");
				break loop;
			}
			if(!(start>=1&&start<=20)) {
				System.out.println("�߸������Ͽ����ϴ�");
				continue loop;
			}
			
			System.out.println("�����Ͻ� ���� �ش��ϴ� ��ȣ�� �Է��ϼ��� (����0)");
			finish=scan.nextInt();
			
			if(finish==0) {
				System.out.println("���α׷��� �����մϴ�");
				break loop;
			}
			if(!(finish>=1&&finish<=20)) {
				System.out.println("�߸������Ͽ����ϴ�");
				continue loop;
			}
			
			
			cal=Math.abs(start-finish)+1;//�⺻���
			//�⺻���+0*100=�⺻���
			//�⺻���+1*100=�⺻���+100
			price=1250+(int)(Math.round(cal)/5)*100;
			time=cal*150;
			System.out.println("��߿� :"+start);
			System.out.println("������ :"+finish);
			System.out.println("���� :"+cal);
			System.out.println("�ش� ���� �����"+price+"�Դϴ�.\n");
			System.out.println("�ҿ�ð���"+time/60+"��"+time%60+"�� �Դϴ�.");
			while(true) {
				System.out.println("�ٽ� ����ö ����� ����Ͻðڽ��ϱ�? y/n");
				yn=scan.next();
				if(yn.equals("y")||yn.equals("Y")) {
					continue loop;
				}
				else if(yn.equals("n")||yn.equals("N")) {
					System.out.println("�ý����� �����մϴ�.");
					break loop;
				}else {
					System.out.println("�ٽ��Է¹ٶ��ϴ� y/n");
					
				}
		   }
		}//while;
		
		
		
		//���� 
//		���������� ��
//		����1
//		����2
//		��3
//		��ǻ�Ϳ� ���������� ��������
//		10�� ������ �ؼ� �� ��� �̰���� Ȯ���ϴ� ����
//		1.�¸�
//		2.���º�
//		3.�й�
//		4.�¸�
//		5.�¸�
//		
//		�¸� 7�� ���º� �� �й� ��
		
		
		
		
	}//����

}//class
