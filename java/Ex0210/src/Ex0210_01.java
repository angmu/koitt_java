import java.util.Scanner;

public class Ex0210_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 가위바위보 게임을 만들어보세오
		int select = 0;// 1번째 선택변수
		int com = 0;// com이 낸 가위바위보
		int user = 0;// user 가 낸 가위바위보

		int win = 0;// 이긴횟수
		int draw = 0;// 비긴횟수
		int lose = 0;// 진횟수
		int count = 10;// 가위바위보 한 횟수

//		int[] confirm=new int[10];
		String[] confirm = new String[10];// 승패확인

		Scanner scan = new Scanner(System.in);
		while (true) {

			System.out.println("-----------------");
			System.out.println("가위바위보/승패확인프로그램");
			System.out.println("-----------------");
			System.out.println("1)가위바위보 게임  2)승패확인");
			System.out.println("번호를 선택해주세요 (종료 0)");

			select = scan.nextInt();
			if (select == 0) {
				System.out.println("시스쳄종료");
				break;
			}
			switch (select) {

			case 1:
				System.out.println("가위바위보");
				for (int i = 0; i < count; i++) {

					if (i >= 10) {
						System.out.println("게임을 종료합니다");

						break;
					}

					com = (int) (Math.random() * 3) + 1;

					System.out.println("[가위바위보 게임]");
					System.out.println("1)가위 2)바위 3)보 중에 1개를 골라주세요 (종료 0번)");
					user = scan.nextInt();
					if (user == 0) {
						System.out.println("게임을 종료합니다");
						break;
					}
					if (!(user >= 1 && user <= 3)) {
						System.out.println("잘못입력하였습니다.");
						count--;
						continue;
					}
					switch (user - com) {
					// 1 3 -2
					case 0:
						System.out.println("비겼습니다.");
						confirm[i] = "무승부";
						draw++;
						break;
					case -2:
					case 1:
						System.out.println("이겼습니다.");
						confirm[i] = "승리";
						win++;
						break;
					case -1:
					case 2:
						System.out.println("졌습니다.");
						confirm[i] = "패배";
						lose++;
						break;

					default:
						continue;
					}// user-com switch
				} // for
				System.out.printf("%d판 중 승리 %d, 패배%d, 무승부 %d 승률%.1f %n", count, win, lose, draw,
						win / (float) count * 100.0);

				break;

			case 2:
				System.out.println("승패확인 START");
				for (int i = 0; i < 10; i++) {
					System.out.println((i + 1) + "번째 승패는 ?" + confirm[i]);
				}
				System.out.printf("%d판 중 승리 %d, 패배%d, 무승부 %d 승률%.1f%n", count, win, lose, draw,
						win / (float) count * 100.0);
				break;

			}// select switch

		} // while

//		//1에서 100 각각의 배열에 저장하고 배열을 더 만들어서 
//		//각각의 0번방까지의 sum
//		//1번방 까지의 sum ... 100방 까지의 sum을 다른 배열장소에 저장
//		
//		int []score=new int[100];
//		int[]sum=new int[100];
//		
//		for(int i=0;i<100;i++) {
//			score[i]=i+1;
//			if(i==0) {
//				sum[i]=0+score[i];
//			}else {
//			sum[i]+=sum[i-1]+score[i];}///배열은 0부터 시작하기때문에 -1인채로 냅두면 에러가 뜨므로 i=0일때 0울 별도로 더할수있도록..한다.. 
//			System.out.println(score[i]+"번 방까지의 합 :"+sum[i]);
//		}
//		

//		//100개의 숫자를 1~100까지해서 각각의 배열에 저장해보세요
//		
//		int[] score= new int[100];
//		for(int i=0;i<100;i++) {
//			score[i]=(i+1);
//			System.out.println(score[i]);
//		}

//		int[] score1=new int[5];
//		score1[0]=100;
//		score1[1]=90;
//		score1[2]=80;
//		score1[3]=70;
//		score1[4]=60;
//		
//		int score2= {100,90,80,70,60};
//		
//		int []score3;
//		score3=new int[] {100,90,80,70,60};//꺽쇠 사이에 숫자를 넣지 않는다.

		// 1에서 6까지의 랜덤변수 5개

//		int[] score=new int[5];//5개의 변수가 만들어짐
//		for(int i= 0;i<5;i++) {
//			score[i]=(int)(Math.random()*6)+1;
//			System.out.println((i+1)+"번 랜덤수 :"+score[i]);
//		}
//		
//		int[] total;
//		total=new int[5];
//		total[0]=1; //이케 바로 못씀,>new int[5];로 마저 선언을 해줘야함

//		//이케 줄여쓸수도잇다
//		int[]total=new int[5];

		// 아래꺼를 배열로 변경 ^^
//		int ran1=(int)(Math.random()*6)+1;
//		int ran2=(int)(Math.random()*6)+1;
//		int ran3=(int)(Math.random()*6)+1;
//		int ran4=(int)(Math.random()*6)+1;
//		int ran5=(int)(Math.random()*6)+1;
//		
//		System.out.println("1에서 6까지 숫자중 랜덤숫자 5개 :"+ran1+" "+ran2+" "+ran3+" "+ran4+" "+ran5);
//		
	}

}
