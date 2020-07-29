
public class Car {
	String color;
	String gearType;
	int door;
	
	Car(){
		this("핑크","auto",5);
//		color="핑크";
//		gearType="auto";
//		door=5;
	}
	
//	Car(){
//		color="핑크";
//		gearType="auto";
//		door=5;
//	}
	
	//  변수의 우선순위 >>지역변수에 있는것을 먼저 대입하기 때문에 this를 써주어 인스턴스변수에 값이 들어갈수 있도록 한다.
	Car(String color, String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
}
