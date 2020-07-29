
public class Student {
	int hak_num;
	int grade;
	String name;
	static int count=1000;//1001,1002,1003....
	
	{
		count++;
		hak_num=count;
	}
	
	Student(){}
	
	Student(String name,int grade){
		this.name=name;
		this.grade=grade;
	}
	
	
}
