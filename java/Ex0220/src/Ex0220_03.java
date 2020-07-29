
public class Ex0220_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String re="";
		Arith a=new Arith();
		a.x=50;
		a.y=10;
		a.z=2;
		
		int[] r=new int[4];
		int add;
		int sub;
		int mult;
		double div;
		
//		//add1
//		a.result=add(a.x,a.y,a.z);
//		System.out.println("합한 리턴값"+a.result);
//		
//		//add2
//		add2(a);
//		System.out.println("결과값"+a.result);
//		
//		
//		
//		//sub1
//		a.result=sub(a.x,a.y,a.z);
//		System.out.println("뺀 리턴값"+a.result);
//		//sub2
//		sub2(a);
//		System.out.println("결과값"+a.result);
//	
//
//		//mult
//		a.result=mult(a.x,a.y,a.z);
//		System.out.println("곱한 리턴값"+a.result);
//		//mult2
//		mult2(a);
//		System.out.println("결과값"+a.result);
//		
//
//		//div
//		a.result_1=div(a.x,a.y,a.z);
//		System.out.println("나눈 리턴값"+a.result_1);
//		//div2
//		div2(a);
//		System.out.println("결과값"+a.result_1);
		
		
		//add sub mult div 변수로
//		re=rule(a.x,a.y,a.z);
//		System.out.println(re);
		
	
		//반환없이
		
		
//		//rule 2번
//		System.out.println(a.result);
//		System.out.println(a.result);
//		System.out.println(a.result);
//		System.out.println(a.result_1);
//		
		//rule 3번
		
		rule3(r,a.x,a.y,a.z);
		add=r[0];
		sub=r[1];
		mult=r[2];
		div=r[3];
		System.out.println(add+" "+sub+" "+mult+" "+div);
		
	}
//	static String rule(int x, int y,int z){
//		//더하기 빼기 곱하기 나누기
//		//값 출력
//		String result="";
//		int result1,result2,result3;
//		double result4;
//		result1=x+y+z;
//		result2=x-y-z;
//		result3=x*y*z;
//		result4=x/y/(double)z;
//		
//		result="더한값"+result1+" 뺀값"+result2+" 곱한값"+result3+" 나눈값"+result4;
//		
//		return result;
//		
//	}
	
	
//	//1. 다 출력
//	static void rule2(Arith a) {
//		System.out.println(a.x+a.y+a.z);
//		System.out.println(a.x-a.y-a.z);
//		System.out.println(a.x*a.y*a.z);
//		System.out.println(a.x/a.y/(double)a.z);
//	}
	
//	//2. 다 출력
//		static void rule2(Arith a) {
//			a.result=a.x+a.y+a.z;
//			a.result2=a.x-a.y-a.z;
//			a.result3=a.x*a.y*a.z;
//			a.result_1=a.x/a.y/(double)a.z;
//		}
	
	
	//3번째 rule배열
	
	static void rule3(int []r,int x,int y,int z) {
		r[0]=x+y+z;
		r[1]=x-y-z;
		r[2]=x*y*z;
		r[3]=x/y/z;
	}
	
	
	
	static int add(int x, int y,int z){
		return x+y+z;
	}
	static void add2(Arith a){
		a.result=a.x+a.y+a.z;
	}
	static int sub(int x, int y,int z){
		return x-y-z;
	}
	static void sub2(Arith a){
		a.result=a.x-a.y-a.z;
	}
	
	
	
	static int mult(int x, int y,int z){
		return x*y*z;
	}
	
	static void mult2(Arith a){
		a.result=a.x*a.y*a.z;
	}
	
	
	static double div(int x, int y,int z){
		return x/y/(double)z;
	}
	
	static void div2(Arith a){
		a.result_1=a.x/a.y/(double)a.z;
	}
	
}
class Arith{
	int x;
	int y;
	int z;
	int result;
	int result2;
	int result3;
	double result_1;
}