
public class Ex0211_04 {
	public static void main(String[] args) {
		//
		int[] coin= {500,100,50,10};
		int[] money=new int[4];//0 0 0 0
		
		money=coin; //�ּҸ� ���������� �ٲ�. �̰�� 1���� �ٲٸ� �ٸ����� �ٲ�.
		money[0]=coin[0]; //�ּҰ� �ƴ� ���� �ٲ�. 
		
		for(int i=0;i<money.length;i++) {
			System.out.println(money[i]);
		}
		
		money[0]=5000;//5000,100,50,10
		
		for(int i=0;i<coin.length;i++) {
			System.out.println(coin[i]);
		}
		
		
		
	}
}
