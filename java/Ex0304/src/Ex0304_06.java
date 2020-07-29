import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Ex0304_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//날짜 -1)유저컴퓨터에서 날짜를 받아옴 2)서버의 컴퓨터 날짜를 받아옴(2번에서받아옴) 3)자바에서 시간을 가져옴 4)DB날짜(주로 이것을 사용)
//		Calendar today=Calendar.getInstance();
//														//대문자 M은 month, 소문자 m은 minute
//		SimpleDateFormat format1=new SimpleDateFormat("YYYY/MM/DD  HH:mm:ss");
//		System.out.println(today.getTime());
//		System.out.println(format1.format(today.getTime()));
//		System.out.println("현재연도"+today.get(Calendar.YEAR));
//		System.out.println("오늘 월"+today.get(Calendar.MONTH));//1을 더해야 정확한 날짜가 나온다.
//		System.out.println("오늘 날짜"+today.get(Calendar.DATE));
		
		//---------------------------
		
		
		Calendar today=Calendar.getInstance();
		SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//입력한 날짜와 수정한 날짜가 필요!!
		String format_time1=format1.format(today.getTime());
		//현재 날짜 시간의 초를 구해준다리 ㅇ.ㅇ! D-day 카운트를 이거로 만든다 캄..
		System.out.println(today.getTimeInMillis());
		System.out.println();
		System.out.println("현재일시:"+format_time1);
		System.out.println("이 해의 연도:"+today.get(Calendar.YEAR));
											//괄호가 필요하다                               //1의 위치 중요
		System.out.println("월(0~11,0:1월):"+(today.get(Calendar.MONTH)+1));
		System.out.println("이 해의 몇째 주:"+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇째 주:"+today.get(Calendar.WEEK_OF_MONTH));
		//date 와 day_of_month는 같다
		System.out.println("이 달의 몇 일:"+today.get(Calendar.DATE));
		System.out.println("이 달의 몇 일:"+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 일:"+today.get(Calendar.DAY_OF_YEAR));
								//1이 월요일이라 2는 월요일
		System.out.println("요일(1~7,1:일요일):"+today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이 달의 몇 째요일:"+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전_오후 (0:오전/1:오후):"+today.get(Calendar.AM_PM));
		System.out.println("시간(0~11):"+today.get(Calendar.HOUR));
		System.out.println("시간(0~23):"+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59):"+today.get(Calendar.MINUTE));
		System.out.println("초(0~59):"+today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999):"+today.get(Calendar.MILLISECOND));
		
		
		
		
		
	}

}
