package com.scse.crms.mapper;

import java.util.List;

import com.scse.crms.vo.SeatTable;

public interface ClassesMapper {
	public List selectSchedule();
	public List selectSeat();
	public int updateSeat(SeatTable seatTable);
}
