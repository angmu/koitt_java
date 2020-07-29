import java.util.Scanner;

public class Ex0212_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ganji = { "쥐", "소", "호랑이", "토끼", "용", "벰", "말", "양", "원숭이", "닭", "개", "돼지" };
		String[] ganji_select= {"자", "축", "인", "묘", "진", "사", "오", "미", "신", "유", "술", "해"};
		String select="";
		int count=0;
		Scanner scan = new Scanner(System.in);
		while (count==12) {
			System.out.println("원하는 십이지신 동물를 입력하세요 >>");
			select = scan.next();
			for(int i=0;i<12;i++) {
				if(select.equals(ganji[i])) {
					System.out.println(ganji[i]+"는(은) 십이지신에서 "+(i+1)+"번째의 동물 "+ganji_select[i]);
					break;
				}
				if(select.equals(ganji_select[i])) {
					System.out.println(ganji_select[i]+"는(은) 십이지신에서 "+(i+1)+"번째의 동물 "+ganji[i]);
					break;
				}
			}
			count++;
		}	//while
		
		
		// 자 축 인묘진사오미 신유술해

//		String[] ganji = { "쥐", "소", "호랑이", "토끼", "용", "벰", "말", "양", "원숭이", "닭", "개", "돼지" };
//		String[] ganji_select= {"자", "축", "인", "묘", "진", "사", "오", "미", "신", "유", "술", "해"};
//		int select = 0;
//		Scanner scan = new Scanner(System.in);
//		while (true) {
//			System.out.println("1~12까지 숫자를 입력해주세요");
//			select = scan.nextInt();
//			if(!(select>=1&&select<=12)) {
//				System.out.println("잘못 입력되었습니다");
//				continue;
//			}
//			System.out.println(select + "번째 띠는? " + ganji[select - 1]+"("+ganji_select[select-1]+")");

//		} // while
		
		
		
		
		
		
		
		
		
		
		
		
		//		String으로 12개의 배열을 만들고 12간지를 만든다
//
//		String[] ganji = { "쥐", "소", "호랑이", "토끼", "용", "벰", "말", "양", "원숭이", "닭", "개", "돼지" };
//		int select = 0;
//		Scanner scan = new Scanner(System.in);
//		while (true) {
//			System.out.println("1~12까지 숫자를 입력해주세요");
//			select = scan.nextInt();
//
//			System.out.println(select + "번째 띠는? " + ganji[select - 1]);
//
//		} // while
//		
		
		
	}// main

}// class
