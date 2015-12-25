package model;

public class Room {
	private String rid;
	private String rname;
	private String type;
	private String sheshi;
	private String pic;
	private String health;
	private String rdesc;
	private String status;
	private String msg;
	private double price;
	private double yu_price;
	
	
	
	public Room(String rid, String rname, String type, String sheshi, String pic, String health, String rdesc,
			String status, String msg, double price, double yu_price) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.type = type;
		this.sheshi = sheshi;
		this.pic = pic;
		this.health = health;
		this.rdesc = rdesc;
		this.status = status;
		this.msg = msg;
		this.price = price;
		this.yu_price = yu_price;
	}

	public double getYu_price() {
		return yu_price;
	}

	public void setYu_price(double yu_price) {
		this.yu_price = yu_price;
	}

	public Room(String rid, String rname, String type, String sheshi, String pic, String health, String rdesc,
			String status, String msg, double price) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.type = type;
		this.sheshi = sheshi;
		this.pic = pic;
		this.health = health;
		this.rdesc = rdesc;
		this.status = status;
		this.msg = msg;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSheshi() {
		return sheshi;
	}

	public void setSheshi(String sheshi) {
		this.sheshi = sheshi;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public String getRdesc() {
		return rdesc;
	}

	public void setRdesc(String rdesc) {
		this.rdesc = rdesc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Room(String rid, String rname, String type, String sheshi, String pic, String health, String rdesc,
			String status, String msg) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.type = type;
		this.sheshi = sheshi;
		this.pic = pic;
		this.health = health;
		this.rdesc = rdesc;
		this.status = status;
		this.msg = msg;
	}

	public Room() {
		super();
	}

}
