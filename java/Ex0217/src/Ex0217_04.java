import java.util.Scanner;

public class Ex0217_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�˶��ð�����
		//�ð��� ��24(int) ��(int)�� 60�� �Ҽ� °�ڸ�(float)10���� time�� �޽��ϴ�.
		//�迭�� �����ؼ� ��\����������
		//13:20:52.1 �˶�
		
		Scanner scan=new Scanner(System.in);
		Time[]t=new Time[3];
		for(int i=0;i<t.length;i++) {
			t[i]=new Time();
			System.out.print("�ø� �Է��ϼ���>>");
			t[i].hour=scan.nextInt();
			System.out.print("�и� �Է��ϼ���>>");
			t[i].minute=scan.nextInt();
			System.out.print("�ʸ� �Է��ϼ���>>");
			t[i].sec=scan.nextFloat();
			t[i].print();
		}
		
		
//		int[] hour=new int[2];
//		int[] minute=new int[2];
//		float[] sec=new float[2];
//		Scanner scan=new Scanner(System.in);
//		for(int i=0;i<10;i++) {
//			System.out.println("�˶� ���߱� ���α׷�");
//			System.out.println("�ð� �� �Է��ϼ��� >>");
//			hour[i]=scan.nextInt();
//			System.out.println("�� �� �Է��ϼ��� >>");
//			minute[i]=scan.nextInt();
//			System.out.println("�� �� �Է��ϼ���");
//			sec[i]=Math.round(scan.nextFloat()*10)/10f;
//			System.out.println((i+1)+"��° �˶��ð� :"+hour[i]+"��"+minute[i]+"��"+sec[i]+"��");
//			
//		}
//		
		
	}

}
