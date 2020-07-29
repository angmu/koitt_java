import java.util.*;

public class Ex0306_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map=new HashMap();
		HashSet set1=new HashSet();
		ArrayList list=new ArrayList();
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		
		map.put("myid", "1234");
		map.put("dream", "d1111");
		map.put("aaa", "aoooo");
		map.put("bbb", "h1111");
		map.put("aaa", "axxxx");
		//앞쪽이 사라진다유
		
		//map에는 iterator가 없음
//		Iterator it=map.iterator();
		//set에는 iterator가 있음
//		Iterator it=set1.iterator();
//		map.entrySet();을 선언시 map이 set으로 바뀜
//		set1.add(map.entrySet());
		Iterator it=map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
	}
}
