
public class Student{
	// implements Comparable<Student>
	int hak_num;
	String name;
	int total;
	
	Student(){}
	Student(int hak_num,String name,int total){
		this.hak_num=hak_num;
		this.name=name;
		this.total=total;
	}
	public String toString() {
		return "�й�"+hak_num+" �̸�:"+name+" �հ�"+total;
	}
//	@Override//�����ϸ� 1���� ������ �ȴٸ�...(���ϰ��� 1��..)
//	public int compareTo(Student s) {
//		// TODO Auto-generated method stub
//		return this.name.compareTo(s.name);
//	}
}
