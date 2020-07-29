import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Ex0302_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//student 객체 생성
		// 학생10명의 성적을 받음
		//성적처리프로그램
		//예전 Student[] stu=new Student[10];
//		//지금 Vector방식으로 Vector list=new Vector();
////		
//		Vector<Student> list= new Vector<Student>();//무한대로 만들수 있음
////		Student[] stu=new Student[10];
//		String[] name1= {"홍길동","이순신","김유신"};
//		int[] kor1= {100,90,95};
//		int[] eng1= {80,70,89};
////		Student s1=new Student(name1[0],kor1[0],eng1[0]);
////		Student s2=new Student(name1[1],kor1[1],eng1[1]);
//		
////		list.add(s1);
////		list.add(s2);
//		
//		list.add(new Student(name1[0],kor1[0],eng1[0]));
//		list.add(new Student(name1[1],kor1[1],eng1[1]));
//		list.add(new Student(name1[2],kor1[2],eng1[2]));
		
//		Vector<Student> list= new Vector<Student>();//무한대로 만들수 있음
//		String name="";
//		int kor=0;
//		int eng=0;
//		
//		Scanner scan=new Scanner(System.in);
//		while(true) {
//			System.out.println("이름을 입력하라요");
//			name=scan.nextLine();
//			System.out.println("국어점수를 입력하세오");
//			kor=scan.nextInt();
//			System.out.println("영어점수를 입력하세오");
//			eng=scan.nextInt();
//			scan.nextLine();
//			list.add(new Student(name,kor,eng));
//			System.out.println("1명의 성적이 주가되어슈");
//		}
		Scanner scan=new Scanner(System.in);

		ArrayList<Student> list= new ArrayList<Student>();//무한대로 만들수 있음 --객체를 사용할 경우에는 이걸 사용하는게 나음.. 단순한 8가지타입의 배열이면 그냥 배열로쓰는게 낫다
		Student[] stu=new Student[10];
		String[] name1= {"홍길동","이순신","김유신"};
		int[] kor1= {100,90,95};
		int[] eng1= {80,70,89};
		list.add(new Student(name1[0],kor1[0],eng1[0]));
		list.add(new Student(name1[1],kor1[1],eng1[1]));
		list.add(new Student(name1[2],kor1[2],eng1[2]));
		
		if(list.isEmpty()) {
			System.out.println("입력된 학생이 없습니다.");
		}else {
			for(int i=0;i<list.size();i++) {
				Student s=(Student)list.get(i);//s초기화를 하면서 계속 담는다.
				System.out.print(s.hak_num+"\t");
				System.out.print(s.name+"\t");
				System.out.print(s.kor+"\t");
				System.out.print(s.eng+"\t");
				System.out.print(s.total+"\t");
				System.out.print(s.avg+"\t");
				System.out.println();//줄바꿈
			}
		}
		
		
	}

}
