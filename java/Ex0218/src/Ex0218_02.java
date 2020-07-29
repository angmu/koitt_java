
public class Ex0218_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("카드넓이:"+Card.width);//100
		System.out.println("카드높이:"+Card.height);//250
		System.out.println("------------------------");
		
		Card c1=new Card();
		c1.kind="Heart";
		c1.num=7;
		
		Card c2=new Card();
		c2.kind="Spade";
		c2.num=5;

		System.out.println("c1 카드는:"+c1.kind+"/"+c1.num);
		System.out.println("c1 크기는:"+c1.width+"/"+c1.height);
		System.out.println("------------------------");
		System.out.println("c2 카드는:"+c2.kind+"/"+c2.num);
		System.out.println("c2 크기는:"+c2.width+"/"+c2.height);
		System.out.println("------------------------");
		c1.width=50;//static은 그것과 공통으로 사용하는 것은 다 바뀐다... 고로 값을 바꿀때는 조심해야한다.
		c1.height=80;
		System.out.println("c1 카드는:"+c1.kind+"/"+c1.num);
		System.out.println("c1 크기는:"+c1.width+"/"+c1.height);
		System.out.println("------------------------");
		System.out.println("c2 카드는:"+c2.kind+"/"+c2.num);
		System.out.println("c2 크기는:"+c2.width+"/"+c2.height);
		System.out.println("------------------------");
		
		
	}

}
