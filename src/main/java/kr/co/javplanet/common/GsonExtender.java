package kr.co.javplanet.common;

import java.util.HashMap;

import com.google.gson.Gson;

public class GsonExtender {
	public static Gson gson = new Gson();
	
	// 생성 막기
	protected GsonExtender() {
		
	}

	// gson 관련 초기화
	static {
    }
	
	public static String toJson(Object src) {
		return gson.toJson(src);
	}
/*	@SuppressWarnings("unchecked")
	public static <T> Object fromJson(String json, Class<T> classOf) {
		HashMap<Object, String> paramMap = new HashMap<Object, String>();
		paramMap = (HashMap<Object, String>)gson.fromJson(json, paramMap.getClass());
		return gson.fromJson(paramMap, classOf);
	}*/
}
