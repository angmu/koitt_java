import java.util.*;

public class Ex0306_03 {
	//map
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		HashMap map=new HashMap();
		map.put("myid","1234");
		map.put("aaa","1234");
		map.put("koitt", "k0001");
		map.put("bbb", "1111");
//		map.put("aaa","1111");
		map.put("dream","d0001");
		
		while(true) {
			System.out.println("Id�� password�� �Է��ϼ���.(��ҹ��� �����մϴ�)>>");
			System.out.print("id:");
			String id=scan.nextLine().trim();
			//******���̵� �о��(�ִ��� ������ Ȯ��)
			if(!(map.containsKey(id))) {
				System.out.println("�Է��� id�������ϴ�.");
				continue;
			}
//			System.out.println(map.get(id));
			System.out.print("pw:");
			String pw=scan.nextLine().trim();
			//id�� �ʤ�
			//**value���� ����
			if(!(map.get(id).equals(pw))) {
			System.out.println("�н����尡 ��ġ��������");
			continue;
			}else {
				System.out.println("�α��εǾ����ϴ�.");
				break;
			}
			
		}//while
		System.out.println("�ý�������");
		
		
	}

}
