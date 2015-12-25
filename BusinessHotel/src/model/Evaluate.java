package model;

public class Evaluate {
	private String eid;
	private String rid;
	private String rname;
	private String begintime;
	private String endtime;
	private String addtime;
	private String content;
	private String uid;
	private String uname;
	private String pic;

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
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

	public String getAddtime() {
		return addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Evaluate(String eid, String rid, String rname, String begintime, String endtime, String addtime,
			String content, String uid, String uname, String pic) {
		super();
		this.eid = eid;
		this.rid = rid;
		this.rname = rname;
		this.begintime = begintime;
		this.endtime = endtime;
		this.addtime = addtime;
		this.content = content;
		this.uid = uid;
		this.uname = uname;
		this.pic = pic;
	}

	public Evaluate() {
		super();
	}

}
