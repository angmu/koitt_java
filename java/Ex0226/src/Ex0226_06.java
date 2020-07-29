import java.util.Scanner;

public class Ex0226_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//시 분 초을 입력받아 출력을 해보세오
		//잘못된 시를 입력받았을때 다시 입력받도록 구현
		String[] tt= {"시간","분","초"};
		int[] tt2=new int[3];
		Time t3=new Time();
		boolean a=false;
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("시간을 입력하세오");
			int h=scan.nextInt();
			if(!(t3.setHour(h))) {
				continue;//이거는 갓다와서 체크된것.. 별로 좋은프로그램이 아니라 칸다.. 이왕이면 여기서 걸러주라고 한다 ㅇ,ㅇ!
			}
			System.out.println("시간이 입력되었습니다");
		}
//		
//		Time t=new Time();
//		Time t2=new Time(12,12,12);
////		t.hour=10;//private이라 안들어감.
//		t.setHour(10);
//		t.setMinute(65);//잘못된 분이 들어왔다고 찍힌다유
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
			System.out.println("잘못된 시간이 들어왔습니다.");
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
			System.out.println("잘못된 분이 들어왔습니다.");
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second<0||second>59) {
			System.out.println("잘못된 초가 들어왔습니다.");
			return;
		}
		this.second = second;
	}
	public String toString() {
		return hour+"시 "+minute+"분 "+second+"초";
	}
}