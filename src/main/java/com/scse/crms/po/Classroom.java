package com.scse.crms.po;

public class Classroom {
	private String crid;
	private String room_num;
	private int row;
	private String rank;
	private String building;
	private String zone;
	
	public Classroom() {
		super();
	}
	public Classroom(String crid, String room_num, int row, String rank, String building, String zone) {
		super();
		this.crid = crid;
		this.room_num = room_num;
		this.row = row;
		this.rank = rank;
		this.building = building;
		this.zone = zone;
	}
	public String getCrid() {
		return crid;
	}
	public void setCrid(String crid) {
		this.crid = crid;
	}
	public String getRoom_num() {
		return room_num;
	}
	public void setRoom_num(String room_num) {
		this.room_num = room_num;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	
}
