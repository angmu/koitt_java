import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex0305_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2020�� 3�� 5��
		
		Calendar today=Calendar.getInstance();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(format.format(today.getTime()));
		
		int year=today.get(Calendar.YEAR);
		int month=today.get(Calendar.MONTH)+1;
		int date=today.get(Calendar.DATE);
		//day or week�� 1���� �����Ѵ�..
		int day_index=today.get(Calendar.DAY_OF_WEEK);
		System.out.println(day_index);
		String[] day= {"","��","��","ȭ","��","��","��","��"};
		
		System.out.println(year+"�� "+month+"�� "+date+"�� "+day[day_index]+"����");
		
		
	}

}
