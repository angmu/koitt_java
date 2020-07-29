
public class Ex0220_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~25 랜덤 5개
		//최대값 구하기
		
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
		System.out.println("1~25중 5개의 숫자출력후 최대값 출력하기");
		for(int i=0;i<s_num.length;i++) {
			System.out.print(s_num[i]+" ");
		}System.out.print("최대값 :"+max);
		
		//1~100까지의 숫자를 랜덤으로 10개를 배열에 넣어서 작은숫자로 정렬해서 출력
		//1~100까지의 숫자 랜덤
		
		int[]ran=new int[100];
		int[]s_ran=new int[10];
		int ran_index,tem=0;
		//100개 숫자 넣기
		for(int i=0;i<ran.length;i++) {
			ran[i]=i+1;
		}
		
		//섞기
		for(int i=0;i<300;i++) {
			ran_index=(int)(Math.random()*100);
			temp=ran[0];
			ran[0]=ran[ran_index];
			ran[ran_index]=temp;
		}
		
		//추출
		for(int i=0;i<s_ran.length;i++) {
			s_ran[i]=ran[i];
		}
		//랜덤수 출력
		System.out.println();
		System.out.println("======================");
		System.out.println();
		System.out.println("1~100 랜덤숫자 중 10개 출력후 자리배열하기");
		System.out.print("랜덤숫자 :");
		for(int i=0;i<s_ran.length;i++) {
			System.out.print(s_ran[i]+" ");
		}System.out.println();
		System.out.print("자리 배열 :");
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
