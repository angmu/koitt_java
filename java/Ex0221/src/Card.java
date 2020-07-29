
public class Card {
	//아래 생성자를 만드는 순간 자동생성이 안된다리..
	Card(){}
	
	Card(String k,int a){
	  	num=a;
	   	kind=k;
	    }
	Card(String k,String q){
	  	num_ch=q;
	   	kind=k;
	    }
	int num;//1~10 jqk
	String kind,num_ch;
	
}
