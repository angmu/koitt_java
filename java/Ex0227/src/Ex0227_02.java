
public class Ex0227_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CaptionTv c2 =null;
		Tv t2 = new CaptionTv();
		
		//자손에게 다시 넘겨주게 될 경우 t2는 사용못하던 caption의 기능을 c2는 사용이 가능하다.
		//DB처험 보관은 다하고 이름에 따라 던져주는 기라유 :D
		c2 = (CaptionTv) t2;
		////==========================
		
		
		Tv t = new Tv();
		CaptionTv c = new CaptionTv();
//		CaptionTv c2 = new CaptionTv();
		
		// **1.자손의 객체를 조상에게 넣을수 있으심
//		Tv t2 = new CaptionTv();
		// 조상의 객체를 자손에게 넣을수 없으심(단 형변화을 하면가능)
//		Caption c2=new Tv();
		
		
		t2 = (Tv)c2;
		//강제 형변환은 널기가능
		c2 = (CaptionTv) t2;

		
		t2.power();
		t2.channel = 7;
		// ***2.리모컨에 해당버른이 없어 사용할수없는것과 같다 (tv에 있는거만 사용가능)
//		t2.text;
//		t2.caption();

		t.power();
		t.channel = 7;
		t.channelUp();
		t.channelUp();
		t.channelDown();
		System.out.println("Tv의 채널: " + t.channel);

		c.power();
		c.channel = 11;
		c.channelDown();
		c.channelDown();
		c.caption();
		c.text = "겨울왕국 2 자막이 추가되었습니다";
		c.caption();
		System.out.println("captionTv의 채널: " + c.channel);
	}

}
