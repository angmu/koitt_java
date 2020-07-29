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
			System.out.println("Id와 password를 입력하세요.(대소문자 구별합니다)>>");
			System.out.print("id:");
			String id=scan.nextLine().trim();
			//******아이디를 읽어옴(있는지 없는지 확인)
			if(!(map.containsKey(id))) {
				System.out.println("입력한 id가없습니다.");
				continue;
			}
//			System.out.println(map.get(id));
			System.out.print("pw:");
			String pw=scan.nextLine().trim();
			//id를 너ㅠ
			//**value값이 나옴
			if(!(map.get(id).equals(pw))) {
			System.out.println("패스워드가 일치하지않음");
			continue;
			}else {
				System.out.println("로그인되었습니다.");
				break;
			}
			
		}//while
		System.out.println("시스템종료");
		
		
	}

}
