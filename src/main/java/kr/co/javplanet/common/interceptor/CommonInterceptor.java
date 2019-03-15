package kr.co.javplanet.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class CommonInterceptor extends HandlerInterceptorAdapter {
	public static final String CONTEXT_PATH = "_contextPath";
	@Override // Controller 진입 전
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		boolean isTrue = true;
		
    	return isTrue;
    }
    
    @Override // Controller 진입 후 View 랜더링 전 
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {

    }
    
    @Override // Controller 진입 후 View 랜더링 후
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception exception)
            throws Exception {
 
    }
}


