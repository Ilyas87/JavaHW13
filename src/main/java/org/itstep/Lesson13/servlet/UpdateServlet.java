package org.itstep.Lesson13.servlet;

import org.itstep.Lesson13.service.DbService;
import org.itstep.Lesson13.service.DbServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/update")
public class UpdateServlet extends HttpServlet {

    private DbService dbService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("update.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.valueOf(request.getParameter("id"));
        String name = request.getParameter("name");
        Integer age = Integer.valueOf(request.getParameter("age"));

        dbService.updateStudent(id, name, age);

        response.sendRedirect("/student");
    }

    @Override
    public void init() throws ServletException {
        dbService = new DbServiceImpl();
    }
}
