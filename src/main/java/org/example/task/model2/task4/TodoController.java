package org.example.task.model2.task4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
@ResponseBody
@Controller
public class TodoController {
    private final List<Todo> todoList = new ArrayList<>();

    public TodoController() {
        // Todo listni boshlang'ich malumotlar bilan to'ldirish
        todoList.add(new Todo(1L, "Bugun dars pdp 5 dars", false));
        todoList.add(new Todo(2L, "Pdp 6chi dars", false));
        todoList.add(new Todo(3L, "Btc 40000", true));
    }

    @GetMapping("/todos")
    public String getAllTodos() {
        // HTML kodni string ko'rinishida generatsiya qilish
        StringBuilder htmlContent = new StringBuilder("<!DOCTYPE html>");
        htmlContent.append("<html lang=\"en\">");
        htmlContent.append("<head>");
        htmlContent.append("<meta charset=\"UTF-8\">");
        htmlContent.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
        htmlContent.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        htmlContent.append("<title>Todo List</title>");
        htmlContent.append("</head>");
        htmlContent.append("<body>");
        htmlContent.append("<h1>Todo List</h1>");
        htmlContent.append("<table border=\"1\">");
        htmlContent.append("<thead>");
        htmlContent.append("<tr>");
        htmlContent.append("<th>ID</th>");
        htmlContent.append("<th>Title</th>");
        htmlContent.append("<th>Completed</th>");
        htmlContent.append("</tr>");
        htmlContent.append("</thead>");
        htmlContent.append("<tbody>");

        // TodoList ni HTML kodga qo'shish
        for (Todo todo : todoList) {
            htmlContent.append("<tr>");
            htmlContent.append("<td>").append(todo.getId()).append("</td>");
            htmlContent.append("<td>").append(todo.getTitle()).append("</td>");
            htmlContent.append("<td>").append(todo.isCompleted() ? "Yes" : "No").append("</td>");
            htmlContent.append("</tr>");
        }

        htmlContent.append("</tbody>");
        htmlContent.append("</table>");
        htmlContent.append("</body>");
        htmlContent.append("</html>");

        return htmlContent.toString();
    }
}
