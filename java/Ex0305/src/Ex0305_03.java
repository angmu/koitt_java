import java.util.Calendar;

public class Ex0305_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//현재시간에서 도쿄올림픽 개막일(2020-7-24 11:59:59)
		//현재까지 몇일 몇시 몇분 몇초가 남앗는지 계산
		
		Calendar cal=Calendar.getInstance();
		Calendar dok=Calendar.getInstance();
		//월은 1개 적게 넣어야함
		dok.set(2020, 6, 24, 11, 59, 59);
		
		int[] time_unit= {24*60*60,60*60,60,1};
		String[]time_name= {"일","시","분","초"};
		
		long remain=Math.abs(cal.getTimeInMillis()-dok.getTimeInMillis())/1000;
		System.out.println("결과:"+remain);
		
		String result="";
		for(int i=0;i<time_unit.length;i++) {
			result+=(remain/time_unit[i])+time_name[i];
			remain=remain%time_unit[i];
		}
		
		System.out.println("남은시간 :"+result);
		
		
		long today=cal.getTimeInMillis();
		long dokyo=dok.getTimeInMillis();
		
		long m=(dokyo-today)/1000;//남은시간 
		
		int date=(int)(m/86400);
		int hour=(int)(m%86400/3600);
		int minute=(int)(m%86400%3600/60);
		int second=(int)(m%86400%3600%60);
		
		System.out.println("도쿄올림픽까지 남은 시간:"+date+"일 "+hour+"시 "+minute+"분 "+second+"초 남았습니다" );
		
	}

}
