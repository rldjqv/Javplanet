package kr.co.javplanet.api.gif.dao;

import java.util.List;

import kr.co.javplanet.api.gif.dto.Gif;
import kr.co.javplanet.api.gif.model.GifParam;


public interface GifDao {
	public List<Gif> getGifs(GifParam param);
	
}
