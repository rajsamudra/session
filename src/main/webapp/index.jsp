<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= " Welcome to Home Page !" %>
    <h2><%=" Verification "%></h2>
</h1>
<br/>
    <form action ="welcome" method="get">
            <%--@declare id="username"--%>
            <label for="username"><b>Username</b></label>
            <input type="text" name="username"/>
            <%--@declare id="password"--%>
            <label for="password"><b>password</b></label>
             <input type="text" name="password"/>
             <input type="submit" name="login"/>

    </form>

</body>
</html>