
public class Product {
	int price;
	String color;
	int bonus_point;
	String name;
	
	
	Product(){
		this("TV",100,10);
	}
	Product(String name,int price,int bonus_point){
		this.name=name;
		this.price=price;
		this.bonus_point=bonus_point;
	}
	
	public String toString() {
		return name;
	}
	void index() {}
	
}

class Tv extends Product{
	int inch;
	Tv(){}
	Tv(String name,int price,int bonus_point,int inch){
		super(name,price,bonus_point);
		this.inch=inch;
	}
	void index() {
		System.out.println("인치:"+inch+" 타입:"+name);
	}
}

class Ref extends Product{
	int liter;
	String door;
	Ref(){}  
	Ref(String name,int price,int bonus_point,int liter,String door){
		super(name,price,bonus_point);
		this.liter=liter;
		this.door=door;
		
	}
	void index() {
		System.out.println("용량:"+liter+" 도어타입:"+door);
	}
}
class Wash extends Product{
	int size;
	String shape;
	Wash(){}
	Wash(String name,int price,int bonus_point,int size,String shape){
		super(name,price,bonus_point);
		this.size=size;
		this.shape=shape;
	}
	void index() {
		System.out.println("용량:"+size+" 타입:"+shape);
	}
}

class LED extends Tv{
	LED(){
		super("LEDTV",1000,100,15);
	}
	
}
class LCD extends Tv{
	LCD(){
		super("LCDTV",700,70,14);
	}
}
class OLED extends Tv{
	OLED(){
		super("OLEDTV",900,90,18);
	}
	void index() {
		System.out.println("인치:"+inch+" 타입:"+name);
		System.out.println("HDR기능이 있습니다.");
	}
}
class Liter extends Ref{
	Liter(){
		super("기본형냉장고",900,90,700,"one");
	}
}
class Double extends Ref{
	Double(){
		super("양문형냉장고",1000,100,900,"double");
	}
	void index() {
		System.out.println("용량:"+liter+" 도어타입:"+door);
		System.out.println("더블냉각기능이 있습니다.");
	}
}
class Tong extends Wash{
	Tong(){
		super("통돌이세탁기",1100,110,18,"통돌이");
	}
}
class Drum extends Wash{
	Drum(){
		super("드럼세탁기",1200,120,15,"드럼");
	}
}
class DrumDry extends Wash{
	DrumDry(){
		super("드럼건조세탁기",1500,150,12,"드럼");
	}
	void index() {
		System.out.println("용량:"+size+" 타입:"+shape);
		System.out.println("살균기능이 있습니다.");
	}
}
