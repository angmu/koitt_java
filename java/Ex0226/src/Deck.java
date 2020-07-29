
public class Deck {
	final int CARD_NUM=52;
	Card[] cardArr=new Card[CARD_NUM];
	
	Deck(){
		for(int i=0;i<Card.KIND_MAX;i++) {
			for(int j=0;j<Card.NUM_MAX;j++) {
				cardArr[j+i*13]=new Card(i+1,j);
			}
		}
	}
	//�� ����
	Card cardCh(int select) {
		return cardArr[select];
	}
	//�����̱�
	Card cardran() {
		int ran=(int)(Math.random()*CARD_NUM);
//		return cardArr[ran];
		return cardCh(ran);
		
	}
	//��Ǯ
	void suffle() {
		for(int i=0;i<2000;i++) {
		int ran=(int)(Math.random()*CARD_NUM);
		Card temp=cardArr[0];
		cardArr[0]=cardArr[ran];
		cardArr[ran]=temp;
		}
	}
}
