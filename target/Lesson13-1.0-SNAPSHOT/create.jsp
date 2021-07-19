<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <%@include file="templates/bootstrap.jsp"%>
</head>
<body>
<div class="container mt-5">
    <a href="/student" class="btn btn-primary">Go back</a>
    <div class="row d-flex justify-content-center">
        <div class="col-sm-9">
            <form method="post" action="/create">
                <div class="mb-3">
                    <label class="form-label">Name</label>
                    <input type="text" class="form-control" name="name">
                </div>
                <div class="mb-3">
                    <label class="form-label">Age</label>
                    <input type="number" class="form-control" name="age">
                </div>
                <button type="submit" class="btn btn-success">Submit</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
