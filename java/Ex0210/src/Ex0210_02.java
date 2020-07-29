import java.util.Scanner;

public class Ex0210_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p199
		Scanner scan = new Scanner(System.in);
		// 로또번호 추출
		int temp = 0;
		int ball_index = 0;
		int[] win_num = new int[6];// 당첨번호
		int goal=0;
		int[] num = new int[6];// 로또입력번호
		int success = 0;// 맞는 숫자가 있는지 홧인

		while (true) {
			for (int i = 0; i < 6; i++) {// 2개의 로또번호를 입력받음
				System.out.println("1~45 중 원하는 숫자를 입력하세요");
				num[i] = scan.nextInt();
				if (!(num[i] >= 1 && num[i] <= 45)) {
					System.out.println("잘못입력하였습니다.");
					i--;
					continue;
				}
			}//for
			break;
		}
			// 당첨번호와 로또번호확인
			int[] ball = new int[45];// 로또
			for (int i = 0; i < 45; i++) {
				ball[i] = i + 1;
			}
			// 로또자리교환 >>>테스트할때 이걸 주석처리하고 하면 된다.
			for (int i = 0; i < 200; i++) {
				ball_index = (int) (Math.random() * 45);// 배열의 자리를 의미함..0~44까지..''
				temp = ball[0];
				ball[0] = ball[ball_index];
				ball[ball_index] = temp;
			}
			//로또번호와 입력번호 확인
			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < 6; j++) {
					if (num[i] == ball[j]) {
						success++;
						win_num[i] = num[i];
					}
				}
			}//for
			// 로또번호 출력
			System.out.println("로또번호는?");

			for (int i = 0; i < 6; i++) {
				System.out.print(ball[i] + " ");
			}
			// 당첨확인
			
			System.out.println(success+"개 맞춰서");
			if (success >= 0 && success<=2) {
				
				System.out.println("당첨되지않았습니다.");
			} else {
				System.out.println("당첨되었습니다.");
				switch(success) {
				case 3 :
					System.out.println("4등 당첨금 : 5,000원");
					break;
				case 4 :
					System.out.println("3등 당첨금 : 50,000원");
					break;
				case 5 :
					System.out.println("2등 당첨금 : 1,500,000원");
					break;
				case 6 :
					System.out.println("1등 당첨금 : 1,600,000,000원");	
					
					break;
				default: 
					break;
					
				}//switch
				for (int i = 0; i < win_num.length; i++) {
					if (!(win_num[i] == 0)) {
						System.out.println("당첨번호 :" + num[i]);
					}
				}
			}//else
			
			
			
			}// main
			
			
			
		}//class


