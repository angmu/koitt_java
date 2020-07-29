import java.util.Scanner;

public class DeckText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//card()
		//deck()
		//deck test()
		
		Deck decktest=new Deck();
		Card[] ch_c=new Card[5];
		decktest.suffle();
		
		for(int i=0;i<ch_c.length;i++) {
			ch_c[i]=decktest.random();
			System.out.print(ch_c[i]+" ");
		}
		System.out.println();
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<ch_c.length;i++) {
			System.out.println("카드를 선택하세오 1~52");
			int ch=scan.nextInt();
			ch_c[i]=decktest.choice(ch);
			System.out.println(ch_c[i]+" ");
		}
		
		
	}

}
