
public class Ex0218_01 {

	public static void main(String[] args) {

		Time t1=new Time();
		t1.minute=10;
		t1.second=10;
		t1.setHour(10);//private은 set방식으로 넣는게 가능하다.
//		System.out.println(t1.hour);
		//t1/
		System.out.println(t1.minute);
		
		
		
//		Time t1=new Time();
//		//10시 10분 10초
//		t1.hour=10;
//		t1.minute=10;
//		t1.second=10;
//		
//		System.out.println(t1.hour+"시"+t1.minute+"분"+ t1.second+"초");
	}

}
