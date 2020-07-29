
public class Ex0221_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for- 카드 4종류
		//num=1~13
		Card c=new Card();
		c.kind="클로버";
		c.num=1;
		System.out.println("기본생성자:"+c.kind+c.num);
		
		Card c2=new Card("하트",2);
		System.out.println("매개변수가 있는 생성자 :"+c2.kind+c2.num);
		
		String[]k= {"클로버","하트","스페이드","다이아몬드"};
		Card[]c3=new Card[52];
		Card[]c4=new Card[52];
		Card[]c5=new Card[52];
		String[]num= {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		for(int i=0;i<k.length;i++) {
			for(int j=0;j<13;j++) {
				c5[j+i*13]=new Card(k[i],num[j]);
			}
		}
		System.out.println("c5의 카드");
		for(int i=0;i<c5.length;i++) {
			System.out.println(c5[i].kind+c5[i].num_ch);
		}
		
		
		
		System.out.println("=============생성자==============");
		for(int i=0;i<k.length;i++) {
			for(int j=0;j<13;j++) {
				c3[j+i*13]=new Card(k[i],j+1);
			}
		}
		System.out.println("c3의 카드");
		for(int i=0;i<c3.length;i++) {
			System.out.println(c3[i].kind+c3[i].num);
		}
		System.out.println("=============기본형==============");
		for(int i=0;i<k.length;i++) {
			for(int j=0;j<13;j++) {
				c4[j+i*13]=new Card();
				c4[j+i*13].kind=k[i];
				c4[j+i*13].num=j+1;
			}
		}
		System.out.println("c4의 카드");
		for(int i=0;i<c4.length;i++) {
			System.out.println(c4[i].kind+c4[i].num);
		}
		
		
	}//main

}//class
