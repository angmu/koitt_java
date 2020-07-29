
public class Ex0304_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		People p1=new People(1001);
		People p2=new People(1001);
		//equals 메소드를 사용해서 비교를 해보세요
		
		System.out.println(p1.equals(p2));//등가비교연산자p1==p2?와 같다리 오버라이딩 안하면 주소값이 달라서 다르다고 나온다.
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
