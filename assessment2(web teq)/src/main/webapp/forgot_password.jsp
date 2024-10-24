<%@ include file="header.jsp" %>
<html>
<head>
    <title>Forgot Password</title>
    <link rel="stylesheet" href="path/to/bootstrap.css">
</head>
<body>
    <div class="container">
        <h2>Forgot Password</h2>
        <form action="UserController" method="post">
            <input type="hidden" name="action" value="forgotPassword">
            <div class="form-group">
                <label for="email">Enter your registered email:</label>
                <input type="email" class="form-control" name="email" required>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
    <%@ include file="footer.jsp" %>
</body>
</html>
