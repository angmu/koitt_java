import java.util.Scanner;

public class Ex0218_04 {

	static int stu_count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학생성적처리 프로그램
//		학생=class:학번/이름/국어/영어 /수락/헙계/평균/등수
		//무한루프(무한반복)
//		[학생성적처리프로그램](학생수는 10명까지)
//				1.성적추가
//				성적추가를 선택>학번입력>>이름 국어 영어 수학///
//				2.성적수정>>수정할 학생의 학번을 입력하세오
//				>>1. 이름수정? 2. 국어성적 3. 영어성적 4. 수학성적
//						1>>이름을 입력하세오>홍길동>홍길동 이름이 수정되엇습니다.
//				3.성적삭제
		
//				4.성적검색
//				5.등수처리
//				0.종료
		
		Stu_class[] stu=new Stu_class[10];
		//10명의 학생만듬
		int input2,input3=0;//입력값
		int rank_i=0;
		
		
		Scanner scan=new Scanner(System.in);
		//첫번째 메인반복
		while(true) {
			
			main_print();// 메소드 분리/ 글자부분을 호출햇다유
			loop:
			switch(scan.nextInt()) {
			
			case 0:
				System.out.println("프로그램을 종료하겠습니다.");
				break loop;
			case 1:
				System.out.println("성적추가를 선택하였습니다.");
				//메소드 분리
				insert(stu);//학생성적추가 메소드
				break;
			case 2:
				System.out.println("성적수정을 선택하였습니다.");
				System.out.println("수정할 학생의 학번을 입력하세요. >>>");
				input2=scan.nextInt();
				for(int i=0;i<stu_count;i++) {
				if(input2==stu[i].stu_num) {
					System.out.println("수정할 항목을 선택하세오>>");
					System.out.println("1)이름 2)국어 3)영어 4)수학");
					input3=scan.nextInt();
					switch(input3) {
					
					}
					break;
				}else {
					System.out.println("일치하는 학생이 없습니다.");
					i--;
					continue;
				}
				}
				break;
			case 3:
				System.out.println("성적삭제를 선택하였습니다.");
				System.out.println("개발중인 메뉴입니다.");
				continue;
			case 4:
				System.out.println("성적검색을 입력하였습니다.");
				break;
			case 5:
				System.out.println("등수처리를 선택하였습니다.");
				for(int i=0;i<stu_count;i++) {
					rank_i=1;
					for(int j=0;j<stu_count;j++) {
						if(stu[i].total<stu[j].total) {
							rank_i++;
						}
					}stu[i].rank=rank_i;
				}
				break;
			default:
				System.out.println("잘못입력하였습니다");
				continue;
			
			
			}
			
		}
		
		
	}//main
	
	//메인 출력메소드
	static void main_print() {
		System.out.println("[학생성적처리프로그램]");
		System.out.println("원하는 번호를 선택하세오");
		System.out.println("1)성적추가");
		System.out.println("2)성적수정");
		System.out.println("3)성적삭제");
		System.out.println("4)성적검색");
		System.out.println("5)등수처리");
		System.out.println("0)종료");
	}
	//성적입력 메소드
	static void insert(Stu_class[] stu) {
		String insert_name="";
		Scanner scan=new Scanner(System.in);
		scan.nextLine();
		for(int i=stu_count;i<stu.length;i++) {
			if(stu_count==10) {
				System.out.println("더이상 입력할 수 없습니다 ㅎㅎ");
				break;
			}
			System.out.println("이름을 입력하세요(99:이전화면)");
			insert_name=scan.nextLine();
			if(insert_name.equals("99")) {
				System.out.println("이전화면으로 돌아갑니다");
				break;
			}
			stu[i]=new Stu_class();//값넣을 공간생성
			stu[i].stu_num=(Stu_class.first_num+=1);
			stu[i].name=insert_name;
			System.out.println("국어성적을 입력하세요");
			stu[i].kor=scan.nextInt();
			System.out.println("영어성적을 입력하세요");
			stu[i].eng=scan.nextInt();
			System.out.println("수학성적을 입력하세요");
			stu[i].math=scan.nextInt();
			stu[i].total();
			stu[i].avg();
			Ex0218_04.stu_count++;
			System.out.println(stu_count+"번째 학생 : 학번"+stu[i].stu_num+" 이름"+stu[i].name);
			
		}
	}

}
