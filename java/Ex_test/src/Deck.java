
public class Deck {
	final int DECKMAX=52;
	Card[] c=new Card[DECKMAX];

	//카드 추출
	Deck() {
		for(int i=0;i<Card.KINDMAX;i++) {
			for(int j=0;j<Card.NUMMAX;j++) {
				c[j+i*13]=new Card(i+1,j+1);
			}
		}
	}
	
	//카드섞기
	void suffle() {
		int ran=0;
		Card temp=new Card();
		for(int i=0; i<300;i++) {
			ran=(int)(Math.random()*DECKMAX);
			temp=c[0];
			c[0]=c[ran];
			c[ran]=temp;
		}
	}
	
	//카드 선택
	Card choice(int num) {
		return c[num];
	}
	
	//카드 랜덤
	Card random() {
		int ran=(int)(Math.random()*DECKMAX);
		return c[ran];
	}
	
	
}
