import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;

@WebServlet(
  urlPatterns = {"/xss"}
)
public class XSS extends HttpServlet {
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{

		String message = request.getParameter("message");

    // StringBuilder body = new StringBuilder();
    // body.append(message);

    request.setAttribute("message", message);

    RequestDispatcher dis = request.getRequestDispatcher("xss.jsp");
    dis.forward(request, response);

    // ServletOutputStream out = response.getOutputStream();
    // out.write(body.toString().getBytes());
    // out.flush();
    // out.close();
  }
}
