import java.util.Calendar;

public class Ex0305_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2020년 3월 14일 15시 39분 42초
		//2021년 4월 14일 12시 59분 59초
		//몇일 몇시 몇분 몇초가 남았는지 계산
		//2021년 4월 14일은 무슨요일인지 >>수욜
		
		Calendar cal1=Calendar.getInstance();
		Calendar cal2=Calendar.getInstance();
		int []time_set= {24*60*60,60*60,60,1};
		String[]time_name= {"일","시","분","초"};
		
		//월은 원하는 날-1
		cal1.set(2020, 2, 14, 15, 39, 42);
		cal2.set(2021, 3, 14, 12, 59, 59);
		
		long remain=Math.abs(cal1.getTimeInMillis()-cal2.getTimeInMillis())/1000;
		String result="";
		for(int i=0;i<time_set.length;i++) {
			result+=remain/time_set[i]+time_name[i]+" ";
			remain=remain%time_set[i];
		}
		
		System.out.println(result);
		
		//2번문제  ??????????
		Calendar cal3=Calendar.getInstance();
		cal3.set(2021, 3, 14);
		String[] week= {"","일","월","화","수","목","금","토"};
		int remain2=cal3.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(week[remain2]);
		
		
		
		
	}

}
