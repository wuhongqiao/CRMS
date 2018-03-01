package com.scse.crms.mapper;

import java.util.List;

import com.scse.crms.vo.ClassesVo;
import com.scse.crms.vo.SeatTable;

public interface ClassesMapper {
	public List<ClassesVo> selectSchedule();
	public List<SeatTable> selectSeat();
	public int updateSeat(SeatTable seatTable);
}
