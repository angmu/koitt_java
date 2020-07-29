//case 3
final class Stu01 {
	private static Stu01 s=new Stu01();//static이라서 바로 생성된다요
	private String name;
	private int hak_num;
	private int kor;
	
	private Stu01() {
	}
	//객체를 리턴하는것만 public으로 만들어 이것만 이용가능
	public static Stu01 getInstance() {//static이라서 바로 생성된다요
		 if(s==null) {
			 s=new Stu01();
		 }
		return s;
	}
	//get 이란 >>>>>읽기가능
	//set 이란 >>>>>수정가능
	//보통 singleon같은 경우에는 set을 만들어두지 않는다.
	//회식비 를 노나가질때 set을 만들어두기도 함..;ㅂ;
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
		return "학번: " + hak_num + "/이름: " + name + "/국어점수: " + kor;
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
//		return "학번: " + hak_num + "/이름: " + name + "/국어점수: " + kor;
//	}
//
//}

//***case1
//class Stu01 extends Object {
//	static int count;
//	String name;
//	int hak_num;
//	
//	//인스턴스 초기화블럭
//	{
//		hak_num=++count;
////		count++;
////		hak_num=count;
//	}
//	
//	Stu01(){
//		this("홍길동");
//	}
//	
//	Stu01(String name){
//		super();
//		this.name=name;
//	}
//	
//	 public String toString() {
//		 return "학번"+hak_num+"/이름"+name;
//	 }
//	
//}
