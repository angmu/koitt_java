
public class Ex0211_04 {
	public static void main(String[] args) {
		//
		int[] coin= {500,100,50,10};
		int[] money=new int[4];//0 0 0 0
		
		money=coin; //주소를 같은곳으로 바꿈. 이경우 1개를 바꾸면 다른곳도 바뀜.
		money[0]=coin[0]; //주소가 아닌 값만 바꿈. 
		
		for(int i=0;i<money.length;i++) {
			System.out.println(money[i]);
		}
		
		money[0]=5000;//5000,100,50,10
		
		for(int i=0;i<coin.length;i++) {
			System.out.println(coin[i]);
		}
		
		
		
	}
}
