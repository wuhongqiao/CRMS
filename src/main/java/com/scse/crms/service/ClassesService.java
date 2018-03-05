package com.scse.crms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scse.crms.vo.ClassesVo;
import com.scse.crms.vo.SeatTable;

public interface ClassesService {
	public List<ClassesVo> selectScheduleForStudent(ClassesVo classesVo);
	public List<ClassesVo> selectScheduleForTeacher(ClassesVo classesVo);
	public List<SeatTable> selectSeat(String classid);
	public int updateSeat(SeatTable seatTable);
	public int removeSeat(SeatTable seatTable);
	public int removeSeatBySid(SeatTable seatTable);
	public int selectCountWithSeat(SeatTable seatTable);
	public int removeAllSeat(String classid);
}
