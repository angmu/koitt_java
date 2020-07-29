import java.util.Scanner;

public class Ex0217_03 {
//이곳에 변수 선언가능.(메인메소드 밖에..')
	int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5명의 학생의 국영수 점수를 입력받아 해보세오
		// 직접 입력받
		Student[] stu=new Student[5];//stu[0],stu[1],stu[2],stu[3],stu[4] 각각 객체 선언을 해줘야한다.

		String[] subject = { "이름", "국어", "영어", "수학", "합계", "평균" };

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < stu.length; i++) {
			stu[i]=new Student();
			System.out.println((i + 1) + "번째 학생의 이름을 입력하세오");
			stu[i].name=scan.nextLine();
			System.out.println("국어점수를 입력하세오");
			stu[i].kor=scan.nextInt();
			scan.nextLine();
			System.out.println("영어점수를 입력하세오");
			stu[i].kor=scan.nextInt();
			scan.nextLine();
			System.out.println("수학점수를 입력하세오");
			stu[i].kor=scan.nextInt();
			scan.nextLine();
			stu[i].total();
			stu[i].avg();
			}
		

		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i].name + "\t");
			System.out.print(stu[i].kor+ "\t");
			System.out.print(stu[i].eng+ "\t");
			System.out.print(stu[i].math+ "\t");
			System.out.print(stu[i].total+ "\t");
			System.out.print(stu[i].avg+ "\t");
			System.out.println();
		}

//		int a=3;
//		int b=1;
//		
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		

//		3+1=4;
//		3-1=2;
//		3*1=3;
//		3/1=3;
//		
//		4,2//
//		4+2=6;
//		4-2=2;
//		4*2=8;
//		4/2=2;
//		

		// ----------

//		Tv t1=new Tv();
//		Tv t2=new Tv();
//		Tv2 tt1=new Tv2();
//		
//		t1.channel=10;
//		
//		//tt1=t1; //다른 타입이라서 넣을수가없다.
//		
//		System.out.println(t2.channel);
//		//t2.channel은 0으로 찍힌다.
//		//만약 t2=t1;이라하면 10이나온다요
//		

		// ----------------

//		Student stu1=new Student();
//		stu1.name="홍길동";
//		stu1.kor=100;
//		stu1.eng=100;
//		stu1.math=90;
//		stu1.total=stu1.kor+stu1.eng+stu1.math;
//		stu1.avg=stu1.total/3;
//		stu1.rank=1;
//		
//		System.out.println(stu1.name+" "+stu1.kor+" "+stu1.eng+" "+stu1.math+" "+stu1.avg+" "+stu1.total);
//		
//		//tv2실습
//		Tv2 t1=new Tv2();
//		t1.volume=10;
//		System.out.println("현재볼륨 : "+t1.volume);
//		t1.volumeUp();
//		t1.volumeDown();
//		

//		//tv1실습
//		Tv t=new Tv();
//		t.channelUp();
//		

		// -------------------

		// Tv t=new Tv();
////		t.power=true;
//		
//		System.out.println(t.power);
//		System.out.println(t.channel);

	}

}
