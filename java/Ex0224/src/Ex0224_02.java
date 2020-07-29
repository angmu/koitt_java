import java.util.Scanner;

public class Ex0224_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2명의 학생-홍길동 100 100 90 .이순신 80 90 70

		
		Student[]stu=new Student[2];
		int[] score=new int[3];
		int stu_count=0;
		///메소드 분리
		stu_count=stu_input(stu,score);
		System.out.println("입력받은 학생수 :"+stu_count);
		System.out.println(stu[0].name+" "+stu[0].total+" "+stu[0].avg);
		System.out.println(stu[1].name+" "+stu[1].total+" "+stu[1].avg);
		
		
//		Student stutest = new Student();
//		Student stu1 = new Student("홍길동", 100, 100, 90);
//		Student stu2 = new Student("이순신", 80, 90, 70);

//		System.out.println(stutest.name +" "+ stutest.kor +" "+ stutest.eng +" "+ stutest.math +" "+ stutest.total +" "+ stutest.avg);
//		System.out.println(stu1.name +" "+ stu1.kor +" "+ stu1.eng +" "+ stu1.math +" "+ stu1.total +" "+ stu1.avg);
//		System.out.println(stu2.name +" "+ stu2.kor +" "+ stu2.eng +" "+ stu2.math +" "+ stu2.total +" "+ stu2.avg);

	}
	///메소드 분리
	static int stu_input(Student[]stu,int[]score) {
		int count=0;
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<stu.length;i++) {
			System.out.println("이름을 입력하세오>>");
			String name=scan.nextLine();
			for(int j=0;j<score.length;j++) {
			System.out.println("값을 입력하세오");
			score[j]=scan.nextInt();
			scan.nextLine();
			}
			stu[i]=new Student(name,score[0],score[1],score[2]);
			count++;
		}
		return count;
	}

}
