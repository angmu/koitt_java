import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Excute_stu implements Excute {

	@Override //메뉴입력
	public int menuPrint() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("성적처리 시스템");
		System.out.println("1)학생입력	2)성적출력 3)학생검색 4)등수확인");
		System.out.println("원하는 메뉴를 입력하세요. (종료: 0)");
		int select = scan.nextInt();
		scan.nextLine();
		return select;
	}

	@Override //학생입력
	public void putstu(ArrayList<Student> a) {
		// TODO Auto-generated method stub
		int math = 0;
		int kor = 0;
		int eng = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("학생의 이름을 입력하세요");
		String name = scan.nextLine();
		kk:
		for (int i = 0; i < 1; i++) {
			System.out.println(name + "의 국어 성적을 입력하세요");
			String kor1 = scan.nextLine();
			for(int c=0;c<kor1.length();c++) {
				if(!(kor1.charAt(c)>='0'&&kor1.charAt(c)<='9')||!(Integer.parseInt(kor1) >= 0 && Integer.parseInt(kor1) <= 100)) {
					System.out.println("점수를 잘못입력하였습니다. 0~100까지의 숫자만 입력가능합니다");
					i--;
					continue kk;
				}
			}kor=Integer.parseInt(kor1);
			ee:
			for (int j = 0; j < 1; j++) {
				System.out.println(name + "의 영어 성적을 입력하세요");
				String eng1 = scan.nextLine();
				for(int c=0;c<eng1.length();c++) {
					if(!(eng1.charAt(c)>='0'&&eng1.charAt(c)<='9')||!(Integer.parseInt(eng1) >= 0 && Integer.parseInt(eng1) <= 100)) {
						System.out.println("점수를 잘못입력하였습니다. 0~100까지의 숫자만 입력가능합니다");
						j--;
						continue ee;
					}
				}eng=Integer.parseInt(eng1);
				mm:
				for (int k = 0; k < 1; k++) {
					System.out.println(name + "의 수학 성적을 입력하세요");
					String math1 = scan.nextLine();
					for(int c=0;c<math1.length();c++) {
						if(!(math1.charAt(c)>='0'&&math1.charAt(c)<='9')||!(Integer.parseInt(math1) >= 0 && Integer.parseInt(math1) <= 100)) {
							System.out.println("점수를 잘못입력하였습니다. 0~100까지의 숫자만 입력가능합니다");
							k--;
							continue mm;
						}
					}math=Integer.parseInt(math1);
				}
			}
		}
		a.add(new Student(name, kor, eng, math));
	}

	@Override //성적출력
	public void stuPrint(ArrayList<Student> a,HashMap<String,String>b) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String id; String pw;
		System.out.println("성적출력을 선택");
		System.out.println("관리자 로그인이 필요합니다.(이전화면 0)");
		System.out.println("아이디를 입력하세요");
		id=scan.nextLine();
		if(id.equals("0")) {
			System.out.println("이전화면으로 돌아갑니다");
			return;
		}else {
		System.out.println("패스워드를 입력하세요");
		pw=scan.nextLine();
		if(!(b.containsKey(id)&&b.containsValue(pw))) {
			System.out.println("아이디 혹은 비밀번호가 틀립니다.");
			return;
		}System.out.println("로그인 성공!");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("성적출력완료 자동 로그아웃 됩니다.");
		}
	}

	@Override //등수출력 및 입력
	public void rank(ArrayList<Student> a) {
		// TODO Auto-generated method stub
		System.out.println("등수출력을 선택");
		for (int i = 0; i < a.size(); i++) {
			int rank_index = 1;
			for (int j = 0; j < a.size(); j++) {
				if (a.get(i).total < a.get(j).total) {
					rank_index++;
				}
			}
			a.get(i).rank = rank_index;
		}

		for (int i = 0; i < a.size(); i++) {
			System.out.print("학번:"+a.get(i).hak_num + "\t이름:" + a.get(i).name + "\t등수:" + a.get(i).rank + "등");
			System.out.println();
		}
	}

	@Override //학생검색
	public void search(ArrayList<Student> a) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("학생검색 선택");
		System.out.println("검색할 이름을 입력하세요");
		String sech = scan.nextLine();
		boolean boo = false;

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).name.contains(sech)) {
				System.out.println(a.get(i));
				boo = true;
			}
		}
		if (boo == true) {
			return;
		} else {
			System.out.println("일치하는 이름이 없습니다.");
		}
	}

}
