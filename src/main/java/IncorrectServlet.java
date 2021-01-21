import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "IncorrectServlet", urlPatterns = "/incorrect")
public class IncorrectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String message = "Boo. That's wrong.";

        req.setAttribute("message", message);

//        int correctAnswer = (int)req.getAttribute("correctAnswer");
//
//        req.setAttribute("correctAnswer", correctAnswer);

        req.getRequestDispatcher("/GuessingGame/answer.jsp").forward(req, resp);

    }
}
