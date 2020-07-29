
public class Card {

	 static final int KIND_MAX=4;
	 static final int NUM_MAX=13;
	
	 static final int SPADE=1;
	 static final int HEART=2;
	 static final int CLOVER=3;
	 static final int DIAMOND=4;
	
	int kind;
	int number;
	Card(){
		this(1,1);
	}
	
	Card(int kind, int num){
		this.kind=kind;
		this.number=num;	
		}
	
	public String toString(){
		String []kinds= {"","Spade","Heart","Clover","Diamond"};
		String nums="123456789XJQK";
		return kinds[kind]+" "+nums.charAt(number);
	}
}
