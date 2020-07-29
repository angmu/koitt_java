
public class Ex0211_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//베열의 크기를 10을 만들고 
		//2-1 배열값이 0 500 1000 3000 중 1개가 나오게
		//202 배열값에 0 10 100 1000이 들어갈수 있게
		
		int[] pay=new int[10];
		int[] pay1=new int[10];
		
		int[] money= {0,500,1000,3000};
		int select=0;
		
		//2-1
		for(int i=0;i<pay.length;i++) {
			
			select=(int)(Math.random()*5);
			switch(select) {
			case 0:
				pay[i]=1;
				break;
			case 1:
				pay[i]=(10*1);
				break;
			case 2:
				pay[i]=(10*10);
				break;
			case 3:
				pay[i]=(10*10*10);
				break;
			default:
				break;
			}
		}
		System.out.println("1차원배열 값 :");
		for(int i=0;i<pay.length;i++) {
			System.out.print(pay[i]+" ");	

		}
		
//		int[] pay=new int[10];
//		int[] pay1=new int[10];
//		
//		int[] money= {0,500,1000,3000};
//		int select=0;
//		
//		//2-1
//		for(int i=0;i<pay.length;i++) {
//			
//			select=(int)(Math.random()*5);
//			pay[i]=money[select];
//	
//		}
//		System.out.println("1차원배열 값 :");
//		for(int i=0;i<pay.length;i++) {
//			System.out.print(pay[i]+" ");	
//
//		}
		
		
		
		
		
	}

}
