package com.scse.crms.mapper;

import java.util.List;

import com.scse.crms.vo.ClassesVo;
import com.scse.crms.vo.SeatTable;

public interface ClassesMapper {
	public List<ClassesVo> selectScheduleForStudent(String sid);
	public List<ClassesVo> selectScheduleForTeacher(String tid);
	public List<SeatTable> selectSeat();
	public int updateSeat(SeatTable seatTable);
	public int removeSeat(SeatTable seatTable);
	public int removeSeatBySid(SeatTable seatTable);
	public int selectCountWithSeat(SeatTable seatTable);
	public int removeAllSeat();
}
