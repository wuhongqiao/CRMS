package com.scse.crms.po;

public class Course {
	protected String id;
	protected String name;
	protected String faculty;
	protected String inspect;
	protected String leaderid;
	protected String introduction;
	protected String premise_cid;
	protected String type;
	protected String proportion;
	public Course(String id, String name, String faculty, String inspect, String leaderid, String introduction,
			String premise_cid, String type, String proportion) {
		super();
		this.id = id;
		this.name = name;
		this.faculty = faculty;
		this.inspect = inspect;
		this.leaderid = leaderid;
		this.introduction = introduction;
		this.premise_cid = premise_cid;
		this.type = type;
		this.proportion = proportion;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getInspect() {
		return inspect;
	}
	public void setInspect(String inspect) {
		this.inspect = inspect;
	}
	public String getLeaderid() {
		return leaderid;
	}
	public void setLeaderid(String leaderid) {
		this.leaderid = leaderid;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getPremise_cid() {
		return premise_cid;
	}
	public void setPremise_cid(String premise_cid) {
		this.premise_cid = premise_cid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProportion() {
		return proportion;
	}
	public void setProportion(String proportion) {
		this.proportion = proportion;
	}
	
}
