
public class Ex0204_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3�� ����� �ƴѰ��� sum�� 200�� �Ѵ� i�� sum�� ���ض�.
		
		
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
		
		System.out.println("i�� :"+(i-2));
		System.out.println("sum�� :"+sum);
		
		
//		//Ȧ���� ���ؼ� 200 ������ i���� sum ���� ���ض�. 
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
//		System.out.println("i��:"+(i-2));//i�� �´��� Ȯ���ϰ������, if�� ���� �۰��ؼ� �׽�Ʈ �غ��� �Ѵ�.(����ó�� ������ ���Ҷ���..������ ���Ҽ�����>>�̰��� �ϴ� ��÷���ڸ� ���Ƿ� ���س��� �׽�Ʈ�� �� �� ������ ������ ����.)
//		System.out.println("sum��"+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
		//������ �ٲ۰�.
		
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
//		System.out.println("i="+(i-1));//���� i ���� �������� for�������� i���� -1�� ������Ѵ�.
//		System.out.println("sum="+sum);
//		
		
	}

}
