import java.util.Scanner;

public class Ex0304_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 1.�ֹι�ȣ�� �Է¹޾� �������� �������� Ȯ��.
		int selec;
		while (true) {
			switch (selec = print()) {

			case 1:
				System.out.println("�ֹι�ȣ�� �Է��ϼ��� (-���� ���ڸ� �Է�)");
				jumin(scan.nextLine());
				break;

			case 2:
				System.out.println("�й��� �Է����ּ���");
				major(scan.nextLine().charAt(0)+"");
				break;

			case 3:
				System.out.println("�װ��� ��ȣ�� �Է��ϼ���");
				airport(scan.nextLine().substring(0,2));
				break;
			
				
			case 4:
				System.out.println("�̸����� �Է��ϼ���");
				email(scan.nextLine());
				break;
			case 5:
				System.out.println("��й�ȣ�� �������ּ��� (Ư������ !, \", #, $, %, &�� ����)");
				System.out.println("(Ư�� 1�� �빮�� 1�� ���̴� 8�ڸ� �̻�)");
				pass(scan.nextLine());
				break;
				
			case 6:
				System.out.println("�ֹι�ȣ�� �и�");
				String a="010101-1234567";
				String[]r=a.split("-", 2);
				for(int i=0;i<r.length;i++) {
					System.out.println(r[i]);
				}
				break;
			case 7:
				System.out.println("��ȭ��ȣ�� �и�");
				String b="010-0000-0000";
				String[]r2=b.split("-", 3);
				for(int i=0;i<r2.length;i++) {
					System.out.println(r2[i]);
				}
			case 8:
				System.out.println("��й�ȣ ������ֱ�");
				String pw="   zbc bcx   ";
				System.out.println(pw);
				pw=pw.trim();
				System.out.println(pw);
				//�߰����� ���ֱ�
				pw=pw.replaceAll(" ","");
				System.out.println(pw);
				break;
			case 99:
				break;
			default:
				continue;

			}

		}

		// 2.�й��� �Է¹޾� ������������ Ȯ���Ͻÿ�
		// ��ǻ�� �а� c0001
		// �����а� e0002
		// �����а� k0003

		// 3.�ѱ�(kor),
	}// main

	static int print() {
		Scanner scan = new Scanner(System.in);
		System.out.println("���дٽ����α׷�");
		System.out.println("1)����Ȯ�����α׷�	2)�а��Ǻ����α׷� 	3)�װ���Ȯ�� ���α׷�	4)�̸��� �Է�	5)��й�ȣ ����	6)�ֹι�ȣ �и�	7)��ȭ��ȣ�� �и� 	8)������鳯����");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ��� (���� 99)>>");
		int selec = scan.nextInt();
		scan.nextLine();
		return selec;
	}
	
	static void jumin(String jumin) {
		//13�ڸ��� �ț�����
		if(jumin.length()!=13) {
			System.out.println("�߸��� �ֹι�ȣ �Է�. �ٽ��Է����ּ���");
			return;
		}
		//���ڸ� �Է� ��������
		for(int i=0;i<jumin.length();i++) {
			if(!(jumin.charAt(i)-'0'>=0&&jumin.charAt(i)-'0'<=9)) {
				System.out.println("���ڸ� �Է°����մϴ�.");
				return;
			}
		}
		//�ֹι�ȣ ��� -����
		System.out.println(jumin.substring(0, 6)+"-"+jumin.substring(6, 13));
		if(jumin.charAt(6)=='2'||jumin.charAt(6)=='4') {
			System.out.println("������ ������ �����Դϴ�.");
		}else if(jumin.charAt(6)=='1'||jumin.charAt(6)=='3') {
			System.out.println("������ ������ �����Դϴ�.");
		}else {
			System.out.println("�ֹι�ȣ�� �߸� �Է��Ͽ����ϴ�.");
		}
	}
	static void major(String major) {
		if(major.equalsIgnoreCase("k")) {
			System.out.println("������ �а��� �����а��Դϴ�.");
		}else if(major.equalsIgnoreCase("c")) {
			System.out.println("������ �а��� ��ǻ���а��Դϴ�.");
		}else if(major.equalsIgnoreCase("e")) {
			System.out.println("������ �а��� �����а��Դϴ�.");
		}else {
			System.out.println("�ش��ϴ� �а��� �����ϴ�.");
		}
	}
	static void airport(String airport) {
		if(airport.equalsIgnoreCase("ke")) {
			System.out.println("������ �װ���� �����װ��Դϴ�");
		}else if(airport.equalsIgnoreCase("oz")) {
			System.out.println("������ �װ���� �ƽþƳ��Դϴ�.");
		}else {
			System.out.println("�ش��ϴ� �װ��簡 �����ϴ�.");
		}
	}
	//�̸���üũ
	static void email(String a) {
		if(a.contains("@")==false||a.contains(".")==false) {
			System.out.println("�̸����� �߸� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���");
			return;
		}
		System.out.println("������ �̸����ּҴ� "+a);
			
		}
	static void pass(String a) {
		int count=0;
		//trim
		if(!(a.length()>=8)) {
			System.out.println("��й�ȣ�� ���̰� ª���ϴ�.");
			return;
		}
		for(int i=0;i<a.length();i++) {
			//���� ��ҹ���,���� ���� Ư�����ڶ�� ģ�ٿ�.
			if(!(a.charAt(i)>='A'&&a.charAt(i)<='Z'||a.charAt(i)>='!'&&a.charAt(i)<='&')) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("�빮�ڳ� Ư�����ڰ� 1���̻� ���ԵǾ�� �մϴ�.");
			return;
		}
		System.out.println("��й�ȣ�� �� �����Ǿ����ϴ�.");
			
		}
	//��й�ȣ üũ
	
}// class
