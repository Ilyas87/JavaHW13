package org.itstep.Lesson13.servlet;

import org.itstep.Lesson13.service.DbService;
import org.itstep.Lesson13.service.DbServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/create")
public class CreateServlet extends HttpServlet {

    private DbService dbService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("create.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Integer age = Integer.valueOf(request.getParameter("age"));

        dbService.createStudent(name, age);

        response.sendRedirect("/student");
    }

    @Override
    public void init() throws ServletException {
        dbService = new DbServiceImpl();
    }
}
