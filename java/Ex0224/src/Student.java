
public class Student {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int hak_num;
	
	{
		hak_num++;
	}
	

	Student() {
		this("ȫ�浿",50,50,50);
//		name = "test";
//		kor = 50;
//		eng = 50;
//		math = 50;
//		total = kor + eng + math;
//		avg = total / 3.0;
	}

	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total / 3.0;
	}

}
