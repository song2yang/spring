package sou;

/**
 * @ClassName User
 * @Description : TODO
 * @Author : songyangyang
 * @Date : 2022/3/29 1:56 PM
 * @Version : 1.0
 **/
public class User {
	public void showMe(){
		System.out.println("i am user");
	}

	private String userName;
	private String email;
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
