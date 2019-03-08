package kr.co.javplanet.common.dto;

public class BaseResult {
	public Header header = new Header();
	public class Header {
		public String resultCode = "200";
		public int resultCnt = 0;
		public String resultMessage = "success";
	}
}
