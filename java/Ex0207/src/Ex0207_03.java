import java.util.Scanner;

public class Ex0207_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		로그인
//		로그인이 5회이상 실패시 프로그램 종료
//		1에서 입력한 값까지 숫자를 더하는 프로그램
		String id="aaa";//id
		String pd="1234";//비번
		int tr=0;//로그인 시행횟수
		int sum=0;//합계
		int input=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("[자동덧셈프로그램]");
		System.out.println("로그인이 필요합니다.");
		
	loop1:	while(true) {

			
			
			
			System.out.println("\n아이디를 입력해주세요");
			String id_ch=scan.next();
			if(!(id.equals(id_ch))) {
				tr++;
				if(tr>4) {
					System.out.println("틀린횟수가 너무 많습니다. 프로그램을 종료합니다.");
					break loop1;
				}
				System.out.println("아이디가 틀렸습니다."+tr+"회 오류");
				continue;}
			while(true) {
				System.out.println("\n비밀번호를 입력해주세오");
				String pd_ch=scan.next();
				if(!(pd.equals(pd_ch))) {
					tr++;
					if(tr>4) {
						System.out.println("틀린횟수가 너무 많습니다. 프로그램을 종료합니다.");
						break loop1;
					}
					System.out.println("비밀번호가 틀렸습니다."+tr+"회 오류");
					continue;
				}break;
			}
			
			System.out.println("\n로그인에 성공했습니다");
			
			while(true) {
				System.out.println("\n1부터 원하는 숫자까지의 합을 구하는 프로그램입니다.");
				System.out.println("원하는 숫자를 입력하세요 (종료 0)");
				input=scan.nextInt();
				if(input==0) {
					System.out.println("프로그램을 종료합니다");
					break loop1;
				}
				for(int i=1;i<=input;i++) {
					sum+=i;
				}System.out.printf("1부터 %d까지의 숫자의 합 : %d%n",input,sum);
			}
			
			
		}//while 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
