
public class Ex0225_02 {
	public static void main(String[] args) {
		Student[] stu = new Student[3];
		String[] name = new String[]{ "ȫ�浿", "�̼���", "������" };
		int[] grade= new int[]{3,4,1};
		
//		stu[0]=new Student(name[0],grade[0]);
//		stu[1]=new Student(name[1],grade[1]);
//		stu[2]=new Student(name[2],grade[2]);
		
		//��ü �迭�̱� ������ �ٽ� new�����ڸ� ���ؼ� ���� ���� ������ ����ٿ�
		for(int i=0;i<stu.length;i++) {
			stu[i]=new Student(name[i],grade[i]);
		}
		
		//lotto�ϴ� 45�� �迭�� ����� 1~45���� ���ڸ� �����ÿ�
		
		int []lotto=new int[45];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
		}
		
		//�ζ� ��ü�� ���� ��ü���� 1~45���� ���ڰ� ���������.
		//�����ϸ� lotto ������ �ǵ���
		
		Deck d=new Deck();
		System.out.println("45���� �� ����");
		for(int i=0;i<45;i++) {
			System.out.print(d.ball[i]+" "); 
		}
	}
}
