
public class Ex0227_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car();
		Car c2=null;
		FireEngine f=null;
		FireEngine f2=new FireEngine();
		
		c.drive();
		c=f2;
		c.drive();
		f=(FireEngine)c;
		f.water();
//		
//		c.drive();
//		c2=f2;//형변환 생략
//		f=(FireEngine)c2;
//		//최초 대입을 무엇부터햇는지 봐야한다.
//		//FireEngine f=new FireEngine();
//		f.water();//여기에서는 에러나지않으나 에러난다유.
		
//		c.drive();
//		c2=f2;//형변환 생략
//		f=(FireEngine)c;
//		//FireEngine f=new Car(); <<에러 //형변환을 했어도 c는 원래Car()로 선언되어있`기 때문에 조상의 객체를 받는것이 되어 에러가 난다.
//		//자손의 참조변수로 조상의 객체를 선언하는것은 안된다.
//		f.water();//여기에서는 에러나지않으나 에러난다유.
		
		
		
		
//		Car c= new Car();
//		FireEngine f=new FireEngine();
//		System.out.println("[깡통차]");
//		Car c2=new FireEngine();//다형성
////		FireEngine f2=new Car();//불가
//		FireEngine f2=new FireEngine();
//		FireEngine f3=null;
//		c=f2;//형변환 생략가능 (water는 사용불가)
//		f3=(FireEngine)c;//형변환 생략불가 (water 사용가능)
//		f3.water();
//		
//		c.drive();
//		c.stop();
//		System.out.println("[소방차]");
//		f.drive();
//		f.stop();
//		f.water();
		
	}

	

	

}

class Car{
	String color;
	int door;
	void drive() {//240이상 오르지않음
		System.out.println("엑셀을 밟으면 출발!");
	}
	
	void stop() {
		System.out.println("브레이크를 밟으면 멈춤!");
	}
}

class FireEngine extends Car{
	public void water(){
		System.out.println("믈을 발사");
	}
}

class Embulance extends Car{
	public void siren() {
		System.out.println("사이렌이 울립니다");
	}
	public void move() {
		System.out.println("사람을 옮깁니다");
	}
}
class Truck extends Car{
	public void stuff() {
		System.out.println("물건을 옮깁니다.");
	}
}