import java.util.Scanner;

public class Ex0206_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		int win=0;//�̰�����
		int loose=0;//������
		int dr=0;//�������
		int you=0;
		int i=0;// ����Ƚ��
		
		Scanner scan=new Scanner(System.in);
		System.out.println("[��ǻ�Ϳ� �Բ��ϴ� ��������������]");
		System.out.println("������������ ��� �ϰ������ �Է����ּ��� (���� 99)");
		int cnt=scan.nextInt();//�����ϰ���� Ƚ��
		loop : while(true) {
			if (i>=cnt) {
				System.out.println("----------------------\n ");
				System.out.println(i+"�� ������������ �����Ͽ� ������ �����մϴ�.");
				break loop;
			}
			if(cnt==99) {
				System.out.println("������ �����մϴ�.");
				break loop;
			}
			int com=(int)(Math.random()*3)+1;
			System.out.println("----------------------\n ");
			System.out.println("����������! (���� 99)");
			System.out.println("1)���� 2)���� 3)�� ");
			you=scan.nextInt();
			
			
			
			if(you==99) {
				System.out.println("���α׷��� �����մϴ�.");
				break loop;
			}
			if (!(you>=1&&you<=3)) {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				continue loop;
			}
			
			
			
			
			switch(you){
				case 1 :
					i++;
				    if(com==you) {
				    	System.out.printf("%d���� ���º�",i);
				    	dr++;
				    	break;
				    }	
				    else if(com==2) {
				    	System.out.printf("%d���� �й�",i);
				    	loose++;
				    	break;
				    }
				    else {
				    	System.out.printf("%d���� �¸�",i);
				    	win++;
				    	break;
				    }
				case 2 :
					i++;
					 if(com==you) {
						 	System.out.printf("%d���� ���º�",i);
					    	dr++;
					    	break;
					    }	
					    else if(com==1) {
					    	System.out.printf("%d���� �й�",i);
					    	loose++;
					    	break;
					    }
					    else {
					    	System.out.printf("%d���� �¸�",i);
					    	win++;
					    	break;
					    }
				case 3 :
					i++;
					 if(com==you) {
						 	System.out.printf("%d���� ���º�",i);
					    	dr++;
					    	break;
					    }	
					    else if(com==1) {
					    	System.out.printf("%d���� �й�",i);
					    	loose++;
					    	break;
					    }
					    else {
					    	System.out.printf("%d���� �¸�",i);
					    	win++;
					    	break;
					    }
				default :
					break;
					
			}
		
		}System.out.printf("���������� ����Ƚ�� %d �¸� %d �й� %d ���º� %d",i,win,loose,dr);
		
	}

}
