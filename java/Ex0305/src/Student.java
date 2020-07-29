
public class Student implements Comparable<Student> {
	int hak_num;
	String name;
	int total;

	Student() {
	}

	Student(int hak_num, String name, int total) {
		this.hak_num = hak_num;
		this.name = name;
		this.total = total;
	}

	public String toString() {
		return "학번 " + hak_num + " 이름:" + name + " 합계:" + total;
	}

	public int compareTo(Student s) {
//	//이름 ㄱㄴㄷ 순..
//	return this.name.compareTo(s.name);
		
		//학번순으로
		if(this.hak_num<s.hak_num) {
			return 1;
		}else if(this.hak_num>s.hak_num) {
			return -1;
		}else {
			return 0;
		}
		
		//토탈이 높은순
//		if (this.total < s.total) {
//			return -1;
//		} else if (this.total > s.total) {
//			return 1;
//		} else {
//			return 0;
//		}
	}
}
