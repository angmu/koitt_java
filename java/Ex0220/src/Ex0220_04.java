
public class Ex0220_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		int[]d=new int[2];
		d[0]=10;
		d[1]=100;
		
//		d[0]=change(d[0],d[1]);
		change2(d);
		System.out.println(d[0]);
		
		
		
	}//main
	
	
	static int change(int d0,int d1) {
		return d0+d1;
	}
	//주소값넘겨받기 (배열에 해당하는 거로 리턴타입으루 넘기믄된다요
	static void change2(int[]d) {
		d[0]=d[0]+d[1];
	}
	
	
	
	
}
