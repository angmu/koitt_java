
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오버로딩 *리턴타입은 오버로딩의 조건에 드가지않음..
		int a=0;
		char b='a';
		String c="abc";
		long d=10000000000l;
		float e=1.5f;
		double f=3.141592;;
		
		print();
		print(a);
		print(b);
		print(c);
		print(d);
		//print(e);//아래쪽에 float을 받는 메소드가 없어서 에러
	}
	static void print() {
		System.out.println("null");
	}
	static void print(int a) {
		System.out.println("int");
	}
	static void print(long a) {
		System.out.println("long");
	}
	static void print(char a) {
		System.out.println("char");
	}
	static void print(String a) {
		System.out.println("String");
	}
	
	
	
	
	
	static void add() {}
	
	//매개변수 타입이 다르면가능
	static void add(int a) {}
	static void add(char a) {}
	//매개변수 개수가 다르면 가능
	static void add(int a,int b) {}
	//이름이 달라도 타입이 같으면 에러
	//static void add(int x,int y) {}
}
