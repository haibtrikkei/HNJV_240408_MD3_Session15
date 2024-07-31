package mini_project.demo_mini_project.controller;

import mini_project.demo_mini_project.model.entity.Product;
import mini_project.demo_mini_project.service.impl.CartServiceImpl;
import mini_project.demo_mini_project.service.impl.ProductServiceImpl;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "LoadProducts", value = "/LoadProducts")
public class LoadProducts extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        List<Product> list = new ProductServiceImpl().findLimit8();
        request.setAttribute("list",list);

        request.getSession().setAttribute("cartSize",new CartServiceImpl().findAll().size());

        request.getRequestDispatcher("listProducts.jsp").forward(request,response);
    }

//    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
//
//        doGet(request,response);
//    }

    public void destroy() {
    }
}