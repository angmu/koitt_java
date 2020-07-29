import java.util.Scanner;

public class Ex0212_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 대문자는 대문자, 소문자는 소문자로 치환하는것
		String input_1 = "";
		String result = "";
		char len;
		Scanner scan = new Scanner(System.in);
		System.out.println("[대소문자 변환 프로그램]");
		while (true) {
			result="";
			System.out.println("알파벳를 입력해주세요");
			input_1 = scan.next();
			for (int i = 0; i < input_1.length(); i++) {
				len = input_1.charAt(i);
			
				if (len >= 'a' && len <= 'z') {
					// 전부다 대문자
					result= result+(char)(len-32)+"";

				} else {
					// 전부다 소문자
					result= result+(char)(len+32)+"";

				}
			}
			System.out.println("경과값 :"+result);
		}

//		//문자열을 받아서 대소문자를 변환하는 프로그햄
//		
//
//		String input_1 = "";
//		String result="";
//		String result_1="";
//		int len=0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("[대소문자 변환 프로그램]");
//		while (true) {
//			System.out.println("알파벳를 입력해주세요");
//			input_1 = scan.nextLine();
//		
//			//문자열의 길이
//			len=input_1.length();
//			//전부다 소문자
//			result=input_1.toLowerCase();
//			//전부다 대문자
//			result_1=input_1.toUpperCase();
//			System.out.println(result);
//			System.out.println(result_1);
//
//			System.out.println(len);
//		}
//

		// 영문 소문자를 받아서 영문 대문자로 변환하는 프로그램을 만들어보세오
//
//		char input;
//		String input_1 = "";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("[대소문자 변환 프로그램]");
//		while (true) {
//			System.out.println("알파벳를 입력해주세요");
//			input_1 = scan.nextLine();
//			input = input_1.charAt(0);
//			// 소문자를 대문자로..
//			if (input >= 'a' && input <= 'z') {
//				input = (char) (input - 32);
//			} else {
//				// 대문자를 소문자로
//				input = (char) (input + 32);
//			}
//
//			System.out.println(input);
//		}

//		char[] hex= {'7','c','a','f','e'};//a=10 b=11 c=12...
//		String[] binary= {
//				"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"
//		};
//		String result="";
//		for(int i=0;i<hex.length;i++) {
//			if(hex[i]>='0'&&hex[i]<='9') {
//				result+=binary[hex[i]-'0']+" ";
//			}else {
//				//A->a, F->f
//				if(hex[i]>='A'&&hex[i]<='Z') {
//					hex[i]=(char)(hex[i]+32);
//				}
//				//toUpperCase >>String일때 소문자를 대문자로 바꿔주는것
//				result+=binary[hex[i]-'a'+10]+" ";//99-97+10=12
//				
//			}
//		}
//		System.out.println("hex : "+new String(hex)+" ");//new String(배열이름)122 <<해당배열의 값 전체출력
//		System.out.println("result : "+result);
	}

}
