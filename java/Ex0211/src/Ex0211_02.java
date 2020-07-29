
public class Ex0211_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단을 출력하는데
		
		
		
		
		//2의 배수단+3의 배수만나오게
		for(int i=2;i<=9;i++) {
			System.out.printf(i+"단\t"); //
			i++;
		
		}
		System.out.println("");
		for(int i=1;i<=9;i++) {
			if(!(i%3==0)) {
				continue;
			}
			
			for(int j=2;j<=9;j++) {
				if(j%2==0) {
				System.out.printf(j+"*"+i+"="+i*j+"\t"); //\t는 자릿수맞춤인가부다..
				}
			}System.out.println("");
		}

		
		
//		//3의 배수만나오게
//				for(int i=2;i<=9;i++) {
//					System.out.printf(i+"단\t"); //
//					
//				
//				}
//				System.out.println("");
//				for(int i=1;i<=9;i++) {
////					if(!(i%3==0)) {
////						continue;
////					}
////					//이케해도된다.
//					for(int j=2;j<=9;j++) {
//						if(i%3==0) {
//						System.out.printf(j+"*"+i+"="+i*j+"\t"); //\t는 자릿수맞춤인가부다..
//						}
//					}System.out.println("");
//				}
//		
		
//		//가로구구단
//		for(int i=2;i<=9;i++) {
//			System.out.printf(i+"단\t"); //
//			
//		
//		}
//		System.out.println("");
//		for(int i=1;i<=9;i++) {
//			for(int j=2;j<=9;j++) {
//				System.out.printf(j+"*"+i+"="+i*j+"\t"); //\t는 자릿수맞춤인가부다..
//				
//			}System.out.println("");
//		}
		
		//세로구구단
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//		}
	}

}
