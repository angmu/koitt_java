import java.util.Scanner;

public class Ex0219_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("=============");
//		
//		System.out.println("4)���簢��  5)��");
//		System.out.println("���ϴ� �޴��� �����ϼ��� (���� 0)>>>");
		
		Scanner scan=new Scanner(System.in);
		int result=0;
		double result_1=0;
		Area a1=new Area();
		System.out.println("�簢������ ���ϱ� ���α׷�");
		System.out.println("=============");
		System.out.println("1)���簢��  2)���簢��  3)������");
		switch(scan.nextInt()) {
		case 1:
			System.out.println("���簢������ ���");
			System.out.println("���α����Է�");
			a1.horiz=scan.nextInt();
			result=a1.square();
			System.out.println("���̴� :"+result);
			break;
		case 2:
			System.out.println("���簢������ ���");
			System.out.println("���α����Է�");
			a1.horiz=scan.nextInt();
			System.out.println("���α����Է�");
			a1.vert=scan.nextInt();
			result=a1.rect();
			System.out.println("���̴� :"+result);
			break;
		case 3:
			System.out.println("��������� ���");
			System.out.println("���α����Է�");
			a1.horiz=scan.nextInt();
			System.out.println("�����Է�");
			a1.height=scan.nextInt();
			result_1=a1.rhom();
			System.out.println("���̴� :"+result_1);
			break;
		default:
			break;
			
		}
		
		
	}

}
