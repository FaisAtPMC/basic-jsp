<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add new User</title>
</head>
<body>
    <div>
        <h1>Super App</h1>
    </div>
    <div>
        <% 
            if(request.getAttribute("userName") != null) {
                out.println("<p>User '" + request.getAttribute("userName") + "'added!</p>");
            }
        %>
    </div>
    <div>
        <div>
            <h2>Add user</h2>
        </div>
        <form method="post">
        <label>Name:
            <input type="text" name="name"><br />
        </label>

        <label>Password:
            <input type="password" name="pass"><br />
        </label>
        <button type="submit">Submit</button>
        </form>
    </div>
    
    <div>
        <button onclick="location.href='/'">Back to main</button>
    </div>
</body>
</html>