package com.scse.crms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scse.crms.vo.SeatTable;

public interface ClassesService {
	public List selectSchedule();
	public List selectSeat();
	public int updateSeat(SeatTable seatTable);
	public int removeSeat(String seat);
	public int selectCountWithSeat(String seat);
}
