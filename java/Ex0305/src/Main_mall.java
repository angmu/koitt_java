import java.util.ArrayList;
import java.util.HashMap;

public class Main_mall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] testid= {"admin","aaa","bbb","ccc"};
		String[] testpw= {"1234","aaa","bbb","ccc"};
		String[] testname= {"������","ȫ�浿","�̼���","������"};
		String[] testtel= {"010-0000-0000","010-1111-1111","010-2222-2222","010-3333-3333"};
		
		ArrayList<Member> m1 = new ArrayList<Member>();
		HashMap map =new HashMap();
		for(int i=0;i<testid.length;i++) {
			m1.add(new Member(testid[i],testpw[i],testname[i],testtel[i]));
		}
		Mall_excute m=new Mall_excute();
		int choice;
		
		while(true) {
			switch(choice=m.print()) {
			case 0:
				System.out.println("���α׷� ����");
				return;
			case 1:
				System.out.println("ȸ�������� ����");
				m.join(m1);
				System.out.println(m1);
				break;
			case 2:
				m.login(map,m1);
				break;
			case 3:
				m.logout(map, m1);
				break;
			case 4:
				System.out.println("��ſ� ���� ���ռ�");
				m.buy(map, m1);
				break;
			case 5:
				System.out.println("���ų��� ���");
				m.printbuy(map, m1);
				break;
			case 8:
				System.out.println("ȸ���˻�");
				m.memsearch(map,m1);
				break;
			case 9:
				System.out.println("ȸ����������");
				m.memprint(map,m1);
				break;
			default:
				System.out.println("�߸��ȹ�ȣ �Է�");
				break;
			}
		}
		}

}
