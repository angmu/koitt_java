
public class Condi extends Product{
	static int count3=3000;
	int product_n;
//	int price=900;
	
	//초기화
	{
		product_n=++count3;//1001부터~~
	}
	
	//생성자
	Condi(){
		name="에어컨";
		price=900;
		buy=0;
	}
}
