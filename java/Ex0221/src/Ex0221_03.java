
public class Ex0221_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]k= {"클로버","하트","스페이드","다이아몬드"};
		Card[]c3=new Card[52];
		Card[]c4=new Card[52];
		Card[]c5=new Card[52];
		String num="123456789XJQK";
		
		for(int i=0;i<k.length;i++) {
			for(int j=0;j<13;j++) {
				c5[j+i*13]=new Card(k[i],(num.charAt[j]-'0'));
			}
		}
		System.out.println("c5의 카드");
		for(int i=0;i<c5.length;i++) {
			System.out.println(c5[i].kind+c5[i].num);
		}
	}

}
