
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
		System.out.println("��ġ:"+inch+" Ÿ��:"+name);
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
		System.out.println("�뷮:"+liter+" ����Ÿ��:"+door);
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
		System.out.println("�뷮:"+size+" Ÿ��:"+shape);
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
		System.out.println("��ġ:"+inch+" Ÿ��:"+name);
		System.out.println("HDR����� �ֽ��ϴ�.");
	}
}
class Liter extends Ref{
	Liter(){
		super("�⺻�������",900,90,700,"one");
	}
}
class Double extends Ref{
	Double(){
		super("�繮�������",1000,100,900,"double");
	}
	void index() {
		System.out.println("�뷮:"+liter+" ����Ÿ��:"+door);
		System.out.println("����ð������ �ֽ��ϴ�.");
	}
}
class Tong extends Wash{
	Tong(){
		super("�뵹�̼�Ź��",1100,110,18,"�뵹��");
	}
}
class Drum extends Wash{
	Drum(){
		super("�巳��Ź��",1200,120,15,"�巳");
	}
}
class DrumDry extends Wash{
	DrumDry(){
		super("�巳������Ź��",1500,150,12,"�巳");
	}
	void index() {
		System.out.println("�뷮:"+size+" Ÿ��:"+shape);
		System.out.println("��ձ���� �ֽ��ϴ�.");
	}
}
