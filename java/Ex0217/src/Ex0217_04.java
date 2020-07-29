import java.util.Scanner;

public class Ex0217_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//알람시간맟줌
		//시간을 시24(int) 분(int)초 60분 소수 째자리(float)10개의 time을 받습니다.
		//배열을 선언해서 밥\ㄷ으세오ㅗ
		//13:20:52.1 알람
		
		Scanner scan=new Scanner(System.in);
		Time[]t=new Time[3];
		for(int i=0;i<t.length;i++) {
			t[i]=new Time();
			System.out.print("시를 입력하세오>>");
			t[i].hour=scan.nextInt();
			System.out.print("분를 입력하세오>>");
			t[i].minute=scan.nextInt();
			System.out.print("초를 입력하세오>>");
			t[i].sec=scan.nextFloat();
			t[i].print();
		}
		
		
//		int[] hour=new int[2];
//		int[] minute=new int[2];
//		float[] sec=new float[2];
//		Scanner scan=new Scanner(System.in);
//		for(int i=0;i<10;i++) {
//			System.out.println("알람 맞추기 프로그램");
//			System.out.println("시간 를 입력하세오 >>");
//			hour[i]=scan.nextInt();
//			System.out.println("분 을 입력하세오 >>");
//			minute[i]=scan.nextInt();
//			System.out.println("초 를 입력하세오");
//			sec[i]=Math.round(scan.nextFloat()*10)/10f;
//			System.out.println((i+1)+"번째 알람시간 :"+hour[i]+"시"+minute[i]+"분"+sec[i]+"초");
//			
//		}
//		
		
	}

}
