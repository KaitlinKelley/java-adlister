import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "CorrectServlet", urlPatterns = "/correct")
public class CorrectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String message = "Yay! You win!";

        req.setAttribute("message", message);

//        req.getAttribute("correctAnswer");

        req.getRequestDispatcher("/GuessingGame/answer.jsp").forward(req, resp);
    }
}
