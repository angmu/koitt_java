import java.util.*;

public class Ex0306_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set을 만들어서 4,6,57,3,2,10 저장후 출력
		//map을 만들어서 1,개 2,소 3,말 4,범 5,돼지 저장 후
		//로그인 형태를 만들어보세오
		//map 모두출력
		
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
		map1.put("1","개");
		map1.put("2","소");
		map1.put("3","말");
		map1.put("4","범");
		map1.put("5","돼지");
		
		
		while(true) {
			System.out.println("id를 입력하세오");
			String id=scan.nextLine();
			if(!(map1.containsKey(id))) {
				System.out.println("아이디가 존재하지 않습니다");
				continue;
			}
			System.out.println("비밀번호를 입력하세오");
			String pw=scan.nextLine();
			if(!(map1.get(id).equals(pw))) {
				System.out.println("비밀번호가 틀렸습니다");
				continue;
			}System.out.println("로그인 성공");
			break;
		}
		
		Iterator it2=map1.entrySet().iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	}

}
