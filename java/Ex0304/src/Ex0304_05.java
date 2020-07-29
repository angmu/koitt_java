import java.util.*;

public class Ex0304_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체에 저장
		// 1)회원입력하기
		// 2)회원출력하기

		// 회원입력받을때 id에 대문자 1개이상 포함, 5자리이상, 중복체크 필요
		// pw 특문 1개이상 길이 8자리이상
		// 주민번호>>-포함 14자리까지입력
		// 이메일>>@,. 있는지없는지 체크
		// 성별은 숫자 0,1만 입력
		// 출력시 gender가 0이면 남자, 1이면 여자
		Scanner scan = new Scanner(System.in);
		String id;
		String pw;
		String name;
		String s_number;// 주민번호
		int gender;// 성별 가공
		String gender1;// 성별
		String email;// 이메일
		String tel;// 전화번호
		int count = 0;
		ArrayList<Member> arr = new ArrayList<Member>();
		while (true) {
			System.out.println("회원관리 프로그램");
			System.out.println("1)회원입력    2)회원출력");
			int ch = scan.nextInt();
			scan.nextLine();
			switch (ch) {
			case 1:
				System.out.println("회원입력선택");
				loop2: while (true) {

					System.out.println("아이디를 입력하세요 (5자리이상 대문자 1개 포함, 이전메뉴 99)");
					id = scan.nextLine().trim();
					id = id.replaceAll(" ", "");
					
					
					
					
					// 아이디 중복체크
					if (!(arr.isEmpty())) {
						for (int i = 0; i < arr.size(); i++) {
							if (id.equals(arr.get(i).id)) {
								System.out.println("중복된 아이디 입니다.");
								continue loop2;
							}
						}
					}
					// 종료여부확인
					if (id.equals("99")) {
						break loop2;
					}
					// 5자리이상인지 확인
					if (!(id.length() >= 5)) {
						System.out.println("아이디는 5자리 이상이어야 합니다");
						continue;
					}

					// 대문자 있는지 확인
					count = 0;// 대문자 유무 변수
					for (int i = 0; i < id.length(); i++) {
						if (id.charAt(i) >= 'A' && id.charAt(i) <= 'Z') {
							count++;
						}
					}
					if (count == 0) {
						System.out.println("대문자가 1개이상 입력되어야 합니다.");
						continue;
					}

					loop3: while (true) {
						System.out.println("비밀번호를 입력하세요 (8자리 이상,특수문자 1개포함 )\n(입력가능특수문자: !,\",#,$,%,&,*)");
						pw = scan.nextLine().trim();
						pw = pw.replaceAll(" ", "");
						// 8자리 이상인지 확인
						if (!(pw.length() >= 8)) {
							System.out.println("비밀번호는 8자리 이상이어야 합니다.");
							continue loop3;
						}
						// 특수문자 있는지 확인
						count = 0;// 특수문자 유무 변수
						for (int i = 0; i < pw.length(); i++) {
							if (pw.charAt(i) >= '!' && pw.charAt(i) <= '&' || pw.charAt(i) == '*') {
								count++;
							}
						}
						if (count == 0) {
							System.out.println("특수문자가 1개이상 입력되어야 합니다.");
							continue loop3;
						}
						break;
					}
					System.out.println("이름을 입력하세요");
					name = scan.nextLine().trim();
					name = name.replaceAll(" ", "");
					loop4: while (true) {
						System.out.println("주민번호를 입력하세요 ('-'포함)");
						s_number = scan.nextLine().trim();
						s_number = s_number.replaceAll(" ", "");
						// 주민번호는 -포함해서 14자리다유
						if (!(s_number.length() >= 14)) {
							System.out.println("잘못된 주민번호 입니다");
							continue loop4;
						}
						// '-'의 유무
						if (s_number.indexOf("-") == -1) {
							System.out.println("'-'를 포함하여 다시 입력해주세요");
							continue loop4;
						}
						// '7'번째 자리가 1234에 해당 안되면 주민번호가 잘못된것으로 ...
						if (!(s_number.charAt(7) == '1' || s_number.charAt(7) == '2' || s_number.charAt(7) == '3'
								|| s_number.charAt(7) == '4')) {
							System.out.println("잘못된 주민번호 입니다");
							continue loop4;
						}
						break;
					}
					loop5: while (true) {
						System.out.println("성별을 입력하세요 (0:남자, 1:여자)");
						gender1 = scan.nextLine().trim();
						// 숫자 1개만 입력 길이가 1인지 확인한다.
						if (gender1.length() != 1) {
							System.out.println("잘못입력하였습니다. 숫자만 입력가능합니다.");
							continue loop5;
						}
						// 숫자로 변환
						gender = gender1.charAt(0) - '0';
						// 0,1인지 확인
						if (!(gender >= 0 && gender <= 1)) {
							System.out.println("0(남자)과 1(여자)만 입력가능합니다.");
							continue loop5;
						}
						break;
					}
					loop6: while (true) {
						System.out.println("이메일을 입력하세요  ('@','.'포함)");
						email = scan.nextLine().trim();
						email = email.replaceAll(" ", "");
						// @와 .이없으면 다시 입력..
						if (email.indexOf("@") == -1 || email.indexOf(".") == -1) {
							System.out.println("잘못된 이메일 형식입니다. @와.을 포함해서 다시 입력하세요");
							continue loop6;
						}
						break;
					}
					loop7: while (true) {
						System.out.println("전화번호를 입력하세요 ('-'포함)");
						tel = scan.nextLine().trim();
						tel = tel.replaceAll(" ", "");
						//-가 없으면 리턴
						if (tel.indexOf("-") == -1) {
							System.out.println("'-'를 포함하여 입력해주세요");
							continue loop7;
						}
						//자릿수가 031-000-0000일때 12자리 010-0000-0000일때 14자리다..
						if (!(tel.length() >= 12 && tel.length() <= 14)) {
							System.out.println("잘못된 번호입니다");
							continue loop7;
						}
						break;
					}
					//최종 배열에 넣기
					arr.add(new Member(id, pw, name, s_number, gender, email, tel));
				}

				break;

			case 2:

				System.out.println("회원정보 출력");
				if (arr.size() == 0) {
					System.out.println("입력된 회원정보가 없습니다.");
					break;
				}
				for (int i = 0; i < arr.size(); i++) {
					System.out.println(arr.get(i));

				}

				break;
			default:
				System.out.println("잘못된 번호 입력");
				continue;
			}

		}

	}

}
