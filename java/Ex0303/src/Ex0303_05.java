
public class Ex0303_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception ee= new Exception();
		try {
			startInstall();
			copyFile();
//			System.out.println(5/0);
//			deleteTempFile();
		}
		catch(Exception e) {
			e.printStackTrace();
//			deleteTempFile();
			System.out.println("catch������ ����Ǿ����ϴ�.");
		}finally {
			deleteTempFile();
		}
	}
	
	
	static void startInstall() {
		System.out.println("���α׷��� ��ġ�մϴ�.>>Install");
	}
	static void copyFile() {
		System.out.println("�ű����α׷��� �����մϴ�>>Copy����");
	}
	static void deleteTempFile() {
		System.out.println("�����ߴ� �ӽ������� �����մϴ�>>Delete����");
	}
}//class


