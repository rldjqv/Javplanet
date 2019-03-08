package kr.co.javplanet.api.best.dao;

import java.util.List;

import kr.co.javplanet.api.best.dto.Best;
import kr.co.javplanet.api.best.model.BestParam;

public interface BestDao {
	public List<Best> getBests(BestParam param);
	
}
