import java.util.Scanner;

public class Ex0213_04 {

	public static void main(String[] args) {
		// 1~100까지의 숫자 1개를 랜덤으로 뽑기.
		// 무한으로 돌려서 숫자를 맞추는 게임.
		// 입력한 숫자가 랜덤수보다 크면 숫자가 큽니다. 다시입력.
		// 작으면 작습니다. 다시입역
		// 맞으면 빙고!
		// ---옵션
		// 정답은 x번입니다. 자신이 입력한 숫자를 모두 출력.
		// 최대 20번까지.

		int ran = (int) (Math.random() * 100 + 1);//랜덤수
		int cnt = 0;// 시도횟수
		int[] input = new int[20];// 유저입력값
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자맞추기 게임");
		loop:while (true) {
			for (int i = 0; i < input.length; i++) {
				//----이걸 안하고 위의 while(true)를 while(cnt<20)으로 써도된다. 이경우 input.length대신 count로, i대신 count를 쓴다.
				if(cnt==input.length) {
					System.out.println("맞추는데 실패하였습니다");
					System.out.println("정답은 "+ran+"입니다.");
					break loop;
				}
				//----
				System.out.println("1~100까지의 숫자 중 1개를 입력하세요");
				input[i] = scan.nextInt();
				if (!(input[i] >= 1 && input[i] <= 100)) {
					System.out.println("잘못입력하였습니다.");
					i--;
					continue;
				}
				cnt++;//필터에 걸리믄 그만하도록..
				if(input[i]>ran) {
					System.out.println("입력한 수가 큽니다"+input[i]+"보다 작은수를 입력해주세요");
				}else if(input[i]==ran) {
					System.out.println("빙고!!");
					System.out.println("정답은 "+ran+"입니다.");
					System.out.println(cnt+"번째 맞췄습니다");
					break loop;
				}else {
					System.out.println("입력한 수가 작습니다."+input[i]+"보다 큰 수를 입력해주세요");
				}
				
			}
		}//while
		System.out.print("시도횟수 ");
		for(int i=0;i<cnt;i++) {
			int num=i+1;
			System.out.printf("%2d ",num);
		}
		System.out.println();
		System.out.print("입력숫자 ");
		//
		for(int i=0;i<cnt;i++) {
			System.out.printf("%2d ",input[i]);
		}

	}

}
