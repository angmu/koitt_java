import java.util.Vector;

public class Ex0302_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ǰ�̶�� ����=tv com audio
		//�л�
		//��Ӱ������� ����� �ִ����� ����
		
		//������= �Ӵ�,���ʽ�,���Ÿ��,ȯ��.����
		
		Buyer user=new Buyer();
		user.buy(new Tv());
		user.buy(new Com());
		user.buy(new Audio());
		user.summary();
	}

}//class

class Buyer{
	int money=10000;
	int bonus=0;
	Tv t=new Tv();
	Data d=new Data();
//	Vector<E> cart=new Vector<E>();// <E>�� ���¸� �ްٴٴ� ��
//	cart[1]=t;
//	cart[2]=d;//�̷��� ���þ��� �����Ͱ� �����°��� ����
	Vector<Product> cart=new Vector<Product>();// <E>
//	Product[] cart=new Product[10];//�迭����
	int i=0;
	String listPrint="";
	//���Ÿ޼ҵ�
	void buy(Product p) {
		
		if(money<p.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		cart.add(p);//������ �˾Ƽ� ����.
//		cart[i++]=p;
		System.out.println(p.name+"�� �����Ͽ����ϴ�.");
		money-=p.price;
		bonus+=p.bonus;
	}
	//���
	void summary() {
		//���Ÿ��. ���űݾ�
		int sum=0;
//		if(cart[0]==null) {
//			System.out.println("������ ��ǰ�� �����ϴ�.");
//			return;
//		}
		if(cart.isEmpty()) {//cart�� ������̳� cart[i]==null  
			return;
		}
		for(int i=0;i<cart.size();i++) {//cart.length �� �޸� ���� �����Ͱ� ���ִ� ��ŭ�� ������ش�.
			Product p=(Product)cart.get(i);//0,1,2,3 ������ �д´�, Object�� ���·� �б� ������ product�� �޾ƾߵȴ�
			listPrint+=p.name+",";//cart[i].name
			sum+=p.price;//cart[i].price
		}
		
		System.out.println("��  ���� ��ǰ :"+listPrint);
		System.out.println("�� ���űݾ� :"+sum);
		
	}
	
}

class Product{
	String name;
	int price;
	int bonus;
	
	Product(){}
	Product(String name,int price){
		this.name=name;
		this.price=price;
		this.bonus=(int)(price/10);
	}
	
}

class Tv extends Product{
	Tv(){
		super("tv",1000);
	}
}

class Com extends Product{
	Com(){super("com",900);}
}

class Audio extends Product{
	Audio(){super("audio",500);}
}



class Data{
	int data;
}