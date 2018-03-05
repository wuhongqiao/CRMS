package com.scse.crms.service;

import java.util.List;

import com.scse.crms.vo.ParaForScore;
import com.scse.crms.vo.ScoreVo;

public interface ScoreService {

	public List<ScoreVo> selectScoreWithClassid(ParaForScore para);
}
