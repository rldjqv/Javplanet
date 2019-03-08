package kr.co.javplanet.api.index.dao;

import java.util.List;

import kr.co.javplanet.api.index.dto.Index;
import kr.co.javplanet.api.index.model.IndexParam;


public interface IndexDao {
	public List<Index> getIndexs(IndexParam param);
	
}
