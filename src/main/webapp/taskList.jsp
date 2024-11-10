<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Task</title>
</head>
<body>
    <h1>Add New Task</h1>
    <form action="add" method="POST">
        <label for="description">Description: </label>
        <input type="text" name="description" required /><br><br>

        <label for="status">Status: </label>
        <select name="status">
            <option value="Pending">Pending</option>
            <option value="Completed">Completed</option>
        </select><br><br>

        <button type="submit">Add Task</button>
    </form>
    <br>
    <a href="taskList.jsp">Back to Task List</a>
</body>
</html>
