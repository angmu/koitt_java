
public class Ex0226_02 extends Object{
	Ex0226_02(){
	super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point(100,140);
		System.out.println(p.getClass());
	}

}
class Point extends Object{
	int x;
	int y;
	
	Point(){}
	
	Point(int x,int y){
		super();
		this.x=x;
		this.y=y;
	}
	
	String getLocation() {
		return "x��ǥ :"+x+"y��ǥ:"+y;
	}
	
}

class Point3D extends Point{
	int z;
	
	Point3D(int x,int y,int z){
		super();//super �⺻�����ڰ� ��� ������ ��. �θ��ʿ� �����ڸ� ����ų� super(x,y)�� �ٲ���Ѵ�. 
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	String getLocation() {
		return  "x��ǥ :"+x+"y��ǥ:"+y+"z��ǥ:"+z;
	}
	
	
}