import java.util.Scanner;

public class Ex0303_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String name="";
		int kor=0;
		int eng=0;
		
		System.out.println("�̸��� �Է��ϼ���");
		name=scan.next();
		System.out.println("���������� �Է��ϼ���");
		kor=scan.nextInt();
		try {
			System.out.println(5/0);//���⼭ ������ ���� ĳġ������ ������.
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();//��𿡼� ���������� ������ �˷��ش�.
			System.out.println();
		}
		System.out.println("���������� �Է��ϼ���");
		eng=scan.nextInt();
		System.out.println(6);
	}

}
