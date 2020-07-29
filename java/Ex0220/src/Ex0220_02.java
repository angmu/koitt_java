
public class Ex0220_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Plus p=new Plus();
			p.x=10;
			p.y=20;
			p.z=30;
			
			add2(p);
			
//			p.x=add(p.x,p.y,p.z);
//			
			System.out.println("결과값 :"+p.x);
		
	}//main		
		
		//x,y,z 값을 받아 3개의 값을 더하여 리턴으루 p.x값을 넣어라요
	static int add(int x,int y,int z) {
		x+=y+z;
		return x;
	}
	//주소값을 받아 3개의 값을 더하여 p.x값을 넣어라요
	static void add2(Plus p) {
		p.x=p.x+p.y+p.z;
	}	
		
		
		//===============
		
		
//		Str s=new Str();
//		s.x="abc";
//		s.y="def";
//		
//		merge(s);
//		//s.x->abcdef;
//		System.out.println(s.x);
//		
//	}//main
//	//2.void로 합쳐라요
//	static void merge(Str s) {
//		s.x=s.x+s.y;
//	}
	
	
//	Str s=new Str();
//	s.x="abc";
//	s.y="def";
//	
////	s.x=merge(s.x,s.y);
//	merge(s);
//	//s.x->abcdef;
//	System.out.println(s.x);
//	
//	}//main
//	1,merge메소드에 리턴값을 만들어서 2개의 변수의 값을 합쳐보세오
//	static String merge(String a,String b){
//	return a+b+"";
//}
	
	


}//class
//class Str{
//	String x;
//	String y;
//}
class Plus{
	int x;
	int y;
	int z;
}
