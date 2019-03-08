package kr.co.javplanet.api.celeb.dao;

import java.util.List;

import kr.co.javplanet.api.celeb.dto.Celeb;
import kr.co.javplanet.api.celeb.model.CelebParam;

public interface CelebDao {
	public List<Celeb> getCelebs(CelebParam param);
	
}
