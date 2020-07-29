
public class Ex0225_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Card c= new Card(1,2);
//		System.out.println(c);
		
		Deck_1 d=new Deck_1();
		for(int i=0;i<52;i++) {
			System.out.print(d.cardArr[i]+" ");
		}
		Card c=d.pick(10); //cardArr[10]  Card[]cardArr=new Card[CARD_NUM] ī���� ������ ī��,��� ī��� �޾ƾ��Ѵ�
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
	Card[]cardArr=new Card[CARD_NUM];//���ڸ� �Ժη� ���ٲٰ� �ϱ� ����
	
	//1~13���� ����, ����		
	Deck_1() {
		for(int i=0;i<Card.KIND_MAX;i++) {
			for(int j=0;j<Card.NUM_MAX;j++) {
				cardArr[j+13*i]=new Card(i+1,j+1);
//				cardArr[0]=new Card(1,1);
//				cardArr[1]=new Card(1,2);
//				cardArr[2]=new Card(1,3);
			}
		}
		
	}//������
	
		
	//ī�� �̱�
	Card pick(int index) {
		return cardArr[index];//10 > Ŭ�ι��� 10
	}	
	
	//���� �̱�
		Card pick() {
			int index=0;
			index=(int)(Math.random()*Card.NUM_MAX);//0~51�� �迭�� ����
			//pick�� ȣ���Ͽ� ����
//			return pick(index);
			
			return cardArr[index];//10 > Ŭ�ι��� 10
		}
		
		
	//ī�弯��
	void suffle() {
		for(int i=0;i<2000;i++) {
			int num=(int)(Math.random()*Card.NUM_MAX);
			//cardArr�� Ÿ���� Card ��ü�̴�. ��� Card�� �޾ƾ��Ѵ�.
			Card temp=cardArr[0];
			cardArr[0]=cardArr[num];
			cardArr[num]=temp;
		}
	}
		
	
}//deck_1





class Card{

	
	static final int KIND_MAX=4;//ī�幫�̰���
	static final int NUM_MAX=13;//���̺� ī�� ��
	
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
				//�̰Ŵ��� for���� �ȵ����� �ȴٸ� :D
	public String toString() {
		String[]kinds= {"","CLOVER","HEART","SPADE","SPADE"};
		String numbers= "0123456789XJQK";
		return kinds[kind]+" "+numbers.charAt(number);
	}
	
}//card