
import java.util.Scanner;
public class Ex0219_copy {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// 1. �л������Է�
			// 2. �л�����
			// 3. �л�����
			// 4. �л��˻�
			// 5. ���ó��
			// 6. ����
			Scanner scan = new Scanner(System.in);
			Student[] stu = new Student[2];
			String name = "";

			while (true) {

				print();
				int s_input = scan.nextInt();
				scan.nextLine();
				switch (s_input) {

				case 1:
					inputArr(stu);
					break;
				case 2:
					System.out.println("�л������� �����ߴٿ�");
					System.out.println("�л��̸��� �Է��ض��");
					name = scan.nextLine();
					loop1:
					for (int i = 0; i < stu.length; i++) {
						if (name.equals(stu[i].name)) {
							System.out.println(stu[i].name + "�� �˻��Ǿ����ϴ�. �����Ұ��� ������");
							System.out.println("1)���� 2)���� 3)����");
							switch (scan.nextInt()) {
							case 1:
								System.out.println("���������� �����ߴٿ�");
								System.out.println("���������� �Է��ϼ���");
								stu[i].kor = scan.nextInt();
								scan.nextLine();
								System.out.println("���� ����" + stu[i].kor + "�����Ͽ����ϴ�");
								break loop1;
							case 2:
								System.out.println("���������� �����ߴٿ�");
								System.out.println("���������� �Է��ϼ���");
								stu[i].eng = scan.nextInt();
								scan.nextLine();
								System.out.println("���� ����" + stu[i].eng + "�����Ͽ����ϴ�");
								break loop1;
							case 3:
								System.out.println("���������� �����ߴٿ�");
								System.out.println("���������� �Է��ϼ���");
								stu[i].math = scan.nextInt();
								scan.nextLine();
								System.out.println("���� ����" + stu[i].math + "�����Ͽ����ϴ�");
								break loop1;
							default:
								System.out.println("�߸��Է��޴ٿ� 1~3������ ���ڸ� �Է��϶��");
								continue;
							}
						}
						else{
								System.out.println("ã������ �л��� ���ٿ�");
							}
						}
					

					break;
				case 3:
					System.out.println("�л������� �����ߴٿ�");
					break;
				case 4:
					System.out.println("�л��˻��� �����ߴٿ�");
					break;
				case 5:
					System.out.println("���ó���� �����ߴٿ�");
					break;
				case 6:
					System.out.println("�����ϰڴٿ�");
					break;
				default:
					System.out.println("�߸��Է��޴ٿ� 1~6������ ���ڸ� �Է��϶��");
					continue;

				}

			}

		}// main
		
		

		static void print() {
			System.out.println("==============");
			System.out.println("  ����ó�����α׷�");
			System.out.println("==============");
			System.out.println("1)�л������Է� 2)�л����� 3)�л����� 4)�л��˻� 5)���ó�� 6)����");
			System.out.println("���ϴ� �޴��� �Է��϶��>>>");
		}

		static void inputArr(Student[] stu) {
			Scanner scan = new Scanner(System.in);
			System.out.println("�л��Է��� �����ߴٿ�");
			String name = "";
			int kor = 0, eng = 0, math = 0;
			String select_stu = "";
			for (int i = 0; i < stu.length; i++) {
				System.out.println("�̸��� �־���");
				name = scan.nextLine();
				System.out.println("���������� �־���");
				kor = scan.nextInt();
				System.out.println("���������� �־���");
				eng = scan.nextInt();
				System.out.println("���������� �־���");
				math = scan.nextInt();
				scan.nextLine();
				stu[i] = new Student(name, kor, eng, math);
//				System.out.println(stu[i].name+stu[i].total+" "+stu[i].avg);
			}
		}
	}//class

class Student {
	
	Student(){
		
	}
	
	Student(String n,int k, int e, int m){
		name=n;
		kor=k;
		eng=e;
		math=m;
		total=kor+eng+math;
		avg=total/3.0;
	}
	//�ʱ�ȭ�� ��հ� �հ赵 �־���� ���ϴٿ�
	
	
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	
}
