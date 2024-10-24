<%@ include file="header.jsp" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="path/to/bootstrap.css">
</head>
<body>
    <div class="container">
        <h2>Login</h2>
        <form action="UserController" method="post">
            <input type="hidden" name="action" value="login">
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" name="email" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control" name="password" required>
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
            <a href="forgot_password.jsp" class="btn btn-link">Forgot Password?</a>
        </form>
    </div>
    <%@ include file="footer.jsp" %>
</body>
</html>
