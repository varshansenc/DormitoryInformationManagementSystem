package bean;

public class Build {

	private String buildno;
	private String buildadmno;
	private int dormtype;
	private int stucount;
	private String tel;
	
	public String getBuildno() {
		return buildno;
	}

	public void setBuildno(String buildno) {
		this.buildno = buildno;
	}

	public String getBuildadmno() {
		return buildadmno;
	}

	public void setBuildadmno(String buildadmno) {
		this.buildadmno = buildadmno;
	}

	public int getDormtype() {
		return dormtype;
	}

	public void setDormtype(int dormtype) {
		this.dormtype = dormtype;
	}

	public int getStucount() {
		return stucount;
	}

	public void setStucount(int stucount) {
		this.stucount = stucount;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	
	@Override
	public String toString() {
		return "build [buildno=" + buildno + ", buildadmno=" + buildadmno + ", dormtype=" + dormtype + ", stucount="
				+ stucount + ", tel=" + tel + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Build() {
		// TODO Auto-generated constructor stub
	}

}
