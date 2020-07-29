
class Ex0226_05 {
	public static void main(String[] args) {
		Data d=new Data();
		d.x=10;
		System.out.println(d.x);
		Time_1 t=new Time_1();
		t.t=10;// private일 경우에는 확인할수없다고 나왓다요오
		System.out.println(d.x);	
	}

}

class Data {
	int x;
}

class Time_1 {
//	private int t;
	protected int t;
	
	// 값을 받는다
	public int getT() {
		return t;
	}

	// 값을넣는다
	public void setT(int t) {
		this.t = t;
	}
}