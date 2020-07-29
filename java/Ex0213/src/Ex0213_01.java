import java.util.Scanner;

public class Ex0213_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로또번호

		int[] lotto = new int[45];
		int lotto_index = 0;
		int temp = 0;
		int[] user = new int[6];
		int success = 0;
		int bonus=0;

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		for (int i = 0; i < 200; i++) {
			lotto_index = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[lotto_index];
			lotto[lotto_index] = temp;
		}
//		System.out.println("로또번호 추첨");
		for (int i = 0; i < 7; i++) {
			if(i==6) {
				System.out.print(" 보너스번호 :"+lotto[i]);
			}
			System.out.print(lotto[i] + " ");
		}
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < user.length; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.println((i + 1) + "번째 번호를 골라주세요");
				user[i] = scan.nextInt();
				if (user[i] == lotto[j]) {
					if(user[i] == lotto[7]) {
						System.out.println("일치하는 번호 : " + user[i]);
						bonus++;
						break;
					}
					System.out.println("일치하는 번호 : " + user[i]);
					success++;
					break;
				}
			}
		}
		switch(success) {
		case 0: case 1: case 2:
			System.out.println("당첨되지 않았습니다.");
			break;
		case 3:
			System.out.println("5등 당첨. 상금 5천원");
			break;
		case 4:
			System.out.println("4등 당첨. 상금 30만원");
			break;
		case 5:
			if(bonus>0) {
				System.out.println("2등 당첨. 상금 1억원");
				break;
			}
			System.out.println("3등 당첨. 상금 100만원");
			break;
		case 6:
			System.out.println("1등 당첨. 상금 10억원");
			break;
		}
	}

}
