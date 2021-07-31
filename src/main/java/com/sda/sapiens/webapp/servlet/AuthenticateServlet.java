package com.sda.sapiens.webapp.servlet;

import com.sda.sapiens.webapp.filter.FilterConstants;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@WebServlet("/login")
public class AuthenticateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login-form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("Próba logowania");

        String parameterName = req.getParameter("user_name_field");
        String parameterSurname = req.getParameter("user_surname_field");
        if(parameterName != null && !parameterName.isEmpty() &&
        parameterSurname != null && !parameterSurname.isEmpty()){
            req.getSession().setAttribute(FilterConstants.HEADER_AUTH_USER_NAME_KEY, parameterName);
            req.getSession().setAttribute(FilterConstants.HEADER_AUTH_USER_SURNAME_KEY, parameterSurname);

            resp.sendRedirect(req.getContextPath() + "/index");
            return;
        }

        resp.sendRedirect(req.getContextPath() + "/login");
    }
}
