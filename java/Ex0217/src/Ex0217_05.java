import java.util.Scanner;

public class Ex0217_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board[] b = new Board[4];
		String[] subject = { "��ȣ", "������", "����", "�ۼ���", "��ȸ��" };
		Scanner scan = new Scanner(System.in);
		int b_num = 0;
		int v_num = 0;
		for (int i = 0; i < b.length; i++) {
			b[i] = new Board();
			b[i].num = b_num + 1;
			System.out.println("[�Խ��Ǳ۵��]");
			System.out.println("������ �Է��ϼ���");
			b[i].title = scan.nextLine();
			System.out.println("������ �Է��ϼ���");
			b[i].contents = scan.nextLine();
			System.out.println("�ۼ��ڸ� �Է��ϼ���");
			b[i].name = scan.nextLine();
			b[i].view_num = v_num;
			b_num++;//�ڵ�����
			System.out.println("-----------");
			System.out.println("[�� ����Ʈ ���]");
			System.out.println("-----------");
			for (int k = 0; k < subject.length; k++) {
				System.out.print(subject[k] + "\t");
			}System.out.println();
			
			for (int j = 0; j < b_num; j++) {
				System.out.print(b[j].num + "\t" + b[j].title + "\t" + b[j].contents + "\t" + b[j].name + "\t"+ b[j].view_num + "\t");
				System.out.println();
			}System.out.println();
		}
//		System.out.println();
//		for (int i = 0; i < b.length; i++) {
//			b[i].print();
//		}
	}

}
