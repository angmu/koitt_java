import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex0302_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stu_info> list=new ArrayList<Stu_info>();
		Scanner scan=new Scanner(System.in);

		String[]name= {"ȫ�浿","�̼���","ȫ�浿"};
		String[]major= {"��ǻ�Ͱ���","�����а�","�̼��а�"};
		int []grade= {1,2,4};
		String[]tel= {"010-1666-7777","010-1111-1111","02-2515-1530"};

		list.add(new Stu_info(name[0],major[0],grade[0],tel[0]));
		list.add(new Stu_info(name[1],major[1],grade[1],tel[1]));
		list.add(new Stu_info(name[2],major[2],grade[2],tel[2]));
		
		while(true) {
			System.out.println("1)�л������Է�   2)���   3)�˻� ");
			int num=scan.nextInt();
			scan.nextLine();
					switch(num) {
					case 1:
						while(true) {
						System.out.println("�̸��� �Է��ϼ��� (����ȭ�� 99)");
						String name1=scan.nextLine();
						if(name1.equals("99")) {
							System.out.println("����ȭ������");
							break;
						}
						System.out.println("�а��� �Է��ϼ���");
						String major1=scan.nextLine();
						System.out.println("�г��� �Է��ϼ���");
						int grade1=scan.nextInt();
						scan.nextLine();
						System.out.println("��ȭ��ȣ�� �Է��ϼ���");
						String tel1=scan.nextLine();
						//��ü�� �ֱ�
						list.add(new Stu_info(name1,major1,grade1,tel1));
						}
						break;
					case 2:
						//�����Ͱ� �ִ��� Ȯ��
						if(list.isEmpty()) {
							System.out.println("�����Ͱ� �����ϴ�");
							break;
						}
						//�ݺ����
						for(int i=0;i<list.size();i++) {
							Stu_info s=(Stu_info)list.get(i);
							System.out.print(s.hak_num+"\t"+s.name+"\t"+s.major+"\t"+s.grade+"�г�"+"\t"+s.tel);
//							System.out.print(s.name+"\t");
//							System.out.print(s.major+"�а�"+"\t");
//							System.out.print(s.grade+"�г�"+"\t");
//							System.out.print(s.tel);
							System.out.println();
						}
						break;
					case 3:
						System.out.println("�˻��� �̸��� �Է��ϼ���");
						String name2=scan.nextLine();
						if(name2.equals("99")) {
							System.out.println("����ȭ������");
							break;
						}
						for(int i=0;i<list.size();i++) {
							Stu_info stu=(Stu_info)list.get(i);
							if(name2.equals(stu.name)) {
								System.out.println("ã�� �л���");
								System.out.println(stu.hak_num+" "+stu.name+" "+stu.major+" "+stu.grade+" "+stu.tel);
							}
//							else {
//								System.out.println("ã�� �л��� �����ϴ�.");
//								break;
//							}
						}
						break;
					default:
						break;
					}
		}
		
		
		//		String name="";
//		String major="";
//		String tel="";
//		int grade=0;
//		int count=0;
//		while(count!=3) {
//			System.out.println("�̸��� �Է��ϼ���");
//			name=scan.nextLine();
//			System.out.println("�а��� �Է��ϼ���");
//			major=scan.nextLine();
//			System.out.println("�г��� �Է��ϼ���");
//			grade=scan.nextInt();
//			scan.nextLine();
//			System.out.println("��ȭ��ȣ�� �Է��ϼ���(-���� ���ڸ� �Է�)");
//			tel=scan.nextLine();
//			list.add(new Stu_info(name,major,grade,tel));
//			count++;
//		}
//		for(int i=0;i<list.size();i++) {
//			Stu_info s=(Stu_info)list.get(i);
//			System.out.print(s.hak_num+"\t");
//			System.out.print(s.name+"\t");
//			System.out.print(s.major+"�а�"+"\t");
//			System.out.print(s.grade+"�г�"+"\t");
//			System.out.print(s.tel.substring(0,2)+"-"+s.tel.substring(3,6)+"-"+s.tel.substring(7,10));
//			System.out.println();
//		}
		
	}

}
