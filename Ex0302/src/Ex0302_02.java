import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Ex0302_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//student ��ü ����
		// �л�10���� ������ ����
		//����ó�����α׷�
		//���� Student[] stu=new Student[10];
//		//���� Vector������� Vector list=new Vector();
////		
//		Vector<Student> list= new Vector<Student>();//���Ѵ�� ����� ����
////		Student[] stu=new Student[10];
//		String[] name1= {"ȫ�浿","�̼���","������"};
//		int[] kor1= {100,90,95};
//		int[] eng1= {80,70,89};
////		Student s1=new Student(name1[0],kor1[0],eng1[0]);
////		Student s2=new Student(name1[1],kor1[1],eng1[1]);
//		
////		list.add(s1);
////		list.add(s2);
//		
//		list.add(new Student(name1[0],kor1[0],eng1[0]));
//		list.add(new Student(name1[1],kor1[1],eng1[1]));
//		list.add(new Student(name1[2],kor1[2],eng1[2]));
		
//		Vector<Student> list= new Vector<Student>();//���Ѵ�� ����� ����
//		String name="";
//		int kor=0;
//		int eng=0;
//		
//		Scanner scan=new Scanner(System.in);
//		while(true) {
//			System.out.println("�̸��� �Է��϶��");
//			name=scan.nextLine();
//			System.out.println("���������� �Է��ϼ���");
//			kor=scan.nextInt();
//			System.out.println("���������� �Է��ϼ���");
//			eng=scan.nextInt();
//			scan.nextLine();
//			list.add(new Student(name,kor,eng));
//			System.out.println("1���� ������ �ְ��Ǿ");
//		}
		Scanner scan=new Scanner(System.in);

		ArrayList<Student> list= new ArrayList<Student>();//���Ѵ�� ����� ���� --��ü�� ����� ��쿡�� �̰� ����ϴ°� ����.. �ܼ��� 8����Ÿ���� �迭�̸� �׳� �迭�ξ��°� ����
		Student[] stu=new Student[10];
		String[] name1= {"ȫ�浿","�̼���","������"};
		int[] kor1= {100,90,95};
		int[] eng1= {80,70,89};
		list.add(new Student(name1[0],kor1[0],eng1[0]));
		list.add(new Student(name1[1],kor1[1],eng1[1]));
		list.add(new Student(name1[2],kor1[2],eng1[2]));
		
		if(list.isEmpty()) {
			System.out.println("�Էµ� �л��� �����ϴ�.");
		}else {
			for(int i=0;i<list.size();i++) {
				Student s=(Student)list.get(i);//s�ʱ�ȭ�� �ϸ鼭 ��� ��´�.
				System.out.print(s.hak_num+"\t");
				System.out.print(s.name+"\t");
				System.out.print(s.kor+"\t");
				System.out.print(s.eng+"\t");
				System.out.print(s.total+"\t");
				System.out.print(s.avg+"\t");
				System.out.println();//�ٹٲ�
			}
		}
		
		
	}

}
