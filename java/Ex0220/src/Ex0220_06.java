import java.util.Scanner;

public class Ex0220_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~25까지 숫자를 5개의 배열에 랜덤으로 넣어라요.
		
//		int[]lotto2=new int[5];
		//응용#
		int[][]lotto2=new int[5][5];
		int[] lotto=new int[25];
		int x,y=0;
		Scanner scan=new Scanner(System.in);
		String xy="";
		//값넣기
		inArr(lotto);
		//섞기
		shuArr(lotto);
		//lotto2에 대입
		sixArr(lotto,lotto2);
		
		while(true) {
			//lotto2출력 (응용#
			printArr(lotto2);
			System.out.println("원하는 번호를 입력하세오>>(x,y)->(0,0)");
			xy=scan.nextLine();
			x=xy.charAt(0)-'0';
			y=xy.charAt(1)-'0';
			
			if(!(lotto2[x][y]==0)) {
				lotto2[x][y]=0;
			}else {
				System.out.println("이미선택");
			}
			
			
		}
		
		
		
		
		
		
		
		
//		System.out.print("랜덤숫자 5개: ");
//		for(int i=0; i<lotto2.length;i++) {
//			System.out.print(lotto2[i]+" ");
//		}System.out.println();
		
	}//main
	//숫자넣기
	static void inArr(int[] lotto){
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
		}
	}
	//섞기
	static void shuArr(int[] lotto){
		for(int i=0;i<200;i++) {
			int lotto_index=(int)(Math.random()*25);
			int temp=lotto[0];
			lotto[0]=lotto[lotto_index];
			lotto[lotto_index]=temp;
		}
	}
	
	//응용# lotto에 값넣기
		static void sixArr(int[] lotto,int[][] lotto2) {
			for(int i=0; i<lotto2.length;i++) {
				for(int j=0;j<lotto2[i].length;j++) {
					lotto2[i][j]=lotto[i*5+j];//배열 뒤가 5로 끝나니 이케 :D
				}
			}
		}
	//출력
		static void printArr(int[][] lotto2){
			//응용#
			System.out.print("\t"+"0"+"\t"+"1"+"\t"+"2"+"\t"+"3"+"\t"+"4"+"\t");
			System.out.println();
			System.out.println("----------------------------------------------");
			for(int i=0; i<lotto2.length;i++) {
				System.out.print(i+"\t");
				for(int j=0;j<lotto2[i].length;j++) {
					System.out.print(lotto2[i][j]+"\t");
				}//최대값 들어갈 위치
				System.out.println("|");
				System.out.println();
			}System.out.println("----------------------------------------------");
		}
		
	
//	//lotto에 값넣기
//	static void sixArr(int lotto[],int lotto2[]) {
//		for(int i=0; i<lotto2.length;i++) {
//			lotto2[i]=lotto[i];
//		}
//	}
}//class
