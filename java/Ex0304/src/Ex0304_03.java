import java.util.ArrayList;
import java.util.Scanner;

public class Ex0304_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Card>a=new ArrayList<Card>();
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("사원번호를 입력하세오");
			int id_num=scan.nextInt();
			scan.nextLine();
			System.out.println("이름을 입력하세오");
			String name=scan.nextLine();
			System.out.println("부서명을 입력하세오");
			String department=scan.nextLine();
			System.out.println("직책을 입력하세오");
			String position=scan.nextLine();
			System.out.println("월급을 입력하세오");
			int salary=scan.nextInt();
			System.out.println("근무기간을 입력하세오");
			int period=scan.nextInt();
			System.out.println("년차을 입력하세오");
			int v_count=scan.nextInt();
			scan.nextLine();
			System.out.println("전화번호를 입력하세오");
			String tel=scan.nextLine();
			a.add(new Card(id_num,name,department,position,salary,period,v_count,tel));
			
			
		}
		for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
		}
		
		
		//3명의 직원을 입력하고 toString을 오버라이딩해서 출력을 해보세오
		
		//-------------------------------------
//		Card c1=new Card("하트",3);
//		System.out.println(c1.kind+c1.num);
//		System.out.println(c1);
//		Card c2=new Card("스페이드",7);
//		System.out.println(c2.kind+c2.num);
//		System.out.println(c2);

	}

}
class Card{
	
	int id_num;
	String name;
	String department;
	String position;//직책
	int salary;//월급
	int period;//근무기간
	int v_count;//년차
	String tel;//전화번호
	
	Card(){}
	Card(int id_num,String name,String department,String position,int salary,int period,int v_count,String tel){
		this.id_num=id_num;
		this.name=name;
		this.department=department;
		this.position=position;
		this.salary=salary;
		this.period=period;
		this.v_count=v_count;
		this.tel=tel;
		
	}
	public String toString() {
		return "사원번호:"+id_num+" 이름:"+name+" "+department+" 직책:"+position+" 월급"+salary+" 근무기간"+period+" 년차:"+v_count+" 전화번호:"+tel;
	}
	
	//--------------------------
//	String kind;
//	int num;
//	Card(){
//		this("클로버",8);
//	}
//	Card(String kind, int num){
//		this.kind=kind;
//		this.num=num;
//	}
//	public String toString() {
//		return kind+num;
//	}
}