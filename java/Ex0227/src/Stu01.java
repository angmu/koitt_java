//case 3
final class Stu01 {
	private static Stu01 s=new Stu01();//static�̶� �ٷ� �����ȴٿ�
	private String name;
	private int hak_num;
	private int kor;
	
	private Stu01() {
	}
	//��ü�� �����ϴ°͸� public���� ����� �̰͸� �̿밡��
	public static Stu01 getInstance() {//static�̶� �ٷ� �����ȴٿ�
		 if(s==null) {
			 s=new Stu01();
		 }
		return s;
	}
	//get �̶� >>>>>�бⰡ��
	//set �̶� >>>>>��������
	//���� singleon���� ��쿡�� set�� �������� �ʴ´�.
	//ȸ�ĺ� �� �볪������ set�� �����α⵵ ��..;��;
	public String getName() {
		return name;
	}
	public int getHak_num() {
		return hak_num;
	}
	public int getKor() {
		return kor;
	}
	public String toString() {
		return "�й�: " + hak_num + "/�̸�: " + name + "/��������: " + kor;
	}

}







// **case2
//class Stu01 {
//	private String name;
//	private int hak_num;
//	private int kor;
//	
//	Stu01() {
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getHak_num() {
//		return hak_num;
//	}
//
//	public void setHak_num(int hak_num) {
//		this.hak_num = hak_num;
//	}
//
//
//	public int getKor() {
//		return kor;
//	}
//
//	public void setKor(int kor) {
//		this.kor = kor;
//	}
//	public String toString() {
//		return "�й�: " + hak_num + "/�̸�: " + name + "/��������: " + kor;
//	}
//
//}

//***case1
//class Stu01 extends Object {
//	static int count;
//	String name;
//	int hak_num;
//	
//	//�ν��Ͻ� �ʱ�ȭ��
//	{
//		hak_num=++count;
////		count++;
////		hak_num=count;
//	}
//	
//	Stu01(){
//		this("ȫ�浿");
//	}
//	
//	Stu01(String name){
//		super();
//		this.name=name;
//	}
//	
//	 public String toString() {
//		 return "�й�"+hak_num+"/�̸�"+name;
//	 }
//	
//}
