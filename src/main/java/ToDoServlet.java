import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet (name="ToDoServlet", urlPatterns = "/todo")
public class ToDoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("isAdmin", false);
        req.setAttribute("myTasks", new String[] {"Todo 1", "Todo 2", "Todo 3"});

        req.getRequestDispatcher("/todo.jsp").forward(req, resp);
    }
}
