import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name="RetrieveAndProcessAnswerServlet", urlPatterns="/guess")
public class RetrieveAndProcessAnswerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/GuessingGame/guess.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userGuess = req.getParameter("user-guess");

        int userInt = Integer.parseInt(userGuess);

        int randomInt = (int)(Math.random() * 3 + 1);

        System.out.println("You were supposed to guess: " + randomInt);

//        req.setAttribute("correctAnswer", randomInt);
//
//        RequestDispatcher rd = req.getRequestDispatcher("/incorrect");
//
//        rd.forward(req, resp);

        if(userInt <=3 && userInt >=1 && userInt == randomInt){
            resp.sendRedirect("/correct");
        }else if(userInt <=3 && userInt >=1 && userInt != randomInt){
            resp.sendRedirect("/incorrect");
        }else{
            resp.sendRedirect("/guess");
        }

    }


}
