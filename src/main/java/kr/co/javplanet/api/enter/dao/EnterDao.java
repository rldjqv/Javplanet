package kr.co.javplanet.api.enter.dao;

import java.util.List;

import kr.co.javplanet.api.enter.dto.Enter;
import kr.co.javplanet.api.enter.model.EnterParam;

public interface EnterDao {
	public List<Enter> getEnters(EnterParam param);
	
}
