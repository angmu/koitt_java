//이거슨 냉장고 입니다.
public class Ref extends Product {
	static int count2=2000;
	int product_n;
//	int price=1500;
	
	//초기화
	{
		product_n=++count2;//1001부터~~
	}
	
	//생성자
	Ref(){
		name="냉장고";
		price=1500;
		buy=0;
	}
}
