import java.util.Scanner;

public class Ex0219_06 {

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
		int kor = 0, eng = 0, math = 0;
		String select_stu = "";

		while (true) {

			print();
			int s_input = scan.nextInt();
			scan.nextLine();
			switch (s_input) {

			case 1:
				System.out.println("�л��Է��� �����ߴٿ�");

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
//					System.out.println(stu[i].name+stu[i].total+" "+stu[i].avg);
				}
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

		// �ζ�
//		Lotto[] l=new Lotto[45];
//		for(int i=0;i<l.length;i++) {
//			//����鼭 ���� �������ִٿ�. (���������� ����)
//			l[i]=new Lotto(i+1);
//		}
		// �Ʒ����� ��ó�� ���ϼ��ս�
//		
//		for(int i=0;i<l.length;i++) {
//			l[i]=new Lotto(i+1);
//			l[i].number=i+1;
//		}

		// ī��
		// Card Ŭ������ 13���� �迭�� ����
		// 1~13���� ���ڸ� ����ְ� Ŭ�ι�
		// ��������
//		String[] kind= {"Ŭ�ι�","���̾Ƹ��","��Ʈ","�����̽�"};
//		
//		Card[]c3=new Card[52];
//		for(int j=0;j<kind.length;j++) {
//			for(int i=0;i<13;i++) {
//				c3[i]=new Card();
//				c3[i].number=i+1;
//				c3[i].kind=kind[j];
//				
//				System.out.println(c3[i].kind+" "+c3[i].number);
//			}
//		}
//		
//		
//		
//		
//		

//		String[] kind= {"Ŭ�ι�","���̾Ƹ��","��Ʈ","�����̽�"};
//		
//		Card[]c2=new Card[52];
//		for(int i=0;i<kind.length;i++) {
//			for(int j=0;j<13;j++) {
////				c2[(i*13)+j]=new Card(j+1,kind[i]);
//				c2[j]=new Card(j+1,kind[i]);
//				System.out.println(c2[j].kind+" "+c2[j].number);
//			}
//		}
//		

//		Card[] c1=new Card[13];
//		
//		for(int i=0;i<c1.length;i++) {
//			c1[i]=new Card(i+1,"Ŭ�ι�");
//			
//			System.out.println(c1[i].kind+" "+c1[i].number);
//		}

//		System.out.println(c1.number+" "+c1.kind);

//		Card c2=new Card();
		// a.���� ���ǵȰ��� ���ٸ� Card(){} ��� �ڹٸӽ��� �˾Ƽ� �־��༭ ������ �ȳ����� ������¼� ��������� �ϸ� ���������ٿ�..�ؼ�
		// �ٸ������ڸ� ������ٸ� �⺻�����ڸ� �־��ִ� ���� ���ٿ�

		// ��ó�� ����
//		Card c1=new Card();
//		c1.number=10;
//		c1.kind="Ŭ�ι�";
//		System.out.println(c1.number+" "+c1.kind);
//		

	}// main

	static void print() {
		System.out.println("==============");
		System.out.println("  ����ó�����α׷�");
		System.out.println("==============");
		System.out.println("1)�л������Է� 2)�л����� 3)�л����� 4)�л��˻� 5)���ó�� 6)����");
		System.out.println("���ϴ� �޴��� �Է��϶��>>>");
	}

}
