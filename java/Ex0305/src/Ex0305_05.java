import java.util.ArrayList;
import java.util.Collections;

public class Ex0305_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();
//		ArrayList list2=new ArrayList();
//		Student stu1=new Student(1,"홍길동",300);
//		Student stu2=new Student(2,"이순신",299);
//		Student stu3=new Student(3,"김유신",280);
//		Student stu4=new Student(4,"유관순",270);
//		Student stu5=new Student(5,"강감찬",188);
//		
//		list2.add(stu3);		
//		list2.add(stu1);
//		list2.add(stu5);
//		list2.add(stu2);
//		list2.add(stu4);
//		
//		Collections.sort(list2);
//		Collections.reverse(list2);
//		for(int i=0;i<list2.size();i++) {
//			System.out.println(list2.get(i));
//		}
		
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(3));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		list.add(3,new Integer(7)); //<<3번방에 들어간다.. 이후 방들의 순서가 밀린다우... 3번방을 덮는게 아님..ㅠ
		list.remove(1);//1번째 방이 사라짐.. 이후 다른것들이 들어와서 자리를 채움
		list.add(5,new Integer(8)); //<<5번방에 들어간다.. 이후 방들의 순서가 밀린다우... 5번방을 덮는게 아님..ㅠ
		//오토박싱. 알아서 지가 8가지 객체타입으로 바꿨다.
		list.add(3);
//		
//		Collections.sort(list);
//		Collections.reverse(list);
//		list.add(stu1); //에러가 났다는것을 알려줌
		
		//기본형태면 출력이 값으로 나오게 되어있다.
		
//		for(int i=0;i<list.size();i++) {
//			list.remove(i);
//		}//이케하면 남는다..
		
//		for(int i=list.size()-1;i>=0;i--) {
//			list.remove(i);
//		}//이케하면 다 지워짐.
		
		//혹은 clear를하면 다 지울수있음
		list.clear();
		System.out.println(list);
	}

}
