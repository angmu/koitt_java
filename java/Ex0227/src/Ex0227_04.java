import java.util.Scanner;

public class Ex0227_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변신 ㅣ 프로그램
		// 1)소방차 생성 2)앰뷸 생성 3)트럭 생성 4)기본차변신 5)원래대로변신 6)정료
		//
		//
		Scanner scan = new Scanner(System.in);
		int select;
		FireEngine fe=new FireEngine();
		Embulance eb=new Embulance();
		Truck tr=new Truck();
		Car g=null;
		loop: while (true) {
			System.out.println("================================");
			System.out.println("변신 차 프로그램");
			System.out.println("1)소방차생성");
			System.out.println("2)앰뷸런스 생성");
			System.out.println("3)트럭생성");
			System.out.println("4)기본차 변신");
			System.out.println("5)원래대로 돌아가기");
			System.out.println("6)종료");
			System.out.println("원하는 번호를 입력하세오>>>>>");
			select = scan.nextInt();
			switch (select) {
			case 1:
				System.out.println("소방차를 생성");
				fe.water();
				g=fe;
				break;
			case 2:
				System.out.println("앰뷸런스를 생성");
				eb.siren();
				g=eb;
				break;
			case 3:
				System.out.println("트럭생성");
				tr.stuff();
				g=tr;
				break;
			case 4:
				System.out.println("기본차로 변신");
//				g=changec(g);
				g.drive();
				break;
			case 5:
				System.out.println("원래대로 변신");
				back(g,fe,tr,eb);
				break;
			case 6:
				System.out.println("프로그램종료");
				break loop;
			default:
				System.out.println("잘못입력했다요");
				continue;
			}
		}

		// 엠뷸론수 객체 1개 생성
		// 카객체에 널고
		// 드라이브메소드 실행.
//		다시 형변롼해서 엠뷸런스1개 객체를 추가해 넣어라요.
		// 사이렌을 시행해보세오

//		Embulance eb=new Embulance();
//		Embulance eb2=new Embulance();
//		Car c=null;
//		c=eb;
//		c.drive();
//		eb2=(Embulance)c;
//		eb2.siren();
		// ====================
//		FireEngine fe=new FireEngine();
//		if(fe instanceof FireEngine) {
//			System.out.println("FireEngine의 객체가 맞습니다.");
//		}
//		if(fe instanceof Car) {
//			System.out.println("Car의 객체가 맞습니다.");
//		}
//		if(fe instanceof Object) {
//			System.out.println("Object의 객체가 맞습니다.");
//		}
//		

	}//// main

	
	static Car changec(Car g) {
		Car c1=new Car();
		g=c1;
		return g;
	}
	
	static void back(Car g,FireEngine fe,Truck tr,Embulance eb) {
		if(g instanceof FireEngine) {
			System.out.println("처음생성된 차는 소방차였세유");
			fe.water();
		}else if(g instanceof Truck) {
			System.out.println("처음생성된 차는 트럭이였세유");
			tr.stuff();
		}else {
			System.out.println("처음 생성된 차는 앰뷸런스였세유");
			eb.move();
		}
	}
}// class
