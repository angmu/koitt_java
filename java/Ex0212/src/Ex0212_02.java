import java.util.Scanner;

public class Ex0212_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �빮�ڴ� �빮��, �ҹ��ڴ� �ҹ��ڷ� ġȯ�ϴ°�
		String input_1 = "";
		String result = "";
		char len;
		Scanner scan = new Scanner(System.in);
		System.out.println("[��ҹ��� ��ȯ ���α׷�]");
		while (true) {
			result="";
			System.out.println("���ĺ��� �Է����ּ���");
			input_1 = scan.next();
			for (int i = 0; i < input_1.length(); i++) {
				len = input_1.charAt(i);
			
				if (len >= 'a' && len <= 'z') {
					// ���δ� �빮��
					result= result+(char)(len-32)+"";

				} else {
					// ���δ� �ҹ���
					result= result+(char)(len+32)+"";

				}
			}
			System.out.println("����� :"+result);
		}

//		//���ڿ��� �޾Ƽ� ��ҹ��ڸ� ��ȯ�ϴ� ���α���
//		
//
//		String input_1 = "";
//		String result="";
//		String result_1="";
//		int len=0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("[��ҹ��� ��ȯ ���α׷�]");
//		while (true) {
//			System.out.println("���ĺ��� �Է����ּ���");
//			input_1 = scan.nextLine();
//		
//			//���ڿ��� ����
//			len=input_1.length();
//			//���δ� �ҹ���
//			result=input_1.toLowerCase();
//			//���δ� �빮��
//			result_1=input_1.toUpperCase();
//			System.out.println(result);
//			System.out.println(result_1);
//
//			System.out.println(len);
//		}
//

		// ���� �ҹ��ڸ� �޾Ƽ� ���� �빮�ڷ� ��ȯ�ϴ� ���α׷��� ��������
//
//		char input;
//		String input_1 = "";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("[��ҹ��� ��ȯ ���α׷�]");
//		while (true) {
//			System.out.println("���ĺ��� �Է����ּ���");
//			input_1 = scan.nextLine();
//			input = input_1.charAt(0);
//			// �ҹ��ڸ� �빮�ڷ�..
//			if (input >= 'a' && input <= 'z') {
//				input = (char) (input - 32);
//			} else {
//				// �빮�ڸ� �ҹ��ڷ�
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
//				//toUpperCase >>String�϶� �ҹ��ڸ� �빮�ڷ� �ٲ��ִ°�
//				result+=binary[hex[i]-'a'+10]+" ";//99-97+10=12
//				
//			}
//		}
//		System.out.println("hex : "+new String(hex)+" ");//new String(�迭�̸�)122 <<�ش�迭�� �� ��ü���
//		System.out.println("result : "+result);
	}

}
