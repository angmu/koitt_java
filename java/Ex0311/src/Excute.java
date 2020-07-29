import java.util.ArrayList;
import java.util.HashMap;

public interface Excute {
	//메뉴 나오는 메소드
	int menuPrint();
	//학생입력메소드
	void putstu(ArrayList<Student> a);
	//성적출력메소드
	void stuPrint(ArrayList<Student> a,HashMap<String,String>b);
	//학생 검색 메소드
	void search(ArrayList<Student> a);
	//등수입력 메소드
	void rank(ArrayList<Student> a);
	
}
