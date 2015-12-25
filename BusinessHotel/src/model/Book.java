package model;

public class Book {
	private String bid;
	private String rid;
	private String rname;
	private double yu_price;
	private int daytime;
	private double sum_price;
	private double other_price;
	private String uid;
	private String cardId;
	private String uname;
	private String utel;
	private String yutime;
	private String begintime;
	private String endtime;
	private String message;
	private String status;
	
	
	public Book(String bid, String rid, String rname, double yu_price, int daytime, double sum_price,
			double other_price, String uid, String cardId, String uname, String utel, String yutime, String begintime,
			String endtime, String message, String status) {
		super();
		this.bid = bid;
		this.rid = rid;
		this.rname = rname;
		this.yu_price = yu_price;
		this.daytime = daytime;
		this.sum_price = sum_price;
		this.other_price = other_price;
		this.uid = uid;
		this.cardId = cardId;
		this.uname = uname;
		this.utel = utel;
		this.yutime = yutime;
		this.begintime = begintime;
		this.endtime = endtime;
		this.message = message;
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
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

	public double getYu_price() {
		return yu_price;
	}

	public void setYu_price(double yu_price) {
		this.yu_price = yu_price;
	}

	public int getDaytime() {
		return daytime;
	}

	public void setDaytime(int daytime) {
		this.daytime = daytime;
	}

	public double getSum_price() {
		return sum_price;
	}

	public void setSum_price(double sum_price) {
		this.sum_price = sum_price;
	}

	public double getOther_price() {
		return other_price;
	}

	public void setOther_price(double other_price) {
		this.other_price = other_price;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUtel() {
		return utel;
	}

	public void setUtel(String utel) {
		this.utel = utel;
	}

	public String getYutime() {
		return yutime;
	}

	public void setYutime(String yutime) {
		this.yutime = yutime;
	}

	public String getBegintime() {
		return begintime;
	}

	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Book(String bid, String rid, String rname, double yu_price, int daytime, double sum_price,
			double other_price, String uid, String cardId, String uname, String utel, String yutime, String begintime,
			String endtime, String message) {
		super();
		this.bid = bid;
		this.rid = rid;
		this.rname = rname;
		this.yu_price = yu_price;
		this.daytime = daytime;
		this.sum_price = sum_price;
		this.other_price = other_price;
		this.uid = uid;
		this.cardId = cardId;
		this.uname = uname;
		this.utel = utel;
		this.yutime = yutime;
		this.begintime = begintime;
		this.endtime = endtime;
		this.message = message;
	}

	public Book() {
		super();
	}

}
