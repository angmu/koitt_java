
public class Card {
	int kind;
	int num;
	Card(){
		this(2,2);
	}
	Card(int kind,int num){
		this.kind=kind;
		this.num=num;
	}
	
	final static int KINDMAX=4;
	final static int NUMMAX=13;
	final static int SPADE=1;
	final static int CLOVER=2;
	final static int HEART=3;
	final static int DIAMOND=4;
	
	public String toString(){
		String[] kinds= {"","다이아몬드","클로버","하트","스페이드"};
		String nums= "0123456789XJQK";
		return kinds[kind]+nums.charAt(num);
	}
	
	
}
