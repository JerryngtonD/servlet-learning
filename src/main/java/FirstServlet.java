import logic.Card;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();

        String user = (String) session.getAttribute("current_user");

//        if(user == null) {
//            // response for anonymus user
//            // register and oauth
//            // session.setAttribute("current_user", ID);
//        } else {
//            // response for authorized user
//        }


//        Card card = (Card) session.getAttribute("card");
//
//        String name = request.getParameter("name");
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//
//
//        if(card == null) {
//            card = new Card();
//            card.setName(name);
//            card.setQuantity(quantity);
//        }
//
//        session.setAttribute("card", card);

//        Integer count = (Integer) session.getAttribute("count");
//
//        if(count == null) {
//            session.setAttribute("count", 1);
//            count = 1;
//        } else {
//            session.setAttribute("count", ++count);
//        }

//
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");

//        PrintWriter pw = response.getWriter();
//
//
//        pw.println("<html>");
//        pw.println("<h1>Your count is: " + count + " </h1>");
//        pw.println("<h1>Hello, " +  name + " " + surname + " </h1>");
//        pw.println("</html>");
//
//        redirect
//        response.sendRedirect("initial.jsp");

        getServletContext().getRequestDispatcher("/showCard.jsp").forward(request, response);
    }
}
