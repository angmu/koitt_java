
public class Product {
	static int count;
	int serialNo;
	String color;//white black red
	int tvInch; //42 50 72
	String standard; //lcd, led oled
	
	//�ν��Ͻ� ȣ��ȭ�� >>�����ڿ� �������� ��Ұ� ������ ���.
	{++count;
	serialNo=count;
			}
	
	//������ü�� ������
	Product(){
//		count++;
//		serialNo=count;
	}

	Product(String color,int tvInch,String standard){
		//������ �Ⱦ��� �ȳ��´�
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
