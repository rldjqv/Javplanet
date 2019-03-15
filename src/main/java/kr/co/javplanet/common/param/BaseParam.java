package kr.co.javplanet.common.param;

public class BaseParam {
	public Header header = new Header();
	public class Header {
		public String userId;
		public String userIp;
		
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUserIp() {
			return userIp;
		}
		public void setUserIp(String userIp) {
			this.userIp = userIp;
		}
	}
}
