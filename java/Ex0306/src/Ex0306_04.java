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
		//������ ���������
		
		//map���� iterator�� ����
//		Iterator it=map.iterator();
		//set���� iterator�� ����
//		Iterator it=set1.iterator();
//		map.entrySet();�� ����� map�� set���� �ٲ�
//		set1.add(map.entrySet());
		Iterator it=map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
	}
}
