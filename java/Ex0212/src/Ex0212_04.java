import java.util.Scanner;

public class Ex0212_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�л��� ������ �Է¹޴� �迭
//		�̸��� �Է¹޴� �迭[3] ������ �Է��ϴ� �迭 [3][3]
		
		
		
//		//�̸��� ������ ��� �Է¹޾� ���+�л����� ���� ���� ���� �հ踦 ���ؼ� �迭��..
		
		String[] name=new String[3];
		
		int [][] score=new int[3][4];
		Scanner scan=new Scanner(System.in);
		
		
		for(int i=0;i<score.length;i++) {
			
			//�̸��Է�
			System.out.println("�л��� �̸��� �Է��ϼ���");
			name[i]=scan.next();
			//�����Է�
			for(int j=0;j<score[i].length-1;j++) {
				System.out.println("������ �Է��ϼ���");
				score[i][j]=scan.nextInt();
				//�հ��Է�
				score[i][3]=score[i][3]+score[i][j];
			}
			
		}
		
		System.out.print("\t"+"����\t"+"����\t"+"����\t"+"�հ�\t\n");
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score.length;j++) {
				System.out.print(score[i][j]+"\t");
			}System.out.println();
		}
		
//		
//		//�̸��� ������ ��� �Է¹޾� ���
//		
//		String[] name=new String[3];
//		
//		int [][] score=new int[3][3];
//		Scanner scan=new Scanner(System.in);
//		
//		
//		for(int i=0;i<score.length;i++) {
//			System.out.println("�л��� �̸��� �Է��ϼ���");
//			name[i]=scan.next();
//			for(int j=0;j<score[i].length;j++) {
//				System.out.println("������ �Է��ϼ���");
//				score[i][j]=scan.nextInt();
//			}
//		}
//		
//		System.out.print("\t"+"����\t"+"����\t"+"����\t\n");
//		for(int i=0;i<name.length;i++) {
//			System.out.print(name[i]+"\t");
//			for(int j=0;j<score.length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}System.out.println();
//		}
		
//		//������ �Է¹޴� ����
//		int [][] score=new int[3][3];
//		
//		String[] name= {"ȫ�浿","�̼���","������"};
////		int[][] score= {
////				{100,88,79},{100,99,87},{79,88,85}
////		};
//		//���
//		Scanner scan=new Scanner(System.in);
//		for(int i=0;i<score.length;i++) {
//			System.out.print(name[i]+" �л��� ");
//			for(int j=0;j<score[i].length;j++) {
//				System.out.println("������ �Է��ϼ���");
//				score[i][j]=scan.nextInt();
//			}
//		}
//		
//		System.out.print("\t"+"����\t"+"����\t"+"����\t\n");
//		for(int i=0;i<score.length;i++) {
//			System.out.print(score[i]+"\t");
//			for(int j=0;j<score.length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}System.out.println();
//		}
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
//		String[] name= {"ȫ�浿","�̼���","������"};
//		int[][] score= {
//				{100,88,79},{100,99,87},{79,88,85}
//		};
//		//���
//		System.out.print("\t"+"����\t"+"����\t"+"����\t\n");
//		for(int i=0;i<name.length;i++) {
//			System.out.print(name[i]+"\t");
//			for(int j=0;j<score.length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}System.out.println();
//		}
		
	}//main

}//class
