package kr.co.javplanet.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import kr.co.javplanet.common.param.BaseParam;
import kr.co.javplanet.common.session.SessionManager;

@Component
public class CommonInterceptor extends HandlerInterceptorAdapter {
	@Override // Controller 진입 전
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		boolean isTrue = true;

		return isTrue;
    }
    
    @Override // Controller 진입 후 View 랜더링 전 
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {
    	response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
    	response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
    	response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
    	response.setHeader("Pragma", "no-cache");
    }
    
    @Override // Controller 진입 후 View 랜더링 후
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception exception)
            throws Exception {
 
    }
}


