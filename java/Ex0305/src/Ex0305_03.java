import java.util.Calendar;

public class Ex0305_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ð����� ����ø��� ������(2020-7-24 11:59:59)
		//������� ���� ��� ��� ���ʰ� ���Ѵ��� ���
		
		Calendar cal=Calendar.getInstance();
		Calendar dok=Calendar.getInstance();
		//���� 1�� ���� �־����
		dok.set(2020, 6, 24, 11, 59, 59);
		
		int[] time_unit= {24*60*60,60*60,60,1};
		String[]time_name= {"��","��","��","��"};
		
		long remain=Math.abs(cal.getTimeInMillis()-dok.getTimeInMillis())/1000;
		System.out.println("���:"+remain);
		
		String result="";
		for(int i=0;i<time_unit.length;i++) {
			result+=(remain/time_unit[i])+time_name[i];
			remain=remain%time_unit[i];
		}
		
		System.out.println("�����ð� :"+result);
		
		
		long today=cal.getTimeInMillis();
		long dokyo=dok.getTimeInMillis();
		
		long m=(dokyo-today)/1000;//�����ð� 
		
		int date=(int)(m/86400);
		int hour=(int)(m%86400/3600);
		int minute=(int)(m%86400%3600/60);
		int second=(int)(m%86400%3600%60);
		
		System.out.println("����ø��ȱ��� ���� �ð�:"+date+"�� "+hour+"�� "+minute+"�� "+second+"�� ���ҽ��ϴ�" );
		
	}

}
