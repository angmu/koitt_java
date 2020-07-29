import java.util.ArrayList;
import java.util.HashMap;

public class Main_mall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] testid= {"admin","aaa","bbb","ccc"};
		String[] testpw= {"1234","aaa","bbb","ccc"};
		String[] testname= {"관리자","홍길동","이순신","김유신"};
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
				System.out.println("프로그램 종료");
				return;
			case 1:
				System.out.println("회원가입을 선택");
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
				System.out.println("즐거운 쇼핑 다잇소");
				m.buy(map, m1);
				break;
			case 5:
				System.out.println("구매내역 출력");
				m.printbuy(map, m1);
				break;
			case 8:
				System.out.println("회원검색");
				m.memsearch(map,m1);
				break;
			case 9:
				System.out.println("회원정보보기");
				m.memprint(map,m1);
				break;
			default:
				System.out.println("잘못된번호 입력");
				break;
			}
		}
		}

}
