
public class Ex0227_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CaptionTv c2 =null;
		Tv t2 = new CaptionTv();
		
		//�ڼտ��� �ٽ� �Ѱ��ְ� �� ��� t2�� �����ϴ� caption�� ����� c2�� ����� �����ϴ�.
		//DBó�� ������ ���ϰ� �̸��� ���� �����ִ� ����� :D
		c2 = (CaptionTv) t2;
		////==========================
		
		
		Tv t = new Tv();
		CaptionTv c = new CaptionTv();
//		CaptionTv c2 = new CaptionTv();
		
		// **1.�ڼ��� ��ü�� ���󿡰� ������ ������
//		Tv t2 = new CaptionTv();
		// ������ ��ü�� �ڼտ��� ������ ������(�� ����ȭ�� �ϸ鰡��)
//		Caption c2=new Tv();
		
		
		t2 = (Tv)c2;
		//���� ����ȯ�� �αⰡ��
		c2 = (CaptionTv) t2;

		
		t2.power();
		t2.channel = 7;
		// ***2.�������� �ش������ ���� ����Ҽ����°Ͱ� ���� (tv�� �ִ°Ÿ� ��밡��)
//		t2.text;
//		t2.caption();

		t.power();
		t.channel = 7;
		t.channelUp();
		t.channelUp();
		t.channelDown();
		System.out.println("Tv�� ä��: " + t.channel);

		c.power();
		c.channel = 11;
		c.channelDown();
		c.channelDown();
		c.caption();
		c.text = "�ܿ�ձ� 2 �ڸ��� �߰��Ǿ����ϴ�";
		c.caption();
		System.out.println("captionTv�� ä��: " + c.channel);
	}

}
