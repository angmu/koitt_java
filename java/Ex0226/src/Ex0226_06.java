import java.util.Scanner;

public class Ex0226_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�� �� ���� �Է¹޾� ����� �غ�����
		//�߸��� �ø� �Է¹޾����� �ٽ� �Է¹޵��� ����
		String[] tt= {"�ð�","��","��"};
		int[] tt2=new int[3];
		Time t3=new Time();
		boolean a=false;
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("�ð��� �Է��ϼ���");
			int h=scan.nextInt();
			if(!(t3.setHour(h))) {
				continue;//�̰Ŵ� ���ٿͼ� üũ�Ȱ�.. ���� �������α׷��� �ƴ϶� ĭ��.. �̿��̸� ���⼭ �ɷ��ֶ�� �Ѵ� ��,��!
			}
			System.out.println("�ð��� �ԷµǾ����ϴ�");
		}
//		
//		Time t=new Time();
//		Time t2=new Time(12,12,12);
////		t.hour=10;//private�̶� �ȵ�.
//		t.setHour(10);
//		t.setMinute(65);//�߸��� ���� ���Դٰ� ��������
//		t.setSecond(12);
//		
//		System.out.println(t);
//		System.out.println(t2);
//		
	}

}
class Time{
	private int hour;
	private int minute;
	private int second;
	
	Time(){
		this(1,1,1);
	}
	Time(int hour,int minute,int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	
	public int getHour() {
		return hour;
	}
	public boolean setHour(int hour) {
		if(hour<0||hour>23) {
			System.out.println("�߸��� �ð��� ���Խ��ϴ�.");
			return false;
			
		}
		this.hour = hour;
		return true;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0||minute>59) {
			System.out.println("�߸��� ���� ���Խ��ϴ�.");
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second<0||second>59) {
			System.out.println("�߸��� �ʰ� ���Խ��ϴ�.");
			return;
		}
		this.second = second;
	}
	public String toString() {
		return hour+"�� "+minute+"�� "+second+"��";
	}
}