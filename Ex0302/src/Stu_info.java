
public class Stu_info {
	//학생정보
	//학번-hak_num 이름-name 학과-major 학년grade 전화번호tel
	static int count;
	int hak_num;
	String name;
	String major;
	String tel;
	int grade;
	
	{
		hak_num=++count;
	}
	Stu_info(){
	}
	Stu_info(String name,String major,int grade,String tel){
		this.name=name;
		this.major=major;
		this.grade=grade;
		this.tel=tel;
	}
	public String toString() {
		return "";
	}
}
