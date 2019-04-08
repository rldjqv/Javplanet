package kr.co.javplanet.common.session;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.javplanet.common.param.BaseParam;

public class SessionManager {
	// Key : Session Id
	public static Map<String, SessionObject> SESSION_MAP = new HashMap<String, SessionObject>();
	
	private static final Logger logger = LoggerFactory.getLogger(SessionManager.class);
	
	public static void setApiHeader(BaseParam param, HttpServletRequest request) {
			param.header.userId = getUserId(request);
			param.header.userIp = getUserIP(request);
	}
	
	public static String getUserId(HttpServletRequest request) {
		String userId = null;
		HttpSession session = request.getSession(false);
		if (session != null) {
			Map<String, Object> sessionObject = (Map<String, Object>) session.getAttribute("sessionObject");
			if (sessionObject != null) {
				userId = (String) sessionObject.get("userId");
				
			}
		}
		return userId;
	}
	
	public static String getUserIP(HttpServletRequest request) {
		if(request == null)
			return "";
		
		String ip = request.getRemoteAddr();
		String xip = request.getHeader("WL-Proxy-Client-IP");
		if(xip != null && !xip.equals("")) {
			ip = xip;
		}
		else {
			xip = request.getHeader("Proxy-Client-IP");
			if(xip != null && !xip.equals("")) {
				ip = xip;
			}
			else {
				xip = request.getHeader("X-Forwarded-For");
				if(xip != null && !xip.equals("")) {
					ip = xip;
				}				
			}
		}
		
		return ip;
	}
}
