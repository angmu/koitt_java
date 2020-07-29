
public class Ex0302_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine01 m1=new Marine01();
		Tank01 t1=new Tank01();
		Scv01 s1=new Scv01();
		Dropship01 d1=new Dropship01();
		
		m1.hitPoint-=10;//40-10=30
		t1.hitPoint-=100;//150-100=50
		d1.hitPoint-=50;

		System.out.println("탱크 데미지 후 체력"+t1.hitPoint);
		System.out.println("마린 데미지 후 체력"+m1.hitPoint);
		System.out.println("드롭쉽 데미지 후 체력"+d1.hitPoint);
		
		s1.repair(t1);
//		s1.repair(m1);
		s1.repair(d1);
		System.out.println("===============================");
		
		System.out.println("탱크 수선 후 체력"+t1.hitPoint);
		System.out.println("마린 수선 후 체력"+m1.hitPoint);
		System.out.println("드롭쉽 수선 후 체력"+d1.hitPoint);
		
	}

}


interface Repairable{
	
}


class Unit01{
	int hitPoint;
	int MAX_HP;
	
	Unit01(){}
	Unit01(int hp){
		MAX_HP=hp;
	}
}// class unit


class GroundUnit extends Unit01{
	GroundUnit(){}
	GroundUnit(int hp){
		super(hp);
	}
}
class AirUnit extends Unit01{
	AirUnit(){}
	AirUnit(int hp){
		super(hp);
	}
}
class Tank01 extends GroundUnit implements Repairable{
	Tank01(){
		super(150);
		hitPoint=MAX_HP;
	}
}
class Dropship01 extends AirUnit implements Repairable{
	Dropship01(){
		super(100);
		hitPoint=MAX_HP;
	}
}

class Marine01 extends GroundUnit{
	Marine01(){
		super(40);
		hitPoint=MAX_HP;
	}
}

class Scv01 extends GroundUnit implements Repairable{
	Scv01(){
		super(60);
		hitPoint=MAX_HP;
	}
	void repair(Repairable r) {
		Unit01 u=(Unit01)r;
		while(u.hitPoint!=u.MAX_HP) {
			u.hitPoint++;
		}
	}
}