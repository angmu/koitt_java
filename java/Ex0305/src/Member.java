import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Member {
	String id;
	String pw;
	String name;
	String tel;
	String time;
	int money;
	int bonus_point;
	int sum;
	int buy_count;
	Calendar cal;
	int year;
	int month;
	int day;
	ArrayList<Product> basket=new ArrayList<Product>();
	
	Member(){}
	Member(String id,String pw,String name,String tel){
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.tel=tel;
		money=10000;
	}
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔고부족");
			System.out.println("현재 보유금액:"+money);
			return;
		}
		System.out.println(p.name+"을 구매하였습니다.");
		p.index();
		money-=p.price;
		bonus_point+=p.bonus_point;
		sum+=p.price;
		cal=Calendar.getInstance();
		year=cal.get(Calendar.YEAR);
		month=cal.get(Calendar.MONTH);
		day=cal.get(Calendar.DATE);
		time=year+"년"+month+"월"+day+"일";
		buy_count++;
		basket.add(p);
		
	}
	
	void printbuy() {
		
		for(int i=0;i<basket.size();i++) {
			System.out.print("구매물품:"+basket.get(i)+" 구매날짜:"+time);
			System.out.println();
		}
		System.out.println("남은 잔고:"+money);
		System.out.println("포인트:"+bonus_point);
		System.out.println("총 구매금액:"+sum);
		System.out.println("총 구매개수:"+buy_count);
		System.out.println("===========================");
	}
	
	public String toString() {
		return "ID:"+id+" 이름:"+name+" 전화번호:"+tel;
	}
	
	
}
