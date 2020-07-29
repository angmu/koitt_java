import java.util.Scanner;

public class Ex0219_06 {

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
		int kor = 0, eng = 0, math = 0;
		String select_stu = "";

		while (true) {

			print();
			int s_input = scan.nextInt();
			scan.nextLine();
			switch (s_input) {

			case 1:
				System.out.println("학생입력을 선택했다요");

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
//					System.out.println(stu[i].name+stu[i].total+" "+stu[i].avg);
				}
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

		// 로또
//		Lotto[] l=new Lotto[45];
//		for(int i=0;i<l.length;i++) {
//			//만들면서 값을 넣을수있다요. (공간차지를 덜함)
//			l[i]=new Lotto(i+1);
//		}
		// 아래꺼를 위처험 줄일수잇심
//		
//		for(int i=0;i<l.length;i++) {
//			l[i]=new Lotto(i+1);
//			l[i].number=i+1;
//		}

		// 카드
		// Card 클래스를 13개의 배열을 만들어서
		// 1~13까지 숫자를 집어넣고 클로버
		// 만들어보세오
//		String[] kind= {"클로버","다이아몬드","하트","스페이스"};
//		
//		Card[]c3=new Card[52];
//		for(int j=0;j<kind.length;j++) {
//			for(int i=0;i<13;i++) {
//				c3[i]=new Card();
//				c3[i].number=i+1;
//				c3[i].kind=kind[j];
//				
//				System.out.println(c3[i].kind+" "+c3[i].number);
//			}
//		}
//		
//		
//		
//		
//		

//		String[] kind= {"클로버","다이아몬드","하트","스페이스"};
//		
//		Card[]c2=new Card[52];
//		for(int i=0;i<kind.length;i++) {
//			for(int j=0;j<13;j++) {
////				c2[(i*13)+j]=new Card(j+1,kind[i]);
//				c2[j]=new Card(j+1,kind[i]);
//				System.out.println(c2[j].kind+" "+c2[j].number);
//			}
//		}
//		

//		Card[] c1=new Card[13];
//		
//		for(int i=0;i<c1.length;i++) {
//			c1[i]=new Card(i+1,"클로버");
//			
//			System.out.println(c1[i].kind+" "+c1[i].number);
//		}

//		System.out.println(c1.number+" "+c1.kind);

//		Card c2=new Card();
		// a.만약 정의된것이 없다면 Card(){} 라고 자바머신이 알아서 넣어줘서 에러가 안나지만 만든상태서 빈공백으로 하면 에러가난다요..해서
		// 다른생성자를 만들었다면 기본생성자를 넣어주는 거이 좋다요

		// 위처럼 변경
//		Card c1=new Card();
//		c1.number=10;
//		c1.kind="클로버";
//		System.out.println(c1.number+" "+c1.kind);
//		

	}// main

	static void print() {
		System.out.println("==============");
		System.out.println("  성적처리프로그램");
		System.out.println("==============");
		System.out.println("1)학생점수입력 2)학생수정 3)학생삭제 4)학생검색 5)등수처리 6)종료");
		System.out.println("원하는 메뉴를 입력하라요>>>");
	}

}
