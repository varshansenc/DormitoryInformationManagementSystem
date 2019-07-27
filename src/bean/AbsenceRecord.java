package bean;

public class AbsenceRecord {

	private String recordno;
	private String stuno;
	private String stuname;
	private String buildno;
	private String dormno;
	private String recorddate;
	private String stutel;
	
	public String getRecordno() {
		return recordno;
	}

	public void setRecordno(String recordno) {
		this.recordno = recordno;
	}

	public String getStuno() {
		return stuno;
	}

	public void setStuno(String stuno) {
		this.stuno = stuno;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getDormno() {
		return dormno;
	}

	public void setDormno(String dormno) {
		this.dormno = dormno;
	}

	public String getRecorddate() {
		return recorddate;
	}

	public void setRecorddate(String recorddate) {
		this.recorddate = recorddate;
	}

	public String getStutel() {
		return stutel;
	}

	public void setStutel(String stutel) {
		this.stutel = stutel;
	}

	@Override
	public String toString() {
		return "absenceRecord [recordno=" + recordno + ", stuno=" + stuno + ", stuname=" + stuname + ", dormno="
				+ dormno + ", recorddate=" + recorddate + ", stutel=" + stutel + ", toString()=" + super.toString()
				+ "]";
	}

	public AbsenceRecord() {
		// TODO Auto-generated constructor stub
	}

	public String getBuildno() {
		return buildno;
	}

	public void setBuildno(String buildno) {
		this.buildno = buildno;
	}
}
