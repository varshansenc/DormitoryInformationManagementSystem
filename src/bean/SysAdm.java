package bean;

public class SysAdm {

	private String sysno;
	private String sysid;
	private String syspwd;
	private String sysname;
	private int syssex;
	private String systel;
	
	public String getSysno() {
		return sysno;
	}


	public void setSysno(String sysno) {
		this.sysno = sysno;
	}


	public String getSysid() {
		return sysid;
	}


	public void setSysid(String sysid) {
		this.sysid = sysid;
	}


	public String getSyspwd() {
		return syspwd;
	}


	public void setSyspwd(String syspwd) {
		this.syspwd = syspwd;
	}


	public String getSysname() {
		return sysname;
	}


	public void setSysname(String sysname) {
		this.sysname = sysname;
	}


	public int getSyssex() {
		return syssex;
	}


	public void setSyssex(int syssex) {
		this.syssex = syssex;
	}


	public String getSystel() {
		return systel;
	}


	public void setSystel(String systel) {
		this.systel = systel;
	}


	@Override
	public String toString() {
		return "sysAdm [sysno=" + sysno + ", sysid=" + sysid + ", syspwd=" + syspwd + ", sysname=" + sysname
				+ ", syssex=" + syssex + ", systel=" + systel + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	public SysAdm() {
		// TODO Auto-generated constructor stub
	}

}
