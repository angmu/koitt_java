import java.util.Scanner;

public class Ex0220_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lotto
		//�ζ�1~45���� �ζ�2 �迭�� �־����
		
		int[] lotto=new int[45];
		int[] lotto2=new int[6];
		int num;
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
		}
		
		while(true) {
			System.out.println("==============");
			System.out.println("1. �迭����ϱ�");
			System.out.println("2. �迭 ����");
			System.out.println("3. 6�� �迭 ��");
			System.out.println("4. �迭����");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���");
			num=scan.nextInt();
			scan.nextLine();
			switch(num) {
			case 1:
				System.out.println("6���� ���� ����մϴ�");
				printArr(lotto2);
				break;
			case 2:
				System.out.println("�� ���Ⱑ �Ϸ�Ǿ�����");
				shuffle(lotto,lotto2); //lotto2
				break;
			case 3:
				System.out.println("6�� �迭�� ��");
				int sum=sumArr(lotto2);
				System.out.println(sum);
				break;
			case 4:
				System.out.println("6�� �迭 ����");
				sortArr(lotto2);
				//1������ ����ϸ� �ȴٸ�..
//				for(int i=0;i<lotto2.length;i++) {
//				System.out.print(lotto2[i]+" ");
//				}System.out.println();
				break;	
				
			}//switch
			
		}
		//while
		
		
		
		
		
	}//main

	//6���� �迭�� �ּҰ��� �Ѱܼ� ���
	static void printArr(int[]lotto2) {
		for(int i=0;i<lotto2.length;i++) {
			System.out.print(lotto2[i]+" ");
		}System.out.println();
	}
	//�� �ٽ� ����
	static void shuffle(int[]lotto,int[]lotto2) {
		for(int i=0;i<300;i++) {
			int lotto_index,temp;
			lotto_index=(int)(Math.random()*45);
			temp=lotto[lotto_index];
			lotto[lotto_index]=lotto[0];
			lotto[0]=temp;
			
		}
		for(int i=0;i<lotto2.length;i++) {
			lotto2[i]=lotto[i];
		}
	}
	static int sumArr(int[]lotto2) {
		int result=0;
		for(int i=0;i<lotto2.length;i++) {
			result+=lotto2[i];
		}
		return result;
	}
	
	static void sortArr(int[]lotto2) {//2 8 10 19 23 45
		//��Ƚ���� ������ ����-1 ���̴�
		for(int i=0;i<lotto2.length-1;i++) {
			boolean change=false;
			//���� ��Ƚ���� -1�� i���̴�
			for(int j=0;j<lotto2.length-i-1;j++) {
				if(lotto2[j]>lotto2[j+1]) {
					int temp;
					temp=lotto2[j];
					lotto2[j]=lotto2[j+1];
					lotto2[j+1]=temp;
					change=true;
				}
				//���� ���ڵ��� ũ�� ���� �����ʿ������ ������ �Ѵٿ�(�ð�����)
				if(change==false) {
					break;
				}
			}
			
		}
	}
	
}//class
