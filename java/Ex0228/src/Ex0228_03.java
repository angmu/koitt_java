import java.util.Scanner;

public class Ex0228_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)��ǻ�� 2)tv 3)����� 4)��Ź�� 5)������ 6)���Ź�ǰ 7)�����ݾ� ��� 8)�����ݾ� ���� 0)����
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
				System.out.println("���α׷� ����");
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
		System.out.println("�����ϱ� ���α׷�");
		System.out.println("1)��ǻ��  2)tv  3)�����  4)��Ź��  5)������  6)���Ź�ǰ");
		System.out.println("7)�����ݾ�,���ʽ�����Ʈ ���  8)�����ݾ� ����  0)����");
		System.out.println("���ϴ� ��ȣ�� �����ϼ���");
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
			System.out.println("���� �����մϴ�");
			return a;
		}
		System.out.println(p.name+"�� 1�� �����Ͽ����ϴ�");
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
		    System.out.println("���Ź�ǰ�� �����ϴ�.");
		   }
		   System.out.print(item[j].name+",");
		   sum = sum + item[j].price;
		  } //for
		  System.out.println();
		  System.out.println("�ѱ��Ű��� : "+(i));
		  System.out.println("�ѱ��űݾ� : "+sum);
	}
	void jango() {
		System.out.println("�ܾ�:"+money);
		System.out.println("����Ʈ:"+bonus_point);
	}
	
}




//��ǰ
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
		name = "������";
		price = 8000;
		bonus_point = (int) (price / 10);
	}
}

class Ref2 extends Product_s{
	Ref2(){
		name = "�����";
		price = 12000;
		bonus_point = (int) (price / 10);
	}
}

class Wash extends Product_s{
	Wash(){
		name = "��Ź��";
		price = 9000;
		bonus_point = (int) (price / 10);
	}
}

