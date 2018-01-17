package com.scse.crms.po;

public class Student {

	protected String id;
	protected String name;
	protected int age;
	protected String sex;
	protected int grade;
	protected String faculty;
	protected String dorm;
	protected String date;
	
	public Student(String id, String name, int age, int grade, String faculty) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.faculty = faculty;
	}
	public Student() {
		super();
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", grade=" + grade
				+ ", faculty=" + faculty + ", dorm=" + dorm + "]";
	}
	
}
