package com.scse.crms.vo;

import com.scse.crms.po.Score;

public class ScoreVo extends Score {
	String sname;
	String cname;
	
	float performance;
	float absenceScore;
	float homework;
	String proportion;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getPerformance() {
		return performance;
	}
	public void setPerformance(float performance) {
		this.performance = performance;
	}
	public float getAbsenceScore() {
		return absenceScore;
	}
	public void setAbsenceScore(float absenceScore) {
		this.absenceScore = absenceScore;
	}
	public float getHomework() {
		return homework;
	}
	public void setHomework(float homework) {
		this.homework = homework;
	}
	public String getProportion() {
		return proportion;
	}
	public void setProportion(String proportion) {
		this.proportion = proportion;
	}
}
