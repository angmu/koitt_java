import java.util.Scanner;

public class Ex0212_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Խ���  ���α׷�
		//��ȣ-int (�̸� ���� �۳���)-string ��ȸ��-int
		//�� 10������ �Է°��� 1�����ϰ� �����
		//���
		
		//1)�۾��� 2)���
		
		int num=0;
		int look=0;
		String[][] text=new String[10][3];
		String[] title= {"��ȣ","�̸�","����","�۳���","��ȸ��"};
		int ch=0;
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<text.length;i++) {
			for(int j=0;j<text[i].length;j++) {
				text[i][j]="";
			}
		}
		loop: for(int i=0;i<text.length;i++) {
			for(int j=0;j<text[i].length;j++) {
				if(i>=1) {
					System.out.println("�Է��� �� �Ͻðڽ��ϱ�? (1)��� (2)����");
					ch=scan.nextInt();
					switch(ch) {
					case 1:
						break;
					case 2:
						break loop;
					default:
						System.out.println("�߸��Է��߽��ϴ�.");
						continue;
					}//switch
				}//if
				System.out.println(title[j+1]+"�� �Է��ϼ���");
				text[i][j]=scan.nextLine();//�۳����� ��� next�� �ϰԵǸ� ����� �������� �Ѿ��.. 
				//nextLine>>���ٸ���Է� next>>������� ������������ �Էµȴ�,,
			}
		}
		
		for(int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
			
		}System.out.println();
		for(int i=0;i<text.length;i++) {
			num+=i+1;
			System.out.print(num+"\t");
			for(int j=0;j<text[i].length;j++) {
				System.out.print(text[i][j]+"\t");
			}System.out.print(look+"\t\n");
		}
			
	}

}
