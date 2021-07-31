package com.sda.sapiens.webapp.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@Slf4j
@WebFilter(urlPatterns = "/**")
public class AuthenticationFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String userNameValue = (String) request.getSession().getAttribute(FilterConstants.HEADER_AUTH_USER_NAME_KEY);
        String userSurnameValue = (String) request.getSession().getAttribute(FilterConstants.HEADER_AUTH_USER_SURNAME_KEY);
        if (userNameValue == null || userNameValue.isEmpty() ||
                userSurnameValue == null || userSurnameValue.isEmpty()) {
            log.info("Użytkownik nie jest autentykowany. Przekierowujemy na stronę logowania");
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            // ścieżka domyślna = /webapp
            log.info("Get Path Info: " + request.getPathInfo() + " " + request.getMethod());
            if(!request.getMethod().equalsIgnoreCase("post")){
                response.sendRedirect(servletRequest.getServletContext().getContextPath() + "/login");
                return;
            }
        }
        // jeśli nie mamy powodu żeby zatrzymać request, przepuszczamy go dalej używając poniższej linii
        filterChain.doFilter(servletRequest, servletResponse);
    }
    @Override
    public void destroy() {
    }
}
