package com.scse.crms.vo;

public class SeatTable {
	private String sid;
	private String sname;
	private String cid;
	private String classroom;
	private String seat;
	private String usual_performance;
	public SeatTable(String sid, String sname, String cid, String classroom, String seat, String usual_performance) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.cid = cid;
		this.classroom = classroom;
		this.seat = seat;
		this.usual_performance = usual_performance;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getUsual_performance() {
		return usual_performance;
	}
	public void setUsual_performance(String usual_performance) {
		this.usual_performance = usual_performance;
	}

	
}
