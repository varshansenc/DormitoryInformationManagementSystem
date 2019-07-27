package bean;

public class BuildAdm {

	private String buildadmno;
	private String buildadmid;
	private String buildadmpwd;
	private String buildno;
	private String buildadmname;
	private int buildadmsex; 
	private String buildtel;


	public String getBuildadmno() {
		return buildadmno;
	}


	public void setBuildadmno(String buildadmno) {
		this.buildadmno = buildadmno;
	}


	public String getBuildadmid() {
		return buildadmid;
	}


	public void setBuildadmid(String buildadmid) {
		this.buildadmid = buildadmid;
	}


	public String getBuildadmpwd() {
		return buildadmpwd;
	}


	public void setBuildadmpwd(String buildadmpwd) {
		this.buildadmpwd = buildadmpwd;
	}


	public String getBuildno() {
		return buildno;
	}


	public void setBuildno(String buildno) {
		this.buildno = buildno;
	}


	public String getBuildadmname() {
		return buildadmname;
	}


	public void setBuildadmname(String buildadmname) {
		this.buildadmname = buildadmname;
	}

	public int getBuildadmsex() {
		return buildadmsex;
	}


	public void setBuildadmsex(int buildadmsex) {
		this.buildadmsex = buildadmsex;
	}

	public String getBuildtel() {
		return buildtel;
	}

	public void setBuildtel(String buildtel) {
		this.buildtel = buildtel;
	}

	
	@Override
	public String toString() {
		return "buildAdm [buildadmno=" + buildadmno + ", buildadmid=" + buildadmid + ", buildadmpwd=" + buildadmpwd
				+ ", buildno=" + buildno + ", buildadmname=" + buildadmname + ", buildadmsex=" + buildadmsex
				+ ", buildtel=" + buildtel + ", toString()=" + super.toString() + "]";
	}


	public BuildAdm() {
		// TODO Auto-generated constructor stub
	}
}
