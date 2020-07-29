package test0325_stu;

public class Student {
	String name;
	int kor;
	int eng;
	int total;
	double avg;
	Student(){
		this("홍길동",100,100);
	}
	Student(String name,int kor,int eng){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		total=kor+eng;
		avg=(((int)total/2.0)*10)/10.0;
	}
	
	public String toString() {
		return "이름:"+name+" 국어점수:"+kor+" 영어점수:"+eng+" 합계:"+total+" 평균:"+avg;
	}
}
