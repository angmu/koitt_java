import java.util.Scanner;

public class Ex0203_03 {
	public static void main(String[] args) {
		//main ġ�� ctrl+�����̽��� ġ�� �Ϸ��ϰ� ������ ����!!
		
		Scanner scan= new Scanner(System.in);
		System.out.println("���ϴ� ù��° ���ڸ� �Է��ϼ���.");
		int input1=scan.nextInt();
		System.out.println("���ϴ� �ι�° ���ڸ� �Է��ϼ���.");
		int input2=scan.nextInt();
		
		int hap=input1+input2;
		int minus =input1-input2;
		double g1 =input1*input2;
		double di= input1/input2;
		
		System.out.println("�μ��� �� :"+hap);
		System.out.println("�μ��� �� :"+minus);
		System.out.println("�μ��� �� :"+g1);
		System.out.println("�μ��� ������ :"+di);
		
		
		
		
	}
}
