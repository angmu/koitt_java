
public class Student {
	static int count;
	int hak_num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	{
		hak_num=++count;
	}
	Student(){}
	Student(String name,int kor,int eng,int math){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		total=kor+eng+math;
		avg=((int)(total/3.0*10))/10.0;
	}
	public String toString() {
		return "학번:"+hak_num+" 이름:"+name+" 국어:"+kor+"점 영어:"+eng+"점 수학:"+math+"점 평균:"+avg+"점 등수:"+rank;
	}
}
