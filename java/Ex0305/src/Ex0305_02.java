import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex0305_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2020년 3월 5일
		
		Calendar today=Calendar.getInstance();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(format.format(today.getTime()));
		
		int year=today.get(Calendar.YEAR);
		int month=today.get(Calendar.MONTH)+1;
		int date=today.get(Calendar.DATE);
		//day or week는 1부터 시작한다..
		int day_index=today.get(Calendar.DAY_OF_WEEK);
		System.out.println(day_index);
		String[] day= {"","일","월","화","수","목","금","토"};
		
		System.out.println(year+"년 "+month+"월 "+date+"일 "+day[day_index]+"요일");
		
		
	}

}
