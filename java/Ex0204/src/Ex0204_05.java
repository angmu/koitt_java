
public class Ex0204_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3의 배수가 아닌것의 sum이 200을 넘는 i와 sum을 구해라.
		
		
		int sum=0;
		int i=1;
		while(true) {
			if(sum>200) {
			break;
			}
			else if(!(i%3==0)) {
				
				sum+=i;
			}
			i++;
			
			
		}
		
		System.out.println("i값 :"+(i-2));
		System.out.println("sum값 :"+sum);
		
		
//		//홀수만 더해서 200 넘을때 i값과 sum 값을 구해라. 
//		
//		int sum=0;
//		int i=1;
//		while(true) {
//			if(sum>200) {
//				break;
//			}
//
//			sum+=i;
//			i+=2;
//		}
//		
//		System.out.println("i값:"+(i-2));//i가 맞는지 확인하고싶을때, if의 값을 작게해서 테스트 해봐야 한다.(복권처럼 난수를 비교할때는..난수를 비교할수없음>>이것은 일단 당첨숫자를 임의로 정해놓고 테스트를 한 후 맞으면 난수로 변경.)
//		System.out.println("sum값"+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int sum=0;
//		int i=0;
//		while(true) {
//			if(sum>100) {
//				break;
//			}
//			i++;
//			sum+=i;
//			
//		}//end of while
//		System.out.println("i="+i);
//		System.out.println("sum="+sum);
//		
		//▲위를 바꾼것.
		
//		for(i=1;i<=100;i++) {
//			if(sum>100) {
//				break;
//			}
//			sum+=i;			
//		}
		
		
		
//		for(i=1;sum<100;i++) {
//			sum+=i;			
//		}
//		
//		System.out.println("i="+(i-1));//같은 i 값을 얻고싶으면 for구문에서 i값에 -1을 해줘야한다.
//		System.out.println("sum="+sum);
//		
		
	}

}
