import java.util.Scanner;

public class Ex0205_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[���̰��]
		//1�簢������
		//2�ﰢ������
		//3������ (����=3.14)
		
		Scanner scan=new Scanner(System.in);
		int btn=0;
		double h=0;
		double v=0;
		double w=0;
		
loop1	:	while(true) {
			System.out.println("[���̰�����α׷�] ���̴� �Ҽ��� 2°�ڸ������� ���˴ϴ�. (���� 99)");
			System.out.println("1.�簢������");
			System.out.println("2.�ﰢ������");
			System.out.println("3.������");
			
			btn=scan.nextInt();
			if(btn==99) {
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;
			}
			if(!(btn>=1&&btn<=3)) {
				System.out.println("1~3������ ���ð����մϴ�.");
				continue loop1;
			}
			switch(btn) {
			
				case 1 : 
					while(true) {
						System.out.println("�簢�����̸� �����߽��ϴ�. ���θ� �Է��ϼ���.(���� 99 �����޴� 0)");
						
						h=scan.nextDouble();
						if(h==99) {
							System.out.println("���α׷��� �����մϴ�.");
							break loop1;
						}
						if(h==0) {
							continue loop1;
						}
						System.out.println("���̸� �Է��ϼ���.");
						v=scan.nextDouble();
						w=h*v;
						System.out.println("�簢�� ���� :"+Math.round(w*100)/100.0);
					}
				case 2 : 
					while(true) {
						System.out.println("�ﰢ�����̸� �����߽��ϴ�. ���θ� �Է��ϼ���.(���� 99 �����޴� 0)");
						
						h=scan.nextDouble();
						if(h==99) {
							System.out.println("���α׷��� �����մϴ�.");
							break loop1;
						}
						if(h==0) {
							continue loop1;
						}
						System.out.println("���̸� �Է��ϼ���.");
						v=scan.nextDouble();
						w=h*v*0.5;
						System.out.println("�ﰢ�� ���� :"+Math.round(w*100)/100.0);
					}
				case 3 : 
					while(true) {
						System.out.println("�����̸� �����߽��ϴ�.(�����̴� �Ҽ��� 2°�ڸ����� ���˴ϴ�.)");
						System.out.println("�������� �Է��ϼ���.(���� 99 �����޴� 0)");
						h=scan.nextDouble();
						if(h==99) {
							System.out.println("���α׷��� �����մϴ�.");
							break loop1;
						}
						if(h==0) {
							continue loop1;
						}
						w=h*h*3.14;
						System.out.println("�� ���� :"+Math.round(w*100)/100.0);
					}	
				default :
					;
			} 
		}
		
	}

}
