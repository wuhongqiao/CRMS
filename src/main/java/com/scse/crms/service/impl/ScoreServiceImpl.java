package com.scse.crms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scse.crms.mapper.ScoreMapper;
import com.scse.crms.service.ScoreService;
import com.scse.crms.vo.ParaForScore;
import com.scse.crms.vo.ScoreVo;

@Service
public class ScoreServiceImpl implements ScoreService {
	@Autowired
	public ScoreMapper scoreMapper;

	public List<ScoreVo> selectScoreWithClassid(ParaForScore para) {
		// TODO Auto-generated method stub
		return scoreMapper.selectScoreWithClassid(para);
	}

}
