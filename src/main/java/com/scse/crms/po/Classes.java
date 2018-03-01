package com.scse.crms.po;

public class Classes {

	protected String id;
	protected String cid;
	protected String cname;
	protected int start;
	protected int end;
	protected String even_odd;
	protected int shooltime;
	protected String classroom;
	protected String tid;
	
	public Classes() {
		super();
	}
	public Classes(String id, String cid, String cname, int start, int end, String even_odd, int shooltime,
			String classroom, String tid) {
		super();
		this.id = id;
		this.cid = cid;
		this.cname = cname;
		this.start = start;
		this.end = end;
		this.even_odd = even_odd;
		this.shooltime = shooltime;
		this.classroom = classroom;
		this.tid = tid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getEven_odd() {
		return even_odd;
	}
	public void setEven_odd(String even_odd) {
		this.even_odd = even_odd;
	}
	public int getShooltime() {
		return shooltime;
	}
	public void setShooltime(int shooltime) {
		this.shooltime = shooltime;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	
	
}
