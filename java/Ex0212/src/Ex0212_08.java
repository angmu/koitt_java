import java.util.Scanner;

public class Ex0212_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ó�����α׷�
		//�̸� ���� ���� ���� �հ� ���
		String[] name=new String[3];
		int [][] score=new int[3][4];
		//{0,0}{0,1}{0,2}���� {0,3}�հ�
		double[] avg=new double[3];
		String[] subject= {"�̸�","����","����","����","�հ�","���"};
		
		Scanner scan=new Scanner(System.in);
		//�Է���
		for(int i=0;i<name.length;i++) {
			//�̸��Է�
			System.out.println((i+1)+"�� �л��� �̸��� �Է����ּ���");
			name[i]=scan.next();
			for(int j=0;j<score[i].length-1;j++) {
				//�����Է�
				System.out.println(subject[j+1]+"������ �Է��ϼ���");
				score[i][j]=scan.nextInt();
				//�հ��Է�
//				score[i][3]+=score[i][j];
				score[i][score[i].length-1]+=score[i][j];
			}
//			avg[i]=score[i][3]/3.0;//�հ�/3 �ϴ°ſ� ������.
			avg[i]=score[i][score.length-1]/(score[i].length-1);		
		}
		
//		���
		for(int i=0;i<subject.length;i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<score.length;i++) {
			//�̸����
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				//�������
				System.out.print(score[i][j]+"\t");
			}
			//������
			System.out.print(avg[i]+"\n");
		}
		
		
		
	}

}
