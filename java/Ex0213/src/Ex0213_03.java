import java.util.Scanner;

public class Ex0213_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
////		System.arraycopy(arr, 0, arr2, 0, arr1.length);
////		               배열1,copy시작할 위치,배열2,붙여널기할 위치,copy범위
		
		int[] num2=new int[10];
		int[] num= {1,2,3,4,5};
		
		System.arraycopy(num, 0, num2, 0, num.length); //<< num.length 대신 5를넣어도 상관없다.
		
		//num배열출력
		System.out.print("num 배열값 : ");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}System.out.println();
		//num2배열출력
		System.out.print("num2 배열값 : ");
		for(int i=0;i<num2.length;i++) {
			System.out.print(num2[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
//		int[] num2=new int[10];
//		int[] num= {1,2,3,4,5};
		
//		
//		//배열복사 : num 이라는 배열을 num2로 옮기는 작업
//		for(int i=0;i<num.length;i++) {
//			num2[i]=num[i];
//		}
//		//num배열출력
//		System.out.print("num 배열값 : ");
//		for(int i=0;i<num.length;i++) {
//			System.out.print(num[i]+" ");
//		}System.out.println();
//		//num2배열출력
//		System.out.print("num2 배열값 : ");
//		for(int i=0;i<num2.length;i++) {
//			System.out.print(num2[i]+" ");
//		}
		
//		int []num=new int[3];
//		
//		Scanner scan=new Scanner(System.in);
//		while(true) {
//			System.out.println("값을 입력하세요.>>");
//			for(int i=0;i<num.length;i++) {
//				num[i]=scan.nextInt();
//				
//				System.out.println("입력값: "+num[i]);
//			}
//		}
//		
//		
//		
		
	}

}
