<%@ include file="header.jsp" %>
<html>
<head>
    <title>Sign Up</title>
    <link rel="stylesheet" href="path/to/bootstrap.css">
    <script src="path/to/jquery.js"></script>
    <script src="script.js"></script>
</head>
<body>
    <div class="container">
        <h2>User Sign Up</h2>
        <form id="signupForm" action="UserController" method="post">
            <input type="hidden" name="action" value="register">
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" class="form-control" name="firstName" required>
            </div>
            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <input type="text" class="form-control" name="lastName" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" name="email" required id="email">
                <div id="emailError"></div>
            </div>
            <div class="form-group">
                <label for="mobile">Mobile:</label>
                <input type="text" class="form-control" name="mobile" required>
            </div>
            <div class="form-group">
                <label for="address">Address:</label>
                <textarea class="form-control" name="address" required></textarea>
            </div>
            <div class="form-group">
                <label>Gender:</label>
                <div>
                    <label><input type="radio" name="gender" value="Male" required> Male</label>
                    <label><input type="radio" name="gender" value="Female" required> Female</label>
                </div>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control" name="password" required>
            </div>
            <div class="form-group">
                <label for="confirmPassword">Confirm Password:</label>
                <input type="password" class="form-control" name="confirmPassword" required>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
    <%@ include file="footer.jsp" %>
</body>
</html>
