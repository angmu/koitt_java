
public class Ex0302_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine m1=new Marine();
		m1.move(10, 10);
		///다형성
		Unit[] group=new Unit[10];
		group[0]=new Marine();
		group[1]=new Tank();
		group[2]=new Dropship();
		
		
		for(int i=0;i<group.length;i++) {
			if(group[i]==null) {
				break;
			}
			group[i].move(1000, 1000);
			System.out.println();
		}
		
		
	}

}


//1.중괄호없음(abstract) >>2. class에도 abstract라고 써줘야함
abstract class Unit{
	int x,y;
	int time;
	int hour=time/3600;
	int minute=time%3600/60;
	int second=time%3600%60;
	{
		hour=time/3600;
		minute=time%3600/60;
		second=time%3600%60;
	}
	abstract void move(int x,int y);
	void stop() {
		System.out.println(x+","+y+": 현재위치에서 멈춤");
	}
}


class Marine extends Unit{
//	int x,y;
	//속도 6
	void move(int x,int y) {
		time=x*6+y*6;
		hour=time/3600;
		minute=time%3600/60;
		second=time%3600%60;
//		System.out.println(x+","+y+": 땅으로 움직임 /속도 :6");
		System.out.println("좌표"+x+","+y);
		System.out.println("움직인 거리:"+(x+y));
		System.out.println("걸리는 시간:"+hour+"시"+minute+"분"+second+"초");
	}
//	void stop() {
//		
//	}
	void stimpack() {
		
	}
}


class Tank extends Unit{
//	int x,y;
	//속도 5
	void move(int x,int y) {
		time=x*4+y*4;
		hour=time/3600;
		minute=time%3600/60;
		second=time%3600%60;
		
		System.out.println("좌표"+x+","+y);
		System.out.println("움직인 거리:"+(x+y));
		System.out.println("걸리는 시간:"+hour+"시"+minute+"분"+second+"초");
		
	}
//	void stop() {
//		
//	}
	void changeMode() {
		
	}
}

class Dropship extends Unit{
//	int x,y;
	//속도 10
	void move(int x,int y) {
		time=(int)Math.sqrt(x*x+y*y)*10;
		hour=time/3600;
		minute=time%3600/60;
		second=time%3600%60;
		System.out.println("좌표"+x+","+y);
		System.out.println("움직인 거리:"+(int)Math.sqrt(x*x+y*y));
		System.out.println("걸리는 시간:"+hour+"시"+minute+"분"+second+"초");
	}
//	void stop() {
//		
//	}
	void load() {
		
	}
	void unload() {
		
	}
}