import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookieId = new Cookie("ID", "qwe123");
        Cookie cookieSomeName = new Cookie("name", "Ivan");

        int maxAge = 60 * 60;


        cookieId.setMaxAge(maxAge);
        cookieSomeName.setMaxAge(maxAge);

        response.addCookie(cookieId);
        response.addCookie(cookieSomeName);
    }
}
