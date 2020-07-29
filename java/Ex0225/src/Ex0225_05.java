
public class Ex0225_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Card c= new Card(1,2);
//		System.out.println(c);
		
		Deck_1 d=new Deck_1();
		for(int i=0;i<52;i++) {
			System.out.print(d.cardArr[i]+" ");
		}
		Card c=d.pick(10); //cardArr[10]  Card[]cardArr=new Card[CARD_NUM] 카드라는 변수의 카드,고로 카드로 받아야한다
		System.out.println(c);
		System.out.println("---------------------");
		d.suffle();
		Card c2=d.pick(10);
		System.out.println(c2);
		for(int i=0;i<52;i++) {
			System.out.print(d.cardArr[i]+" ");
		}
	}

}

class Deck_1{
	final int CARD_NUM=52;
	Card[]cardArr=new Card[CARD_NUM];//숫자를 함부로 못바꾸게 하기 위함
	
	//1~13까지 숫자, 종류		
	Deck_1() {
		for(int i=0;i<Card.KIND_MAX;i++) {
			for(int j=0;j<Card.NUM_MAX;j++) {
				cardArr[j+13*i]=new Card(i+1,j+1);
//				cardArr[0]=new Card(1,1);
//				cardArr[1]=new Card(1,2);
//				cardArr[2]=new Card(1,3);
			}
		}
		
	}//생성자
	
		
	//카드 뽑기
	Card pick(int index) {
		return cardArr[index];//10 > 클로버의 10
	}	
	
	//랜덤 뽑기
		Card pick() {
			int index=0;
			index=(int)(Math.random()*Card.NUM_MAX);//0~51의 배열을 선택
			//pick을 호출하여 보냄
//			return pick(index);
			
			return cardArr[index];//10 > 클로버의 10
		}
		
		
	//카드섞기
	void suffle() {
		for(int i=0;i<2000;i++) {
			int num=(int)(Math.random()*Card.NUM_MAX);
			//cardArr의 타입은 Card 객체이다. 고로 Card로 받아야한다.
			Card temp=cardArr[0];
			cardArr[0]=cardArr[num];
			cardArr[num]=temp;
		}
	}
		
	
}//deck_1





class Card{

	
	static final int KIND_MAX=4;//카드무늬개수
	static final int NUM_MAX=13;//무늬별 카드 수
	
	static final int SPADE=4;
	static final int DIAMOND=3;
	static final int HEART=2;
	static final int CLOVER=1;
	
	int kind;//1=clover 2=heart 3=diamond 4=spade
	int number;//1,2,3,4...9,x,j,q,k
	
	Card(){}
	
	Card(int kind,int number){
		this.kind=kind;
		this.number=number;
	}
				//이거덕에 for문을 안돌려도 된다리 :D
	public String toString() {
		String[]kinds= {"","CLOVER","HEART","SPADE","SPADE"};
		String numbers= "0123456789XJQK";
		return kinds[kind]+" "+numbers.charAt(number);
	}
	
}//card