package model;

public class Cart {
	private String cid;
	private String rid;
	private String rname;
	private double price;
	private int daynum;
	private String uid;
	private String uname;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDaynum() {
		return daynum;
	}

	public void setDaynum(int daynum) {
		this.daynum = daynum;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Cart(String cid, String rid, String rname, double price, int daynum, String uid, String uname) {
		super();
		this.cid = cid;
		this.rid = rid;
		this.rname = rname;
		this.price = price;
		this.daynum = daynum;
		this.uid = uid;
		this.uname = uname;
	}

	public Cart() {
		super();
	}

}
