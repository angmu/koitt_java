import java.util.Scanner;

public class Ex0211_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3 3ǥ�� ����� 0�ƴϸ� 1�� �������ְ�.

		// x��ǥ�� �Է��ؼ� 1
		// y��ǥ�� �Է��ؼ� 2
		// [1,2] >>1�̸� score_in �� ��÷, 0�� ������ �� �Է�
		// 0 1 2
		// 0
		// 1
		// 2
		// ��

		int in_x = 0;
		int in_y = 0;
		int[][] ran = new int[3][3];
		String[][] score_in = new String[3][3];// ���� �Է��ؼ� �����ϴ� �迭
		System.out.println("[��ǥ���߱� ����]");
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

			System.out.println("x��ǥ�� �Է��ϼ��� (���� 99)");
			in_x = scan.nextInt();
			if(in_x==99) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
			if(!(in_x>=0&&in_x<=2)){
				System.out.println("�Է���ǥ�� �߸��Ǿ����ϴ�");
				continue;
			}
			System.out.println("x��ǥ�� �Է��ϼ���");
			in_y = scan.nextInt();
			if(!(in_y>=0&&in_y<=2)){
				System.out.println("�Է���ǥ�� �߸��Ǿ����ϴ�");
				continue;
			}
			if (ran[in_x][in_y] == 1) {
				score_in[in_x][in_y] = "��÷";
				
			}
			else {
				score_in[in_x][in_y] = "��";
			}
		}
//		
//		// 3 3ǥ�� ����� 0�ƴϸ� 1�� �������ְ�.
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

//		//5.8�� ǥ�� ����� 2,4,6,8 10 12 14 16 18....�� �־��
//		
//		int [][]score=new int[5][8];
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				score[i][j]=((i*8)+j+1)*2;//(1~40)*2
//			}
//			
//		}
//		System.out.println("[2�� ���]");
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.printf(score[i][j]+"\t");
//			}System.out.println();
//			
//		}
//
//		//�Է¹��
//		Scanner scan=new Scanner(System.in);
//		int[][]score2=new int[5][8];
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.println((i*8)+j+1+"��° 2�� ����� �Է����ּ���");
//				score2[i][j]=scan.nextInt();
//				if(!((score2[i][j])%2==0)){
//					System.out.println("�߸� �Է��Ͽ����ϴ�.");
//					j--;
//					continue;
//					
//				}
//				
//			}
//			
//		}

////		//�ð�ǥ ���
////		 ��    ȭ    ��  ��   ��
////1	        ����   ���� ���� ���� ����
////2	        ����1 ���� ���� ����2 �����
////3	        ���� ���� ���� ���� ü��
////4     ���� �̼� ü�� ���� ����
//		System.out.println("[�ð�ǥ]");
//		String[][]schedule= {
//				{"����","����","����","����","����"},
//				{"����1","����","����","����2","�����"},
//				{"����","����1","����","����","ü��"},
//				{"����","�̼�","ü��","����","����"},
//		};
//		System.out.println("\t��\tȭ\t��\t��\t��");
//		for(int i=0;i<4;i++) {
//			System.out.printf((i+1)+"����\t");
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
//				System.out.println((i*5)+j+1+"��° ������ �Է����ּ���");
//				schedule2[i][j]=scan.next();
//			}
//			
//		}
//		System.out.println("[�ð�ǥ]");
//		System.out.println("\t��\tȭ\t��\t��\t��");
//		for(int i=0;i<4;i++) {
//			System.out.printf((i+1)+"����\t");
//			for(int j=0;j<schedule2[i].length;j++) {
//				System.out.print(schedule2[i][j]+"\t");
//			}System.out.println();
//		}	
//		

		// 3,3�� ���� ��
		// �������� �������� �������� >>ȭ�� �Է�����
		// 100 78 99
		// 87 85 100
		// 75 100 89

//		int[][] score=new int[3][3];
//		
//		Scanner scan=new Scanner(System.in);
//		//�Է�
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.println((i*3)+j+1+"���� ������ �Է����ּ���");
//				score[i][j]=scan.nextInt();
//				
//			}
//		}//���
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				
//				System.out.print(score[i][j]+" ");
//				
//			}System.out.println();
//		}
//		
//		

//		//7,9�� for������
//		
//		
//		int[][] num=new int[7][9];
//		System.out.println("2�����迭");
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<num[i].length;j++) {
//				num[i][j]=(i*9)+j+1;
//				System.out.print(num[i][j]+" ");
//			}
//			
//		}
//		

		// 2���� �迭 :[5][5] ->25���� 1 2 3 4 5 //3 3�Ƿ� ����
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
//		System.out.println("2���� �迭");
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<num[i].length;j++) {
//				num[i][j]=(i*3)+j+1;//3�̶�>>�迭�� ���� ����..����..
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
//		System.out.println("1�����迭");
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
//		System.out.println("2���� �迭");
//		for(int i=0;i<score1.length;i++) {
//			for(int j=0;j<score1[i].length;j++) { //2��°�� �ּҸ� ���ҽ� [i].length
//				System.out.print(score1[i][j]+" ");
//			}System.out.println();
//		}

	}// main

}
