import java.util.Scanner;

public class Ex0212_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ó�� ���α׷�
		//�̸� ���� ���� ���� �հ� ���
		
		String[] name=new String[3];
		String[] subject= {"","����","����","����","�հ�","���"};
		int[][] score=new int[3][4];
		double[] ave=new double[3];
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<name.length;i++) {
			System.out.println("�л��� �̸��� �Է��ϼ���");
			name[i]=scan.next();
			loop1:for(int j=0;j<score[i].length-1;j++) {
				System.out.println(name[i]+"�� "+(j+1)+"��° ������ �Է��ϼ���");
				score[i][j]=scan.nextInt();
				//�հ�
				if(!(score[i][j]>=0&&score[i][j]<=100)) {
					System.out.println("������ �߸��Ǿ����ϴ�.");
					continue loop1;
				}
				score[i][3]+=score[i][j];
			}
			//���
			ave[i]=(double)(score[i][3]/3.0);
		}
		
		for(int i=0;i<subject.length;i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println();
		//���
		for(int i=0;i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.printf("%.1f",ave[i]);
			System.out.println();
		}
		
		
	}

}
