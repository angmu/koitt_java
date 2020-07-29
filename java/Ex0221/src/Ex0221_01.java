import java.util.Scanner;

public class Ex0221_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1차원 10배열
		// 1~45 배열 만들어 값넣기
		// 10개를 배열에 넣어라요
		// 중복허락 x

		int[] lotto = new int[45];
		int[] lotto2 = new int[10];
		
		int select = 0, result = 0;
		while (true) {
			
			select = main_pArr();//main print
			switch (select) {
			case 1:
				System.out.println("공넣기 완료");
				// 45공 넣기
				ball(lotto);
				break;
			case 2:
				System.out.println("공섞기 완료");
				// 공섞기
				ball_sh(lotto);
				break;
			case 3:
				System.out.println("공선택 완료");
				// 공뽑기
				lotto(lotto, lotto2);
				break;
			case 4:
				System.out.println("선택된 공");
				// 공 프린트
				print2(lotto2);
				break;
			case 5:
				System.out.println("선택된 공의 합이다요");
				result = sumArr(lotto2);
				System.out.println(result);
				break;
			case 6:
				int[]lotto3=new int[10];
				lotto(lotto2, lotto3);
				System.out.println("정렬전");
				print2(lotto3);//변경전
				System.out.println("공을 이쁘게 정리햇다요");
				sortArr2(lotto2);
				print2(lotto2);//변경후
//				System.out.println("정렬전");
//				print2(lotto2);//변경전
//				System.out.println("공을 이쁘게 정리햇다요");
//				sortArr(lotto2);
//				print2(lotto2);//변경후
				break;
			default:
				System.out.println("번호 잘못넣었다요");
				break;
			}

		}

	}// main

	static int main_pArr() {
		Scanner scan = new Scanner(System.in);
		int select = 0;
		System.out.println("=================");
		System.out.println("로또 공을 뽑는다요");
		System.out.println("1. 공넣기");
		System.out.println("2. 공섞기");
		System.out.println("3. 공추출(10개)");
		System.out.println("4. 추첨결과");
		System.out.println("5. 공의 합");
		System.out.println("6. 공 정렬");
		System.out.println("원하는 번호를 입력해라요");
		select=scan.nextInt();
		scan.nextLine();
		return select;
	}

	static void ball(int[] lotto) {
//		for (int i = 0; i < lotto.length; i++) {
		for (int i:lotto) {	//위랑 같은말이다요 하지만 잘 안쓴다요.(배열일때만 가능)
			lotto[i] = i + 1;
		}
	}

	static void ball_sh(int[] lotto) {
		for (int i = 0; i < 200; i++) {
			int lotto_index, temp = 0;
			lotto_index = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[lotto_index];
			lotto[lotto_index] = temp;
		}
	}

	static void lotto(int[] lotto, int[] lotto2) {
		for (int i = 0; i < lotto2.length; i++) {
			lotto2[i] = lotto[i];
		}
	}

	static void print2(int[] lotto2) {
		for (int i = 0; i < lotto2.length; i++) {
			System.out.print(lotto2[i] + " ");
		}
		System.out.println();
	}

	static int sumArr(int[] lotto2) {
		int result = 0;
		for (int i = 0; i < lotto2.length; i++) {
			result += lotto2[i];
		}
		return result;
	}
	//그냥 셔플후 바꾸는것
	static void sortArr(int[] lotto2) {
		for (int i = 0; i < lotto2.length - 1; i++) {
			boolean boo=false;
			for (int j = 0; j < lotto2.length - i - 1; j++) {
				if (lotto2[j] > lotto2[j + 1]) {
					int temp = lotto2[j];
					lotto2[j] = lotto2[j + 1];
					lotto2[j + 1] = temp;
					boo=true;
				}
			}
			//j밖에 둬야 된다요!
			if(boo==false) {
				break;
			}
		}
	}
	//배열로 리턴하여 보내는 방법
	static int[] sortArr2(int[] lotto2) {
		for (int i = 0; i < lotto2.length - 1; i++) {
			boolean boo=false;
			for (int j = 0; j < lotto2.length - i - 1; j++) {
				if (lotto2[j] > lotto2[j + 1]) {
					int temp = lotto2[j];
					lotto2[j] = lotto2[j + 1];
					lotto2[j + 1] = temp;
					boo=true;
				}
			}
			//for j밖에 둬야 된다요!
			if(boo==false) {
				break;
			}
		}return lotto2;
	}
}// class
