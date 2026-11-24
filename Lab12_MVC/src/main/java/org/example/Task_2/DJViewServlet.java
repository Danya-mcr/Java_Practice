package org.example.Task_2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/servlet/DJViewServlet")
public class DJViewServlet extends HttpServlet {
    private static final long serialVersionUID = 2L;

    public void init() throws ServletException {
        BeatModel beatModel = new BeatModel();
        beatModel.initialize();
        getServletContext().setAttribute("beatModel", beatModel);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        handleRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        handleRequest(request, response);
    }

    private void handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        BeatModel beatModel = (BeatModel) getServletContext().getAttribute("beatModel");
        if (beatModel == null) {
            beatModel = new BeatModel();
            beatModel.initialize();
            getServletContext().setAttribute("beatModel", beatModel);
        }

        String bpm = request.getParameter("bpm");
        if (bpm == null) bpm = beatModel.getBPM() + "";

        String set = request.getParameter("set");
        if (set != null) {
            try {
                beatModel.setBPM(Integer.parseInt(bpm.trim()));
            } catch (NumberFormatException ex) {
            }
        }

        String decrease = request.getParameter("decrease");
        if (decrease != null) beatModel.setBPM(beatModel.getBPM() - 1);

        String increase = request.getParameter("increase");
        if (increase != null) beatModel.setBPM(beatModel.getBPM() + 1);

        String on = request.getParameter("on");
        if (on != null) beatModel.on();

        String off = request.getParameter("off");
        if (off != null) beatModel.off();

        request.setAttribute("beatModel", beatModel);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/DJView.jsp");
        dispatcher.forward(request, response);
    }
}