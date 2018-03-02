package com.scse.crms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scse.crms.mapper.ClassesMapper;
import com.scse.crms.service.ClassesService;
import com.scse.crms.vo.SeatTable;

@Service
public class ClassesServiceImpl implements ClassesService {
	@Autowired
	private ClassesMapper mapper;

	public List selectSchedule() {
		return mapper.selectSchedule();
	}

	public List selectSeat() {
		return mapper.selectSeat();
	}
	
	public int updateSeat(SeatTable seatTable) {
		return mapper.updateSeat(seatTable);
	}

	public int removeSeat(String seat) {
		return mapper.removeSeat(seat);
	}
	public int selectCountWithSeat(String seat) {
		return mapper.selectCountWithSeat(seat);
	}

}
