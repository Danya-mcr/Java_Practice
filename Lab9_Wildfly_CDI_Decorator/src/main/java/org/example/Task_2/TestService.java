package org.example.Task_2;

import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")
public class TestService extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Inject
    private MessageService messageService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println(messageService.getMessage());
    }
}
