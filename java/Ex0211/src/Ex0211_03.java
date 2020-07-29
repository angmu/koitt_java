import java.util.Scanner;

public class Ex0211_03 {

	public static void main(String[] args) {
		// /->나누기 %->나머지

		// 3번의 급액을 입력하여 3번의 결과 출력. 단, 배열을 사용
		int[] money = new int[3];
		int[] coin = { 500, 100, 50, 10 };

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println((i+1)+"번째 동전으로 바꾸고싶은 금액을 입력하세요");
			money[i] = scan.nextInt();
		}
		for (int j = 0; j < 3; j++) {
			System.out.println("\n"+(j+1)+"번째 바꾼금액 : " + money[j] + "원");

			for (int i = 0; i < 4; i++) {
				System.out.println(coin[i] + "원 : " + money[j] / coin[i] + "개");
				money[j] %= coin[i];

			}
		}
		// 아래꺼를 위로 변경가능

//		// 5890원->입력형태
//		int money=0;
//		int[]coin= {500,100,50,10};
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("동전으로 바꾸고싶은 금액을 입력하세요");
//		money=scan.nextInt();
//		System.out.println("바꾼금액 : "+money+"원");
//
//		for(int i=0;i<4;i++) {
//			System.out.println(coin[i]+"원 : "+money/coin[i]+"개");
//			money%=coin[i];
//		
//		}
//
//		//		아래꺼를 위로 변경가능

//		// 5890원->500원짜리 동전, 100원 동전 50동전,10동전
//		int money=5890;
//		int[]coin= {500,100,50,10};
//		for(int i=0;i<4;i++) {
//			System.out.println(coin[i]+"원 : "+money/coin[i]+"개");
//			money%=coin[i];
//		
//		}
//
		// 아래꺼를 위로 변경가능
//		// /->나누기 %->나머지
//				// 5890원->500원짜리 동전, 100원 동전 50동전,10동전
//				int money=5890;
//				int coin500=0;
//				int coin100=0;
//				int coin50=0;
//				int coin10=0;
//				}
//				coin500=money/500;
//				coin100=money%500/100;
//				coin50=money%500%100/50;
//				coin10=money%500%100%50/10;
//				
//				
//				
//				System.out.println(money+"원을 동전으로 바꿨을때 필요개수\n");
//				System.out.println("500원 "+coin500+"개");
//				System.out.println("100원 "+coin100+"개");
//				System.out.println("50원 "+coin50+"개");
//				System.out.println("10원 "+coin10+"개");
//				
//				

	}

}
