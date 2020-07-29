import java.util.Scanner;

public class Ex0224_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3명의 학생을 입력받아 학번 이름 국 영 수 합계 평균 등수
		//학번은 1에서 1씩증가(자동)
		//입력은 메소드로 분리
		//출력 메소드 분리
		//등수 메소드분리
		//성적수정 메소드 분리
		//1. 학생입력
		//2. 학생 성적출력
		//3. 학생 성적수정
		//4. 햓생등수
		//5 종료
		
		int select;
		Stu[] stu=new Stu[3];
		int stu_count = 0;
		String [] sub= {"국어","영어","수학"};
		loop:
		while(true) {
			select=print();
			switch(select) {
			
			case 1:
				System.out.println("학생입력 선택");
				stu_count=scoreInput(stu,stu_count,sub);
				break;
			case 2:
				System.out.println("학생성적출력 선택");
				scoreOutput(stu);
				break;
			case 3:
				System.out.println("학생성적 수정 선택");
				scoreChange(stu);
				break;
			case 4:
				System.out.println("학생등수입력 선택");
				rankArr(stu);
				break;
			case 5:
				System.out.println("프로그램을 종료");
				break loop;
			default:
				System.out.println("잘못된 번호를 입력하였습니다");
				continue;
			
			
			}
			
			
			
		}
		
		
		
		
		
		
		
	}
	//기본입력값
	static int print() {
		System.out.println("===========");
		System.out.println("학생성적 프로그램");
		System.out.println("===========");
		System.out.println("1)학생성적입력");
		System.out.println("2)학생성적출력");
		System.out.println("3)학생성적수정");
		System.out.println("4)학생등수입력");
		System.out.println("5)종료");
		System.out.println("원하는 번호를 입력하세요>>>");
		Scanner scan=new Scanner(System.in);
		int select=scan.nextInt();
		return select;
	}
	//성적 입력
	static int scoreInput(Stu[] stu,int a,String [] sub) {
		Scanner scan=new Scanner(System.in);
		
		int [] score=new int[3];
		for(int i=0;i<stu.length;i++) {
			System.out.println((i+1)+"번째 학생의 이름을 입력하세오");
			String name=scan.nextLine();
			for(int j=0;j<stu.length;j++) {
				System.out.println(sub[j]+"점수를 입력하세오");
				score[j]=scan.nextInt();
				scan.nextLine();
			}stu[i]=new Stu(name,score[0],score[1],score[2]);
			a++;
		}
		return a;
	}//scoreInput
	//성적출력
	static void scoreOutput(Stu[] stu) {
		System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i].hak_num+"\t"+stu[i].name+"\t"+stu[i].kor+"\t"+stu[i].eng+"\t"+stu[i].math+"\t"+stu[i].total+"\t"+stu[i].avg);
		}System.out.println();
	}//scoreOutput
	
	//성적출력
	static void scoreChange(Stu[] stu) {
		Scanner scan=new Scanner(System.in);
		System.out.println("수정할 학생의 학번을 입력하세오");
		int ch=scan.nextInt();
		boolean boo=false;
		for(int i=0;i<stu.length;i++) {
			if(ch==stu[i].hak_num) {
				boo=true;
				System.out.println(stu[i].hak_num+"/"+stu[i].name+"을 선택하였습니다");
				System.out.println("0)이름수정 1)국어성적 2)영어성적 3)수학성적");
				System.out.println("수정할 항목을 고르세오>>>");
				int ch2=scan.nextInt();
				scan.nextLine();
				switch(ch2) {
				case 0:
					//성적수정시 합계 평균 등수가 모두 바뀌어야함.. rank는 모두 0으루 맹그러야한다리..
					System.out.println("이름 수정을 선택. 변경하고자 하는 이름을 입력하세오(현재 이름:"+stu[i].name+")");
					stu[i].name=scan.nextLine();
					System.out.println("이름 수정이 완료되었습니다.");
					break;
				case 1:
					sw_modify(stu,i,"국어");
					break;
				case 2:
					sw_modify(stu,i,"영어");
					break;
				case 3:
					sw_modify(stu,i,"수학");
					break;
				default:
					System.out.println("잘못선택하였습니다.");
					continue;
				}
				break;
		}
		}if(boo==false) {
			System.out.println("일치하는 학생이 없습니다.");
		}
		System.out.println();
	}//scoreChange
	
	
	static void sw_modify(Stu[] stu,int i,String sub){
		Scanner scan=new Scanner(System.in);
		System.out.println(sub+"성적 수정을 선택. 점수를 입력하세오");
		if(sub.equals("국어")) {
			stu[i].kor=scan.nextInt();
			System.out.println("국어성적 수정이 완료되었습니다.");
		}else if(sub.equals("영어")) {
			stu[i].eng=scan.nextInt();
			System.out.println("영어성적 수정이 완료되었습니다.");
		}else{
			stu[i].math=scan.nextInt();
			System.out.println("수학성적 수정이 완료되었습니다.");
		}
		stu[i].modify();
	}
	
	
	
	static void rankArr(Stu[] stu) {
		for(int i=0;i<stu.length;i++) {
			for(int j=0;j<stu.length;j++) {
				if(stu[i].total<stu[j].total) {
					stu[i].rank++;
				}
			}
		}//
		
		
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i].name+":"+stu[i].rank+"등");
		}
	}//rankArr
	
	
	
}//class

class Stu{
	//static변수는 모든 객체가 사용하므로 count만으로는  같은수가찍힌다.
	static int count;
	int kor;
	int eng;
	int math;
	String name;
	int hak_num;
	int total;
	double avg;
	int rank=1;
	{
		count++;
		hak_num=count;
	}
	Stu(){
		this("name",0,0,0);
	}
	Stu(String name, int kor, int eng, int math){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.total=kor+eng+math;
		this.avg=total/3;
	}
	
	void total() {
		total=kor+eng+math;
	}
	void avg() {
		avg=total/3;
	}
	void modify() {
		total();
		avg();
		rank=0;
	}
}