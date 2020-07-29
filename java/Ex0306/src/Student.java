
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
		return "학번"+hak_num+" 이름:"+name+" 합계"+total;
	}
//	@Override//이케하면 1개만 정렬이 된다리...(리턴값이 1개..)
//	public int compareTo(Student s) {
//		// TODO Auto-generated method stub
//		return this.name.compareTo(s.name);
//	}
}
