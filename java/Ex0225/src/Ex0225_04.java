import java.util.Scanner;

public class Ex0225_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1=new Data();
		System.out.println(d1);
		CaptionTv c1=new CaptionTv();
		
		
//		Tv t1;
//		t1=c1;
//		
//		//d1=c1; 다른 클래스+상속받은게 없기 때문에 에러가 난다요.
//		
//		c1.channel=7;
//		c1.channelUp();//8
//		c1.channelUp();//9
//		c1.channelDown();//8
//		System.out.println("현재채널:"+c1.channel);
//		c1.caption=true;
//		c1.displayCap("Hello Java");
	}

}

class Tv {
	boolean power;
	int channel;
	int volume;

	void power() {
		power = !power;

	}

	void channelUp() {
		//100번이 넘어가면 다시 1로 돌아가게
		if(channel>=101) {
			channel=1;
		}
		++channel;
	}
	
	void channelDown() {
		if(channel<=-1) {
			channel=100;
		}
		--channel;
	}
	
	Scanner scan=new Scanner(System.in);
	int remote=scan.nextInt();
	
}//tv

class CaptionTv extends Tv{
	boolean caption;
	
	void displayCap(String a) {
		if(caption==true) {
			System.out.println("Caption on");
			System.out.println(a);
		}
	}
}

class Data{
	int x;
	int y;
	
	Data(){
		x=10;
		y=20;
	}
	
	                //모든 클래스의 조상 --오버라이딩으로 재정의
	public String toString() {
		return "x의 값 :"+x+"y의 값 :"+y;
	}
}