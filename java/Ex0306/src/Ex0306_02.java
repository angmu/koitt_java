import java.util.*;
public class Ex0306_02 {
	//set..
	public static void main(String[] args) {
	
		HashSet set1=new HashSet();
		
		set1.add(new Integer(1));
		set1.add(new Integer(2));
		set1.add(new Integer(4));
		set1.add(new Integer(1));//�ߺ��̸� 1���� ���
		set1.add(new Integer(5));

		Iterator it=set1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//1���� ���// 1���� ����ϰ� ������ Iterator�� 1�� �� �����ؾ��Ѵ�.
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Iterator it1=set1.iterator();		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
	}

}
