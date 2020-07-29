import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Ex0305_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calendar는 추상클래스라서 getinstance방식으로 선언하면서 객체선언을 해줘야 한다
		Calendar today=Calendar.getInstance();
		long between=0L;
		//날짜관련 폼을 만드는것
		SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("기본 폼:"+today.getTime());
		System.out.println("포멧을 적용한 출력:"+format1.format(today.getTime()));
		//주로 디데이와 오늘날짜의 차이 등을 계산할때 사용>>getTimeInMillis()
		System.out.println("현재 시간을 밀리세컨드로 표시:"+today.getTimeInMillis());
		int year=today.get(Calendar.YEAR);
		System.out.println("년도 :"+year);
		//month는 0>1월이므로 제대로 표현을 하려면 1을 더해야한다 
		int month=today.get(Calendar.MONTH);
		System.out.println("현재 달:"+(month+1));
		int date=today.get(Calendar.DATE);
		System.out.println("현재 일:"+date);
		
		String d_day="2020-03-14 11:59:59";
		
		try {
			Date enddate=format1.parse(d_day);//parse 사용시 try catch
			//getTime>>long의 숫자로 나온다
			System.out.println("직접입력일시(d-day)"+enddate.getTime());
			between=today.getTimeInMillis()-enddate.getTime();
			System.out.println("롱타입 변수:"+between);
			System.out.println("현재시간과 직접입력시간 차이:"+(today.getTimeInMillis()-enddate.getTime()));
			//Math.abd
			System.out.println("현재시간과 직접입력시간 차이:"+Math.abs((today.getTimeInMillis()-enddate.getTime())));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//예외가 어떤 유형인지, 어느위치에서 발생했는지 알려주는것
		}
		
		Calendar today2=Calendar.getInstance();
		
		Date enddate2=null;
		
		today2.set(Calendar.YEAR,2021);
		today2.set(Calendar.MONTH,02);
		today2.set(Calendar.DATE,14);
		today2.set(Calendar.HOUR,11);
		today2.set(Calendar.MINUTE,59);
		today2.set(Calendar.SECOND,59);
		
		System.out.println("today2기본 폼:"+today2.getTime());
		System.out.println("today2포멧을 적용한 출력:"+format1.format(today2.getTime()));
		//주로 디데이와 오늘날짜의 차이 등을 계산할때 사용>>getTimeInMillis()
		System.out.println("today2현재 시간을 밀리세컨드로 표시:"+today2.getTimeInMillis());
		int year2=today2.get(Calendar.YEAR);
		System.out.println("today2년도 :"+year2);
		//month는 0>1월이므로 제대로 표현을 하려면 1을 더해야한다 
		int month2=today2.get(Calendar.MONTH);
		System.out.println("today2현재 달:"+(month2+1));
		int date2=today2.get(Calendar.DATE);
		System.out.println("today2현재 일:"+date2);
		System.out.println("현재 시간을 밀리세컨드로 표시:"+today2.getTimeInMillis());
		
		
		}

}
