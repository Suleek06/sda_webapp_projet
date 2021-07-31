package com.sda.sapiens.webapp.servlet;

import com.sda.sapiens.webapp.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> studentList = new ArrayList<>(Arrays.asList(new Student(null, "janek", "kowalski", "123", LocalDate.now(), new ArrayList<>())));
        req.setAttribute("studentList", studentList);
        req.getRequestDispatcher("/student.jsp").forward(req, resp);
    }
}
