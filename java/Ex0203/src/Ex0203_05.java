import java.util.Scanner;//�Ʒ� ��ĵ�� ������ ������ ���� ��ĵǥ�ø� �ؾ��Ѵ�..�ڵ����� �Է��� �Ǿ��� '0';;

public class Ex0203_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //void�� ã���� main �� ã���� �ִ�.
		
		
		
		
		
		//����. 2�� ���? 2�� ���, 2�� ��� �ƴ�.
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int a1=a%2;//%���ڴ� ���ڷ� ������������ �ٷ� ����ؼ� �������� ����.
		System.out.println(a1==0?"2�ǹ��":"2�ǹ���� �ƴ�");
		
		
		
//		//����.ȸ����ȣ 4�ڸ��� �Է¹޾Ƽ� ȸ������� �����ϴ� ��. vip 10 gold 20 silver 30
//		
//		//��
//		Scanner scan=new Scanner(System.in);
//		System.out.println("ȸ����ȣ�� �Է��ϼ���");
//		String member=scan.nextLine();
//		int num=member.charAt(0)-'0';
//		String str=num==1?"vip���":num==2?"gold���":"silver���";
//		
//		
//		System.out.printf("ȸ���� ����� %s�Դϴ�.",str);
//		
//		
		
//		����
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("ȸ����ȣ�� �Է��ϼ���");
//		String point=scan.nextLine();
//		char a=point.charAt(0);
//		int a1=a-'0';
//		
//		System.out.println("ȸ���� �����?"+(a1==1?"vip":(a1==2?"gold":"silver")));
//		
		
		
		
		
		
		
//		//����. ������ 60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ�
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("������ �Է����ּ���");
//		int score=scan.nextInt();
//		
//		System.out.println("�հݿ��� :"+(score>=60?"�հ�":"���հ�"));
//		
		
		
		
		
		
		
//		//����. �Է¹��� ���� ����� ������ ���ڰ�, ������ ������� ���ڰ�, 0�̸� 0�̶��  ��µǵ��� �Ѵ�.
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("���ڸ� �Է����ּ���");
//		int x=scan.nextInt();
//		System.out.println("x��?"+(x>0?"���":(x<0?"����":"0")));//���� ����Ű ctrl+f11
//		
//		
		
		
		
		
		
//		//���밪�� ����ϴ� ��.
//		Scanner scan=new Scanner(System.in);
//		System.out.println("���ڸ� �Է��ϼ���");
//		int x=scan.nextInt();
//		System.out.println("x�� ���밪�� ?"+(x>=0?x:-x));
//		
//		//����. �Ǽ� �Ҽ��� 5°�ڸ� ���ڸ� �Է¹޾Ƽ� 4°�ڸ����� �ݿø��� ���� ����Ͻÿ�.
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("�Ҽ��� 5�ڸ� ���� ���� �ִ� �Ǽ��� �Է��Ͻÿ�");
//		double input1=scan.nextDouble();
//		System.out.println("�Ҽ��� 4�ڸ� ��"+(Math.round(input1*1000))/1000.0);//�������� �׳�1000�� �ع����� ������ �ǹ�����. ������ ���� .0 Ȥ�� d�� ���̸� ���������� ��µȴ�.
//		
		
		
		//�ݿø�, �ø� ,����..
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("�Ǽ��� �Է��ϼ���");
//		
//		double num1= scan.nextDouble();
//		System.out.println("round �����ϱ��?"+Math.round(num1));//�ݿø�
//		System.out.println("ceil �����ϱ��?"+Math.ceil(num1));//�ø�
//		System.out.println("floor �����ϱ��?"+Math.floor(num1));//����
//		
	}

}
