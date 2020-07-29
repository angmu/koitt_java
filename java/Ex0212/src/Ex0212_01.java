import java.util.Scanner;

public class Ex0212_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로또번호 생성

		int[] lotto = new int[45];
		int temp = 0;
		int lotto_index = 0;

		// 옵션을 위한 것
		int[] user = new int[6];
		int[] user_index = new int[6];
		int win = 0;


		Scanner scan = new Scanner(System.in);

		System.out.println("\n[로또번호 맞추기 프로그램]");
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		
		for (int i = 0; i < lotto.length; i++) {
			lotto_index = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[lotto_index];
			lotto[lotto_index] = temp;
		}
		for (int i = 0; i < user.length; i++) {
			for (int j = 0; j < user_index.length; j++) {
				System.out.println((i + 1) + "번째 숫자를 입력하세요");
				user[i] = scan.nextInt();
				if(!(user[i]>=1&&user[i]<=45)) {
					System.out.println("잘못된 숫자입니다. 다시입력해주세요");
					continue;
				}
				if (user[i] == user_index[j]) {
					System.out.println("중복된 숫자입니다. 다시입력해주세요");
					continue;
				}
				user_index[j] = user[i];
			}
		}
		System.out.print("로또 번호  : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		for (int i = 0; i < user.length; i++) {
			for (int j = 0; j < 6; j++) {
				if(user[i]==lotto[j]) {
					System.out.println("당첨번호 : "+user[i]);
					win++;
				}
			}
		}
		switch(win) {
		
		case 0: case 1: 
			System.out.println("아쉽게도 당첨되지 않았습니다.");
			break;
		case 2:
			System.out.println("축하합니다 5등 입니다. 상금 5천원을 수령하세요");
			break;
		case 3:
			System.out.println("축하합니다 4등 입니다. 상금 10만원을 수령하세요");
			break;
		case 4:
			System.out.println("축하합니다 3등 입니다. 상금 100만원을  수령하세요");
			break;
		case 5:
			System.out.println("축하합니다 2등 입니다. 상금 1억원을 수령하세요");
			break;
		case 6:
			System.out.println("축하합니다 1등 입니다. 상금 10억원을 수령하세요");
			break;
			
			
		}
		
	}

}
