import java.util.ArrayList;
import java.util.Scanner;

public class Ex0303_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1)학생정보입력 학번/이름/과/학년/
//		2)학생성적처리입력 학번입력시 찾음>>국어 영어 합계 평균 등수를 구함 (이름은 자동적으로 입력._
//		3)학생정보출력(모두)
//		4)학생성적출력(모두)
//		5)학생정보검색
//		6)학생성적검색
		// ArrayList 사용
		// Student, Stu_score 객체 사용
		// 학번이 없으면 다시 반환.

		Scanner scan = new Scanner(System.in);
		ArrayList<Student> a = new ArrayList<Student>();
		ArrayList<Stu_score> b = new ArrayList<Stu_score>();

		loop: while (true) {

			System.out.println("학생성적처리프로그램 (종료0)");
			System.out.println("=============");
			System.out.println("1)학생정보입력	2)학생성적입력	3)학생정보출력");
			System.out.println("4)학생성적출력	5)학생정보검색	6)학생성적검색");
			System.out.println("원하는 메뉴의 번호를 입력하세요>>>");
			int selec = scan.nextInt();
			scan.nextLine();
			switch (selec) {
			case 0:
				System.out.println("프로그햄 종료");
				break loop;
			case 1:
				System.out.println("학생정보입력을 선택 ");
				loop2: while (true) {
					System.out.println("이름을 입력하세요 (이전화면 99)");
					String name = scan.nextLine();
					if (name.equals("99")) {
						System.out.println("이전화면으로 돌아갑니다.");
						break loop2;
					}
					System.out.println("학과를 입력하세요");
					String major = scan.nextLine();
					System.out.println("학년을 입력하세요");
					int grade = scan.nextInt();
					scan.nextLine();
					a.add(new Student(name, major, grade));
				}
				break;
			case 2:
				if (a.isEmpty()) {
					System.out.println("학생정보가 없습니다. 학생정보부터 입력하세요");
					break;
				}
				System.out.println("학생성적 입력을 선택 (이전화면 99)");
				System.out.println("성적을 입력할 학생의 학번을 입력하세요");
				int ch=scan.nextInt();
				for (int i = 0; i < a.size(); i++) {
					if (ch== a.get(i).hak_num) {
						System.out.println(a.get(i).name + "의 국어성적을 입력하세요");
						int kor = scan.nextInt();
						System.out.println(a.get(i).name + "의 영어성적을 입력하세요");
						int eng = scan.nextInt();
						b.add(i, new Stu_score(kor, eng));
						b.get(i).name = a.get(i).name;
						b.get(i).hak_num = a.get(i).hak_num;
						continue loop;
					}

				}
				System.out.println("일치하는 학번이 없습니다. 이전화면으로 돌아갑니다.");
				continue loop;
			case 3:
				if (a.isEmpty()) {
					System.out.println("학생정보가 없습니다. 학생정보부터 입력하세요");
					break;
				}
				System.out.println("학생정보를 출력합니다.");
				for (int i = 0; i < a.size(); i++) {
					System.out.println((Student) a.get(i));
				}
				break;
			case 4:
				if (a.isEmpty()||b.isEmpty()) {
					System.out.println("학생정보가 없습니다. 학생정보부터 입력하세요");
					break;
				}
				System.out.println("학생성적을 출력합니다.");
				for (int i = 0; i < b.size(); i++) {
					System.out.println((Stu_score) b.get(i));
				}
				break;
			case 5:
				if (a.isEmpty()) {
					System.out.println("학생정보가 없습니다. 학생정보부터 입력하세요");
					break;
				}
				System.out.println("학생정보검색을 선택(이전화면 99)");
				System.out.println("검색할 학생의 학번을 입력하세요");
				int select = scan.nextInt();
				if (select == 99) {
					System.out.println("이전화면으로 돌아갑니다");
					break;
				}
				for (int i = 0; i < a.size(); i++) {
					if (select == a.get(i).hak_num) {
						System.out.println((Student) a.get(i));
						continue loop;
					}
				}
				System.out.println("일치하는 학생이 없습니다.");

				break;
			case 6:
				if (a.isEmpty()) {
					System.out.println("학생정보가 없습니다. 학생정보부터 입력하세요");
					break;
				}
				System.out.println("학생성적검색을 선택(이전화면 99)");
				System.out.println("검색할 학생의 학번을 입력하세요");
				int select1 = scan.nextInt();
				if (select1 == 99) {
					System.out.println("이전화면으로 돌아갑니다");
					break;
				}
				for (int i = 0; i < b.size(); i++) {
					if (select1 == b.get(i).hak_num) {
						System.out.println((Stu_score) b.get(i));
						continue loop;
					}
				}
				System.out.println("일치하는 학생이 없습니다.");
				break;
			default:
				System.out.println("잘못된 번호를 입력하엿습니다.");
				continue;
			}

		}

	}// main

}// class

class Student {
	int hak_num;
	static int count;
	String name;
	String major;
	int grade;
	{
		hak_num = ++count;
	}

	Student() {
		
	}

	Student(String name, String major, int grade) {
		this.name = name;
		this.major = major;
		this.grade = grade;
	}

	public String toString() {
		return hak_num + " " + name + " " + major + " " + grade + "학년";
	}
}

class Stu_score extends Student {
	int kor;
	int eng;
	int total;
	double avg;
	int rank;

	Stu_score() {
		this(0,0);
	}

	Stu_score(int kor, int eng) {
		super("홍길동", "법학과", 2);
		this.kor = kor;
		this.eng = eng;
		total = kor + eng;
		avg = total / 2.0;
	}

	public String toString() {
		return hak_num + " " + name + " 국어점수:" + kor + " 영어점수:" + eng + " 합계:" + total + " 평균:" + avg;
	}
}