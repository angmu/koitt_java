import java.util.Vector;

public class Ex0302_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제품이라는 형태=tv com audio
		//학생
		//상속개념으로 만들수 있는지의 여부
		
		//구매자= 머니,보너스,구매목록,환블.츨력
		
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
//	Vector<E> cart=new Vector<E>();// <E>의 형태만 받겟다는 뜻
//	cart[1]=t;
//	cart[2]=d;//이렇게 관련없는 데이터가 들어오는것을 방지
	Vector<Product> cart=new Vector<Product>();// <E>
//	Product[] cart=new Product[10];//배열구조
	int i=0;
	String listPrint="";
	//구매메소드
	void buy(Product p) {
		
		if(money<p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		cart.add(p);//순차로 알아서 들어간다.
//		cart[i++]=p;
		System.out.println(p.name+"을 구매하였습니다.");
		money-=p.price;
		bonus+=p.bonus;
	}
	//출력
	void summary() {
		//구매목록. 구매금액
		int sum=0;
//		if(cart[0]==null) {
//			System.out.println("구매한 물품이 없습니다.");
//			return;
//		}
		if(cart.isEmpty()) {//cart가 빈공백이냐 cart[i]==null  
			return;
		}
		for(int i=0;i<cart.size();i++) {//cart.length 와 달리 현재 데이터가 들어가있는 만큼만 계산해준다.
			Product p=(Product)cart.get(i);//0,1,2,3 순차로 읽는다, Object의 형태로 읽기 때문에 product로 받아야된다
			listPrint+=p.name+",";//cart[i].name
			sum+=p.price;//cart[i].price
		}
		
		System.out.println("총  구매 물품 :"+listPrint);
		System.out.println("총 구매금액 :"+sum);
		
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