import java.util.*;

public class Ex0304_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ü�� ����
		// 1)ȸ���Է��ϱ�
		// 2)ȸ������ϱ�

		// ȸ���Է¹����� id�� �빮�� 1���̻� ����, 5�ڸ��̻�, �ߺ�üũ �ʿ�
		// pw Ư�� 1���̻� ���� 8�ڸ��̻�
		// �ֹι�ȣ>>-���� 14�ڸ������Է�
		// �̸���>>@,. �ִ��������� üũ
		// ������ ���� 0,1�� �Է�
		// ��½� gender�� 0�̸� ����, 1�̸� ����
		Scanner scan = new Scanner(System.in);
		String id;
		String pw;
		String name;
		String s_number;// �ֹι�ȣ
		int gender;// ���� ����
		String gender1;// ����
		String email;// �̸���
		String tel;// ��ȭ��ȣ
		int count = 0;
		ArrayList<Member> arr = new ArrayList<Member>();
		while (true) {
			System.out.println("ȸ������ ���α׷�");
			System.out.println("1)ȸ���Է�    2)ȸ�����");
			int ch = scan.nextInt();
			scan.nextLine();
			switch (ch) {
			case 1:
				System.out.println("ȸ���Է¼���");
				loop2: while (true) {

					System.out.println("���̵� �Է��ϼ��� (5�ڸ��̻� �빮�� 1�� ����, �����޴� 99)");
					id = scan.nextLine().trim();
					id = id.replaceAll(" ", "");
					
					
					
					
					// ���̵� �ߺ�üũ
					if (!(arr.isEmpty())) {
						for (int i = 0; i < arr.size(); i++) {
							if (id.equals(arr.get(i).id)) {
								System.out.println("�ߺ��� ���̵� �Դϴ�.");
								continue loop2;
							}
						}
					}
					// ���Ῡ��Ȯ��
					if (id.equals("99")) {
						break loop2;
					}
					// 5�ڸ��̻����� Ȯ��
					if (!(id.length() >= 5)) {
						System.out.println("���̵�� 5�ڸ� �̻��̾�� �մϴ�");
						continue;
					}

					// �빮�� �ִ��� Ȯ��
					count = 0;// �빮�� ���� ����
					for (int i = 0; i < id.length(); i++) {
						if (id.charAt(i) >= 'A' && id.charAt(i) <= 'Z') {
							count++;
						}
					}
					if (count == 0) {
						System.out.println("�빮�ڰ� 1���̻� �ԷµǾ�� �մϴ�.");
						continue;
					}

					loop3: while (true) {
						System.out.println("��й�ȣ�� �Է��ϼ��� (8�ڸ� �̻�,Ư������ 1������ )\n(�Է°���Ư������: !,\",#,$,%,&,*)");
						pw = scan.nextLine().trim();
						pw = pw.replaceAll(" ", "");
						// 8�ڸ� �̻����� Ȯ��
						if (!(pw.length() >= 8)) {
							System.out.println("��й�ȣ�� 8�ڸ� �̻��̾�� �մϴ�.");
							continue loop3;
						}
						// Ư������ �ִ��� Ȯ��
						count = 0;// Ư������ ���� ����
						for (int i = 0; i < pw.length(); i++) {
							if (pw.charAt(i) >= '!' && pw.charAt(i) <= '&' || pw.charAt(i) == '*') {
								count++;
							}
						}
						if (count == 0) {
							System.out.println("Ư�����ڰ� 1���̻� �ԷµǾ�� �մϴ�.");
							continue loop3;
						}
						break;
					}
					System.out.println("�̸��� �Է��ϼ���");
					name = scan.nextLine().trim();
					name = name.replaceAll(" ", "");
					loop4: while (true) {
						System.out.println("�ֹι�ȣ�� �Է��ϼ��� ('-'����)");
						s_number = scan.nextLine().trim();
						s_number = s_number.replaceAll(" ", "");
						// �ֹι�ȣ�� -�����ؼ� 14�ڸ�����
						if (!(s_number.length() >= 14)) {
							System.out.println("�߸��� �ֹι�ȣ �Դϴ�");
							continue loop4;
						}
						// '-'�� ����
						if (s_number.indexOf("-") == -1) {
							System.out.println("'-'�� �����Ͽ� �ٽ� �Է����ּ���");
							continue loop4;
						}
						// '7'��° �ڸ��� 1234�� �ش� �ȵǸ� �ֹι�ȣ�� �߸��Ȱ����� ...
						if (!(s_number.charAt(7) == '1' || s_number.charAt(7) == '2' || s_number.charAt(7) == '3'
								|| s_number.charAt(7) == '4')) {
							System.out.println("�߸��� �ֹι�ȣ �Դϴ�");
							continue loop4;
						}
						break;
					}
					loop5: while (true) {
						System.out.println("������ �Է��ϼ��� (0:����, 1:����)");
						gender1 = scan.nextLine().trim();
						// ���� 1���� �Է� ���̰� 1���� Ȯ���Ѵ�.
						if (gender1.length() != 1) {
							System.out.println("�߸��Է��Ͽ����ϴ�. ���ڸ� �Է°����մϴ�.");
							continue loop5;
						}
						// ���ڷ� ��ȯ
						gender = gender1.charAt(0) - '0';
						// 0,1���� Ȯ��
						if (!(gender >= 0 && gender <= 1)) {
							System.out.println("0(����)�� 1(����)�� �Է°����մϴ�.");
							continue loop5;
						}
						break;
					}
					loop6: while (true) {
						System.out.println("�̸����� �Է��ϼ���  ('@','.'����)");
						email = scan.nextLine().trim();
						email = email.replaceAll(" ", "");
						// @�� .�̾����� �ٽ� �Է�..
						if (email.indexOf("@") == -1 || email.indexOf(".") == -1) {
							System.out.println("�߸��� �̸��� �����Դϴ�. @��.�� �����ؼ� �ٽ� �Է��ϼ���");
							continue loop6;
						}
						break;
					}
					loop7: while (true) {
						System.out.println("��ȭ��ȣ�� �Է��ϼ��� ('-'����)");
						tel = scan.nextLine().trim();
						tel = tel.replaceAll(" ", "");
						//-�� ������ ����
						if (tel.indexOf("-") == -1) {
							System.out.println("'-'�� �����Ͽ� �Է����ּ���");
							continue loop7;
						}
						//�ڸ����� 031-000-0000�϶� 12�ڸ� 010-0000-0000�϶� 14�ڸ���..
						if (!(tel.length() >= 12 && tel.length() <= 14)) {
							System.out.println("�߸��� ��ȣ�Դϴ�");
							continue loop7;
						}
						break;
					}
					//���� �迭�� �ֱ�
					arr.add(new Member(id, pw, name, s_number, gender, email, tel));
				}

				break;

			case 2:

				System.out.println("ȸ������ ���");
				if (arr.size() == 0) {
					System.out.println("�Էµ� ȸ�������� �����ϴ�.");
					break;
				}
				for (int i = 0; i < arr.size(); i++) {
					System.out.println(arr.get(i));

				}

				break;
			default:
				System.out.println("�߸��� ��ȣ �Է�");
				continue;
			}

		}

	}

}
