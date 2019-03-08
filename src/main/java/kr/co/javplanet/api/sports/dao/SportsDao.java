package kr.co.javplanet.api.sports.dao;

import java.util.List;

import kr.co.javplanet.api.sports.dto.Sports;
import kr.co.javplanet.api.sports.model.SportsParam;


public interface SportsDao {
	public List<Sports> getSportss(SportsParam param);
	
}
