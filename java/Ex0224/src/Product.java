
public class Product {
	static int count;
	int serialNo;
	String color;//white black red
	int tvInch; //42 50 72
	String standard; //lcd, led oled
	
	//인스턴스 호기화블럭 >>생성자에 공통적인 요소가 있을때 사용.
	{++count;
	serialNo=count;
			}
	
	//모은객체가 공통사용
	Product(){
//		count++;
//		serialNo=count;
	}

	Product(String color,int tvInch,String standard){
		//독같이 안쓰면 안나온다
//		count++;
//		serialNo=count;
		//
		this.color=color;
		this.standard=standard;
		this.tvInch=tvInch;
		
	}
	Product(String color){
//		count++;
//		serialNo=count;
	}
	
	
}
