import java.util.Scanner;

public class Ex0211_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3 3표를 만들고 0아니면 1을 넣을수있게.

		// x좌표를 입력해서 1
		// y좌표를 입력해서 2
		// [1,2] >>1이면 score_in 에 당첨, 0이 있으면 꽝 입력
		// 0 1 2
		// 0
		// 1
		// 2
		// 답

		int in_x = 0;
		int in_y = 0;
		int[][] ran = new int[3][3];
		String[][] score_in = new String[3][3];// 내가 입력해서 저장하는 배열
		System.out.println("[좌표맞추기 게임]");
		for (int i = 0; i < ran.length; i++) {
			for (int j = 0; j < ran[i].length; j++) {
				ran[i][j] = (int) (Math.random() * 2);
			}
		}
		while (true) {
			System.out.println("\t0\t1\t2\n");
			for (int i = 0; i <score_in.length; i++) {
				System.out.print(i+"\t");
				for (int j = 0; j < score_in[i].length; j++) {
					System.out.printf(score_in[i][j]+"\t");
					
				}
				System.out.println();
			}
			

			Scanner scan = new Scanner(System.in);

			System.out.println("x좌표를 입력하세요 (종료 99)");
			in_x = scan.nextInt();
			if(in_x==99) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			if(!(in_x>=0&&in_x<=2)){
				System.out.println("입력좌표가 잘못되었습니다");
				continue;
			}
			System.out.println("x좌표를 입력하세요");
			in_y = scan.nextInt();
			if(!(in_y>=0&&in_y<=2)){
				System.out.println("입력좌표가 잘못되었습니다");
				continue;
			}
			if (ran[in_x][in_y] == 1) {
				score_in[in_x][in_y] = "당첨";
				
			}
			else {
				score_in[in_x][in_y] = "꽝";
			}
		}
//		
//		// 3 3표를 만들고 0아니면 1을 넣을수있게.
//
//		int[][] ran = new int[3][3];
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				ran[i][j] = (int) (Math.random()*2);
//			}
//		}
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.printf(ran[i][j] + " ");
//
//			}
//			System.out.println();
//		}

//		//5.8의 표를 만들고 2,4,6,8 10 12 14 16 18....를 넣어라
//		
//		int [][]score=new int[5][8];
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				score[i][j]=((i*8)+j+1)*2;//(1~40)*2
//			}
//			
//		}
//		System.out.println("[2의 배수]");
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.printf(score[i][j]+"\t");
//			}System.out.println();
//			
//		}
//
//		//입력방식
//		Scanner scan=new Scanner(System.in);
//		int[][]score2=new int[5][8];
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.println((i*8)+j+1+"번째 2의 배수를 입력해주세요");
//				score2[i][j]=scan.nextInt();
//				if(!((score2[i][j])%2==0)){
//					System.out.println("잘못 입력하였습니다.");
//					j--;
//					continue;
//					
//				}
//				
//			}
//			
//		}

////		//시간표 출력
////		 월    화    수  목   금
////1	        국어   수학 국어 영어 국사
////2	        과학1 영어 수학 과학2 세계사
////3	        수학 과학 국사 윤리 체륙
////4     음악 미술 체육 국어 영어
//		System.out.println("[시간표]");
//		String[][]schedule= {
//				{"국어","수학","국어","영어","국사"},
//				{"과학1","영어","수학","과학2","세계사"},
//				{"수학","과락1","국사","윤리","체육"},
//				{"음악","미술","체육","국어","영어"},
//		};
//		System.out.println("\t월\t화\t수\t목\t금");
//		for(int i=0;i<4;i++) {
//			System.out.printf((i+1)+"교시\t");
//			for(int j=0;j<schedule[i].length;j++) {
//				System.out.print(schedule[i][j]+"\t");
//			}System.out.println();
//		}
//		
//		Scanner scan=new Scanner(System.in);
//		String[][]schedule2=new String[4][5];
//		
//		for(int i=0;i<schedule2.length;i++){
//			for(int j=0;j<schedule2[i].length;j++) {
//				System.out.println((i*5)+j+1+"번째 과목을 입력해주세요");
//				schedule2[i][j]=scan.next();
//			}
//			
//		}
//		System.out.println("[시간표]");
//		System.out.println("\t월\t화\t수\t목\t금");
//		for(int i=0;i<4;i++) {
//			System.out.printf((i+1)+"교시\t");
//			for(int j=0;j<schedule2[i].length;j++) {
//				System.out.print(schedule2[i][j]+"\t");
//			}System.out.println();
//		}	
//		

		// 3,3을 만든 후
		// 국어점수 영어점수 수학점수 >>화면 입력으로
		// 100 78 99
		// 87 85 100
		// 75 100 89

//		int[][] score=new int[3][3];
//		
//		Scanner scan=new Scanner(System.in);
//		//입력
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.println((i*3)+j+1+"번때 점수를 입력해주세요");
//				score[i][j]=scan.nextInt();
//				
//			}
//		}//출력
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				
//				System.out.print(score[i][j]+" ");
//				
//			}System.out.println();
//		}
//		
//		

//		//7,9를 for문으로
//		
//		
//		int[][] num=new int[7][9];
//		System.out.println("2차원배열");
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<num[i].length;j++) {
//				num[i][j]=(i*9)+j+1;
//				System.out.print(num[i][j]+" ");
//			}
//			
//		}
//		

		// 2차원 배열 :[5][5] ->25까지 1 2 3 4 5 //3 3의로 수정
		// 6 7 8 9 10

//		int[][] num2=new int[3][3];
//		num2[0][0]=1;
//		num2[0][1]=2;
//		num2[0][2]=3;
//		num2[1][0]=4;
//		num2[1][1]=5;
//		num2[1][2]=6;
//		num2[2][0]=7;
//		num2[2][1]=8;
//		num2[2][2]=9;
//		
//		int [][] num3= {
//				{1,2,3},{4,5,6},{7,8,9}
//		};
//		
//		
//		
//		int[][] num=new int[3][3];
//		System.out.println("2차원 배열");
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<num[i].length;j++) {
//				num[i][j]=(i*3)+j+1;//3이란>>배열의 뒤의 숫자..ㅇㅇ..
//				
//				System.out.println("["+i+"]"+"["+j+"]"+num[i][j]);
//			}
//			
//		}

//		int[] total=new int[5];
//		total[0]=100;
//		total[1]=90;
//		total[2]=80;
//		total[3]=70;
//		total[4]=60;
//		
//		int[] total1= {100,90,80,70,60};
//		System.out.println("1차원배열");
//		for(int i=0;i<5;i++) {
//			System.out.print(total[i]);
//		}
//		
//		int[][] score=new int[5][3];
//		score[0][0]=100;
//		score[0][1]=100;
//		score[0][2]=100;
//		score[1][0]=90;
//		score[1][1]=90;
//		score[1][2]=90;
//		score[2][0]=80;
//		score[2][1]=80;
//		score[2][2]=80;
//		score[3][0]=70;
//		score[3][1]=70;
//		score[3][2]=70;
//		score[4][0]=60;
//		score[4][1]=60;
//		score[4][2]=60;
//		score[5][0]=50;
//		score[5][1]=50;
//		score[5][2]=50;
//		
//		
//		
//		
//		int[][] score1={
//			{100,100,100},{90,90,90},{80,80,80},{70,70,70},{60,60,60}
//			
//		};
//		System.out.println("2차원 배열");
//		for(int i=0;i<score1.length;i++) {
//			for(int j=0;j<score1[i].length;j++) { //2번째의 주소를 원할시 [i].length
//				System.out.print(score1[i][j]+" ");
//			}System.out.println();
//		}

	}// main

}
