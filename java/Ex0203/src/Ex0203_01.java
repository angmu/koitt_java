import java.util.Scanner;

public class Ex0203_01 {

	public static void main(String[] args) {
		
		//�ܼ�ȭ�鿡�� ���� �Է¹޾� ����ϴ� Ŭ���� Scanner,����ϴ� �޼ҵ� scan.next***()
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			//nextInt��  ȭ������ ���ڸ� �Է¹޴� �޼ҵ�
//		float kor=scan.nextFloat(); // �Ǽ����� �������� �Է¹޴� ������ Ȯ���� �ؼ� nextInt,nextLine ������ �ٲ㾵���ִ�..(���� �������� ��絵 ���� �����ؾ��Ѵ�.)
			System.out.println("���������� �Է����ּ���.");
			
			String kor=scan.nextLine();//���ڿ��� �޾Ƽ� �״�� ����ض�
			System.out.println("���������� �Է����ּ���.");
			
			String eng=scan.nextLine();
			
			
			int kor1=Integer.parseInt(kor);//���ڷ� �ٲ� �����̵ȴ�  scan.parseInt(���� ������ int�� ��ȯ�ϴ� �޼ҵ��̴�.)
			int eng1=Integer.parseInt(eng);
			
			System.out.println("����� ���������� �� :"+(kor1+eng1));
//			System.out.println("����� ���������� �� :"+(kor+eng)); //�׳����ϰ� �Ǹ� 10099�� ���ڰ� ���������ʰ� �׳� �پ ���´�.
			
//		System.out.println("�������� :"+kor);//console���� �Է��� ������ ����� �Ҽ��ְԵȴ�.
		}
		
//
//		String str =new String();
//		int a=5;
//		

//		//�١١١�����ȯ ����.
//		char c1='a'//97
//		char c2=(char)(c1+1); //+�� �Է��ϸ� �ڵ������� int�� ��ȯ�Ǳ⶧���� ���ڷ� ����ϰ� �ʹٸ� �� char�� �Է��Ͽ� �������� ������� �Ѵ�.
//		System.out.println("c1 ��� :"+c1);
//		System.out.println("c1 ��� :"+c2);
//		//������ ���� char ���ڿ����� string
////
		
		
//		byte a=10;
//		byte b=7;
//		byte c=(byte) (a+b);
//		System.out.println(c); //�׳��ϰԵǸ� ������ ����.�ؼ� (byte)��� �տ� �ٿ��ְ� ���� ��ȣ�ȿ� �־���� �����ȳ��� byte�� ��ȯ�Ǿ� ���´�.
	}

}
