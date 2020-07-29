
public class Tv {
	String color;//tv의 색살
	boolean power;//
	int channel;
	//void 메소드를 선언.()가 붙어있다. void는 return값이 없다. 8변수를 사용할때는 return 값을 반환해야한다.
	void power(){
		if(power==true) {
		System.out.println("전원을 off합니다");
		power=!power;}else {
			System.out.println("전원을 on합니다");
		}
	}
	void channelUp() {
	    System.out.println("채널을 1 증가합니다");
		channel++;
		System.out.println("현재채널 :"+channel);
	}
	void channelDown() {
		System.out.println("채널을 1 감소합니다");
		channel--;
		System.out.println("현재채널 :"+channel);
	}
}
