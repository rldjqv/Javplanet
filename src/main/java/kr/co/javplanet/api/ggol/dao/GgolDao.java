package kr.co.javplanet.api.ggol.dao;

import java.util.List;

import kr.co.javplanet.api.ggol.dto.Ggol;
import kr.co.javplanet.api.ggol.model.GgolParam;


public interface GgolDao {
	public List<Ggol> getGgols(GgolParam param);
	
}
