import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.sql.DataSource;
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(
  urlPatterns = {"/injection"}
)
public class Injection extends HttpServlet {
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{

		String title = request.getParameter("title");

    InitialContext context;
    DataSource ds;
    try {
      context = new InitialContext();
      ds = (DataSource) context.lookup("java:comp/env/jdbc_book");
      Connection con = ds.getConnection();
      Statement stmt = con.createStatement();
      ResultSet result = stmt.executeQuery("select * from books;");

      List<Book> books = new ArrayList<Book>();

      while (resultSet.next()) {
        Book book = new Book();
        book.setTitle(resultSet.getString("title"));
      }

      request.setAttribute("result", result);
      request.setAttribute("message", "test message");

      RequestDispatcher dis = request.getRequestDispatcher("injection.jsp");
      dis.forward(request, response);

      con.close();
      context.close();
      // }
    } catch (NamingException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }
}
