
public class Ex0218_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d=new Data();//��ü������ �����ν� ���� ���� ������ ����..
		d.x=10;
		
		System.out.println("1��° d.x :"+d.x);
		
		//Ŭ������.������
//		Ex0218_03.change(d.x);//��Ģ
		
//		change(d);//d�� ȣ��
		int dx=change(d);//d�� ȣ��
		//����2
//		int z=change(d.x);
//		System.out.println("2��° d.x :"+z);
//		
		
		
		//���1�� ����
//		change(d.x);//���� Ŭ���� ���� �ִ°��̱� ������ �׳� ȣ���� �����ϴٿ�//d.x�� ȣ��
//		Data.ch();//���� Ŭ�������� ��� ������ ���� ������ Ŭ�������� ����� �Ѵٿ�
		System.out.println("2���� d.x :"+d.x);//���ϰ��� d.x�� �޾ұ� ������ 210 �� �ּҴ� �ٸ��� ���� ���ٿ�
		System.out.println("2���� d.x :"+dx);
		
	}//main
	//����2
//	static int change(int z) {
//		z=z+200;
//		return z; //�̰�� z�� �Ѿ�� ���� 10+200���� 210���� �ȴٿ� //�� ���ϰ��� 1�����ȴٿ�
//	}
	//���� �����ϴ� ���2(����������.������)
	static int change(Data d) {//
		d.x+=200;//
		return d.x;
	}
	
	
//	//���� �����ϴ� ���1
//	static int change(int x) {//d.x�� �����ϰ�ʹٸ� return�� ���ָ�ȴٿ�
//		x=20;
//		return x;//int x=d.x;
//	}
	
	
//	static void change(int x) {//Ŭ�����޼ҵ�, �ν��Ͻ� �޼ҵ�
//		x=20;//int x=d.x;//d.x�� ���� ������ �ʴ´ٿ�(�޼ҵ峻�� ��������(�޼ҵ� ���� ������)�� ���ԵǼ� ���� ���� �ְ���� x�� ���� ���°� �ƴϴ� x�� �ְ������ return������ �޾� �־���Ѵ�
//	}
	
	
}//class
