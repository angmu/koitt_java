import java.util.ArrayList;
import java.util.Scanner;

public class Ex0303_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1)�л������Է� �й�/�̸�/��/�г�/
//		2)�л�����ó���Է� �й��Է½� ã��>>���� ���� �հ� ��� ����� ���� (�̸��� �ڵ������� �Է�._
//		3)�л��������(���)
//		4)�л��������(���)
//		5)�л������˻�
//		6)�л������˻�
		// ArrayList ���
		// Student, Stu_score ��ü ���
		// �й��� ������ �ٽ� ��ȯ.

		Scanner scan = new Scanner(System.in);
		ArrayList<Student> a = new ArrayList<Student>();
		ArrayList<Stu_score> b = new ArrayList<Stu_score>();

		loop: while (true) {

			System.out.println("�л�����ó�����α׷� (����0)");
			System.out.println("=============");
			System.out.println("1)�л������Է�	2)�л������Է�	3)�л��������");
			System.out.println("4)�л��������	5)�л������˻�	6)�л������˻�");
			System.out.println("���ϴ� �޴��� ��ȣ�� �Է��ϼ���>>>");
			int selec = scan.nextInt();
			scan.nextLine();
			switch (selec) {
			case 0:
				System.out.println("���α��� ����");
				break loop;
			case 1:
				System.out.println("�л������Է��� ���� ");
				loop2: while (true) {
					System.out.println("�̸��� �Է��ϼ��� (����ȭ�� 99)");
					String name = scan.nextLine();
					if (name.equals("99")) {
						System.out.println("����ȭ������ ���ư��ϴ�.");
						break loop2;
					}
					System.out.println("�а��� �Է��ϼ���");
					String major = scan.nextLine();
					System.out.println("�г��� �Է��ϼ���");
					int grade = scan.nextInt();
					scan.nextLine();
					a.add(new Student(name, major, grade));
				}
				break;
			case 2:
				if (a.isEmpty()) {
					System.out.println("�л������� �����ϴ�. �л��������� �Է��ϼ���");
					break;
				}
				System.out.println("�л����� �Է��� ���� (����ȭ�� 99)");
				System.out.println("������ �Է��� �л��� �й��� �Է��ϼ���");
				int ch=scan.nextInt();
				for (int i = 0; i < a.size(); i++) {
					if (ch== a.get(i).hak_num) {
						System.out.println(a.get(i).name + "�� ������� �Է��ϼ���");
						int kor = scan.nextInt();
						System.out.println(a.get(i).name + "�� ������� �Է��ϼ���");
						int eng = scan.nextInt();
						b.add(i, new Stu_score(kor, eng));
						b.get(i).name = a.get(i).name;
						b.get(i).hak_num = a.get(i).hak_num;
						continue loop;
					}

				}
				System.out.println("��ġ�ϴ� �й��� �����ϴ�. ����ȭ������ ���ư��ϴ�.");
				continue loop;
			case 3:
				if (a.isEmpty()) {
					System.out.println("�л������� �����ϴ�. �л��������� �Է��ϼ���");
					break;
				}
				System.out.println("�л������� ����մϴ�.");
				for (int i = 0; i < a.size(); i++) {
					System.out.println((Student) a.get(i));
				}
				break;
			case 4:
				if (a.isEmpty()||b.isEmpty()) {
					System.out.println("�л������� �����ϴ�. �л��������� �Է��ϼ���");
					break;
				}
				System.out.println("�л������� ����մϴ�.");
				for (int i = 0; i < b.size(); i++) {
					System.out.println((Stu_score) b.get(i));
				}
				break;
			case 5:
				if (a.isEmpty()) {
					System.out.println("�л������� �����ϴ�. �л��������� �Է��ϼ���");
					break;
				}
				System.out.println("�л������˻��� ����(����ȭ�� 99)");
				System.out.println("�˻��� �л��� �й��� �Է��ϼ���");
				int select = scan.nextInt();
				if (select == 99) {
					System.out.println("����ȭ������ ���ư��ϴ�");
					break;
				}
				for (int i = 0; i < a.size(); i++) {
					if (select == a.get(i).hak_num) {
						System.out.println((Student) a.get(i));
						continue loop;
					}
				}
				System.out.println("��ġ�ϴ� �л��� �����ϴ�.");

				break;
			case 6:
				if (a.isEmpty()) {
					System.out.println("�л������� �����ϴ�. �л��������� �Է��ϼ���");
					break;
				}
				System.out.println("�л������˻��� ����(����ȭ�� 99)");
				System.out.println("�˻��� �л��� �й��� �Է��ϼ���");
				int select1 = scan.nextInt();
				if (select1 == 99) {
					System.out.println("����ȭ������ ���ư��ϴ�");
					break;
				}
				for (int i = 0; i < b.size(); i++) {
					if (select1 == b.get(i).hak_num) {
						System.out.println((Stu_score) b.get(i));
						continue loop;
					}
				}
				System.out.println("��ġ�ϴ� �л��� �����ϴ�.");
				break;
			default:
				System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�.");
				continue;
			}

		}

	}// main

}// class

class Student {
	int hak_num;
	static int count;
	String name;
	String major;
	int grade;
	{
		hak_num = ++count;
	}

	Student() {
		
	}

	Student(String name, String major, int grade) {
		this.name = name;
		this.major = major;
		this.grade = grade;
	}

	public String toString() {
		return hak_num + " " + name + " " + major + " " + grade + "�г�";
	}
}

class Stu_score extends Student {
	int kor;
	int eng;
	int total;
	double avg;
	int rank;

	Stu_score() {
		this(0,0);
	}

	Stu_score(int kor, int eng) {
		super("ȫ�浿", "���а�", 2);
		this.kor = kor;
		this.eng = eng;
		total = kor + eng;
		avg = total / 2.0;
	}

	public String toString() {
		return hak_num + " " + name + " ��������:" + kor + " ��������:" + eng + " �հ�:" + total + " ���:" + avg;
	}
}