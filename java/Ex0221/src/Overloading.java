
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ε� *����Ÿ���� �����ε��� ���ǿ� �尡������..
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
		//print(e);//�Ʒ��ʿ� float�� �޴� �޼ҵ尡 ��� ����
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
	
	//�Ű����� Ÿ���� �ٸ��鰡��
	static void add(int a) {}
	static void add(char a) {}
	//�Ű����� ������ �ٸ��� ����
	static void add(int a,int b) {}
	//�̸��� �޶� Ÿ���� ������ ����
	//static void add(int x,int y) {}
}
