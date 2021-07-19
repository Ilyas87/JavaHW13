package org.itstep.Lesson13.servlet;

import org.itstep.Lesson13.entity.Student;
import org.itstep.Lesson13.service.DbService;
import org.itstep.Lesson13.service.DbServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/student")
public class StudentServlet extends HttpServlet {

    private DbService dbService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> students = dbService.getAllStudents();
        request.setAttribute("students", students);
        request.getRequestDispatcher("student.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void init() throws ServletException {
        dbService = new DbServiceImpl();
    }
}
