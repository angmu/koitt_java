import java.util.*;

public class Ex0306_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set�� ���� 4,6,57,3,2,10 ������ ���
		//map�� ���� 1,�� 2,�� 3,�� 4,�� 5,���� ���� ��
		//�α��� ���¸� ��������
		//map ������
		
		HashSet set1=new HashSet();
		set1.add(4);
		set1.add(6);
		set1.add(57);
		set1.add(3);
		set1.add(2);
		set1.add(10);
		
		Iterator it=set1.iterator();
		System.out.println(set1);
		Scanner scan=new Scanner(System.in);
		HashMap map1=new HashMap();
		map1.put("1","��");
		map1.put("2","��");
		map1.put("3","��");
		map1.put("4","��");
		map1.put("5","����");
		
		
		while(true) {
			System.out.println("id�� �Է��ϼ���");
			String id=scan.nextLine();
			if(!(map1.containsKey(id))) {
				System.out.println("���̵� �������� �ʽ��ϴ�");
				continue;
			}
			System.out.println("��й�ȣ�� �Է��ϼ���");
			String pw=scan.nextLine();
			if(!(map1.get(id).equals(pw))) {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
				continue;
			}System.out.println("�α��� ����");
			break;
		}
		
		Iterator it2=map1.entrySet().iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	}

}
