
public class Member {
	String id;
	String pw;
	String name;
	String s_number;//�ֹι�ȣ
	int gender;//����
	String email;//�̸���
	String tel;//��ȭ��ȣ
	
	Member(){}
	Member(String id,String pw,String name,	String s_number,int gender,	String email,String tel){
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.s_number=s_number;
		this.gender=gender;
		this.email=email;
		this.tel=tel;
		
	}
	
	public String toString() {
		String a="";
		if(gender==0) {
			a="����";
		}else {
			a="����";
		}
		return "���̵�:"+id+" �̸�:"+name+" ����:"+a;
	}
	
	
	
	
}
