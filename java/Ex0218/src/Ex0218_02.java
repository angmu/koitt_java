
public class Ex0218_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ī�����:"+Card.width);//100
		System.out.println("ī�����:"+Card.height);//250
		System.out.println("------------------------");
		
		Card c1=new Card();
		c1.kind="Heart";
		c1.num=7;
		
		Card c2=new Card();
		c2.kind="Spade";
		c2.num=5;

		System.out.println("c1 ī���:"+c1.kind+"/"+c1.num);
		System.out.println("c1 ũ���:"+c1.width+"/"+c1.height);
		System.out.println("------------------------");
		System.out.println("c2 ī���:"+c2.kind+"/"+c2.num);
		System.out.println("c2 ũ���:"+c2.width+"/"+c2.height);
		System.out.println("------------------------");
		c1.width=50;//static�� �װͰ� �������� ����ϴ� ���� �� �ٲ��... ��� ���� �ٲܶ��� �����ؾ��Ѵ�.
		c1.height=80;
		System.out.println("c1 ī���:"+c1.kind+"/"+c1.num);
		System.out.println("c1 ũ���:"+c1.width+"/"+c1.height);
		System.out.println("------------------------");
		System.out.println("c2 ī���:"+c2.kind+"/"+c2.num);
		System.out.println("c2 ũ���:"+c2.width+"/"+c2.height);
		System.out.println("------------------------");
		
		
	}

}
