import java.util.Scanner;

public class Ex0218_04 {

	static int stu_count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�л�����ó�� ���α׷�
//		�л�=class:�й�/�̸�/����/���� /����/���/���/���
		//���ѷ���(���ѹݺ�)
//		[�л�����ó�����α׷�](�л����� 10�����)
//				1.�����߰�
//				�����߰��� ����>�й��Է�>>�̸� ���� ���� ����///
//				2.��������>>������ �л��� �й��� �Է��ϼ���
//				>>1. �̸�����? 2. ����� 3. ����� 4. ���м���
//						1>>�̸��� �Է��ϼ���>ȫ�浿>ȫ�浿 �̸��� �����Ǿ����ϴ�.
//				3.��������
		
//				4.�����˻�
//				5.���ó��
//				0.����
		
		Stu_class[] stu=new Stu_class[10];
		//10���� �л�����
		int input2,input3=0;//�Է°�
		int rank_i=0;
		
		
		Scanner scan=new Scanner(System.in);
		//ù��° ���ιݺ�
		while(true) {
			
			main_print();// �޼ҵ� �и�/ ���ںκ��� ȣ���޴���
			loop:
			switch(scan.nextInt()) {
			
			case 0:
				System.out.println("���α׷��� �����ϰڽ��ϴ�.");
				break loop;
			case 1:
				System.out.println("�����߰��� �����Ͽ����ϴ�.");
				//�޼ҵ� �и�
				insert(stu);//�л������߰� �޼ҵ�
				break;
			case 2:
				System.out.println("���������� �����Ͽ����ϴ�.");
				System.out.println("������ �л��� �й��� �Է��ϼ���. >>>");
				input2=scan.nextInt();
				for(int i=0;i<stu_count;i++) {
				if(input2==stu[i].stu_num) {
					System.out.println("������ �׸��� �����ϼ���>>");
					System.out.println("1)�̸� 2)���� 3)���� 4)����");
					input3=scan.nextInt();
					switch(input3) {
					
					}
					break;
				}else {
					System.out.println("��ġ�ϴ� �л��� �����ϴ�.");
					i--;
					continue;
				}
				}
				break;
			case 3:
				System.out.println("���������� �����Ͽ����ϴ�.");
				System.out.println("�������� �޴��Դϴ�.");
				continue;
			case 4:
				System.out.println("�����˻��� �Է��Ͽ����ϴ�.");
				break;
			case 5:
				System.out.println("���ó���� �����Ͽ����ϴ�.");
				for(int i=0;i<stu_count;i++) {
					rank_i=1;
					for(int j=0;j<stu_count;j++) {
						if(stu[i].total<stu[j].total) {
							rank_i++;
						}
					}stu[i].rank=rank_i;
				}
				break;
			default:
				System.out.println("�߸��Է��Ͽ����ϴ�");
				continue;
			
			
			}
			
		}
		
		
	}//main
	
	//���� ��¸޼ҵ�
	static void main_print() {
		System.out.println("[�л�����ó�����α׷�]");
		System.out.println("���ϴ� ��ȣ�� �����ϼ���");
		System.out.println("1)�����߰�");
		System.out.println("2)��������");
		System.out.println("3)��������");
		System.out.println("4)�����˻�");
		System.out.println("5)���ó��");
		System.out.println("0)����");
	}
	//�����Է� �޼ҵ�
	static void insert(Stu_class[] stu) {
		String insert_name="";
		Scanner scan=new Scanner(System.in);
		scan.nextLine();
		for(int i=stu_count;i<stu.length;i++) {
			if(stu_count==10) {
				System.out.println("���̻� �Է��� �� �����ϴ� ����");
				break;
			}
			System.out.println("�̸��� �Է��ϼ���(99:����ȭ��)");
			insert_name=scan.nextLine();
			if(insert_name.equals("99")) {
				System.out.println("����ȭ������ ���ư��ϴ�");
				break;
			}
			stu[i]=new Stu_class();//������ ��������
			stu[i].stu_num=(Stu_class.first_num+=1);
			stu[i].name=insert_name;
			System.out.println("������� �Է��ϼ���");
			stu[i].kor=scan.nextInt();
			System.out.println("������� �Է��ϼ���");
			stu[i].eng=scan.nextInt();
			System.out.println("���м����� �Է��ϼ���");
			stu[i].math=scan.nextInt();
			stu[i].total();
			stu[i].avg();
			Ex0218_04.stu_count++;
			System.out.println(stu_count+"��° �л� : �й�"+stu[i].stu_num+" �̸�"+stu[i].name);
			
		}
	}

}
