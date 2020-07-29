import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex0302_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stu_info> list=new ArrayList<Stu_info>();
		Scanner scan=new Scanner(System.in);

		String[]name= {"홍길동","이순신","홍길동"};
		String[]major= {"컴퓨터공학","영문학과","미술학과"};
		int []grade= {1,2,4};
		String[]tel= {"010-1666-7777","010-1111-1111","02-2515-1530"};

		list.add(new Stu_info(name[0],major[0],grade[0],tel[0]));
		list.add(new Stu_info(name[1],major[1],grade[1],tel[1]));
		list.add(new Stu_info(name[2],major[2],grade[2],tel[2]));
		
		while(true) {
			System.out.println("1)학생정보입력   2)출력   3)검색 ");
			int num=scan.nextInt();
			scan.nextLine();
					switch(num) {
					case 1:
						while(true) {
						System.out.println("이름을 입력하세오 (이전화면 99)");
						String name1=scan.nextLine();
						if(name1.equals("99")) {
							System.out.println("이전화면으로");
							break;
						}
						System.out.println("학과를 입력하세오");
						String major1=scan.nextLine();
						System.out.println("학년을 입력하세오");
						int grade1=scan.nextInt();
						scan.nextLine();
						System.out.println("전화번호를 입력하세오");
						String tel1=scan.nextLine();
						//객체에 넣기
						list.add(new Stu_info(name1,major1,grade1,tel1));
						}
						break;
					case 2:
						//데이터가 있는지 확인
						if(list.isEmpty()) {
							System.out.println("데이터가 없습니다");
							break;
						}
						//반복출력
						for(int i=0;i<list.size();i++) {
							Stu_info s=(Stu_info)list.get(i);
							System.out.print(s.hak_num+"\t"+s.name+"\t"+s.major+"\t"+s.grade+"학년"+"\t"+s.tel);
//							System.out.print(s.name+"\t");
//							System.out.print(s.major+"학과"+"\t");
//							System.out.print(s.grade+"학년"+"\t");
//							System.out.print(s.tel);
							System.out.println();
						}
						break;
					case 3:
						System.out.println("검색할 이름을 입력하세오");
						String name2=scan.nextLine();
						if(name2.equals("99")) {
							System.out.println("이전화면으로");
							break;
						}
						for(int i=0;i<list.size();i++) {
							Stu_info stu=(Stu_info)list.get(i);
							if(name2.equals(stu.name)) {
								System.out.println("찾는 학생은");
								System.out.println(stu.hak_num+" "+stu.name+" "+stu.major+" "+stu.grade+" "+stu.tel);
							}
//							else {
//								System.out.println("찾는 학생이 없습니다.");
//								break;
//							}
						}
						break;
					default:
						break;
					}
		}
		
		
		//		String name="";
//		String major="";
//		String tel="";
//		int grade=0;
//		int count=0;
//		while(count!=3) {
//			System.out.println("이름을 입력하세오");
//			name=scan.nextLine();
//			System.out.println("학과를 입력하세오");
//			major=scan.nextLine();
//			System.out.println("학년을 입력하세오");
//			grade=scan.nextInt();
//			scan.nextLine();
//			System.out.println("전화번호를 입력하세오(-없이 숫자만 입력)");
//			tel=scan.nextLine();
//			list.add(new Stu_info(name,major,grade,tel));
//			count++;
//		}
//		for(int i=0;i<list.size();i++) {
//			Stu_info s=(Stu_info)list.get(i);
//			System.out.print(s.hak_num+"\t");
//			System.out.print(s.name+"\t");
//			System.out.print(s.major+"학과"+"\t");
//			System.out.print(s.grade+"학년"+"\t");
//			System.out.print(s.tel.substring(0,2)+"-"+s.tel.substring(3,6)+"-"+s.tel.substring(7,10));
//			System.out.println();
//		}
		
	}

}
