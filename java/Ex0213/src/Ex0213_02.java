import java.util.Scanner;

public class Ex0213_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		// 16������ 2������
		// �Է��� �޾Ƽ� ����ϴ� ���·� ����,
		char hex[] = new char[5];
		String str = "";
		String[] binary = { // A=10 B=11 C=12 D=13 E=14 F=15
				"0000", "0001", "0010", "0011", // 0,1,2,3
				"0100", "0101", "0110", "0111", // 4,5,6,7
				"1000", "1001", "1010", "1011", // 8,9,10,11
				"1100", "1101", "1110", "1111"// 12,13,14,15
		};// 0~15������ 16����

		String result = ""; // result= result+"0100"...

		System.out.println("10�������� ���ڸ� �Է��ϼ���(ABCDE)");
		str = scan.next();
		//�빮��ġȯ
		str=str.toUpperCase();
		//���ڱ��̸�ŭ �ϰ�������� �Ʒ�ó��!! 
		for (int i = 0; i < str.length(); i++) {
//		for (int i = 0; i < hex.length; i++) {
			hex[i] = str.charAt(i);

		}
//				hex[0]=str.charAt(0);
//				hex[1]=str.charAt(1);
//				hex[2]=str.charAt(2);
//		for (int i = 0; i < hex.length; i++) {
		for (int i = 0; i < str.length(); i++) {
			// ��ȣ�� ��������
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

//		// 16������ 2������
//		//�Է��� �޾Ƽ� ����ϴ� ���·� ����,
//		char[] hex = { '7', 'C', 'A', 'F', 'E' };
//		String[] binary = { // A=10 B=11 C=12 D=13 E=14 F=15
//				"0000", "0001", "0010", "0011", // 0,1,2,3
//				"0100", "0101", "0110", "0111", // 4,5,6,7
//				"1000", "1001", "1010", "1011", // 8,9,10,11
//				"1100", "1101", "1110", "1111"// 12,13,14,15
//		};// 0~15������ 16����
//
//		String result = ""; // result= result+"0100"...
//
//		for (int i = 0; i < hex.length; i++) {
//			// ��ȣ�� ��������
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

//		�Խ���
//		��ȣ �̸� ���� �۳��� ��ȸ��

//		int num=0;
//		String name="";
//		
//		while(true) {
//			System.out.println("��ȣ�� �Է��ϼ���");
//			num=scan.nextInt();//123�� �ް�  enter
//			scan.nextLine();//�ؽ�Ʈ��Ƽ�� �ڿ� ���ָ� enter�� �̰� �޴´ٿ� :> //���� �ܼ�â���� �����ʱ� ������ �ְܼ�쿡�� ���� ..;��;
//			System.out.println("�̸��� �Է��ϼ���");
//			name=scan.nextLine();//enterŰ�� ���ڷ� �ν�.
//			
//			System.out.println(num+" "+name);
//			
//			
//			
//		}
//		

	}

}
