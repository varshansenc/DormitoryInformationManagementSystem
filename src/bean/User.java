package bean;

public class User {

	private String type;
	private String id;
	private String pwd;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	
	@Override
	public String toString() {
		return "user [type=" + type + ", id=" + id + ", pwd=" + pwd + ", toString()=" + super.toString() + "]";
	}

	public User() {
	}
}
