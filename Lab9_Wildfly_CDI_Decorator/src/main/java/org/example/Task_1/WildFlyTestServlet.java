package org.example.Task_1;

import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/decorator-test")
public class WildFlyTestServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Inject
    private IGreetingService greetingService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>CDI Decorator Test</title>");
            out.println("<style>");
            out.println("  body { font-family: Arial, sans-serif; margin: 40px;  }");
            out.println("  .decorated { color: #d63384; font-weight: bold; }");
            out.println("  .info { background: #e7f3ff; padding: 15px; "
                    + "border-radius: 5px; margin: 10px 0; }");
            out.println("  </style>");
            out.println("</head>");
            out.println("<body>");
            out.println("  <h1>CDI + Decorator</h1>");

            for (int i = 0; i < 3; i++) {
                out.println("  <div class='info'>");
                out.println("  <h3>Call #" + (i + 1) + ":</h3>");
                out.println("  <p class='decorated'><strong>Greeting:</strong> "
                        + greetingService.getGreeting() + "</p>");
                out.println("  <p><strong>Server Info:</strong> "
                        + greetingService.getServerInfo() + "</p>");
                out.println("  <p><strong>System Stats:</strong> "
                        + greetingService.getSystemStats() + "</p>");
                out.println("  </div>");

                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}