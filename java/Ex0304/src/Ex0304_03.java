import java.util.ArrayList;
import java.util.Scanner;

public class Ex0304_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Card>a=new ArrayList<Card>();
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("�����ȣ�� �Է��ϼ���");
			int id_num=scan.nextInt();
			scan.nextLine();
			System.out.println("�̸��� �Է��ϼ���");
			String name=scan.nextLine();
			System.out.println("�μ����� �Է��ϼ���");
			String department=scan.nextLine();
			System.out.println("��å�� �Է��ϼ���");
			String position=scan.nextLine();
			System.out.println("������ �Է��ϼ���");
			int salary=scan.nextInt();
			System.out.println("�ٹ��Ⱓ�� �Է��ϼ���");
			int period=scan.nextInt();
			System.out.println("������ �Է��ϼ���");
			int v_count=scan.nextInt();
			scan.nextLine();
			System.out.println("��ȭ��ȣ�� �Է��ϼ���");
			String tel=scan.nextLine();
			a.add(new Card(id_num,name,department,position,salary,period,v_count,tel));
			
			
		}
		for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
		}
		
		
		//3���� ������ �Է��ϰ� toString�� �������̵��ؼ� ����� �غ�����
		
		//-------------------------------------
//		Card c1=new Card("��Ʈ",3);
//		System.out.println(c1.kind+c1.num);
//		System.out.println(c1);
//		Card c2=new Card("�����̵�",7);
//		System.out.println(c2.kind+c2.num);
//		System.out.println(c2);

	}

}
class Card{
	
	int id_num;
	String name;
	String department;
	String position;//��å
	int salary;//����
	int period;//�ٹ��Ⱓ
	int v_count;//����
	String tel;//��ȭ��ȣ
	
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
		return "�����ȣ:"+id_num+" �̸�:"+name+" "+department+" ��å:"+position+" ����"+salary+" �ٹ��Ⱓ"+period+" ����:"+v_count+" ��ȭ��ȣ:"+tel;
	}
	
	//--------------------------
//	String kind;
//	int num;
//	Card(){
//		this("Ŭ�ι�",8);
//	}
//	Card(String kind, int num){
//		this.kind=kind;
//		this.num=num;
//	}
//	public String toString() {
//		return kind+num;
//	}
}