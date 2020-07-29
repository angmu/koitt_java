
public class Ex0225_02 {
	public static void main(String[] args) {
		Student[] stu = new Student[3];
		String[] name = new String[]{ "홍길동", "이순신", "김유신" };
		int[] grade= new int[]{3,4,1};
		
//		stu[0]=new Student(name[0],grade[0]);
//		stu[1]=new Student(name[1],grade[1]);
//		stu[2]=new Student(name[2],grade[2]);
		
		//객체 배열이기 때문에 다시 new연산자를 통해서 값을 받을 공간을 만든다요
		for(int i=0;i<stu.length;i++) {
			stu[i]=new Student(name[i],grade[i]);
		}
		
		//lotto하는 45개 배열을 만들어 1~45까지 숫자를 넣으시오
		
		int []lotto=new int[45];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
		}
		
		//로또 객체를 만들어서 객체에서 1~45까지 숫자가 만들어지게.
		//선언만하면 lotto 생성이 되도록
		
		Deck d=new Deck();
		System.out.println("45개의 공 생성");
		for(int i=0;i<45;i++) {
			System.out.print(d.ball[i]+" "); 
		}
	}
}
