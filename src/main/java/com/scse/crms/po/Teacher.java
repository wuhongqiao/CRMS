package com.scse.crms.po;

public class Teacher {
	private String id;
	private String name;
	private int age;
	private String sex;
	protected String faculty;
	protected String dorm;
	protected String place;
	protected String office;
	
	public Teacher() {
		super();
	}
	public Teacher(String id, String name, int age, String sex, String faculty, String dorm, String place,
			String office) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.faculty = faculty;
		this.dorm = dorm;
		this.place = place;
		this.office = office;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getDorm() {
		return dorm;
	}
	public void setDorm(String dorm) {
		this.dorm = dorm;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	
	
}
