import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Menu", urlPatterns = "/convert")
public class Menu extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));

        float vnd = rate * usd;

        PrintWriter writer = response.getWriter();
        writer.println(
                "<html>\n" +
                "<head>\n" +
                "  <title>Currency Converter</title>\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Currency Converter</h2>\n" +
                "<form action=\"/convert\" method=\"post\">\n" +
                "  <label>Rate: </label><br/>\n" +
                "  <input type=\"text\" name=\"rate\" placeholder=\"RATE\" value= "+String.valueOf(rate)+"><br/>\n" +
                "  <label>USD: </label><br/>\n" +
                "  <input type=\"text\" name=\"usd\" placeholder=\"USD\" value="+String.valueOf(usd)+"><br/>\n" +
                        "  <label>VND: </label><br/>\n" +
                "  <input type=\"text\" name=\"vnd\" placeholder=\"VND\" value="+String.valueOf(vnd)+"><br/>\n" +
                "  <input type = \"submit\" id = \"submit\" value = \"Converter\"/>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>"
        );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println(
                "<html>\n" +
                "<head>\n" +
                "  <title>Currency Converter</title>\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Currency Converter</h2>\n" +
                "<form action=\"/convert\" method=\"post\">\n" +
                "  <label>Rate: </label><br/>\n" +
                "  <input type=\"text\" name=\"rate\" placeholder=\"RATE\" value=\"22000\"/><br/>\n" +
                "  <label>USD: </label><br/>\n" +
                "  <input type=\"text\" name=\"usd\" placeholder=\"USD\" value=\"0\"/><br/>\n" +
                "  <input type = \"submit\" id = \"submit\" value = \"Converter\"/>\n" +
                "  <input type=\"text\" name=\"vnd\" placeholder=\"VND\" value=\"0\"/><br/>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>"
        );
    }
}
