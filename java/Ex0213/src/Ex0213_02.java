import java.util.Scanner;

public class Ex0213_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		// 16진수를 2진수로
		// 입력을 받아서 출력하는 형태로 변경,
		char hex[] = new char[5];
		String str = "";
		String[] binary = { // A=10 B=11 C=12 D=13 E=14 F=15
				"0000", "0001", "0010", "0011", // 0,1,2,3
				"0100", "0101", "0110", "0111", // 4,5,6,7
				"1000", "1001", "1010", "1011", // 8,9,10,11
				"1100", "1101", "1110", "1111"// 12,13,14,15
		};// 0~15까지의 16진수

		String result = ""; // result= result+"0100"...

		System.out.println("10개까지의 문자를 입력하세요(ABCDE)");
		str = scan.next();
		//대문자치환
		str=str.toUpperCase();
		//문자길이만큼 하고싶을때는 아래처롬!! 
		for (int i = 0; i < str.length(); i++) {
//		for (int i = 0; i < hex.length; i++) {
			hex[i] = str.charAt(i);

		}
//				hex[0]=str.charAt(0);
//				hex[1]=str.charAt(1);
//				hex[2]=str.charAt(2);
//		for (int i = 0; i < hex.length; i++) {
		for (int i = 0; i < str.length(); i++) {
			// 번호가 들어왔을때
			if (hex[i] >= '0' && hex[i] <= '9') {
				result += binary[hex[i] - '0'] + " ";
			} else {
				result += binary[hex[i] - 'A' + 10] + " "; // >>>67-65=2+10=12
			}
		}
		for (int i = 0; i < str.length(); i++) {
//		for (int i = 0; i < hex.length; i++) {
			System.out.print(hex[i]+"\t");
		}
		System.out.println();
		System.out.println(result);

//		// 16진수를 2진수로
//		//입력을 받아서 출력하는 형태로 변경,
//		char[] hex = { '7', 'C', 'A', 'F', 'E' };
//		String[] binary = { // A=10 B=11 C=12 D=13 E=14 F=15
//				"0000", "0001", "0010", "0011", // 0,1,2,3
//				"0100", "0101", "0110", "0111", // 4,5,6,7
//				"1000", "1001", "1010", "1011", // 8,9,10,11
//				"1100", "1101", "1110", "1111"// 12,13,14,15
//		};// 0~15까지의 16진수
//
//		String result = ""; // result= result+"0100"...
//
//		for (int i = 0; i < hex.length; i++) {
//			// 번호가 들어왔을때
//			if (hex[i] >= '0' && hex[i] <= '9') {
//				result += binary[hex[i] - '0'] + " ";
//			} else {
//				result += binary[hex[i] - 'A' + 10]+ " "; // >>>67-65=2+10=12
//			}
//		}
//		for(int i=0;i<hex.length;i++) {
//			System.out.print(hex[i]);
//		}
//		System.out.println();
//		System.out.println(result);

//		게시판
//		번호 이름 제목 글내용 조회수

//		int num=0;
//		String name="";
//		
//		while(true) {
//			System.out.println("번호를 입력하세요");
//			num=scan.nextInt();//123만 받고  enter
//			scan.nextLine();//넥스트인티즈 뒤에 써주면 enter를 이게 받는다요 :> //요즘엔 콘솔창으로 받지않기 때문에 콘솔경우에만 이케 ..;ㅂ;
//			System.out.println("이름을 입력하세요");
//			name=scan.nextLine();//enter키도 문자로 인식.
//			
//			System.out.println(num+" "+name);
//			
//			
//			
//		}
//		

	}

}
