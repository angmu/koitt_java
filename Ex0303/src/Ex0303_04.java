
public class Ex0303_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception e= new Exception("고의로 발생시켯음");
		System.out.println(1);
		System.out.println(2);
		try {
			throw e;
			
		} catch (Exception e2) {
			// TODO: handle exception
			//에러를 고의로 발생 가능하다.
			System.out.println("에러메세지 :"+e.getMessage());
			e.printStackTrace();
			System.out.println();
		}
		System.out.println(3);
		System.out.println("완료");
	}

}
