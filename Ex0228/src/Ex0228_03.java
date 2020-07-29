import java.util.Scanner;

public class Ex0228_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)컴퓨터 2)tv 3)냉장고 4)세탁기 5)에어컨 6)구매물품 7)보유금액 출력 8)보유금액 충전 0)종료
		Scanner scan=new Scanner(System.in);
		Tv2[] t=new Tv2[15];
		Com[] c=new Com[15];
		Air[] a=new Air[15];
		Ref2[] r=new Ref2[15];
		Wash[] w=new Wash[15];
		int tv_index=0,co_index=0,air_index=0,ref_index=0,wash_index=0;
		Buyer1 b=new Buyer1();
		loop:
		while(true) {
			int select=print();
			switch(select) {
			case 0:
				System.out.println("프로그램 종료");
				break loop;
			case 1:
				t[tv_index]=new Tv2();
				tv_index=b.buy(t[tv_index], tv_index);
				break;
			case 2:
				c[co_index]=new Com();
				co_index=b.buy(c[co_index], co_index);
				break;
			case 3:
				a[air_index]=new Air();
				air_index=b.buy(a[air_index], air_index);
				break;
			case 4:
				r[ref_index]=new Ref2();
				ref_index=b.buy(r[ref_index], ref_index);
				break;
			case 5:
				w[wash_index]=new Wash();
				wash_index=b.buy(w[wash_index], wash_index);
				break;
			case 6:
				b.summary();
				break;
			case 7:
				b.jango();
				break;
			case 8:
				break;
			default:
				continue loop;
			}
		}
		
		
		
		
	}//main
	static int print() {
		Scanner scan=new Scanner(System.in);
		int y=0;
		System.out.println("쇼핑하기 프로그램");
		System.out.println("1)컴퓨터  2)tv  3)냉장고  4)세탁기  5)에어컨  6)구매물품");
		System.out.println("7)보유금액,보너스포인트 출력  8)보유금액 충전  0)종료");
		System.out.println("원하는 번호를 선택하세요");
		y=scan.nextInt();
		return y;
	}
}//class

class Buyer1{
	int money=100000;
	int bonus_point=0;
	int sum=0;
	int i;
	Product_s[] item=new Product_s[40];
	Buyer1() {
		
	}
	int buy(Product_s p,int a) {
		if(money<p.price) {
			System.out.println("돈이 부족합니다");
			return a;
		}
		System.out.println(p.name+"을 1대 구매하였습니다");
		item[i]=p;
		i++;
		money=money-p.price;
		bonus_point+=p.bonus_point;
		sum+=p.price;
		a++;
		return a;
	}
	
	void summary() {
		  
		  for(int j=0;j<i;j++) {
		   if(item[j]==null) {
		    System.out.println("구매물품이 없습니다.");
		   }
		   System.out.print(item[j].name+",");
		   sum = sum + item[j].price;
		  } //for
		  System.out.println();
		  System.out.println("총구매개수 : "+(i));
		  System.out.println("총구매금액 : "+sum);
	}
	void jango() {
		System.out.println("잔액:"+money);
		System.out.println("포인트:"+bonus_point);
	}
	
}




//상품
class Product_s{
	String name;
	int price;
	int bonus_point;
	
	Product_s(){
		
	}
	Product_s(String name,int price,int bonus_point){
		this.name=name;
		this.price=price;
		this.bonus_point=bonus_point;
	}
}


class Com extends Product_s{
	Com(){
		name = "Computer";
		price = 13000;
		bonus_point = (int) (price / 10);
	}
}

class Tv2 extends Product_s{
	Tv2(){
		name = "Tv";
		price = 9000;
		bonus_point = (int) (price / 10);
	}
}

class Air extends Product_s{
	Air(){
		name = "에어컨";
		price = 8000;
		bonus_point = (int) (price / 10);
	}
}

class Ref2 extends Product_s{
	Ref2(){
		name = "냉장고";
		price = 12000;
		bonus_point = (int) (price / 10);
	}
}

class Wash extends Product_s{
	Wash(){
		name = "세탁기";
		price = 9000;
		bonus_point = (int) (price / 10);
	}
}

