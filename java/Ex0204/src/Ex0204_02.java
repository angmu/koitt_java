import java.util.Scanner;

public class Ex0204_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~10������ ������ ã~
		int input_num=0;//�Է��� ����
//		int input_num2=0;
		String out="";//�����Ҷ� Ȯ���ϴ� ���ڿ�
		int ch=(int)(Math.random()*10)+1;//��������
		int count=1;//�� 4������ üũ�ϴ� ����
		String save="";//�Է��� ���ڷ� �����ϴ� ���ڿ�
		Scanner scan=new Scanner(System.in);//��ü����
//	while������	
//		
//		System.out.println("1~100������ ���ڸ� �Է��ϼ���");
//		input_num=scan.nextInt();
//		if(ch==input_num) {
//			System.out.printf("��÷�Դϴ�.��÷��ȣ %d �Է¹�ȣ %d%n",ch,input_num);
//		}
//		else {
//			System.out.printf("��÷�����ʾҽ��ϴ�.��÷��ȣ %d �Է¹�ȣ %d%n",ch,input_num);
//			System.out.println("1~10������ ���ڸ� �Է��ϼ���");
//			input_num2=scan.nextInt();
//			if(ch==input_num2) {
//				System.out.printf("��÷�Դϴ�.��÷��ȣ %d �Է¹�ȣ %d%n",ch,input_num);
//			}
//			else {
//				System.out.printf("��÷�����ʾҽ��ϴ�.��÷��ȣ %d �Է¹�ȣ %d%n",ch,input_num2);
//			}
//			
//		}
//		System.out.println("�ý����� ����Ǿ����ϴ�.");
		
		//���� ���� while�� ��ȯ
		
//		while(true) {
//			System.out.println("1~10������ ���ڸ� �Է��ϼ���");
//			input_num=scan.nextInt();			
//			if(ch==input_num) {
//				System.out.printf("��÷�Դϴ�.��÷��ȣ %d �Է¹�ȣ %d%n",ch,input_num);
//				break;//��÷�Ǹ� �������ü� �ֵ���..
//			}else{
//				System.out.println("��÷�����ʾҽ��ϴ�.�ٽõ����ϼ���");
//				
//			}
//		}
		
//		//x������ ����ǰ�
//		while(true) {
//			System.out.println("1~10������ ���ڸ� �Է��ϼ���");
//			input_num=scan.nextInt();			
//			if(ch==input_num) {
//				System.out.printf("��÷�Դϴ�.��÷��ȣ %d �Է¹�ȣ %d%n",ch,input_num);
//				break;//��÷�Ǹ� �������ü� �ֵ���..
//			}else{
//				System.out.println("��÷�����ʾҽ��ϴ�.�ٽõ����ϼ���");
//				
//			}
//			System.out.println("�����ϰ� �ʹٸ� x�� �����ּ���");
//			out=scan.next();//next�� nextLine�� ����. �ܼ�â���� enter�� �Է¹޾Ҵٰ� �ν���..next�� ����Ű�� ���� �Է����� ���.	
////			char out2=out.charAt(0); 
////			if(out2=='x'||out2=='X'){ //char �񱳴� ==���� ����
////					System.out.println("���α׷��� �����մϴ�.");
////			break;}
//			if(out.equals("x")||out.equals("X")){//��Ʈ���� .equals�� ��
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			}
//		}
		
		
		//�Է�Ƚ�� 4�� ����//�Է��� ���� ������µǵ���..
					
				while(count<=4) {//4������ �ݺ���
					//while�� true�� ����ΰ� for �� if��..
					System.out.println("1~10������ ���ڸ� �Է��ϼ���");
					input_num=scan.nextInt();//�Է��� ����
					save=save+""+input_num;//save + input_num(�����ϴ� ���ڿ�)
					
					
					if(ch==input_num) {
						System.out.println("��÷�Դϴ�");
						break;//��÷�Ǹ� �������ü� �ֵ���..
					}else{
						System.out.println("��÷�����ʾҽ��ϴ�.�ٽõ����ϼ���");
						
					}
					//���α׷� ����Ȯ��
					System.out.println("�����ϰ� �ʹٸ� x�� �����ּ���");
					out=scan.next();//���ڿ��� �Է¹޴� ��ɾ�, next�� nextLine�� ����. �ܼ�â���� enter�� �Է¹޾Ҵٰ� �ν���..next�� ����Ű�� ���� �Է����� ���.	
					char out2=out.charAt(0); //���ں�
					if(out2=='x'||out2=='X'){ //char �񱳴� ==���� ����
							System.out.println("���α׷��� �����մϴ�.");
					break;}
//					if(out.equals("x")||out.equals("X")){//��Ʈ���� .equals�� ��
//						System.out.println("���α׷��� �����մϴ�.");
//						break;
//						
//					}
					count++;
					
				}
				System.out.printf("������ȣ %d �Է¹�ȣ%s :",ch,save);
		
		
		
		
		
		
		
//		int i=10;
//		while(i>=0) {
//			System.out.println(i--);
//		}
		
		
//		for(int i=10;i>=0;i--) {
//			System.out.println(i);
//		}//���� while���� for������ ����
//		
//		
		
		
		
		
		
//		//��øfor�� 3�� ���.
//		
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				for(int k=1;k<=3;k++) {
//					System.out.println(""+i+j+k);
//					
//				}
//			}
//			
//		}
		
		
		
		
//		//*�� �پ���
//		for(int i=10;i>=1;i--) {
//			for(int j=i;j>=1;j--) {
//				System.out.printf("*");
//			}
//			
//			System.out.println();
//		}
		
		
		
//		//*�� �þ��
//		for(int i=1;i<=10;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.printf("*");
//			}
//			
//			System.out.println();
//		}
//		
		
		
		
		//* 10�� ���. (���� 10�� ���� 10��)
		
//		for(int i=1;i<=10;i++) {
//			for(int j=1;j<=10;j++) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
////		
//		
		
//		//2*1 2*3/ 2*5
//		
//		int i,j;
//		for(i=1;i<=9;i+=2) {//Ȧ����
//			for(j=2;j<=9;j++) {
//				System.out.printf("%d*%d=%d ",j,i,i*j);
//			}
//		}
//		
//		
		
		
//		//���� �ι��� �����̱�.
//		int ch=(int)(Math.random()*25)+1;
//		System.out.println("���弱���ȣ :"+ch);
//	
//		
		
		
//		//for���� �̿��ؼ� �������� ����°�
//		int i;//Ȥ�� 2���� �Ѳ����� ���𰡴� ex)int i,j;
//		int j;
//		for(i=2;i<=9;i++) {
//			System.out.println("["+i+"����� ]");
//			for(j=1;j<=9;j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//			System.out.println("---------------------------");
//		}
		
//		//for���� �̿��ؼ� �������� ����°� printf
//				int i;//Ȥ�� 2���� �Ѳ����� ���𰡴� ex)int i,j;
//				int j;
//				for(i=2;i<=9;i++) {
//					System.out.println("["+i+"����� ]");
//					for(j=1;j<=9;j++) {
//						System.out.printf("%d*%d=%d ",i,j,i*j);
//					}
//					System.out.println();//���� ���� �ؿ������� �ϵ��� ���� ����.
//					System.out.println("---------------------------");
//				}
//				
		
		//for���� �̿��ؼ� �������� ����°� printf (������)
//	�̵��Ѵ���int i;//Ȥ�� 2���� �Ѳ����� ���𰡴� ex)int i,j;
//		int j;
//		for(i=2;i<=9;i++) {
//			for(j=1;j<=9;j++) {
//			if(j==1) {System.out.printf("[%d��]  ",j);}
//			
//			}
//			for(j=1;j<=9;j++) {
//				
//				System.out.printf("%d*%d=%2d   ",j,i,i*j);//���� �޸� i�� j�� ��ġ�� �ٲٸ� ���� �ǳ��� 2d�� �����ν� ���Ѱ��� �ڸ����� �°� ����
//			}
//			System.out.println();//
//		}

		
		
		
//		int sum=0;
//		int i=0;
//		for(i=2;i<=100;i +=2) {//Ȥ�� i++ �� i+=2�� ����, i=0�ϸ� �ȴ�. ���� i�� ���� ���Ǵٸ� for�������� int i ��� ������������ �׳� i=1�̷��� �����ؾ��Ѵ�.
//			if(i%2==0) { //���� 3�� ������?? %3==0
//				sum +=i;
//			}
//		}
//		System.out.println("2�� ����� �� :"+sum);
//		System.out.println("������ ���ڰ� :"+(i-2));//�׳��ϸ� 102���ȴ�.. 2�� �������..
		
		
		
		
//		//for(;;){} <-���ѹݺ�.(while�� ���°� ����)
//		//1~100������ 2�� ����� ���� ���� ���Ͽ���
//		int sum=0;
//		for(int i=1;i<=100;i++) {//Ȥ�� i++ �� i+=2�� ����, i=0�ϸ� �ȴ�.
//			if(i%2==0) { //���� 3�� ������?? %3==0
//				sum +=i;
//			}
//		}
//		System.out.println("2�� ����� �� :"+sum);
		//���� ���·δ� System.out.println("������ ���ڰ� :"+i);�� �ؿ� ������ i ����� �ȵȴ�. for�� �ȿ� ��°��� �ְų� i���ۿ� �̸� �����ؾ��Ѵ�.
		
		
		
//		//�հ踦 ���ϴ� �ݺ���(for��)| ���� : for(�ʱ�ȭ;���ǽ�;������){}//������ ������ 2���̻� �����Ҽ��ִ�.
//		int sum=0;//�հ� ����
//		for(int i=1;i<=10;i++) {
//			sum +=i;//sum=sum+i //for�� �߰�ȣ �ȿ� if���� �� �� �ִ�.
//		}
//		System.out.println("1~10������ �� :"+sum);
//		
		
		
		
//		//4���� 10������ ���� �����߻�.
//		int ox=(int)(Math.random()*7)+4;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("4~10�����Ǽ����� 1���� �Է��ϼ���");
//		int input=scan.nextInt();
//		if (input==ox) {
//			System.out.printf("��÷�Ǿ����ϴ�. �Էµ� �� %d, �������� %d",input,ox);
//		}else {
//			System.out.printf("��÷�����ʾҽ��ϴ�. �Էµ� �� %d, �������� %d",input,ox);
//		}
//		
		
		
		
		
//		//�Է°��� 3���� �ް� 1~45���� ���� 1���� ���ߴ� ����.
//		int ox=(int)(Math.random()*45)+1;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("1~45 �� ���ڸ� 1�� ��� �Է��ϼ���");//�ߺ��Ǵ� �̺κе��� �ݺ����̶� �����Ѵ�.
//		int input1=scan.nextInt();
//		System.out.println("1~45 �� ���ڸ� 1�� ��� �Է��ϼ���");
//		int input2=scan.nextInt();
//		System.out.println("1~45 �� ���ڸ� 1�� ��� �Է��ϼ���");
//		int input3=scan.nextInt();
//		if (ox==input1||ox==input2||ox==input3) {
//			System.out.printf("�Է��Ѽ� %d %d %d �������� %d ��÷�Ǿ����ϴ�.", input1, input2, input3, ox);
//			
//		}else {
//			System.out.printf("�Է��Ѽ� %d %d %d �������� %d ��÷�����ʾҽ��ϴ�.", input1, input2, input3, ox);
//			
//		}
		
		
		
		
//		//o,x 1,2(��ǻ���� ������ 1���� 2���� ���ߴ� �Լ�
//		
//		int ox =(int)(Math.random()*2)+1;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("1�� 2�� �����ϴ� ��ȣ�� �Է��ϼ���");
//		int ox_true=scan.nextInt();
//		if(ox==ox_true) {
//			System.out.printf("�����Դϴ�.�������� %d",ox);
//		}else {
//			System.out.printf("�����Դϴ�. ��������%d",ox);
//		}
//		
		
		
		//Math.random();Ŭ����!
		
//		double ran = Math.random();//random�� 0.0~1.0���� ������ ..
//		System.out.println("�������� :"+ran);//double�� 15° �ڸ������� ��Ȯ���� �ִ�.
		
//		double ran = Math.random()+1;//+1�� �ϸ� 1���� ����
//		System.out.println("�������� :"+ran);//double�� 15° �ڸ������� ��Ȯ���� �ִ�.
		
		
		
//		double ran = Math.random()*10;//*10�����ָ� 0~10������ ������ ..
//		System.out.println("�������� :"+ran);//
		
//		int ran = (int)(Math.random()*10);//�������� ���ϸ� int ����ȯ �ʿ�.
//		System.out.println("�������� :"+ran);//
		
//		int ran = (int)(Math.random()*10)+1;//1~10���� ���ϸ� +1�� ���ش�.
//		System.out.println("�������� :"+ran);//
		
//		int ran = (int)(Math.random()*20)+1;//1~20���� ���ϸ� *20)+1�� ���ش�. ���� 2~20������ *19)+2�� ���ش�. 3~20������ *18)+3�� ���ش�.
//		System.out.println("�������� :"+ran);//
		
		
		
	}

}
