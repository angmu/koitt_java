
public class Member {
	String id;
	String pw;
	String name;
	String s_number;//주민번호
	int gender;//성별
	String email;//이메일
	String tel;//전화번호
	
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
			a="남성";
		}else {
			a="여성";
		}
		return "아이디:"+id+" 이름:"+name+" 성별:"+a;
	}
	
	
	
	
}
