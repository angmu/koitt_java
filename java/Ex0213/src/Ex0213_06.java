import java.util.Scanner;

public class Ex0213_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�̸� ���� ���� �հ� ���
		String[]name=new String[3];
		int[][]score=new int[3][3];
		String[]subject= {"�̸�","����","����","�հ�","���","���"};
		double []avg=new double[3];
		int [] rank=new int[3];
		
		Scanner scan=new Scanner(System.in);
		//�̸��Է�
		for(int i=0;i<name.length;i++) {
			System.out.println((i+1)+"��° �л��� �̸��� �Է��ϼ���");
			name[i]=scan.next();
			for(int j=0;j<score[i].length-1;j++) {
				//����
				System.out.println(subject[j+1]+"������ ������ �Է��ϼ���");
				score[i][j]=scan.nextInt();
				//�հ�
				score[i][score[i].length-1]+=score[i][j];
			}//���
			avg[i]=score[i][score[i].length]/(double)(score[i].length-1);
			
		}
		
		//���
		for(int i=0;i<score.length;i++) {
			rank[i]=1;
			for(int j=0;j<score.length;j++) {
				if(score[i][score.length]<score[j][score.length]) {
				rank[i]++;
				}
			}
		}//���
		
		//----��½���
		
		for(int i=0;i<subject.length;i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;i<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}System.out.print(avg[i]+"\t");
			System.out.println(rank[i]+"\t\n");
		}
	}

}
