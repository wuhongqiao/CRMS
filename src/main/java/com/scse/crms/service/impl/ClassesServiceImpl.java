package com.scse.crms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scse.crms.mapper.ClassesMapper;
import com.scse.crms.service.ClassesService;
import com.scse.crms.vo.ClassesVo;
import com.scse.crms.vo.SeatTable;

@Service
public class ClassesServiceImpl implements ClassesService {
	@Autowired
	private ClassesMapper mapper;

	public List<ClassesVo> selectScheduleForStudent(String sid){
		return mapper.selectScheduleForStudent(sid);
	}
	public List<ClassesVo> selectScheduleForTeacher(String tid){
		return mapper.selectScheduleForTeacher(tid);
	}

	public List<SeatTable> selectSeat() {
		return mapper.selectSeat();
	}
	
	public int updateSeat(SeatTable seatTable) {
		return mapper.updateSeat(seatTable);
	}

	public int removeSeat(SeatTable seatTable) {
		return mapper.removeSeat(seatTable);
	}
	public int removeSeatBySid(SeatTable seatTable) {
		return mapper.removeSeatBySid(seatTable);
	}
	public int selectCountWithSeat(SeatTable seatTable) {
		return mapper.selectCountWithSeat(seatTable);
	}

	public int removeAllSeat() {
		return mapper.removeAllSeat();
	}

}
