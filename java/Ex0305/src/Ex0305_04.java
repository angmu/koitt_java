import java.util.Calendar;

public class Ex0305_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2020�� 3�� 14�� 15�� 39�� 42��
		//2021�� 4�� 14�� 12�� 59�� 59��
		//���� ��� ��� ���ʰ� ���Ҵ��� ���
		//2021�� 4�� 14���� ������������ >>����
		
		Calendar cal1=Calendar.getInstance();
		Calendar cal2=Calendar.getInstance();
		int []time_set= {24*60*60,60*60,60,1};
		String[]time_name= {"��","��","��","��"};
		
		//���� ���ϴ� ��-1
		cal1.set(2020, 2, 14, 15, 39, 42);
		cal2.set(2021, 3, 14, 12, 59, 59);
		
		long remain=Math.abs(cal1.getTimeInMillis()-cal2.getTimeInMillis())/1000;
		String result="";
		for(int i=0;i<time_set.length;i++) {
			result+=remain/time_set[i]+time_name[i]+" ";
			remain=remain%time_set[i];
		}
		
		System.out.println(result);
		
		//2������  ??????????
		Calendar cal3=Calendar.getInstance();
		cal3.set(2021, 3, 14);
		String[] week= {"","��","��","ȭ","��","��","��","��"};
		int remain2=cal3.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(week[remain2]);
		
		
		
		
	}

}
