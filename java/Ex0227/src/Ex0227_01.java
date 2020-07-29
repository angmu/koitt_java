
public class Ex0227_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//시간같이 공통인것을 사용할때 사용.
		Stu01 s1=Stu01.getInstance();
		Stu01 s2=Stu01.getInstance();
		//Time t=new Time();
		//Time t2=new Time();
		//t2=t1; //주소값을 넘겨주는것과 같다. (둥다 같은주소를 바라보고있다요)
		
//		s1.setName("홍길동");
//		s2.setName("이순신");
		
		System.out.println(s1);
		System.out.println(s2);
		
		
//		//case2
//		Stu01 s=new Stu01();
//		
//		s.setName("홍길동");
//		s.setKor(100);
//		
//		System.out.println(s);
		//case1
//		Stu01 s=new Stu01();
//		Stu01 s1=new Stu01("이순신"); 변수에 private이 선언되어 바로 넣을수가 없음
//		s.name="홍길동";
		
//		System.out.println(s1);
		
	}

}
