
public class Ex0220_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d=new Data();//��ü����
		d.x=10;
		d.y=100;
		change1(d.x);
		d.y=change2(d.y,d.x);
		System.out.println("��� �� :"+d.y);//110
		       //�ּҸ� �ѱ�
		change3(d);
		System.out.println("���Ͼ��� d.y�� �� :"+d.y);//2000
		d.y=change3_1(d.y);
		System.out.println("�����ִ� d.y�� �� :"+d.y);//3000
	}//main
	
	//���⼭ �Ű������� ������ ������ ������ �ƴϸ� �ּ���ü�� ������������ ���� ���� �ٲ�ٿ�
	static int change2(int a,int b) {
		return a-b;
	}
	static void change1(int x) {
		x=1000;
	}	
	//change 3�� ���� ���ϰ����� d.y���� 2000���� �����	
	static void change3(Data d) {
		d.y=2000;
	}
	//change3_1�� ����� �������� d.y�� 3000����
	static int change3_1(int z) {
		z=3000;
		return z;
	}
		
		
//		int result;
//		//return���� �޾Ƽ� ����������	
//				Data d=new Data();//��ü����
//				d.x=10;
//				d.y=100;
//				//d.x�� d.y�� change�� �����ٿ�
//				result=change(d.x,d.y);
//				System.out.println("����� :"+result);//1000
//				
//				
//			}//main
//			
//			//���⼭ �Ű������� ������ ������ ������ �ƴϸ� �ּ���ü�� ������������ ���� ���� �ٲ�ٿ�
//							//d.x�� d.y�� ���´ٿ�
//			static int change(int x,int y) {
//				return x+y;
//			}
//		
		
//	//return���� �޾Ƽ� ������	
//		Data d=new Data();//��ü����
//		d.x=10;
//		d.x=change(d.x);
//		System.out.println("main :"+d.x);//1000
//		
//		
//	}//main
//	
//	//���⼭ �Ű������� ������ ������ ������ �ƴϸ� �ּ���ü�� ������������ ���� ���� �ٲ�ٿ�
//					//d.x�� ���´ٿ�
//	static int change(int x) {
//		x=1000;
//		return x;
//	}
		
		
		
		
	//�ּ���ü�� �޾Ƽ� 1000�� ������	
//		Data d=new Data();//��ü����
//		d.x=10;
//		change(d);
//		System.out.println("main :"+d.x);//1000
//		
//		
//	}//main
//	
//	//���⼭ �Ű������� ������ ������ ������ �ƴϸ� �ּ���ü�� ������������ ���� ���� �ٲ�ٿ�
//	static void change(Data d) {
//		d.x=1000;
//	}
	
	
	//���������θ� ������ d.x�� ���� ������ �ʴ´ٿ� :D
//	Data d=new Data();//��ü����
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
//	System.out.println("change������ x :"+1000);
//}
	
	
	
	
}//class

//�� �ڹ� ���Ͽ� class�� ������ ������ �̵�
//�� ���� Data. ���δ� ������ Ex0220_01.���� �����ؾ��Ѵٸ�
class Data{
	int x;
	int y; //���� ���ϱ� ���� �����ٿ�! 
}