
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
			System.out.println("����� :"+p.x);
		
	}//main		
		
		//x,y,z ���� �޾� 3���� ���� ���Ͽ� �������� p.x���� �־���
	static int add(int x,int y,int z) {
		x+=y+z;
		return x;
	}
	//�ּҰ��� �޾� 3���� ���� ���Ͽ� p.x���� �־���
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
//	//2.void�� ���Ķ��
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
//	1,merge�޼ҵ忡 ���ϰ��� ���� 2���� ������ ���� ���ĺ�����
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
