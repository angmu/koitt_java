import java.util.Scanner;

public class Ex0213_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
////		System.arraycopy(arr, 0, arr2, 0, arr1.length);
////		               �迭1,copy������ ��ġ,�迭2,�ٿ��α��� ��ġ,copy����
		
		int[] num2=new int[10];
		int[] num= {1,2,3,4,5};
		
		System.arraycopy(num, 0, num2, 0, num.length); //<< num.length ��� 5���־ �������.
		
		//num�迭���
		System.out.print("num �迭�� : ");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}System.out.println();
		//num2�迭���
		System.out.print("num2 �迭�� : ");
		for(int i=0;i<num2.length;i++) {
			System.out.print(num2[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
//		int[] num2=new int[10];
//		int[] num= {1,2,3,4,5};
		
//		
//		//�迭���� : num �̶�� �迭�� num2�� �ű�� �۾�
//		for(int i=0;i<num.length;i++) {
//			num2[i]=num[i];
//		}
//		//num�迭���
//		System.out.print("num �迭�� : ");
//		for(int i=0;i<num.length;i++) {
//			System.out.print(num[i]+" ");
//		}System.out.println();
//		//num2�迭���
//		System.out.print("num2 �迭�� : ");
//		for(int i=0;i<num2.length;i++) {
//			System.out.print(num2[i]+" ");
//		}
		
//		int []num=new int[3];
//		
//		Scanner scan=new Scanner(System.in);
//		while(true) {
//			System.out.println("���� �Է��ϼ���.>>");
//			for(int i=0;i<num.length;i++) {
//				num[i]=scan.nextInt();
//				
//				System.out.println("�Է°�: "+num[i]);
//			}
//		}
//		
//		
//		
		
	}

}
