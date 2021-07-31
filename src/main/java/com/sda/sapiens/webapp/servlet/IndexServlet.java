package com.sda.sapiens.webapp.servlet;

import com.sda.sapiens.webapp.dao.HibernateUtil;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@WebServlet(name="IndexServlet", urlPatterns = {"/index"})
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("Ladowanie strony");
        HibernateUtil.getSessionFactory();
        req.getRequestDispatcher("/student.jsp").forward(req, resp);
    }
}
