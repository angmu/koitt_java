
public class Ex20200131_01 {

	public static void main(String[] args) {//메인 클래스를 먼저지정. main을 쓰고 ctrl+스페이스바해도 뜬다.
		

//		<0.변수의 표기법>		
//		boolean power =true;
//		char ch ='A';
//		char ch2 ='\u0041'; // \는 원화표시W모양을 누르면 나온다 :D
//		char tab ='\t';
//		byte b= 127;
//		short s = 32767;
//		int i = 100; //정수의 가장 기본값... 
//		int oct = 0100;
//		int hex = 0x100;
//		long l =10000000000L; //정수 중 int로 캐리 안될때 사용 int와 구분짓기 위하여 L로 끝마쳐 표시된다.
//		float f = 3.14f; //실수의 기본값으로 정수와 차이를 주기위해 f를 뒤에 써준다.
//		double d = 3.14d; //실수에서 쓰지만 거의 안써서 d를 안써줘도 된다 :D
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
		
//      <1.그냥 대입하기/>		
//		int score=10; //int는 정수. 소수점 숫자를 입력해도 정수를 출력
//		int num=5;
//		final int NUM2=12; //final은 상수표시 >>
//		
//		
//		//kor, eng, 100 ,99
//		int kor=100;
//		int eng=99;
//		
//		String str = "abcdef";
//		//String str1= new String("abc");
//		//원래 위처럼 써야하나 잘쓰기때문에 위처럼 줄여써도 되도록 한다.
//		
//		//Ex20200131_02 str3 =new Ex20200131_02();
//		
//		//Ex20200131_02클래스의 변수를 참조한다.
		//한줄을 지우고 싶을때는 ctrl+d , 주석변환  지정 혹은 풀기. ctrl+/ 	

		//		
//		
//		num=3;
//		
//		System.out.println("두숫자 합 :"+score*num); //화면이 출력되는 명령어 sysout + ctrl+스페이스바, system.out.println();<<print in이 아니라 ln(린)이다.. 읍읍
//		System.out.println("상수의 값 :"+NUM2); //글자를 출력하고 싶을때는 "" 안에 글을 쓰고 +(합쳐서 출력하라는 의미)를 써준다.
//	
//		System.out.println("kor와 eng의 합"+(kor+eng));
//		System.out.println("kor와 eng의 차"+(kor-eng));//글자를 더햇더니 에러가 난다면 뒤의 변수쪽을 괄호로 묶어준다.
//		System.out.println("kor와 eng의 곱"+(kor*eng));
//		System.out.println("kor와 eng의 나눈값"+(kor/eng));
		
		
//		------------------------------------------------------------------------------	
//		<2.아스키 코드변환>
//		char ch='a';
//		char ch2='A';
//		
//		char ch3=65;
//		char ch4=65+1;
//		char ch5=97-32; //아스키코드상에서 대문자와 소문자 간의 숫자 차이는 32이다.(소문자에서 32를 빼면 대문자로 변환,대문자에서 32를 더하면 소문자로 변환)
//		
//		System.out.println("ch문자 출력 :"+ch);
//		System.out.println("ch2문자 출력 :"+ch2);
//		System.out.println("ch3숫자 출력 :"+ch3);//아스키 코드로 변환되어 나온다..숫자를 써도 에러는 나지않음..ㅡㅡ
//		System.out.println("ch4숫자 출력 :"+ch4);//아스키 코드
//		System.out.println("ch5숫자 출력 :"+ch5);//아스키 코드
//		
//		
	
//		//예제1 . 문제 대문자c를 소문자로 출력해보세요.
//		
//		char ch0=67;
//		char ch1=67+32;
//		
//		System.out.println("대문자"+ch0);
//		System.out.println("대문자C를 소문자로 출력"+ch1);
//		
//		
//		
//		//예제2 . 소문자k를 대문자로 출력해보세요.
//		
//		
//		
//		char ch2=107;
//		char ch3=107-32;
//		
//		System.out.println("소문자"+ch2);
//		System.out.println("소문자k를 대문자로 출력"+ch3);
//		
		
//----------------------------------------------------------------		
		
//		<3.String과 char의 차이>
//		
//		char ch='A'; //char의 문자에는 ''(따옴표)를 사용한다.
//		//에러 char ch='AB'; //char에는 숫자가 1개만 들어간다.(무조건 들어가야함 공백으로 두면 에러..)
//		//에러char ch=''
//		String sl="AB";//String에서의 문자는 ""(쌍따옴표)를 사용한다. (공백으로 내비둬도 된다.)
//		String sl2="";		
//				
//		System.out.println(ch);
//		System.out.println(sl);
//		System.out.println(sl2);
//		
		
//----------------------------------------------------------------		
		
//		<4.정수와 문자를 더하면??>
//		
//		String s1="a"+"b";
//		String s2=""+7;//숫자7이 아닌 문자7, 사칙연산불가.
//		String s3=""+7+7;//문자+정수해서 7(문자) 문자+정수해서 또다시 7 해서 77이다.
//		String s4=7+7+"";//정수+정수+문자라서 정수 2개먼저 개산 14 후 문자가된다.
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		
//------------------------------------------------------------------
		
		
		
//		<5.정수의 오버플로우>
//		byte b=127;
//		b=(byte) (b+1);//b=b+1로 쓰면 에러날 수 있다. byte+int는 int가 된다.. 해서 (byte)라고 앞에 선언을 해줘야 에러가 안난다.
//		
//		System.out.println(b);
//		
		
//		int a=100000000;
//		int b=200000000;
//		long c=a*b; //에러나면 a랑b랑c셋다 long으로 만들어야 함..
//		
//		System.out.println(c);
//		
//		---------------------------------------------
		
////	<6.형변환>
//		
//		float f=1.6f;
//		int i=(int)f; //작은 쪽으로 들어갈때는 꼭 형변환을 해줘야한다. 안그러면 에러남..★
//
//		System.out.println(i);
//		
//		int j=5;
//		float k=j;
//		
//		System.out.println(k);///큰쪽으로 들어갈때는 괜춘하다. 
//		
//		int ch=65;
//		char c=(char)ch;//형병환을 꼭 해줘야한다.
//		
//		System.out.println(c);
//		
//		char d='a';
//		int ch2=d;
//		System.out.println(ch2);//아스키코드화! 정수로 변환된다.
//		
//		int i2=300;
//		byte b2=(byte)i2;
//		System.out.println(b2);
////		--------------------------------
		
		
////	<7.증감연산자>>>>전위 와 후위>
		//++는 숫자에 +1을 증가시켜주는 연산자이다.
		
//		int i=5;
//		int j=0;
//		j=++i;//더한후 대입.
//
//		System.out.println("i의 값 :"+i);
//		System.out.println("j의 값 :"+j);
//	
//		int i2=5;
//		int j2=0;
//		j2=i2++; //대입후 더함.
//		
//		System.out.println("i2의 값 :"+i2);
//		System.out.println("j2의 값 :"+j2);
//		
////		
//		//--는 숫자에 -1을 증가시켜주는 연산자이다.
//		
//		int p=5;
//		int q=0;
//		q=--p;//뺀후 대입
//		
//		System.out.println(q);
//		System.out.println(p);		
//			
//		
//		int p2=5;
//		int q2=0;
//		q2=p2--;//대입후뺀다.  ★★★보통은 이 형태로 많이 사용한다.
//		
//		System.out.println(q2);
//		System.out.println(p2);		
//		
//		
		
//		<8.이형연산자 형변환 ★★★곱셈연산시 고려를 해야한다..>
//		byte a=10;
//		byte b=20;
//		byte c=(byte) (a+b); //+를 하는순간 자동으로 int로 변환되어 에러가 날수있다. 해서byte로 변환해줘야한다. (연산자 포함해서 괄호도 쳐줘야한다..)
//		
//		System.out.println(c);
//		
//		
//		int d=1000000;
//		int e=2000000;//에러고치는법 1. 둘다 d와 e전부 long으루.. 혹은 d나e 중 1개를 long으로..
//		long f=d*e;//혹은 결과값에 long f=(long)d*e등 1개에 long으로 변환..
//		
//		System.out.println(f);
//		
//		int a2=10;
//		int b2=3;
//		double c2=a2/(double)b2;//소숫점까지 똑바로 나오게 하고싶으면 a2나 b2에 (double)형변환을 시켜준다.
//		
//		System.out.println(c2);
//		
//		
//		int a4=1000000;
//		int b4=1000000;
//		
//		int c4=a4*b4/b4; //곱셈을 먼저하면서 int에 오버플로우가되어 에러.
//		int d4=a4/b4*b4;
//		
//		System.out.println(c4);
//		System.out.println(d4);
//	
//		char c1='a';
//		char c6=(char) (c1+1);//문자와 int를 합하여 int가되엇는데char에 넣으려해서 에러.(char)를 넣어야함.
//		
//		
//		System.out.println(c6);
		
		
//		char q= ++q;
//	System.out.println("뭐가 문제인거시냐으.."+q);
		
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
//		int z= t-o; //문자형숫자를 정수형 숫자로 변경하고 싶을때는 무조건 뒤에 0이라는것을 빼주면된다. (int로 변한다..)
//		
//		System.out.println("문자7더하기 문자0:"+t+o);
//		
//		
//		float pi=3.141592f;
//		float shortPi = (int)(pi*10000)/10000f; //소숫점3자리까지만 살려놔라 (pi뒤의 숫자와 나누는 숫자의 자릿수에따라 살아나는 소숫점자리수가 바뀐다.
//		
//
//		System.out.println("소숫점4자리까지만:"+shortPi); 
		
//<예제 소숫점 2자리까지만 나오는 a를 b로 나눈 값을 구해라.		
		
//		int a=10;
//		int b=3;
//		float c=(float)a/b;//double은 15자리까지만 정확, float의 경우 8자리까지만 정확.
//		float shortc=(int)(c*100)/100f;//100f대신 100.0으로 해도된다. :D
//		
//	
//		System.out.println(c);
//		System.out.println(shortc);
//	
//	
	//	<반올림>
//		float pi=3.141592f;
//		float shortPi = Math.round(pi*1000)/1000f;
		
		float c=(float) 7.2399981;
		float roundc=Math.round(c*100)/100f;
		System.out.println(roundc);
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
