package org.itstep.Lesson13.servlet;

import org.itstep.Lesson13.service.DbService;
import org.itstep.Lesson13.service.DbServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/delete")
public class DeleteServlet extends HttpServlet {

    private DbService dbService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.valueOf(request.getParameter("id"));
        dbService.deleteStudent(id);
        response.sendRedirect("/student");
    }

    @Override
    public void init() throws ServletException {
        dbService = new DbServiceImpl();
    }
}
