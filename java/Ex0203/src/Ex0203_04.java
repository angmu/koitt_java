import java.util.Scanner;

public class Ex0203_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//���� 3���� ���ڸ� �Է¹޾Ƽ� printf ����ؼ�
		//5+4+2=11
		
		Scanner scan= new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int a=scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int b=scan.nextInt();
		System.out.println("����° ���ڸ� �Է��ϼ���.");
		int c=scan.nextInt();
				
		
		int d=a+b+c;
		int e=a-b-c;
		int f=a*b*c;
		float g=(float)a/b/c;
		
		
		System.out.printf("ù��°���� :%d, �ι�° ����:%d, ����°���� :%d,�� ���� �� :%d,������ �� :%d, ������ ��:%d,������ ������ :%.2f",a,b,c,d,e,f,g);
		
		
		
		
		
		
		
		
//		//printf
//		
//		System.out.println(10.0/3); //�Ǽ����� f�������Ƿ� 10.0�� double�̴�. /����ϴ� �Ҽ����ڸ����� �����Ҽ� ����.�ڵ����� ������ enterŰ�� �����־ �ٹٲ��� �˾Ƽ� ��.
//		
//		int a=5;
//		int b=10;
//		
//		System.out.printf("ù��°���� :%d, �ι�° ���� :%d%n",a,b);//�Է¹޴� ����ŭ %d�� ���ָ� �������� ��°����ϴ�.
		
		
		
//		//���� %d, �Ǽ� %f, ����%c, ���ڿ�%s
//		//%n ���๮��
//		System.out.printf("�ڸ��� ��ġ :%.2f%n",10.0/3);//.2���ϸ� �Ҽ��� 2°�ڸ����� ������ �϶�� ���̴�. ,, %n�� ���� �ٹٲ��� �Ͼ��.
//		System.out.printf("�ڸ��� ��ġ :%5.2f%n",10.0/3);//. �տ��ִ� ���ڴ� �Ҽ����ڸ������ؼ� 5�ڸ����� ����϶�� ���̴�. 
//		System.out.printf("�ڸ��� ��ġ :%-5.2f%n",10.0/3);//. �տ��ִ� ���� �տ� -�� ���̸� ���������� �ȴ�.
//		
		
		
		
//		
//		//����2 ����7���� �ѹ��� �޾Ƽ� 
//		//ù��������:
//		//�ι�° ����:...
//		//������ ���ڸ� ���غ�����.
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("7�ڸ� ���ڸ� �Է��ϼ���");
//		String ch=scan.nextLine();
//		char input1=ch.charAt(0);
//		char input2=ch.charAt(1);
//		char input3=ch.charAt(2);
//		char input4=ch.charAt(3);
//		char input5=ch.charAt(4);
//		char input6=ch.charAt(5);		
//		char input7=ch.charAt(6);
//		
//		int a=input1-'0';
//		int b=input2-'0';
//		int c=input3-'0';
//		int d=input4-'0';
//		int e=input5-'0';
//		int f=input6-'0';
//		int g=input7-'0';
//		
//		int sum=a+b+c+d+e+f+g;
//		
//		System.out.println("ù��° ���� :"+a);
//		System.out.println("�ι�° ���� :"+b);
//		System.out.println("����° ���� :"+c);
//		System.out.println("�׹�° ���� :"+d);
//		System.out.println("�ټ���° ���� :"+e);
//		System.out.println("������° ���� :"+f);
//		System.out.println("�ϰ���° ���� :"+g);
//		
//		System.out.println("������ �� :"+sum);
//		
//		
//		
		
		
//		//���� �� ���ڸ� �Է¹޾Ƽ� �ΰ��� ���� ���ϴ¹�
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("���ڸ� �Է����ּ���");
//		String ch=scan.nextLine();
//		char b=ch.charAt(0);
//		char a=ch.charAt(1);
//		
//		//int input=Integer.parseInt(ch);//���ڷ� ġȯ�ϴ¹��
//		
//		
//		int b1=b-'0';// '0'�� ���� ���ڷ� ġȯ�� �ȴ�. ''�� �Ⱦ��� ��ȯ�� �ȵȴ�..�Ф� '0'�� �Ѽ�Ʈ�� �ܿ���.. +����. ���ڸ� ���ڿ��� �ٲٴ¹� 7+""(ū����ǥ�� ���Ѵ�)="7"
//		int a1=a-'0';
//		
//		int sum=(int)(b1+a1);
//		int minus=(int)(b1-a1);
//		double g1=(double)(b1*a1);
//		double di=(double)(b1/a1);
//		
//		
//		System.out.println("�μ��� �� :"+sum);
//		System.out.println("�μ��� �� :"+minus);
//		System.out.println("�μ��� �� :"+g1);
//		System.out.println("�μ��� ������ :"+di);
//		
//		
		
//	//	��ҹ��� ġȯ
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("�빮�ڸ� �Է����ּ���.");
//		String ch =scan.nextLine();
//		char b =ch.charAt(0); //charAt ���� ���ڿ��� ������ ���ڷ� ������ �ִ� �޼ҵ�. ex)korea��� �ܾ �ִٸ� ��ȣ���� ���ڰ� ��ġ�ε�. k(0) o(1) r(2) e(3) a(4) �߿� �����ϴ� ��ġ�� ���ڸ� �޴´�. 1��° ���ڴ� 0 �̷���..
//		char c=(char)(b+32);
//		
//		System.out.println("�Է��� �빮�� :"+b);
//		System.out.println("����� �ҹ��� :"+c);
//		
//		------
//		System.out.println("�ҹ��ڸ� �Է����ּ���.");
//		String ch1 =scan.nextLine();
//		char d =ch1.charAt(0); //charAt ���� ���ڿ��� ������ ���ڷ� ������ �ִ� �޼ҵ�. ex)korea��� �ܾ �ִٸ� ��ȣ���� ���ڰ� ��ġ�ε�. k(0) o(1) r(2) e(3) a(4) �߿� �����ϴ� ��ġ�� ���ڸ� �޴´�. 1��° ���ڴ� 0 �̷���..
//		char f=(char)(d-32);
//		
//		System.out.println("�Է��� �ҹ��� :"+d);
//		System.out.println("����� �빮�� :"+f);
//		
		
		//���� ���� ����.
		//1. �����Է�,���ڿ� �Է�
		//2. �Է���>��������ȯ, ���ڿ� ���ڷ� ��ȯ
		//3. �������� ���������� ��ȯ.
		//4. printf ������ ������ ��������ϴ� ��. %d(����) %f(�Ǽ�) %c(����) %s(���ڿ�) %10.2f(�Ҽ���2�� ���� 10�ڸ� ���)
		
		
	}

}
