import java.util.ArrayList;
import java.util.Collections;

public class Ex0305_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();
//		ArrayList list2=new ArrayList();
//		Student stu1=new Student(1,"ȫ�浿",300);
//		Student stu2=new Student(2,"�̼���",299);
//		Student stu3=new Student(3,"������",280);
//		Student stu4=new Student(4,"������",270);
//		Student stu5=new Student(5,"������",188);
//		
//		list2.add(stu3);		
//		list2.add(stu1);
//		list2.add(stu5);
//		list2.add(stu2);
//		list2.add(stu4);
//		
//		Collections.sort(list2);
//		Collections.reverse(list2);
//		for(int i=0;i<list2.size();i++) {
//			System.out.println(list2.get(i));
//		}
		
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(3));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		list.add(3,new Integer(7)); //<<3���濡 ����.. ���� ����� ������ �и��ٿ�... 3������ ���°� �ƴ�..��
		list.remove(1);//1��° ���� �����.. ���� �ٸ��͵��� ���ͼ� �ڸ��� ä��
		list.add(5,new Integer(8)); //<<5���濡 ����.. ���� ����� ������ �и��ٿ�... 5������ ���°� �ƴ�..��
		//����ڽ�. �˾Ƽ� ���� 8���� ��üŸ������ �ٲ��.
		list.add(3);
//		
//		Collections.sort(list);
//		Collections.reverse(list);
//		list.add(stu1); //������ ���ٴ°��� �˷���
		
		//�⺻���¸� ����� ������ ������ �Ǿ��ִ�.
		
//		for(int i=0;i<list.size();i++) {
//			list.remove(i);
//		}//�����ϸ� ���´�..
		
//		for(int i=list.size()-1;i>=0;i--) {
//			list.remove(i);
//		}//�����ϸ� �� ������.
		
		//Ȥ�� clear���ϸ� �� ���������
		list.clear();
		System.out.println(list);
	}

}
