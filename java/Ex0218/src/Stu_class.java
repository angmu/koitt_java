
public class Stu_class {
	int stu_num,kor,eng,math,total,rank=0;
	static int first_num=1000;
	String name;
	double avg;
	
	void total() {
		total=kor+eng+math;
		
		
	}
	void avg() {
		avg=total/3.0;
	}
	
}
