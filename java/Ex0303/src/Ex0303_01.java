
public class Ex0303_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ��ũ �޵� 2�� 200,100
		//���� 4 ��ũ2 ���� 4 300,300 �̵�
		//�ͷ� 1��
		
		
		Unit[]u2=new Unit[10];
		
		u2[0]=new Vulture();
		u2[1]=new Vulture();
		u2[2]=new Vulture();
		u2[3]=new Vulture();
		u2[4]=new Tank();
		u2[5]=new Tank();
		u2[6]=new Marine();
		u2[7]=new Marine();
		u2[8]=new Dropship();
		u2[9]=new Medic();
		
		
		
		
		
		
//		Unit []u1=new Unit[6];
//		u1[0]=new Marine();
//		u1[1]=new Marine();
//		u1[2]=new Tank();
//		u1[3]=new Tank();
//		u1[4]=new Medic();
//		u1[5]=new Medic();
//		
//		for(int i=0;i<u1.length;i++) {
//			u1[i].move(200, 100);
//		}
//		
//		
//		Unit[]u2=new Unit[10];
//		
//		u2[0]=new Vulture();
//		u2[1]=new Vulture();
//		u2[2]=new Vulture();
//		u2[3]=new Vulture();
//		u2[4]=new Tank();
//		u2[5]=new Tank();
//		u2[6]=new Marine();
//		u2[7]=new Marine();
//		u2[8]=new Marine();
//		u2[9]=new Marine();
//		
//		for(int i=0;i<u2.length;i++) {
//			u2[i].move(300, 300);
//		}
//		
		
		
		
		
		
		
		//		Unit[] group = new Unit[10];
//		group[0] = new Marine();
//		group[1] = new Tank();
//		group[2] = new Dropship();
//		group[3] = new Medic();
//		group[4] = new Vulture();
//		group[5] = new Marine();
//
//		group[0].move(100, 100);

	}

}// class
class GroundUnit extends Unit{
	int transit;//�����Ҵ��� ���� ��
	
	
	GroundUnit(int transit){//�����Ҵ纯��
		this.transit=transit;
	}
	
	
	
	void move(int x, int y) {
		System.out.println();
	}
}
class Marine extends GroundUnit  implements Tran{
	Marine(){
		super(3);
	}
	void stimPack() {
	}
	void move(int x, int y) {
	}
}

class Tank extends GroundUnit  implements Tran{
	Tank(){
		super(4);
	}
	void move(int x, int y) {
	}
	void changMode() {
	}
}

class Dropship extends Unit{
	
	int transit_space;
	GroundUnit[]ground=new GroundUnit[7];//7�̵Ǹ� �¿�� ���ٿ�
	int i=0;
	
	void transport(Tran t) {
		if(t instanceof GroundUnit) {
			GroundUnit g=(GroundUnit)t;
			if((transit_space+=g.transit)<=7) {//7�̵Ǹ� �¿�� ���ٿ�
				System.out.println("�m���ϴ�");
				ground[i]=g;
				i++;
			}else{System.out.println("�����̾��� �¿�� �����ϴ�.");
			transit_space-=g.transit;}
		}
	}
	
	void move(int x, int y) {
	}

	void load() {
	}

	void unload() {
	}
}
