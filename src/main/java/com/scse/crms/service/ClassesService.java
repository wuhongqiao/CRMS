package com.scse.crms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scse.crms.vo.ClassesVo;
import com.scse.crms.vo.SeatTable;

public interface ClassesService {
	public List<ClassesVo> selectScheduleForStudent(String sid);
	public List<ClassesVo> selectScheduleForTeacher(String tid);
	public List<SeatTable> selectSeat();
	public int updateSeat(SeatTable seatTable);
	public int removeSeat(SeatTable seatTable);
	public int removeSeatBySid(SeatTable seatTable);
	public int selectCountWithSeat(SeatTable seatTable);
	public int removeAllSeat();
}
