import java.util.Scanner;

public class Ex0212_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//게시판  프로그램
		//번호-int (이름 제목 글내용)-string 조회수-int
		//글 10개까지 입력가능 1개만하고 물어보기
		//출력
		
		//1)글쓰기 2)목록
		
		int num=0;
		int look=0;
		String[][] text=new String[10][3];
		String[] title= {"번호","이름","제목","글내용","조회수"};
		int ch=0;
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<text.length;i++) {
			for(int j=0;j<text[i].length;j++) {
				text[i][j]="";
			}
		}
		loop: for(int i=0;i<text.length;i++) {
			for(int j=0;j<text[i].length;j++) {
				if(i>=1) {
					System.out.println("입력을 더 하시겠습니까? (1)계속 (2)종료");
					ch=scan.nextInt();
					switch(ch) {
					case 1:
						break;
					case 2:
						break loop;
					default:
						System.out.println("잘못입력했습니다.");
						continue;
					}//switch
				}//if
				System.out.println(title[j+1]+"를 입력하세요");
				text[i][j]=scan.nextLine();//글내용의 경우 next로 하게되면 띄어쓰기시 다음꺼로 넘어간다.. 
				//nextLine>>한줄모두입력 next>>띄워쓰기 엔터전까지만 입력된다,,
			}
		}
		
		for(int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
			
		}System.out.println();
		for(int i=0;i<text.length;i++) {
			num+=i+1;
			System.out.print(num+"\t");
			for(int j=0;j<text[i].length;j++) {
				System.out.print(text[i][j]+"\t");
			}System.out.print(look+"\t\n");
		}
			
	}

}
