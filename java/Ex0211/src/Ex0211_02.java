
public class Ex0211_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������� ����ϴµ�
		
		
		
		
		//2�� �����+3�� �����������
		for(int i=2;i<=9;i++) {
			System.out.printf(i+"��\t"); //
			i++;
		
		}
		System.out.println("");
		for(int i=1;i<=9;i++) {
			if(!(i%3==0)) {
				continue;
			}
			
			for(int j=2;j<=9;j++) {
				if(j%2==0) {
				System.out.printf(j+"*"+i+"="+i*j+"\t"); //\t�� �ڸ��������ΰ��δ�..
				}
			}System.out.println("");
		}

		
		
//		//3�� �����������
//				for(int i=2;i<=9;i++) {
//					System.out.printf(i+"��\t"); //
//					
//				
//				}
//				System.out.println("");
//				for(int i=1;i<=9;i++) {
////					if(!(i%3==0)) {
////						continue;
////					}
////					//�����ص��ȴ�.
//					for(int j=2;j<=9;j++) {
//						if(i%3==0) {
//						System.out.printf(j+"*"+i+"="+i*j+"\t"); //\t�� �ڸ��������ΰ��δ�..
//						}
//					}System.out.println("");
//				}
//		
		
//		//���α�����
//		for(int i=2;i<=9;i++) {
//			System.out.printf(i+"��\t"); //
//			
//		
//		}
//		System.out.println("");
//		for(int i=1;i<=9;i++) {
//			for(int j=2;j<=9;j++) {
//				System.out.printf(j+"*"+i+"="+i*j+"\t"); //\t�� �ڸ��������ΰ��δ�..
//				
//			}System.out.println("");
//		}
		
		//���α�����
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//		}
	}

}
