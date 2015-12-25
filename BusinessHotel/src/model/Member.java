package model;

public class Member {
	private String mid;
	private String mpwd;
	private String mname;
	private String mtype;
	private String mtel;
	private String maddress;
	private String msg;
	private int jifen;

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpwd() {
		return mpwd;
	}

	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMtype() {
		return mtype;
	}

	public void setMtype(String mtype) {
		this.mtype = mtype;
	}

	public String getMtel() {
		return mtel;
	}

	public void setMtel(String mtel) {
		this.mtel = mtel;
	}

	public String getMaddress() {
		return maddress;
	}

	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getJifen() {
		return jifen;
	}

	public void setJifen(int jifen) {
		this.jifen = jifen;
	}

	public Member(String mid, String mpwd, String mname, String mtype, String mtel, String maddress, String msg,
			int jifen) {
		super();
		this.mid = mid;
		this.mpwd = mpwd;
		this.mname = mname;
		this.mtype = mtype;
		this.mtel = mtel;
		this.maddress = maddress;
		this.msg = msg;
		this.jifen = jifen;
	}

	public Member() {
		super();
	}

}
