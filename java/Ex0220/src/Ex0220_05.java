import java.util.Scanner;

public class Ex0220_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lotto
		//로또1~45값을 로또2 배열에 넣어보세오
		
		int[] lotto=new int[45];
		int[] lotto2=new int[6];
		int num;
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
		}
		
		while(true) {
			System.out.println("==============");
			System.out.println("1. 배열출력하기");
			System.out.println("2. 배열 섞기");
			System.out.println("3. 6개 배열 합");
			System.out.println("4. 배열정렬");
			System.out.println("원하는 번호를 입력하세오");
			num=scan.nextInt();
			scan.nextLine();
			switch(num) {
			case 1:
				System.out.println("6개의 공을 출력합니다");
				printArr(lotto2);
				break;
			case 2:
				System.out.println("공 섞기가 완료되었세라");
				shuffle(lotto,lotto2); //lotto2
				break;
			case 3:
				System.out.println("6개 배열의 합");
				int sum=sumArr(lotto2);
				System.out.println(sum);
				break;
			case 4:
				System.out.println("6개 배열 정렬");
				sortArr(lotto2);
				//1번으로 출력하면 된다리..
//				for(int i=0;i<lotto2.length;i++) {
//				System.out.print(lotto2[i]+" ");
//				}System.out.println();
				break;	
				
			}//switch
			
		}
		//while
		
		
		
		
		
	}//main

	//6개의 배열의 주소값을 넘겨서 출력
	static void printArr(int[]lotto2) {
		for(int i=0;i<lotto2.length;i++) {
			System.out.print(lotto2[i]+" ");
		}System.out.println();
	}
	//공 다시 섞기
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
		//비교횟수는 숫자의 개수-1 번이다
		for(int i=0;i<lotto2.length-1;i++) {
			boolean change=false;
			//이후 비교횟수는 -1에 i번이다
			for(int j=0;j<lotto2.length-i-1;j++) {
				if(lotto2[j]>lotto2[j+1]) {
					int temp;
					temp=lotto2[j];
					lotto2[j]=lotto2[j+1];
					lotto2[j+1]=temp;
					change=true;
				}
				//뒤의 숫자들이 크면 굳이 돌릴필요없으니 나오게 한다요(시간단축)
				if(change==false) {
					break;
				}
			}
			
		}
	}
	
}//class
