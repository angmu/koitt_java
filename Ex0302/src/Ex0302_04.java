
public class Ex0302_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine m1=new Marine();
		m1.move(10, 10);
		///������
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


//1.�߰�ȣ����(abstract) >>2. class���� abstract��� �������
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
		System.out.println(x+","+y+": ������ġ���� ����");
	}
}


class Marine extends Unit{
//	int x,y;
	//�ӵ� 6
	void move(int x,int y) {
		time=x*6+y*6;
		hour=time/3600;
		minute=time%3600/60;
		second=time%3600%60;
//		System.out.println(x+","+y+": ������ ������ /�ӵ� :6");
		System.out.println("��ǥ"+x+","+y);
		System.out.println("������ �Ÿ�:"+(x+y));
		System.out.println("�ɸ��� �ð�:"+hour+"��"+minute+"��"+second+"��");
	}
//	void stop() {
//		
//	}
	void stimpack() {
		
	}
}


class Tank extends Unit{
//	int x,y;
	//�ӵ� 5
	void move(int x,int y) {
		time=x*4+y*4;
		hour=time/3600;
		minute=time%3600/60;
		second=time%3600%60;
		
		System.out.println("��ǥ"+x+","+y);
		System.out.println("������ �Ÿ�:"+(x+y));
		System.out.println("�ɸ��� �ð�:"+hour+"��"+minute+"��"+second+"��");
		
	}
//	void stop() {
//		
//	}
	void changeMode() {
		
	}
}

class Dropship extends Unit{
//	int x,y;
	//�ӵ� 10
	void move(int x,int y) {
		time=(int)Math.sqrt(x*x+y*y)*10;
		hour=time/3600;
		minute=time%3600/60;
		second=time%3600%60;
		System.out.println("��ǥ"+x+","+y);
		System.out.println("������ �Ÿ�:"+(int)Math.sqrt(x*x+y*y));
		System.out.println("�ɸ��� �ð�:"+hour+"��"+minute+"��"+second+"��");
	}
//	void stop() {
//		
//	}
	void load() {
		
	}
	void unload() {
		
	}
}