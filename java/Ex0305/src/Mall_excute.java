import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Mall_excute {
	Mall_excute() {
	}

	static int print() {
		Scanner scan = new Scanner(System.in);
		System.out.println("쇼핑몰 프로그램");
		System.out.println("-----------");
		System.out.println("1)회원가입   2)로그인   3)로그아웃   4)상품보기   5)구매내역출력");
		System.out.println("8)회원검색   9)회원정보보기");
		System.out.println("원하는 메뉴번호를 입력하세오 (종료 0)>>>>");
		int choice = scan.nextInt();
		scan.nextLine();
		return choice;

	}

	// 1.회원가입 메소드
	static void join(ArrayList<Member> m) {
		String pw;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("아이디를 입력해주세요");
			String id = scan.nextLine();
			if (id.length() < 3) {
				System.out.println("아이디는 3자리 이상이어야 합니다");
				continue;
			}
			while (true) {
				System.out.println("비밀번호를 입력해주세요");
				pw = scan.nextLine();
				System.out.println("비밀번호를 다시한번 입력해주세요");
				String pw2 = scan.nextLine();
				if (!(pw.equals(pw2))) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력>>");
					continue;
				}
				break;
			}
			System.out.println("이름을 입력하세요");
			String name = scan.nextLine();
			System.out.println("전화번호를 입력하세요");
			String tel = scan.nextLine();
			m.add(new Member(id, pw, name, tel));
			break;
		}
	}

	// 2.로그인 메소드
	static void login(HashMap a, ArrayList<Member> m) {
		if (!(a.isEmpty())) {
			System.out.println("이미 로그인 되어있습니다");
			return;
		}
		Scanner scan = new Scanner(System.in);
		boolean voo = false;
		while (true) {
			System.out.println("아이디를 입력하세요");
			String id = scan.nextLine().trim();
			for (int i = 0; i < m.size(); i++) {
				if (m.get(i).id.equals(id)) {
					System.out.println("비밀번호를 입력하세요");
					String pw = scan.nextLine().trim();
					if (!(m.get(i).pw.equals(pw))) {
						System.out.println("비밀번호가 일치하지 않습니다.");
						i--;
						continue;
					}
					a.put(id, pw);
					voo = true;
					break;
				}
			}
			if (voo == true) {
				System.out.println("로그인 성공");
				return;
			}
			System.out.println("로그인 실패");
			return;
		}
	}

	// 3.로그아웃 메소드
	static void logout(HashMap a, ArrayList<Member> m) {
		Scanner scan = new Scanner(System.in);
		if (a.isEmpty()) {
			System.out.println("로그인 후에 이용가능합니다");
			return;
		} else {
			System.out.println("정말로 로그아웃 하시겠습니까? 1)yes 2)no");
			String ch2 = scan.nextLine();
			if (ch2.equals("1") || ch2.equals("y") || ch2.equals("Y")) {
				for (int i = 0; i < m.size(); i++) {
					if (a.containsKey(m.get(i).id)) {
						a.remove(m.get(i).id);
						System.out.println("로그아웃되었습니다.");
						return;
					}
				}
			} else if (ch2.equals("2") || ch2.equals("n") || ch2.equals("N")) {
				System.out.println("이전화면으로 돌아갑니다");
				return;
			} else {
				System.out.println("잘못된입력입니다");
				return;
			}
		}
	}

	// 4.상품구매
	static void buy(HashMap a, ArrayList<Member> m) {
		Scanner scan = new Scanner(System.in);
		if (a.isEmpty()) {
			System.out.println("로그인 후에 이용가능합니다");
			return;
		} else {
			for (int i = 0; i < m.size(); i++) {
				if (a.containsKey(m.get(i).id)) {
					while (true) {
						System.out.println("1)LCDTV   2)LEDTV   3)OLEDTV   4)일반냉장고    5)양문형냉장고");
						System.out.println("6)통돌이세탁기   7)드럼세탁기   9)드럼건조세탁기");
						System.out.println("구매하실 상품의 번호를 입력하세오 (종료 0)>>>>");
						int ch = scan.nextInt();
						switch (ch) {
						case 0:
							System.out.println("이전메뉴로 돌아갑니다");
							return;
						case 1:
							m.get(i).buy(new LCD());
							break;
						case 2:
							m.get(i).buy(new LED());
							break;
						case 3:
							m.get(i).buy(new OLED());
							break;
						case 4:
							m.get(i).buy(new Liter());
							break;
						case 5:
							m.get(i).buy(new Double());
							break;
						case 6:
							m.get(i).buy(new Tong());
							break;
						case 7:
							m.get(i).buy(new Drum());
							break;
						case 8:
							m.get(i).buy(new DrumDry());
							break;
						default:
							System.out.println("잘못된 번호입력");
							continue;
						}
					}
				}
			}
		}
	}

	// 5.구매목록 출력
	static void printbuy(HashMap a, ArrayList<Member> m) {
		if (a.isEmpty()) {
			System.out.println("로그인 후에 이용가능합니다");
			return;
		}
		// 관리자 로그인
		String admin = "admin";
		if (a.containsKey(admin)) {
			for (int i = 0; i < m.size(); i++) {
				if(m.get(i).buy_count==0) {
					continue;
				}
				System.out.println("ID:"+m.get(i).id+" 이름:"+m.get(i).name);
				m.get(i).printbuy();
			}
		}
		// 일반회원
		else {
			for (int i = 0; i < m.size(); i++) {
				if (a.containsKey(m.get(i).id)) {
					m.get(i).printbuy();
					break;
				}
			}
		}
	}

	// 8.회원검색
	static void memsearch(HashMap a, ArrayList<Member> m) {
		Scanner scan = new Scanner(System.in);
		// 이름검색
		System.out.println("검색할 키워드를 입력하세요");
		String search = scan.nextLine().trim();
		boolean boo = false;
		for (int i = 0; i < m.size(); i++) {
			if (m.get(i).name.contains(search)) {
				System.out.println(m.get(i));
				boo = true;
			}
		}
		if (boo == true) {
			return;
		}
		System.out.println("일치하는 회원이 없습니다");
		return;
	}

	// 9.회원출력
	static void memprint(HashMap a, ArrayList<Member> m) {
		if (a.isEmpty()) {
			System.out.println("로그인 후에 이용가능합니다");
			return;
		}
		Scanner scan = new Scanner(System.in);
		// 관리자 로그인
		String admin = "admin";
		if (a.containsKey(admin)) {
			int count = 0;
			while (count != 1) {
				System.out.println("1)입력순 출력   2)아이디순 출력   3)이름순 출력");
				System.out.println("출력타입을 고르세요>> ");
				int ch = scan.nextInt();
				switch (ch) {
				case 1:
					// 입력순 출력
					for (int i = 0; i < m.size(); i++) {
						System.out.println(m.get(i));
					}
					count++;
					break;
				case 2:
					// 아이디순 출력
					Collections.sort(m, new Comparator<Member>() {
						public int compare(Member a, Member b) {
							return a.id.compareTo(b.id);
						}
					});
					for (int i = 0; i < m.size(); i++) {
						System.out.println(m.get(i));
					}
					count++;
					break;
				case 3:
					// 이름순 출력
					Collections.sort(m, new Comparator<Member>() {
						public int compare(Member a, Member b) {
							return a.name.compareTo(b.name);
						}
					});
					for (int i = 0; i < m.size(); i++) {
						System.out.println(m.get(i));
					}
					count++;
					break;
				default:
					System.out.println("잘못골랐습니다.");
					continue;

				}
			}
		}
		// 일반회원 출력
		else {
			for (int i = 0; i < m.size(); i++) {
				if (a.containsKey(m.get(i).id)) {
					System.out.println(m.get(i));
					break;
				}
			}
		}
	}
}
