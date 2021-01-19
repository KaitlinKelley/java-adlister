import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "PageViewCounterServlet", urlPatterns = "/count")
public class PageViewCounterServlet extends HttpServlet {

    private int viewCount;

    public void resetCount(){
        viewCount = 0;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        viewCount++;

        PrintWriter out = resp.getWriter();

        String reset = req.getParameter("reset");

        String resetLink = "<h4>To reset the counter, add '?reset=yes' to the URL</h4>";

        if(reset == null) {
            if(viewCount == 1){
                out.println("<h2>This page has been viewed: " + viewCount + " time.");
                out.println(resetLink);
            }else {
                out.println("<h2>This page has been viewed: " + viewCount + " times.");
                out.println(resetLink);
            }
        }else if(reset.equals("yes")){
            resetCount();
            out.println("<h2>This counter has been reset to 0.</h2>");
            out.println("<a href='/count'>Go back to counter</a>");
        }


    }
}
