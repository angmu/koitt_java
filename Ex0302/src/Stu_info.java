
public class Stu_info {
	//�л�����
	//�й�-hak_num �̸�-name �а�-major �г�grade ��ȭ��ȣtel
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
