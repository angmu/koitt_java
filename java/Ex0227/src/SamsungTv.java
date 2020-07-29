
public class SamsungTv extends Product{
	static int count=1000;
	int product_n;
	
//	int tvInch;
//	int price=1000;
	
	//초기화
	{
		product_n=++count;//1001부터~~
	}
	
	//생성자
	SamsungTv(){
		name="lcdTV";
		price=1000;
		buy=0;
//		this("삼성허브HD모니터",16,1800000);
	}
//	SamsungTv(String name,int tvInch,int price){
//		this.name=name;
//		this.tvInch=tvInch;
//		this.price=price;
//	}
	public String toString() {
		return "";
	}
}
