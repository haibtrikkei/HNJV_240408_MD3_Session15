package mini_project.demo_mini_project.controller;

import mini_project.demo_mini_project.model.entity.Product;
import mini_project.demo_mini_project.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShopProduct", value = "/ShopProduct")
public class ShopProduct extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        List<Product> list = new ProductServiceImpl().findAll();
        request.setAttribute("list",list);

        request.getRequestDispatcher("shopProduct.jsp").forward(request,response);
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