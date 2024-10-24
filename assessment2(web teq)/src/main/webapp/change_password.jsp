<%@ include file="header.jsp" %>
<html>
<head>
    <title>Change Password</title>
    <link rel="stylesheet" href="path/to/bootstrap.css">
</head>
<body>
    <div class="container">
        <h2>Change Password</h2>
        <form action="UserController" method="post">
            <input type="hidden" name="action" value="changePassword">
            <div class="form-group">
                <label for="oldPassword">Old Password:</label>
                <input type="password" class="form-control" name="oldPassword" required>
            </div>
            <div class="form-group">
                <label for="newPassword">New Password:</label>
                <input type="password" class="form-control" name="newPassword" required>
            </div>
            <div class="form-group">
                <label for="confirmNewPassword">Confirm New Password:</label>
                <input type="password" class="form-control" name="confirmNewPassword" required>
            </div>
            <button type="submit" class="btn btn-primary">Change Password</button>
        </form>
    </div>
    <%@ include file="footer.jsp" %>
</body>
</html>
