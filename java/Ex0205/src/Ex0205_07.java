import java.util.Scanner;

public class Ex0205_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for���� ����ؼ� �հ踦 ���Ұ�.
		//5�� ����� �����ؼ� ������ ���� ���ϴ� ���α׷�
		//2~40���� ���ڸ� ���ϴµ�>> 5�� ����� �����ϰ� �հ踦 ���Ͻÿ�
		//�� ��� ���ϱ⸦ �޴����� �Բ� ����� �غ�����

		int check=0;
		int sum=0;
		int i=0;
		int num2=0;
		int num1=0;
		int i2=0;
		int age=0;//����
		String jumin="";//�ֹι�ȣ
		String mf="";//����
		Scanner scan=new Scanner(System.in);
		loop1:
		while(true) {
		
			System.out.println("[���ռ��� ���α׷�]");
			System.out.println("1> �μ��� ���ϴ� ���α׷�");
			System.out.println("2> �ֹι�ȣ ���̰�����α׷�");
			System.out.println("3> �ֹι�ȣ ���� Ȯ�� ���α׷�");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���. (���� : 99)");
			
			check =scan.nextInt();
			
			if(check==99) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
				
			}
			else if(!(check>=1&&check<=3)) {
				System.out.println("1~3������ ���� �Է����ּ���");
				continue;
			}
		
			
			switch(check) {
			
			
				case 1 : //�μ��� ��
					//99�� ������ ����ǰ� ���ѷ���		
					while(true) {
						System.out.println("���Ϸ����ϴ� ������ ���� 2�� �Է��Ͻÿ� (�շ� 99 ���� 0)");
						num1=scan.nextInt();
						
						if(num1==99) {
							System.out.println("���α׷��� �����մϴ�.");
							break loop1;
						}
						if(num1==0) {
							System.out.println("���α׷��� �����մϴ�.");
							continue loop1;
						}
						
						//num�� num2���� ũ�� ġȯ�ϴ� �ݺ���
						while(true) {
							System.out.println("���Ϸ����ϴ� ������ ���� 1�� �� �Է��Ͻÿ�");
							num2=scan.nextInt();
							
							if(num1>num2) {//5>2
								i2=num2;
								num2=num1;
								num1=i2;
								break;
							}else {
								break;
							}
						}
						for(i=num1;i<=num2;i++) {
							
							sum+=i;
						}
						System.out.println(num1+"����"+num2+"������ �հ� :"+sum);	
					}
					
				case 2 :
					//�ֹι�ȣ ���̰��
					while(true) {
						//ex)880101-1011198
						System.out.println("�ֹι�ȣ�� �Է����ּ��� (�����̵� :0, ���� : 99)");
						jumin=scan.next();//�̶���..next�� �ٲ�� �ϴ°�..;��;
						
						if(jumin.equals("99")) {
							System.out.println("���α׷��� �����մϴ�.");
							break loop1;
						}
						if(jumin.equals("0")) {
							System.out.println("�����޴��� �̵��մϴ�.");
							continue loop1;
						}
						
						//jumin��ȣ ���
						//charAt(0)
						if(jumin.charAt(7)=='1'||jumin.charAt(7)=='2') {
							String ju_check=19+jumin.substring(0,2);
							//�ڸ� �κ�,�ڸ��κ�+1�� ���� �Է��ϸ� String�� ���·� �����´�. ���� ���ô�θ� 88�� �����´�.
							age=2020-Integer.parseInt(ju_check)+1;
						}else if(jumin.charAt(7)=='3'||jumin.charAt(7)=='4'){
							String ju_check=20+jumin.substring(0,2);
							//�ڸ� �κ�,�ڸ��κ�+1�� ���� �Է��ϸ� String�� ���·� �����´�. ���� ���ô�θ� 88�� �����´�.
							age=2020-Integer.parseInt(ju_check)+1;
						}else {
							System.out.println("�ֹι�ȣ�� �߸��Ǿ����ϴ�. �ٽ��Է����ֽʽÿ�");
							continue;
						}
						
						//7��° ���ڸ� ���Ͽ� 1,2�� ���  �ֹ� �� 2�ڸ� �տ� 19�� ���ְ� 3,4�� ��� �ֹ� �� 2�ڸ� �տ� 20�� ���ش�. 
						System.out.println("������ ���̴� "+age+"�Դϴ�");
						
						
					}
					
					
					
					
				case 3 :
					//�ֹι�ȣ ���౸��
					while(true) {
						//ex)880101-1011198
						System.out.println("�ֹι�ȣ�� �Է����ּ��� (�����̵� :0, ���� : 99)");
						jumin=scan.next();//�̶���..next�� �ٲ�� �ϴ°�..;��;
						if(jumin.equals("99")) {
							System.out.println("���α׷��� �����մϴ�.");
							break loop1;
						}
						if(jumin.equals("0")) {
							System.out.println("�����޴��� �̵��մϴ�.");
							continue loop1;
						}
						
						//jumin��ȣ ���
						//charAt(0)
						if(jumin.charAt(7)=='1'||jumin.charAt(7)=='3') {
							mf="����";
						}else if(jumin.charAt(7)=='2'||jumin.charAt(7)=='4'){
							mf="����";
						}else {
							System.out.println("�ֹι�ȣ�� �߸��Ǿ����ϴ�. �ٽ��Է����ֽʽÿ�");
							continue;
						}
						
						//7��° ���ڸ� ���Ͽ� 1,2�� ���  �ֹ� �� 2�ڸ� �տ� 19�� ���ְ� 3,4�� ��� �ֹ� �� 2�ڸ� �տ� 20�� ���ش�. 
						System.out.println("������ ������ "+mf+"�Դϴ�");
						
						
					}
					
					
				default :
			
			}//����ġ
			
			
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int sum=0;
//		int i=0;
//		int num2=0;
//		int num1=0;
//		int i2=0;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("���Ϸ����ϴ� ������ ���� 2�� �Է��Ͻÿ�");
//		num1=scan.nextInt();
//		//num�� num2���� ũ�� ġȯ�ϴ� �ݺ���
//		while(true) {
//			System.out.println("���Ϸ����ϴ� ������ ���� 1�� �� �Է��Ͻÿ�");
//			num2=scan.nextInt();
//			
//			if(num1>num2) {//5>2
//				i2=num2;
//				num2=num1;
//				num1=i2;
//				break;
//			}else {
//				break;
//			}
//		}
//		for(i=num1;i<=num2;i++) {
//			
//			sum+=i;
//		}
//		System.out.println(num1+"����"+num2+"������ �հ� :"+sum);	
//		
		
		
		
		
		
//		int sum=0;
//		int i=0;
//		int num2=0;
//		int num1=0;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("���Ϸ����ϴ� ������ ���� 2�� �Է��Ͻÿ�");
//		num1=scan.nextInt();
//		//num�� num2���� Ŭ�� �ٽ� �Է��� �޴� �ݺ���
//		while(true) {
//			System.out.println("���Ϸ����ϴ� ������ ���� 1�� �� �Է��Ͻÿ�");
//			num2=scan.nextInt();
//			
//			if(num1>num2) {//5>2
//				System.out.println(num1+"�� ���ں��� ū ���� �����ÿ�");
//			}else {
//				break;
//			}
//		}
//		for(i=num1;i<=num2;i++) {
//			
//			sum+=i;
//		}
//		System.out.println((i-1)+"��°"+"�հ� :"+sum);	
//		
		
//		
//		int sum=0;
//		int i=0;
//
//		for(i=1;i<=50;i++) {
//			
//			sum+=i;
//		}
//		System.out.println((i-1)+"��° ���� �հ� :"+sum);	
	
	
	
//		int sum=0;
//		int i=0;
//		int cnt=0;
//		for(i=2;i<=40;i++) {
//			
//			if(i%5==0) {
//				continue;
//			}
//			sum+=i;
//			cnt++;
//		}
//		System.out.println("�հ� :"+sum);
//		System.out.println("���� Ƚ�� :"+(cnt));
//	

	
	
	
	}

}
