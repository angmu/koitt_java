
public class Ex0220_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~25 ���� 5��
		//�ִ밪 ���ϱ�
		
		int[] num=new int[25];
		int [ ]s_num=new int[5];
		int num_index=0;
		int max,temp=0;
		
		for(int i=0;i<num.length;i++) {
			num[i]=i+1;
		}
		
		for(int i=0;i<200;i++) {
			num_index=(int)(Math.random()*25);
			temp=num[0];
			num[0]=num[num_index];
			num[num_index]=temp;
		}
		
		for(int i=0;i<s_num.length;i++) {
			s_num[i]=num[i];
		}
		
		max=Math.max(s_num[0],Math.max(s_num[1],(Math.max(s_num[2],(Math.max(s_num[3],s_num[4]))))));
		System.out.println("1~25�� 5���� ��������� �ִ밪 ����ϱ�");
		for(int i=0;i<s_num.length;i++) {
			System.out.print(s_num[i]+" ");
		}System.out.print("�ִ밪 :"+max);
		
		//1~100������ ���ڸ� �������� 10���� �迭�� �־ �������ڷ� �����ؼ� ���
		//1~100������ ���� ����
		
		int[]ran=new int[100];
		int[]s_ran=new int[10];
		int ran_index,tem=0;
		//100�� ���� �ֱ�
		for(int i=0;i<ran.length;i++) {
			ran[i]=i+1;
		}
		
		//����
		for(int i=0;i<300;i++) {
			ran_index=(int)(Math.random()*100);
			temp=ran[0];
			ran[0]=ran[ran_index];
			ran[ran_index]=temp;
		}
		
		//����
		for(int i=0;i<s_ran.length;i++) {
			s_ran[i]=ran[i];
		}
		//������ ���
		System.out.println();
		System.out.println("======================");
		System.out.println();
		System.out.println("1~100 �������� �� 10�� ����� �ڸ��迭�ϱ�");
		System.out.print("�������� :");
		for(int i=0;i<s_ran.length;i++) {
			System.out.print(s_ran[i]+" ");
		}System.out.println();
		System.out.print("�ڸ� �迭 :");
		for(int i=0;i<s_ran.length-1;i++) {
			for(int j=0;j<s_ran.length-1-i;j++) {
			if(s_ran[j]>s_ran[j+1]) {
				temp=s_ran[j];
				s_ran[j]=s_ran[j+1];
				s_ran[j+1]=temp;
			}
			}
		}
		for(int i=0;i<s_ran.length;i++) {
			System.out.print(s_ran[i]+" ");
		}System.out.println();
		
		
	}//main

}
