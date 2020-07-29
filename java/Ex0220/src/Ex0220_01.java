
public class Ex0220_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d=new Data();//객체선언
		d.x=10;
		d.y=100;
		change1(d.x);
		d.y=change2(d.y,d.x);
		System.out.println("결과 값 :"+d.y);//110
		       //주소를 넘김
		change3(d);
		System.out.println("리턴없는 d.y의 값 :"+d.y);//2000
		d.y=change3_1(d.y);
		System.out.println("리턴있는 d.y의 값 :"+d.y);//3000
	}//main
	
	//여기서 매개변수를 참조형 변수로 받을지 아니면 주소자체로 받을지에따라 위의 값이 바뀐다요
	static int change2(int a,int b) {
		return a-b;
	}
	static void change1(int x) {
		x=1000;
	}	
	//change 3를 만들어서 리턴값없이 d.y값을 2000으로 만들기	
	static void change3(Data d) {
		d.y=2000;
	}
	//change3_1을 만들어 리턴으로 d.y를 3000으로
	static int change3_1(int z) {
		z=3000;
		return z;
	}
		
		
//		int result;
//		//return값을 받아서 합이찍히게	
//				Data d=new Data();//객체선언
//				d.x=10;
//				d.y=100;
//				//d.x와 d.y를 change에 보낸다요
//				result=change(d.x,d.y);
//				System.out.println("결과값 :"+result);//1000
//				
//				
//			}//main
//			
//			//여기서 매개변수를 참조형 변수로 받을지 아니면 주소자체로 받을지에따라 위의 값이 바뀐다요
//							//d.x랑 d.y가 들어온다요
//			static int change(int x,int y) {
//				return x+y;
//			}
//		
		
//	//return값을 받아서 찍히게	
//		Data d=new Data();//객체선언
//		d.x=10;
//		d.x=change(d.x);
//		System.out.println("main :"+d.x);//1000
//		
//		
//	}//main
//	
//	//여기서 매개변수를 참조형 변수로 받을지 아니면 주소자체로 받을지에따라 위의 값이 바뀐다요
//					//d.x가 들어온다요
//	static int change(int x) {
//		x=1000;
//		return x;
//	}
		
		
		
		
	//주소자체로 받아서 1000이 찍히게	
//		Data d=new Data();//객체선언
//		d.x=10;
//		change(d);
//		System.out.println("main :"+d.x);//1000
//		
//		
//	}//main
//	
//	//여기서 매개변수를 참조형 변수로 받을지 아니면 주소자체로 받을지에따라 위의 값이 바뀐다요
//	static void change(Data d) {
//		d.x=1000;
//	}
	
	
	//참조변수로만 받으면 d.x의 값이 변하지 않는다요 :D
//	Data d=new Data();//객체선언
//	d.x=10;
//	change(d.x);
//	System.out.println("main :"+d.x);//10
//	
//	
//}//main
//
//
//static void change(int x) {
//	x=1000;
//	System.out.println("change에서의 x :"+1000);
//}
	
	
	
	
}//class

//한 자바 파일에 class는 여러개 잇을수 이따
//단 사용시 Data. 으로는 못쓰고 Ex0220_01.으로 참조해야한다리
class Data{
	int x;
	int y; //합을 구하기 위한 변수다요! 
}