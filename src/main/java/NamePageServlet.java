import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NamePageServlet", urlPatterns = "/name")
    public class NamePageServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
                IOException, ServletException {

            String name = request.getParameter("name");
            request.setAttribute("name", name);
            request.getRequestDispatcher("HelloName.jsp").forward(request, response);
        }
            protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
                    IOException, ServletException {
                request.getRequestDispatcher("name.jsp").forward(request, response);
            }
    }

