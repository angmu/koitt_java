import java.util.Scanner;

public class Ex0211_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//소수점 숫자 2개를 입력, 사직연산, 소수점은 2째자리까지 나타날수 있게.
		
		float[] input=new float[2];
		
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<input.length;i++) {
			System.out.println((i+1)+"번째 소수를 입력하세요");
			input[i]=scan.nextFloat();
		}
		System.out.printf("%.2f%n",(input[0]+input[1]));
		System.out.printf("%.2f%n",(input[0]-input[1]));
		System.out.printf("%.2f%n",(input[0]*input[1]));
		System.out.printf("%.2f",(input[0]/input[1]));
		
		
		//2배열에 값넣기
		//1차원 배열 크기 10 만든다 배열에 랜덤수를 0 500 1000 3000중에 1개를 넣는다
		
		
		
	}

}
