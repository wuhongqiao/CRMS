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
	private ClassesMapper classesMapper;

	public List<ClassesVo> selectScheduleForStudent(ClassesVo classesVo){
		return classesMapper.selectScheduleForStudent(classesVo);
	}
	public List<ClassesVo> selectScheduleForTeacher(ClassesVo classesVo){
		return classesMapper.selectScheduleForTeacher(classesVo);
	}

	public List<SeatTable> selectSeat(String classid) {
		return classesMapper.selectSeat(classid);
	}
	
	public int updateSeat(SeatTable seatTable) {
		return classesMapper.updateSeat(seatTable);
	}

	public int removeSeat(SeatTable seatTable) {
		return classesMapper.removeSeat(seatTable);
	}
	public int removeSeatBySid(SeatTable seatTable) {
		return classesMapper.removeSeatBySid(seatTable);
	}
	public int selectCountWithSeat(SeatTable seatTable) {
		return classesMapper.selectCountWithSeat(seatTable);
	}

	public int removeAllSeat(String classid) {
		return classesMapper.removeAllSeat(classid);
	}

}
