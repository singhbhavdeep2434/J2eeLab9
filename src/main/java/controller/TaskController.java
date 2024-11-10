package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.*;
import modal.Task;
import modal.TaskRepository;


public class TaskController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    

    private TaskRepository taskRepository = new TaskRepository();


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve all tasks
        List<Task> tasks = taskRepository.getAllTasks();
        request.setAttribute("tasks", tasks);
        RequestDispatcher dispatcher = request.getRequestDispatcher("taskList.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        String status = request.getParameter("status");

        // Add new task
        TaskRepository.addTask(description, status);
        response.sendRedirect("TaskController?action=view");
    }
}
