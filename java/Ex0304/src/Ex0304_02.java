
public class Ex0304_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		People p1=new People(1001);
		People p2=new People(1001);
		//equals �޼ҵ带 ����ؼ� �񱳸� �غ�����
		
		System.out.println(p1.equals(p2));//��񱳿�����p1==p2?�� ���ٸ� �������̵� ���ϸ� �ּҰ��� �޶� �ٸ��ٰ� ���´�.
	}

}

class People{
	int stu_number;
	People(){}
	People(int stu_number){
		this.stu_number=stu_number;
	}
	
	
	public boolean equals(Object obj) {
		if(obj!=null&&obj instanceof People) {
			return true;
		}
		
		return false;
	}
}
