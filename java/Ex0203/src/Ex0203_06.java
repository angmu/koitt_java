import java.util.Scanner;
public class Ex0203_06 {

	public static void main(String[] args) {
		
		
		//�μ��� �Է¹ް� ����ȣ �� ������� ���.????????????
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ù��°���ڸ� �Է��ϼ���");
		int a=scan.nextInt();
		System.out.println("�ι�°���ڸ� �Է��ϼ���");
		int b=scan.nextInt();
		System.out.println("��Ģ������ �Է��ϼ���");
		String op1=scan.next();
		int op=op1.charAt(0);
		float result=0;
				
		switch(op) {
			case '+' :
				result =a+b;
				System.out.println((int)(result));
				break;
			case '-' :
				result =a-b;
				System.out.println((int)(result));
				break;
			case '*' :
				result =a*b;
				System.out.println((int)(result));
				break;
			case '/' :
				result =a/b;
				System.out.println((float)(result));
				break; //�������� �� �ȵȴ�..�̤̤Ф̤�
				
			default :
				System.out.println("�ٸ��� �Է����� �ʾҽ��ϴ�.");
		}		
		
		
		
//		//���� 90���̻��̸� a����> 95���̻��� a+, 80���̻��̸� b����...c d f
//		Scanner scan=new Scanner(System.in);
//		System.out.println("������ �Է��ϸ� ������ ���ɴϴ�.");
//		int score=scan.nextInt();
//		char hak='A';
//		char sh='+';
//		
//		if(score>=90) {
//				hak='A';
//			if(score>=95) {
//				sh='+';
//			}
//			else {
//				sh='-';
//			}
//		}
//		else if (score>=80){
//			 hak='B';
//			if(score>=85) {
//				sh='+';
//			}
//			else {
//				sh='-';
//			}
//		}
//		else if (score>=70){
//			hak='C';
//			if(score>=75) {
//				sh='+';
//			}
//			else {
//				sh='-';
//			}
//		}
//		else if (score>=60){
//			hak='D';
//			if(score>=65) {
//				sh='+';
//			}
//			else {
//				sh='-';
//			}
//		}
//		else {
//			hak='F';
//			}
//			
//		System.out.printf("����� ������ :%c%c",hak, sh);
//		
//		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("���ڸ� �Է����ּ���.");
//		int num=scan.nextInt();
//		
//		if(num<-1 || num>3 && num<5) {//&&(and)��||(or)�������� �� �켱�ȴ�. &&���� ó��!!
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
		
		
		
		
//		//������� (8��)�� �޾Ƽ�  ���Ͽ� 20�� �̻��̸� �̺�Ʈ ��÷�� �Ǿ����ϴ�. ���(�����պ������ǥ ��÷)
//				Scanner scan=new Scanner(System.in);
//				System.out.println("�¾ �⵵�� �Է����ּ���.");
//				int event_year=scan.nextInt();
//				int event=2020-event_year+1;//����
//				
//				if (event>=20){
//					System.out.println("�����պ�Ƽ�Ͽ� ��÷�Ǿ����ϴ�.");
//					
//				}else {
//					System.out.println("�ƽ��Ե� ��÷���� �ʾҽ��ϴ�.");
//				
//				}
		
		
		
		
//		//����. ���̵� ��� ��ġ����id = c /pass 123456
//		
//		//��
//				String id="aaa";//����>�����Ͱ��� ����Ǵµ� ���� ��ü�� ��� �������� �ּҰ� �����̵ȴ�.
//				int pass=12345;
//				Scanner scan=new Scanner(System.in);
//				System.out.println("���̵� �Է��ϼ���");
//				String id_ch=scan.nextLine();
//				
//				System.out.println("�н����带 �Է��ϼ���");
//				int pass_ch=scan.nextInt();
//				
//				
//				
//				if (id_ch.equals(id)){//8���� ������ �ƴѰ��� �������� Ȯ���Ҷ� equals�޼ҵ带 ����Ѵ�.
//					System.out.println("id�� �ֽ��ϴ�.");
//					if(pass_ch==pass) {//if�����ȿ� if�ֱ� ����.
//						System.out.println("�α��εǾ����ϴ�.");
//					}
//					else {
//						System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
//					}
//				}else {
//					System.out.println("id�� ��ġ���� �ʽ��ϴ�.");
//					System.out.println("�ٽ� �Է����ּ���.");
//				}
//				
		
//		//Ǭ��
//		Scanner scan=new Scanner(System.in);
//		System.out.println("���̵� �Է��ϼ���");
//		String id1=scan.nextLine();
//		char id=charAt(0);
//		char id2='c';
//		System.out.println("�н����带 �Է��ϼ���");
//		int pd=scan.nextInt();
//		
//		
//		
//		if ((id==id2)&&(pd==123456)) {
//			System.out.println("�α��ο� �����Ͽ����ϴ�.");
//		}else if(pd!=123456) {
//			System.out.println("��й�ȣ�� Ʋ���ϴ�.");
//		}else if(id!=id2) {
//			System.out.println("���̵� Ʋ���ϴ�.");
//		}
//		else {
//			System.out.println("���̵� Ȥ�� ��й�ȣ�� Ʋ���ϴ�.");
//		}
		
		
		
		
		
		
		
		
//		//��� , 0, ����
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("���ڸ� �Է����ּ���");
//		int x=scan.nextInt();
//		
//		if(x>0) {
//			System.out.println("���");
//		}
//		else if(x==0){
//
//			System.out.println("0");
//		}
//		else {
//			System.out.println("����");
//		
//		}
//		
		
		
		
		
		
		
		
		
		
		
//		//90 A 80B 70C 60D F
//		Scanner scan=new Scanner(System.in);
//
//		System.out.println("������ �Է��ϼ���");
//		int score=scan.nextInt();
//		
//		score /=10;//score=score/10;
//		switch(score) {
//		case 9: case 10://case�� �ش��ϴ°��� �� �־������..
//			System.out.println("����� ������ :"+"A");
//		break;
//
//		case 8:
//			System.out.println("����� ������ :"+"B");
//		break;
//
//		case 7:
//			System.out.println("����� ������ :"+"C");
//		break;
//
//		case 6:
//			System.out.println("����� ������ :"+"D");
//		break;
//
//		default:
//			System.out.println("����� ������ :"+"F");
//	}

		
//		
//		switch(score) {
//			case 90: case 91: case 92://case�� ������ �ȵ��� ���� ���µ�.. �ؼ� ���� �̹������ �ϸ� case�� �ش��ϴ°��� �� �־������..�ؼ� ��ó�� �ϴ°� ����..
//				System.out.println("����� ������ :"+"A");
//			break;
//
//			case 80:
//				System.out.println("����� ������ :"+"B");
//			break;
//
//			case 70:
//				System.out.println("����� ������ :"+"C");
//			break;
//
//			case 60:
//				System.out.println("����� ������ :"+"D");
//			break;
//
//			default:
//				System.out.println("����� ������ :"+"F");
//		}
//		
		
		
//		if(score>=90) {
//			System.out.println("����� ������ :"+"A");
//		}
//		else if(score>=80) {
//			System.out.println("����� ������ :"+"B");
//		}else if(score>=70) {
//			System.out.println("����� ������ :"+"C");
//		}else if(score>=60) {
//			System.out.println("����� ������ :"+"D");
//		}else {
//			System.out.println("����� ������ :"+"F");
//		}
//		
		
		
		
		
		
		
//		Scanner scan= new Scanner(System.in);
//		System.out.println("����� ������ �Է��ϼ���");
//		int check=scan.nextInt();
//		
//		System.out.println(check>=60?"�հ�":"���հ�");	
		
//		//���� ����� �հ� ���հ�
//		
//		if(check>60) {
//			System.out.println("�հ�");}
//		else if(check==60) {
//			System.out.println("�����");
//		}
//		else {
//			System.out.println("���հ�");} //if �� else ������ �߰�ȣ �ȿ� ������ 1�پ��� �ִٸ� ��� �߰�ȣ�� ���������ϴ�.
		
		
		
		
//		if(check>=60) 
//			System.out.println("�հ�");
//		else 
//			System.out.println("���հ�"); //if �� else ������ �߰�ȣ �ȿ� ������ 1�پ��� �ִٸ� ��� �߰�ȣ�� ���������ϴ�.
//		
		
		
		
		
//		Scanner scan= new Scanner(System.in);
//		System.out.println("�ڵ�����ȣ�� �Է��ϼ���");
//		int check=scan.nextInt();

//		//�Ʒ����� switch������ �ٲ� ,, ���ڿ� ���� ���� ����.(���ڿ��� �Ұ�??)
//		
//		switch(check){
//			case 1:
//				System.out.println("sk�Դϴ�.");
//				break;//�� ���̽����� break��� ����ǥ�ø� ���ϸ� �������̽��� break�� ���ö����� ��� ����..����
//			case 6:
//				System.out.println("KTF�Դϴ�.");
//				break;
//			case 9:
//				System.out.println("LG�Դϴ�.");
//				break;
//			default:
//				System.out.println("�߸��� ��ȣ�Դϴ�.");
//				
//		}
		
//		//if���ǹ� . ������ ���Ͽ� ���. ����ó��������� ������ ������ �ӵ��� �������� ������ �ִ�.
//		if(check==1) {
//			System.out.println("sk�ڷ����Դϴ�.");}
//		else if(check==6) {
//			System.out.println("KTF�Դϴ�.");}
//		else if(check==9) {
//			System.out.println("LG�Դϴ�.");}
//		else {
//			System.out.println("�߸��� ��ȣ�Դϴ�.");
//		}//if�� //if�� �־ Ȥ�� if+ else ������ �־ �ȴ�. �߰��� �ٸ� ������ �ְ�ʹٸ� else if�� �߰��ؼ� �߰��� �־��ش�. ,,�������� if�� ���ڸ� �������� ������ ���ڿ�, ����, ���� �� ����.
	
		
	}//main

	
}// class
