package com.test;

import com.test.Alien;
import com.test.AlienDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int aid = Integer.parseInt(request.getParameter("aid"));
        AlienDao dao = new AlienDao();
        Alien a1 = dao.getAlien(aid);

        HttpSession session = request.getSession();
        session.setAttribute("alien", a1);

        response.sendRedirect("showAlien.jsp");

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
