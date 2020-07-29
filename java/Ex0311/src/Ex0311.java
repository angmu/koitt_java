import java.util.ArrayList;
import java.util.HashMap;

public class Ex0311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excute_stu ex=new Excute_stu();
		String[] name={"이순신","김유신","홍길동"};
		ArrayList<Student> stu=new ArrayList<Student>();
		int[] kor= {80,70,90};
		int[] eng= {100,80,100};
		int[] math= {85,90,95};
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("admin", "1234");
		for(int i=0;i<name.length;i++) {
			stu.add(new Student(name[i],kor[i],eng[i],math[i]));
		}
		loop:
		while(true) {
			switch(ex.menuPrint()) {
			case 0:
				System.out.println("프로그램 종료");
				break loop;
			case 1:
				ex.putstu(stu);
				break;
			case 2:
				ex.stuPrint(stu,map);
				break;
			case 3:
				ex.search(stu);
				break;
			case 4:
				ex.rank(stu);
				break;
			default:
				System.out.println("잘못된입력");
				continue;
			}
		}
		
		
		
	}

	private static Integer Integer(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
