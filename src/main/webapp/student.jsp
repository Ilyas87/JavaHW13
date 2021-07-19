<%@ page import="org.itstep.Lesson13.entity.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Students list</title>
    <%@include file="templates/bootstrap.jsp" %>
</head>
<body>
<div class="container mt-5">
    <a href="/" class="btn btn-primary">Go back</a>
    <div class="row d-flex justify-content-center">
        <div class="col-sm-9">
            <table class="table text-center">
                <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">NAME</th>
                    <th scope="col">AGE</th>
                    <th scope="col"></th>
                </tr>
                </thead>
                <tbody>
                <%
                    List<Student> students = (List<Student>) request.getAttribute("students");
                    if (students != null) {
                        for (Student student : students) {
                %>
                <tr>
                    <td><%=student.getId()%>
                    </td>
                    <td><%=student.getName()%>
                    </td>
                    <td><%=student.getAge()%>
                    </td>
                    <td>
                        <%
                            Long id = student.getId();
                            String name = student.getName();
                            Integer age = student.getAge();
                        %>
                        <a href="/update?id=<%=id%>&name=<%=name%>&age=<%=age%>" class="btn btn-secondary">Update</a>
                        <form method="post" action="/delete">
                            <input type="hidden" name="id" value="<%=student.getId()%>">
                            <button class="btn btn-danger">Delete</button>
                        </form>
                    </td>
                </tr>
                <%
                        }
                    }
                %>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>