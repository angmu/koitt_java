
class Ex0226_05 {
	public static void main(String[] args) {
		Data d=new Data();
		d.x=10;
		System.out.println(d.x);
		Time_1 t=new Time_1();
		t.t=10;// private�� ��쿡�� Ȯ���Ҽ����ٰ� ���Ӵٿ��
		System.out.println(d.x);	
	}

}

class Data {
	int x;
}

class Time_1 {
//	private int t;
	protected int t;
	
	// ���� �޴´�
	public int getT() {
		return t;
	}

	// �����ִ´�
	public void setT(int t) {
		this.t = t;
	}
}