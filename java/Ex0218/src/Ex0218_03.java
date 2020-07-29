
public class Ex0218_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d=new Data();//객체선언을 함으로써 값을 넣을 공간이 생김..
		d.x=10;
		
		System.out.println("1번째 d.x :"+d.x);
		
		//클래스명.변수명
//		Ex0218_03.change(d.x);//원칙
		
//		change(d);//d를 호출
		int dx=change(d);//d를 호출
		//예제2
//		int z=change(d.x);
//		System.out.println("2번째 d.x :"+z);
//		
		
		
		//방법1의 변수
//		change(d.x);//같은 클래스 내에 있는거이기 때문에 그냥 호출이 가능하다요//d.x를 호출
//		Data.ch();//같은 클래스내에 없어서 에러가 나기 때문에 클래스명을 써줘야 한다요
		System.out.println("2번쩨 d.x :"+d.x);//리턴값을 d.x로 받았기 때문에 210 단 주소는 다르고 값만 같다요
		System.out.println("2번쩨 d.x :"+dx);
		
	}//main
	//예제2
//	static int change(int z) {
//		z=z+200;
//		return z; //이경우 z가 넘어가서 값이 10+200으로 210으로 된다요 //단 리턴값은 1개만된다요
//	}
	//값을 변경하는 방법2(참조변수명.변수명)
	static int change(Data d) {//
		d.x+=200;//
		return d.x;
	}
	
	
//	//값을 변경하는 방법1
//	static int change(int x) {//d.x를 변경하고싶다면 return을 해주면된다요
//		x=20;
//		return x;//int x=d.x;
//	}
	
	
//	static void change(int x) {//클래스메소드, 인스턴스 메소드
//		x=20;//int x=d.x;//d.x의 값이 변하지 않는다요(메소드내에 지역변수(메소드 옆에 생성됨)로 대입되서 정작 값을 넣고싶은 x에 값을 넟는게 아니댜 x에 넣고싶으면 return값으로 받아 넣어야한다
//	}
	
	
}//class
