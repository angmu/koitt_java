
public class Ex0224_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
//		p1.serialNo=1;
		p1.color="white";
		p1.tvInch=42;
		p1.standard="lcd";
		
		Product p2=new Product();
//		p1.serialNo=2;
		p2.color="black";
		p2.tvInch=50;
		p2.standard="led";
		
		Product p3=new Product("red",70,"oled");
		
		System.out.println(p1.serialNo+"/"+p1.color);
		System.out.println(p2.serialNo+"/"+p2.color);
		System.out.println(p3.serialNo+"/"+p3.color);
	}

}
