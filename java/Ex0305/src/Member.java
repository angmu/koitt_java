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
			System.out.println("�ܰ����");
			System.out.println("���� �����ݾ�:"+money);
			return;
		}
		System.out.println(p.name+"�� �����Ͽ����ϴ�.");
		p.index();
		money-=p.price;
		bonus_point+=p.bonus_point;
		sum+=p.price;
		cal=Calendar.getInstance();
		year=cal.get(Calendar.YEAR);
		month=cal.get(Calendar.MONTH);
		day=cal.get(Calendar.DATE);
		time=year+"��"+month+"��"+day+"��";
		buy_count++;
		basket.add(p);
		
	}
	
	void printbuy() {
		
		for(int i=0;i<basket.size();i++) {
			System.out.print("���Ź�ǰ:"+basket.get(i)+" ���ų�¥:"+time);
			System.out.println();
		}
		System.out.println("���� �ܰ�:"+money);
		System.out.println("����Ʈ:"+bonus_point);
		System.out.println("�� ���űݾ�:"+sum);
		System.out.println("�� ���Ű���:"+buy_count);
		System.out.println("===========================");
	}
	
	public String toString() {
		return "ID:"+id+" �̸�:"+name+" ��ȭ��ȣ:"+tel;
	}
	
	
}
