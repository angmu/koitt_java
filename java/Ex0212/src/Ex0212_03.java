import java.util.Scanner;

public class Ex0212_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ganji = { "��", "��", "ȣ����", "�䳢", "��", "��", "��", "��", "������", "��", "��", "����" };
		String[] ganji_select= {"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"};
		String select="";
		int count=0;
		Scanner scan = new Scanner(System.in);
		while (count==12) {
			System.out.println("���ϴ� �������� ������ �Է��ϼ��� >>");
			select = scan.next();
			for(int i=0;i<12;i++) {
				if(select.equals(ganji[i])) {
					System.out.println(ganji[i]+"��(��) �������ſ��� "+(i+1)+"��°�� ���� "+ganji_select[i]);
					break;
				}
				if(select.equals(ganji_select[i])) {
					System.out.println(ganji_select[i]+"��(��) �������ſ��� "+(i+1)+"��°�� ���� "+ganji[i]);
					break;
				}
			}
			count++;
		}	//while
		
		
		// �� �� �ι�������� ��������

//		String[] ganji = { "��", "��", "ȣ����", "�䳢", "��", "��", "��", "��", "������", "��", "��", "����" };
//		String[] ganji_select= {"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"};
//		int select = 0;
//		Scanner scan = new Scanner(System.in);
//		while (true) {
//			System.out.println("1~12���� ���ڸ� �Է����ּ���");
//			select = scan.nextInt();
//			if(!(select>=1&&select<=12)) {
//				System.out.println("�߸� �ԷµǾ����ϴ�");
//				continue;
//			}
//			System.out.println(select + "��° ���? " + ganji[select - 1]+"("+ganji_select[select-1]+")");

//		} // while
		
		
		
		
		
		
		
		
		
		
		
		
		//		String���� 12���� �迭�� ����� 12������ �����
//
//		String[] ganji = { "��", "��", "ȣ����", "�䳢", "��", "��", "��", "��", "������", "��", "��", "����" };
//		int select = 0;
//		Scanner scan = new Scanner(System.in);
//		while (true) {
//			System.out.println("1~12���� ���ڸ� �Է����ּ���");
//			select = scan.nextInt();
//
//			System.out.println(select + "��° ���? " + ganji[select - 1]);
//
//		} // while
//		
		
		
	}// main

}// class
