
import java.util.Scanner;
public class Ex0219_copy {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// 1. 학생점수입력
			// 2. 학생수정
			// 3. 학생삯제
			// 4. 학생검색
			// 5. 등수처리
			// 6. 종료
			Scanner scan = new Scanner(System.in);
			Student[] stu = new Student[2];
			String name = "";

			while (true) {

				print();
				int s_input = scan.nextInt();
				scan.nextLine();
				switch (s_input) {

				case 1:
					inputArr(stu);
					break;
				case 2:
					System.out.println("학생수정을 선택했다요");
					System.out.println("학생이름을 입력해라요");
					name = scan.nextLine();
					loop1:
					for (int i = 0; i < stu.length; i++) {
						if (name.equals(stu[i].name)) {
							System.out.println(stu[i].name + "이 검색되었습니다. 수정할것을 고르세오");
							System.out.println("1)국어 2)영어 3)수학");
							switch (scan.nextInt()) {
							case 1:
								System.out.println("국어점수를 선택했다요");
								System.out.println("변경점수를 입력하세오");
								stu[i].kor = scan.nextInt();
								scan.nextLine();
								System.out.println("국어 점수" + stu[i].kor + "변경하였습니다");
								break loop1;
							case 2:
								System.out.println("영어점수를 선택했다요");
								System.out.println("변경점수를 입력하세오");
								stu[i].eng = scan.nextInt();
								scan.nextLine();
								System.out.println("영어 점수" + stu[i].eng + "변경하였습니다");
								break loop1;
							case 3:
								System.out.println("국어점수를 선택했다요");
								System.out.println("변경점수를 입력하세오");
								stu[i].math = scan.nextInt();
								scan.nextLine();
								System.out.println("수학 점수" + stu[i].math + "변경하였습니다");
								break loop1;
							default:
								System.out.println("잘못입력햇다요 1~3까지의 숫자만 입력하라요");
								continue;
							}
						}
						else{
								System.out.println("찾으려는 학생이 없다요");
							}
						}
					

					break;
				case 3:
					System.out.println("학생삭제을 선택했다요");
					break;
				case 4:
					System.out.println("학생검색을 선택했다요");
					break;
				case 5:
					System.out.println("등수처리를 선택했다요");
					break;
				case 6:
					System.out.println("종료하겠다요");
					break;
				default:
					System.out.println("잘못입력햇다요 1~6까지의 숫자만 입력하라요");
					continue;

				}

			}

		}// main
		
		

		static void print() {
			System.out.println("==============");
			System.out.println("  성적처리프로그램");
			System.out.println("==============");
			System.out.println("1)학생점수입력 2)학생수정 3)학생삭제 4)학생검색 5)등수처리 6)종료");
			System.out.println("원하는 메뉴를 입력하라요>>>");
		}

		static void inputArr(Student[] stu) {
			Scanner scan = new Scanner(System.in);
			System.out.println("학생입력을 선택했다요");
			String name = "";
			int kor = 0, eng = 0, math = 0;
			String select_stu = "";
			for (int i = 0; i < stu.length; i++) {
				System.out.println("이름을 넣어라요");
				name = scan.nextLine();
				System.out.println("국어점수를 넣어라요");
				kor = scan.nextInt();
				System.out.println("영어점수를 넣어라요");
				eng = scan.nextInt();
				System.out.println("수학점수를 넣어라요");
				math = scan.nextInt();
				scan.nextLine();
				stu[i] = new Student(name, kor, eng, math);
//				System.out.println(stu[i].name+stu[i].total+" "+stu[i].avg);
			}
		}
	}//class

class Student {
	
	Student(){
		
	}
	
	Student(String n,int k, int e, int m){
		name=n;
		kor=k;
		eng=e;
		math=m;
		total=kor+eng+math;
		avg=total/3.0;
	}
	//초기화때 평균과 합계도 넣어놔서 편하다요
	
	
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	
}
