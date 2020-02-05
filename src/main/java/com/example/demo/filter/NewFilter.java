package com.example.demo.filter;

import javax.servlet.*;
import java.io.IOException;

public class NewFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Hello new filter");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
