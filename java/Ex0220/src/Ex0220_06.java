import java.util.Scanner;

public class Ex0220_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~25���� ���ڸ� 5���� �迭�� �������� �־���.
		
//		int[]lotto2=new int[5];
		//����#
		int[][]lotto2=new int[5][5];
		int[] lotto=new int[25];
		int x,y=0;
		Scanner scan=new Scanner(System.in);
		String xy="";
		//���ֱ�
		inArr(lotto);
		//����
		shuArr(lotto);
		//lotto2�� ����
		sixArr(lotto,lotto2);
		
		while(true) {
			//lotto2��� (����#
			printArr(lotto2);
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���>>(x,y)->(0,0)");
			xy=scan.nextLine();
			x=xy.charAt(0)-'0';
			y=xy.charAt(1)-'0';
			
			if(!(lotto2[x][y]==0)) {
				lotto2[x][y]=0;
			}else {
				System.out.println("�̹̼���");
			}
			
			
		}
		
		
		
		
		
		
		
		
//		System.out.print("�������� 5��: ");
//		for(int i=0; i<lotto2.length;i++) {
//			System.out.print(lotto2[i]+" ");
//		}System.out.println();
		
	}//main
	//���ڳֱ�
	static void inArr(int[] lotto){
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
		}
	}
	//����
	static void shuArr(int[] lotto){
		for(int i=0;i<200;i++) {
			int lotto_index=(int)(Math.random()*25);
			int temp=lotto[0];
			lotto[0]=lotto[lotto_index];
			lotto[lotto_index]=temp;
		}
	}
	
	//����# lotto�� ���ֱ�
		static void sixArr(int[] lotto,int[][] lotto2) {
			for(int i=0; i<lotto2.length;i++) {
				for(int j=0;j<lotto2[i].length;j++) {
					lotto2[i][j]=lotto[i*5+j];//�迭 �ڰ� 5�� ������ ���� :D
				}
			}
		}
	//���
		static void printArr(int[][] lotto2){
			//����#
			System.out.print("\t"+"0"+"\t"+"1"+"\t"+"2"+"\t"+"3"+"\t"+"4"+"\t");
			System.out.println();
			System.out.println("----------------------------------------------");
			for(int i=0; i<lotto2.length;i++) {
				System.out.print(i+"\t");
				for(int j=0;j<lotto2[i].length;j++) {
					System.out.print(lotto2[i][j]+"\t");
				}//�ִ밪 �� ��ġ
				System.out.println("|");
				System.out.println();
			}System.out.println("----------------------------------------------");
		}
		
	
//	//lotto�� ���ֱ�
//	static void sixArr(int lotto[],int lotto2[]) {
//		for(int i=0; i<lotto2.length;i++) {
//			lotto2[i]=lotto[i];
//		}
//	}
}//class
