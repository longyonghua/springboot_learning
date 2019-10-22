package com.longge.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author longge
 * @create 2019-10-21 下午4:49
 */
//@WebFilter("/myFilter")
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException { }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("进入filter");
        chain.doFilter(request,response);
        System.out.println("离开filter");
    }

    @Override
    public void destroy() { }
}
