
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
		return "x좌표 :"+x+"y좌표:"+y;
	}
	
}

class Point3D extends Point{
	int z;
	
	Point3D(int x,int y,int z){
		super();//super 기본생성자가 없어서 에러가 남. 부모쪽에 생성자를 만들거나 super(x,y)로 바꿔야한다. 
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	String getLocation() {
		return  "x좌표 :"+x+"y좌표:"+y+"z좌표:"+z;
	}
	
	
}