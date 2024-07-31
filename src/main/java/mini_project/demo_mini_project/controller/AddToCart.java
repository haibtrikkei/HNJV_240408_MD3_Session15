package mini_project.demo_mini_project.controller;

import mini_project.demo_mini_project.model.entity.Product;
import mini_project.demo_mini_project.service.impl.CartServiceImpl;
import mini_project.demo_mini_project.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AddToCart", value = "/AddToCart")
public class AddToCart extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String strProId = request.getParameter("proId");
        Integer proId;
        if(strProId != null && !strProId.isEmpty())
             proId = Integer.parseInt(strProId);
        else
            proId = 0;
        boolean blCheck = new CartServiceImpl().checkProductInCart(proId);
        if(blCheck){
            new CartServiceImpl().update(proId);
        }else{
            new CartServiceImpl().save(proId);
        }

        request.getRequestDispatcher("LoadProducts").forward(request,response);
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