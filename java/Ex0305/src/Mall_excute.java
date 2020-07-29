import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Mall_excute {
	Mall_excute() {
	}

	static int print() {
		Scanner scan = new Scanner(System.in);
		System.out.println("���θ� ���α׷�");
		System.out.println("-----------");
		System.out.println("1)ȸ������   2)�α���   3)�α׾ƿ�   4)��ǰ����   5)���ų������");
		System.out.println("8)ȸ���˻�   9)ȸ����������");
		System.out.println("���ϴ� �޴���ȣ�� �Է��ϼ��� (���� 0)>>>>");
		int choice = scan.nextInt();
		scan.nextLine();
		return choice;

	}

	// 1.ȸ������ �޼ҵ�
	static void join(ArrayList<Member> m) {
		String pw;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("���̵� �Է����ּ���");
			String id = scan.nextLine();
			if (id.length() < 3) {
				System.out.println("���̵�� 3�ڸ� �̻��̾�� �մϴ�");
				continue;
			}
			while (true) {
				System.out.println("��й�ȣ�� �Է����ּ���");
				pw = scan.nextLine();
				System.out.println("��й�ȣ�� �ٽ��ѹ� �Է����ּ���");
				String pw2 = scan.nextLine();
				if (!(pw.equals(pw2))) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է�>>");
					continue;
				}
				break;
			}
			System.out.println("�̸��� �Է��ϼ���");
			String name = scan.nextLine();
			System.out.println("��ȭ��ȣ�� �Է��ϼ���");
			String tel = scan.nextLine();
			m.add(new Member(id, pw, name, tel));
			break;
		}
	}

	// 2.�α��� �޼ҵ�
	static void login(HashMap a, ArrayList<Member> m) {
		if (!(a.isEmpty())) {
			System.out.println("�̹� �α��� �Ǿ��ֽ��ϴ�");
			return;
		}
		Scanner scan = new Scanner(System.in);
		boolean voo = false;
		while (true) {
			System.out.println("���̵� �Է��ϼ���");
			String id = scan.nextLine().trim();
			for (int i = 0; i < m.size(); i++) {
				if (m.get(i).id.equals(id)) {
					System.out.println("��й�ȣ�� �Է��ϼ���");
					String pw = scan.nextLine().trim();
					if (!(m.get(i).pw.equals(pw))) {
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
						i--;
						continue;
					}
					a.put(id, pw);
					voo = true;
					break;
				}
			}
			if (voo == true) {
				System.out.println("�α��� ����");
				return;
			}
			System.out.println("�α��� ����");
			return;
		}
	}

	// 3.�α׾ƿ� �޼ҵ�
	static void logout(HashMap a, ArrayList<Member> m) {
		Scanner scan = new Scanner(System.in);
		if (a.isEmpty()) {
			System.out.println("�α��� �Ŀ� �̿밡���մϴ�");
			return;
		} else {
			System.out.println("������ �α׾ƿ� �Ͻðڽ��ϱ�? 1)yes 2)no");
			String ch2 = scan.nextLine();
			if (ch2.equals("1") || ch2.equals("y") || ch2.equals("Y")) {
				for (int i = 0; i < m.size(); i++) {
					if (a.containsKey(m.get(i).id)) {
						a.remove(m.get(i).id);
						System.out.println("�α׾ƿ��Ǿ����ϴ�.");
						return;
					}
				}
			} else if (ch2.equals("2") || ch2.equals("n") || ch2.equals("N")) {
				System.out.println("����ȭ������ ���ư��ϴ�");
				return;
			} else {
				System.out.println("�߸����Է��Դϴ�");
				return;
			}
		}
	}

	// 4.��ǰ����
	static void buy(HashMap a, ArrayList<Member> m) {
		Scanner scan = new Scanner(System.in);
		if (a.isEmpty()) {
			System.out.println("�α��� �Ŀ� �̿밡���մϴ�");
			return;
		} else {
			for (int i = 0; i < m.size(); i++) {
				if (a.containsKey(m.get(i).id)) {
					while (true) {
						System.out.println("1)LCDTV   2)LEDTV   3)OLEDTV   4)�Ϲݳ����    5)�繮�������");
						System.out.println("6)�뵹�̼�Ź��   7)�巳��Ź��   9)�巳������Ź��");
						System.out.println("�����Ͻ� ��ǰ�� ��ȣ�� �Է��ϼ��� (���� 0)>>>>");
						int ch = scan.nextInt();
						switch (ch) {
						case 0:
							System.out.println("�����޴��� ���ư��ϴ�");
							return;
						case 1:
							m.get(i).buy(new LCD());
							break;
						case 2:
							m.get(i).buy(new LED());
							break;
						case 3:
							m.get(i).buy(new OLED());
							break;
						case 4:
							m.get(i).buy(new Liter());
							break;
						case 5:
							m.get(i).buy(new Double());
							break;
						case 6:
							m.get(i).buy(new Tong());
							break;
						case 7:
							m.get(i).buy(new Drum());
							break;
						case 8:
							m.get(i).buy(new DrumDry());
							break;
						default:
							System.out.println("�߸��� ��ȣ�Է�");
							continue;
						}
					}
				}
			}
		}
	}

	// 5.���Ÿ�� ���
	static void printbuy(HashMap a, ArrayList<Member> m) {
		if (a.isEmpty()) {
			System.out.println("�α��� �Ŀ� �̿밡���մϴ�");
			return;
		}
		// ������ �α���
		String admin = "admin";
		if (a.containsKey(admin)) {
			for (int i = 0; i < m.size(); i++) {
				if(m.get(i).buy_count==0) {
					continue;
				}
				System.out.println("ID:"+m.get(i).id+" �̸�:"+m.get(i).name);
				m.get(i).printbuy();
			}
		}
		// �Ϲ�ȸ��
		else {
			for (int i = 0; i < m.size(); i++) {
				if (a.containsKey(m.get(i).id)) {
					m.get(i).printbuy();
					break;
				}
			}
		}
	}

	// 8.ȸ���˻�
	static void memsearch(HashMap a, ArrayList<Member> m) {
		Scanner scan = new Scanner(System.in);
		// �̸��˻�
		System.out.println("�˻��� Ű���带 �Է��ϼ���");
		String search = scan.nextLine().trim();
		boolean boo = false;
		for (int i = 0; i < m.size(); i++) {
			if (m.get(i).name.contains(search)) {
				System.out.println(m.get(i));
				boo = true;
			}
		}
		if (boo == true) {
			return;
		}
		System.out.println("��ġ�ϴ� ȸ���� �����ϴ�");
		return;
	}

	// 9.ȸ�����
	static void memprint(HashMap a, ArrayList<Member> m) {
		if (a.isEmpty()) {
			System.out.println("�α��� �Ŀ� �̿밡���մϴ�");
			return;
		}
		Scanner scan = new Scanner(System.in);
		// ������ �α���
		String admin = "admin";
		if (a.containsKey(admin)) {
			int count = 0;
			while (count != 1) {
				System.out.println("1)�Է¼� ���   2)���̵�� ���   3)�̸��� ���");
				System.out.println("���Ÿ���� ������>> ");
				int ch = scan.nextInt();
				switch (ch) {
				case 1:
					// �Է¼� ���
					for (int i = 0; i < m.size(); i++) {
						System.out.println(m.get(i));
					}
					count++;
					break;
				case 2:
					// ���̵�� ���
					Collections.sort(m, new Comparator<Member>() {
						public int compare(Member a, Member b) {
							return a.id.compareTo(b.id);
						}
					});
					for (int i = 0; i < m.size(); i++) {
						System.out.println(m.get(i));
					}
					count++;
					break;
				case 3:
					// �̸��� ���
					Collections.sort(m, new Comparator<Member>() {
						public int compare(Member a, Member b) {
							return a.name.compareTo(b.name);
						}
					});
					for (int i = 0; i < m.size(); i++) {
						System.out.println(m.get(i));
					}
					count++;
					break;
				default:
					System.out.println("�߸�������ϴ�.");
					continue;

				}
			}
		}
		// �Ϲ�ȸ�� ���
		else {
			for (int i = 0; i < m.size(); i++) {
				if (a.containsKey(m.get(i).id)) {
					System.out.println(m.get(i));
					break;
				}
			}
		}
	}
}
