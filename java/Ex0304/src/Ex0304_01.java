
public class Ex0304_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person(88801046648L);
		Person p2=new Person(88801046648L);
		
		System.out.println("p1의 값"+p1);
		System.out.println("p2의 값"+p2);
		
		System.out.println();
	}

}
class Person{
	long id;
	Person(){}
	Person(long id){
		this.id=id;
	}
	public boolean equals(Object obj) {
		if(obj!=null&& obj instanceof Person){
			Person p=(Person)obj;
			if(id==p.id) {
				return true;
			}
//			return p.id;
		}else {
			return false;
		}
		return false;
	}
	public String toString() {
		return "변수값:"+id;
	}
}