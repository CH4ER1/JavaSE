package section08;

public class MemberVO {
	
	private String id;
	private String password;
	private String name;
	private String mobile;
	
	public String getId() {
		return id;
	}
	public void setId(String id) { 
		this.id = id;
		//참조연산
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

}
