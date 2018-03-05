package com.scse.crms.po;

public class Score {
	String cid;
	String sid;
	String absence;
	String usual_performance;
	Float examination_performance;
	Float score;
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getAbsence() {
		return absence;
	}
	public void setAbsence(String absence) {
		this.absence = absence;
	}
	public String getUsual_performance() {
		return usual_performance;
	}
	public void setUsual_performance(String usual_performance) {
		this.usual_performance = usual_performance;
	}
	public Float getExamination_performance() {
		return examination_performance;
	}
	public void setExamination_performance(Float examination_performance) {
		this.examination_performance = examination_performance;
	}
	public Float getScore() {
		return score;
	}
	public void setScore(Float score) {
		this.score = score;
	}
	
}
