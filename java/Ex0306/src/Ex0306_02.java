import java.util.*;
public class Ex0306_02 {
	//set..
	public static void main(String[] args) {
	
		HashSet set1=new HashSet();
		
		set1.add(new Integer(1));
		set1.add(new Integer(2));
		set1.add(new Integer(4));
		set1.add(new Integer(1));//중복이면 1개만 출력
		set1.add(new Integer(5));

		Iterator it=set1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//1번만 출력// 1번더 출력하고 싶으면 Iterator를 1개 더 선언해야한다.
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Iterator it1=set1.iterator();		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
	}

}
