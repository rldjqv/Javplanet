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
		String userId = getSessionUserId(request);
		String userIp = getClientIP(request);
		if(param == null)
			return;
		if(param.header == null)
			return;
		param.header.userId = (userId);
		param.header.userIp = (userIp);
	}
	
	public static String getSessionUserId(HttpServletRequest request) {
		SessionObject so = SessionManager.getSessionObject(request);
		if(so == null)
			return "";
		return so.getUserId();
	}
	
	public static SessionObject getSessionObject(HttpServletRequest request) {
		if(request == null)
			return null;
		HttpSession session = request.getSession(false);
		if(session == null)
			return null;
		return SESSION_MAP.get(session.getId());
	}
	
	public static String getClientIP(HttpServletRequest request) {
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
