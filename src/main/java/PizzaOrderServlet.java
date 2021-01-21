import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name="PizzaOrderServlet", urlPatterns = "/PizzaOrder")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza-app/PizzaOrder.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


            String crust = req.getParameter("crust-type");
            String sauce = req.getParameter("sauce-type");
            String size = req.getParameter("size");
            String address = req.getParameter("address");
            String[] toppings = req.getParameterValues("topping");

            System.out.println("Crust: " + crust);
            System.out.println("Sauce: " + sauce);
            System.out.println("Size: " + size);
            System.out.println("Address: " + address);

            System.out.println("Toppings Listed Below:");
            for(String topping: toppings){
                    System.out.println(topping);
            }
    }



}
