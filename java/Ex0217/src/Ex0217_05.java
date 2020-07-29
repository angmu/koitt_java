import java.util.Scanner;

public class Ex0217_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board[] b = new Board[4];
		String[] subject = { "번호", "글제목", "내용", "작성자", "조회수" };
		Scanner scan = new Scanner(System.in);
		int b_num = 0;
		int v_num = 0;
		for (int i = 0; i < b.length; i++) {
			b[i] = new Board();
			b[i].num = b_num + 1;
			System.out.println("[게시판글등록]");
			System.out.println("제목을 입력하세요");
			b[i].title = scan.nextLine();
			System.out.println("내용을 입력하세요");
			b[i].contents = scan.nextLine();
			System.out.println("작성자를 입력하세요");
			b[i].name = scan.nextLine();
			b[i].view_num = v_num;
			b_num++;//자동증가
			System.out.println("-----------");
			System.out.println("[글 리스트 출력]");
			System.out.println("-----------");
			for (int k = 0; k < subject.length; k++) {
				System.out.print(subject[k] + "\t");
			}System.out.println();
			
			for (int j = 0; j < b_num; j++) {
				System.out.print(b[j].num + "\t" + b[j].title + "\t" + b[j].contents + "\t" + b[j].name + "\t"+ b[j].view_num + "\t");
				System.out.println();
			}System.out.println();
		}
//		System.out.println();
//		for (int i = 0; i < b.length; i++) {
//			b[i].print();
//		}
	}

}
