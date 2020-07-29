import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Ex0305_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calendar�� �߻�Ŭ������ getinstance������� �����ϸ鼭 ��ü������ ����� �Ѵ�
		Calendar today=Calendar.getInstance();
		long between=0L;
		//��¥���� ���� ����°�
		SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("�⺻ ��:"+today.getTime());
		System.out.println("������ ������ ���:"+format1.format(today.getTime()));
		//�ַ� ���̿� ���ó�¥�� ���� ���� ����Ҷ� ���>>getTimeInMillis()
		System.out.println("���� �ð��� �и�������� ǥ��:"+today.getTimeInMillis());
		int year=today.get(Calendar.YEAR);
		System.out.println("�⵵ :"+year);
		//month�� 0>1���̹Ƿ� ����� ǥ���� �Ϸ��� 1�� ���ؾ��Ѵ� 
		int month=today.get(Calendar.MONTH);
		System.out.println("���� ��:"+(month+1));
		int date=today.get(Calendar.DATE);
		System.out.println("���� ��:"+date);
		
		String d_day="2020-03-14 11:59:59";
		
		try {
			Date enddate=format1.parse(d_day);//parse ���� try catch
			//getTime>>long�� ���ڷ� ���´�
			System.out.println("�����Է��Ͻ�(d-day)"+enddate.getTime());
			between=today.getTimeInMillis()-enddate.getTime();
			System.out.println("��Ÿ�� ����:"+between);
			System.out.println("����ð��� �����Է½ð� ����:"+(today.getTimeInMillis()-enddate.getTime()));
			//Math.abd
			System.out.println("����ð��� �����Է½ð� ����:"+Math.abs((today.getTimeInMillis()-enddate.getTime())));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//���ܰ� � ��������, �����ġ���� �߻��ߴ��� �˷��ִ°�
		}
		
		Calendar today2=Calendar.getInstance();
		
		Date enddate2=null;
		
		today2.set(Calendar.YEAR,2021);
		today2.set(Calendar.MONTH,02);
		today2.set(Calendar.DATE,14);
		today2.set(Calendar.HOUR,11);
		today2.set(Calendar.MINUTE,59);
		today2.set(Calendar.SECOND,59);
		
		System.out.println("today2�⺻ ��:"+today2.getTime());
		System.out.println("today2������ ������ ���:"+format1.format(today2.getTime()));
		//�ַ� ���̿� ���ó�¥�� ���� ���� ����Ҷ� ���>>getTimeInMillis()
		System.out.println("today2���� �ð��� �и�������� ǥ��:"+today2.getTimeInMillis());
		int year2=today2.get(Calendar.YEAR);
		System.out.println("today2�⵵ :"+year2);
		//month�� 0>1���̹Ƿ� ����� ǥ���� �Ϸ��� 1�� ���ؾ��Ѵ� 
		int month2=today2.get(Calendar.MONTH);
		System.out.println("today2���� ��:"+(month2+1));
		int date2=today2.get(Calendar.DATE);
		System.out.println("today2���� ��:"+date2);
		System.out.println("���� �ð��� �и�������� ǥ��:"+today2.getTimeInMillis());
		
		
		}

}
