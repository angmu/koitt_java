
public class Car {
	String color;
	String gearType;
	int door;
	
	Car(){
		this("��ũ","auto",5);
//		color="��ũ";
//		gearType="auto";
//		door=5;
	}
	
//	Car(){
//		color="��ũ";
//		gearType="auto";
//		door=5;
//	}
	
	//  ������ �켱���� >>���������� �ִ°��� ���� �����ϱ� ������ this�� ���־� �ν��Ͻ������� ���� ���� �ֵ��� �Ѵ�.
	Car(String color, String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
}
