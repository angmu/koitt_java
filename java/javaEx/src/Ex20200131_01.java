
public class Ex20200131_01 {

	public static void main(String[] args) {//���� Ŭ������ ��������. main�� ���� ctrl+�����̽����ص� ���.
		

//		<0.������ ǥ���>		
//		boolean power =true;
//		char ch ='A';
//		char ch2 ='\u0041'; // \�� ��ȭǥ��W����� ������ ���´� :D
//		char tab ='\t';
//		byte b= 127;
//		short s = 32767;
//		int i = 100; //������ ���� �⺻��... 
//		int oct = 0100;
//		int hex = 0x100;
//		long l =10000000000L; //���� �� int�� ĳ�� �ȵɶ� ��� int�� �������� ���Ͽ� L�� ������ ǥ�õȴ�.
//		float f = 3.14f; //�Ǽ��� �⺻������ ������ ���̸� �ֱ����� f�� �ڿ� ���ش�.
//		double d = 3.14d; //�Ǽ����� ������ ���� �ȽἭ d�� �Ƚ��൵ �ȴ� :D
//		float f2 = 100f;
//		
//		
//		System.out.println(power);
//		System.out.println(ch);
//		System.out.println(ch2);
//		System.out.println(tab);
//		System.out.println(b);
//		System.out.println(s);
//		System.out.println(i);
//		System.out.println(oct);
//		System.out.println(hex);
//		System.out.println(l);
//		System.out.println(d);
//		System.out.println(f2);
//	----------------------------------------------	
		
//      <1.�׳� �����ϱ�/>		
//		int score=10; //int�� ����. �Ҽ��� ���ڸ� �Է��ص� ������ ���
//		int num=5;
//		final int NUM2=12; //final�� ���ǥ�� >>
//		
//		
//		//kor, eng, 100 ,99
//		int kor=100;
//		int eng=99;
//		
//		String str = "abcdef";
//		//String str1= new String("abc");
//		//���� ��ó�� ����ϳ� �߾��⶧���� ��ó�� �ٿ��ᵵ �ǵ��� �Ѵ�.
//		
//		//Ex20200131_02 str3 =new Ex20200131_02();
//		
//		//Ex20200131_02Ŭ������ ������ �����Ѵ�.
		//������ ����� �������� ctrl+d , �ּ���ȯ  ���� Ȥ�� Ǯ��. ctrl+/ 	

		//		
//		
//		num=3;
//		
//		System.out.println("�μ��� �� :"+score*num); //ȭ���� ��µǴ� ��ɾ� sysout + ctrl+�����̽���, system.out.println();<<print in�� �ƴ϶� ln(��)�̴�.. ����
//		System.out.println("����� �� :"+NUM2); //���ڸ� ����ϰ� �������� "" �ȿ� ���� ���� +(���ļ� ����϶�� �ǹ�)�� ���ش�.
//	
//		System.out.println("kor�� eng�� ��"+(kor+eng));
//		System.out.println("kor�� eng�� ��"+(kor-eng));//���ڸ� ���޴��� ������ ���ٸ� ���� �������� ��ȣ�� �����ش�.
//		System.out.println("kor�� eng�� ��"+(kor*eng));
//		System.out.println("kor�� eng�� ������"+(kor/eng));
		
		
//		------------------------------------------------------------------------------	
//		<2.�ƽ�Ű �ڵ庯ȯ>
//		char ch='a';
//		char ch2='A';
//		
//		char ch3=65;
//		char ch4=65+1;
//		char ch5=97-32; //�ƽ�Ű�ڵ�󿡼� �빮�ڿ� �ҹ��� ���� ���� ���̴� 32�̴�.(�ҹ��ڿ��� 32�� ���� �빮�ڷ� ��ȯ,�빮�ڿ��� 32�� ���ϸ� �ҹ��ڷ� ��ȯ)
//		
//		System.out.println("ch���� ��� :"+ch);
//		System.out.println("ch2���� ��� :"+ch2);
//		System.out.println("ch3���� ��� :"+ch3);//�ƽ�Ű �ڵ�� ��ȯ�Ǿ� ���´�..���ڸ� �ᵵ ������ ��������..�Ѥ�
//		System.out.println("ch4���� ��� :"+ch4);//�ƽ�Ű �ڵ�
//		System.out.println("ch5���� ��� :"+ch5);//�ƽ�Ű �ڵ�
//		
//		
	
//		//����1 . ���� �빮��c�� �ҹ��ڷ� ����غ�����.
//		
//		char ch0=67;
//		char ch1=67+32;
//		
//		System.out.println("�빮��"+ch0);
//		System.out.println("�빮��C�� �ҹ��ڷ� ���"+ch1);
//		
//		
//		
//		//����2 . �ҹ���k�� �빮�ڷ� ����غ�����.
//		
//		
//		
//		char ch2=107;
//		char ch3=107-32;
//		
//		System.out.println("�ҹ���"+ch2);
//		System.out.println("�ҹ���k�� �빮�ڷ� ���"+ch3);
//		
		
//----------------------------------------------------------------		
		
//		<3.String�� char�� ����>
//		
//		char ch='A'; //char�� ���ڿ��� ''(����ǥ)�� ����Ѵ�.
//		//���� char ch='AB'; //char���� ���ڰ� 1���� ����.(������ ������ �������� �θ� ����..)
//		//����char ch=''
//		String sl="AB";//String������ ���ڴ� ""(�ֵ���ǥ)�� ����Ѵ�. (�������� ����ֵ� �ȴ�.)
//		String sl2="";		
//				
//		System.out.println(ch);
//		System.out.println(sl);
//		System.out.println(sl2);
//		
		
//----------------------------------------------------------------		
		
//		<4.������ ���ڸ� ���ϸ�??>
//		
//		String s1="a"+"b";
//		String s2=""+7;//����7�� �ƴ� ����7, ��Ģ����Ұ�.
//		String s3=""+7+7;//����+�����ؼ� 7(����) ����+�����ؼ� �Ǵٽ� 7 �ؼ� 77�̴�.
//		String s4=7+7+"";//����+����+���ڶ� ���� 2������ ���� 14 �� ���ڰ��ȴ�.
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		
//------------------------------------------------------------------
		
		
		
//		<5.������ �����÷ο�>
//		byte b=127;
//		b=(byte) (b+1);//b=b+1�� ���� ������ �� �ִ�. byte+int�� int�� �ȴ�.. �ؼ� (byte)��� �տ� ������ ����� ������ �ȳ���.
//		
//		System.out.println(b);
//		
		
//		int a=100000000;
//		int b=200000000;
//		long c=a*b; //�������� a��b��c�´� long���� ������ ��..
//		
//		System.out.println(c);
//		
//		---------------------------------------------
		
////	<6.����ȯ>
//		
//		float f=1.6f;
//		int i=(int)f; //���� ������ ������ �� ����ȯ�� ������Ѵ�. �ȱ׷��� ������..��
//
//		System.out.println(i);
//		
//		int j=5;
//		float k=j;
//		
//		System.out.println(k);///ū������ ������ �����ϴ�. 
//		
//		int ch=65;
//		char c=(char)ch;//����ȯ�� �� ������Ѵ�.
//		
//		System.out.println(c);
//		
//		char d='a';
//		int ch2=d;
//		System.out.println(ch2);//�ƽ�Ű�ڵ�ȭ! ������ ��ȯ�ȴ�.
//		
//		int i2=300;
//		byte b2=(byte)i2;
//		System.out.println(b2);
////		--------------------------------
		
		
////	<7.����������>>>>���� �� ����>
		//++�� ���ڿ� +1�� ���������ִ� �������̴�.
		
//		int i=5;
//		int j=0;
//		j=++i;//������ ����.
//
//		System.out.println("i�� �� :"+i);
//		System.out.println("j�� �� :"+j);
//	
//		int i2=5;
//		int j2=0;
//		j2=i2++; //������ ����.
//		
//		System.out.println("i2�� �� :"+i2);
//		System.out.println("j2�� �� :"+j2);
//		
////		
//		//--�� ���ڿ� -1�� ���������ִ� �������̴�.
//		
//		int p=5;
//		int q=0;
//		q=--p;//���� ����
//		
//		System.out.println(q);
//		System.out.println(p);		
//			
//		
//		int p2=5;
//		int q2=0;
//		q2=p2--;//�����Ļ���.  �ڡڡں����� �� ���·� ���� ����Ѵ�.
//		
//		System.out.println(q2);
//		System.out.println(p2);		
//		
//		
		
//		<8.���������� ����ȯ �ڡڡڰ�������� ����� �ؾ��Ѵ�..>
//		byte a=10;
//		byte b=20;
//		byte c=(byte) (a+b); //+�� �ϴ¼��� �ڵ����� int�� ��ȯ�Ǿ� ������ �����ִ�. �ؼ�byte�� ��ȯ������Ѵ�. (������ �����ؼ� ��ȣ�� ������Ѵ�..)
//		
//		System.out.println(c);
//		
//		
//		int d=1000000;
//		int e=2000000;//������ġ�¹� 1. �Ѵ� d�� e���� long����.. Ȥ�� d��e �� 1���� long����..
//		long f=d*e;//Ȥ�� ������� long f=(long)d*e�� 1���� long���� ��ȯ..
//		
//		System.out.println(f);
//		
//		int a2=10;
//		int b2=3;
//		double c2=a2/(double)b2;//�Ҽ������� �ȹٷ� ������ �ϰ������ a2�� b2�� (double)����ȯ�� �����ش�.
//		
//		System.out.println(c2);
//		
//		
//		int a4=1000000;
//		int b4=1000000;
//		
//		int c4=a4*b4/b4; //������ �����ϸ鼭 int�� �����÷ο찡�Ǿ� ����.
//		int d4=a4/b4*b4;
//		
//		System.out.println(c4);
//		System.out.println(d4);
//	
//		char c1='a';
//		char c6=(char) (c1+1);//���ڿ� int�� ���Ͽ� int���Ǿ��µ�char�� �������ؼ� ����.(char)�� �־����.
//		
//		
//		System.out.println(c6);
		
		
//		char q= ++q;
//	System.out.println("���� �����ΰŽó���.."+q);
		
//				
//		int i='B'-'A'; 		
//		System.out.println(i);
//		
//		int i5='2'-'0';
//		System.out.println(i5);
//		
		
		
//		char t='7';
//		char o='0';
//		char u='2';
//		
//		int z= t-o; //���������ڸ� ������ ���ڷ� �����ϰ� �������� ������ �ڿ� 0�̶�°��� ���ָ�ȴ�. (int�� ���Ѵ�..)
//		
//		System.out.println("����7���ϱ� ����0:"+t+o);
//		
//		
//		float pi=3.141592f;
//		float shortPi = (int)(pi*10000)/10000f; //�Ҽ���3�ڸ������� ������� (pi���� ���ڿ� ������ ������ �ڸ��������� ��Ƴ��� �Ҽ����ڸ����� �ٲ��.
//		
//
//		System.out.println("�Ҽ���4�ڸ�������:"+shortPi); 
		
//<���� �Ҽ��� 2�ڸ������� ������ a�� b�� ���� ���� ���ض�.		
		
//		int a=10;
//		int b=3;
//		float c=(float)a/b;//double�� 15�ڸ������� ��Ȯ, float�� ��� 8�ڸ������� ��Ȯ.
//		float shortc=(int)(c*100)/100f;//100f��� 100.0���� �ص��ȴ�. :D
//		
//	
//		System.out.println(c);
//		System.out.println(shortc);
//	
//	
	//	<�ݿø�>
//		float pi=3.141592f;
//		float shortPi = Math.round(pi*1000)/1000f;
		
		float c=(float) 7.2399981;
		float roundc=Math.round(c*100)/100f;
		System.out.println(roundc);
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
