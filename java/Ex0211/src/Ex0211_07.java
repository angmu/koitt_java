import java.util.Scanner;

public class Ex0211_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ҽ��� ���� 2���� �Է�, ��������, �Ҽ����� 2°�ڸ����� ��Ÿ���� �ְ�.
		
		float[] input=new float[2];
		
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<input.length;i++) {
			System.out.println((i+1)+"��° �Ҽ��� �Է��ϼ���");
			input[i]=scan.nextFloat();
		}
		System.out.printf("%.2f%n",(input[0]+input[1]));
		System.out.printf("%.2f%n",(input[0]-input[1]));
		System.out.printf("%.2f%n",(input[0]*input[1]));
		System.out.printf("%.2f",(input[0]/input[1]));
		
		
		//2�迭�� ���ֱ�
		//1���� �迭 ũ�� 10 ����� �迭�� �������� 0 500 1000 3000�߿� 1���� �ִ´�
		
		
		
	}

}
