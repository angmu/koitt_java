
public class Student {
	String name;
	int kor,eng,math,total,rank;
	// 국어  영어  수학  합계   평균
	double avg;
	
	void total() {
		total=kor+eng+math;
	}
	
	void avg() {
		avg=total/3.0;
	}
	
//	String name;
//	int kor;
//	int eng;
//	int math;
//	int total;
//	double avg;
//	int rank; 
}
