package bean;

public class Stu {

	private String stuno;
	private String stuid;
	private String stupwd;
	private String stuname;
	private String buildno;
	private String dormno;
	private int stusex;
	private String stutel;
		
	public String getStuno() {
		return stuno;
	}

	public void setStuno(String stuno) {
		this.stuno = stuno;
	}

	public String getStuid() {
		return stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	public String getStupwd() {
		return stupwd;
	}

	public void setStupwd(String stupwd) {
		this.stupwd = stupwd;
	}
	
	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getBuildno() {
		return buildno;
	}

	public void setBuildno(String buildno) {
		this.buildno = buildno;
	}

	public String getDormno() {
		return dormno;
	}

	public void setDormno(String dormno) {
		this.dormno = dormno;
	}

	public int getStusex() {
		return stusex;
	}

	public void setStusex(int stusex) {
		this.stusex = stusex;
	}

	public String getStutel() {
		return stutel;
	}


	public void setStutel(String stutel) {
		this.stutel = stutel;
	}


	@Override
	public String toString() {
		return "stu [stuno=" + stuno + ", stuid=" + stuid + ", stupwd=" + stupwd + ", stuname=" + stuname + ", buildno="
				+ buildno + ", dormno=" + dormno + ", stusex=" + stusex + ", stutel=" + stutel + "]";
	}

	public Stu() {
		// TODO Auto-generated constructor stub
	}
}
