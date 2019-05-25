package com.lzc.video.interceptor;

import com.lzc.video.pojo.User;
import com.lzc.video.service.CategoryService;
import com.lzc.video.service.VideoService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

public class LoginInterceptor extends HandlerInterceptorAdapter{
    @Autowired
    CategoryService categoryService;
    @Autowired
    VideoService videoService;



    public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception{
        System.out.println("执行preHandle");
        HttpSession session = request.getSession();
        String contextPath=session.getServletContext().getContextPath();//获取项目的根路径
        System.out.println("contextPath:"+contextPath);
        String[] noNeedAuthPage = new String[]{
                "home",
                "checkLogin",
                "register",
                "loginAjax",
                "login",
                "video",
                "category",
                "search"
        };
        String uri = request.getRequestURI();
        uri = StringUtils.remove(uri, contextPath);
        System.out.println("uri:"+uri);
        if(uri.startsWith("/fore")){
            String method = StringUtils.substringAfterLast(uri,"/fore" );
            if(!Arrays.asList(noNeedAuthPage).contains(method)){
                User user =(User) session.getAttribute("user");
                if(null==user){
                    response.sendRedirect("loginPage");
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * 在业务处理器处理请求执行完成后,生成视图之前执行的动作
     * 可在modelAndView中加入数据，比如当前时间
     */
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }
    /**
     * 在DispatcherServlet完全处理完请求后被调用,可用于清理资源等
     *
     * 当有拦截器抛出异常时,会从当前拦截器往回执行所有的拦截器的afterCompletion()
     */

    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("testa:");
    }

}