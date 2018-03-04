package com.scse.crms.mapper;

import java.util.List;

import com.scse.crms.vo.ClassesVo;
import com.scse.crms.vo.SeatTable;

public interface ClassesMapper {
	public List<ClassesVo> selectScheduleForStudent(ClassesVo classesVo);
	public List<ClassesVo> selectScheduleForTeacher(ClassesVo classesVo);
	public List<SeatTable> selectSeat(String classid);
	public int updateSeat(SeatTable seatTable);
	public int removeSeat(SeatTable seatTable);
	public int removeSeatBySid(SeatTable seatTable);
	public int selectCountWithSeat(SeatTable seatTable);
	public int removeAllSeat();
}
