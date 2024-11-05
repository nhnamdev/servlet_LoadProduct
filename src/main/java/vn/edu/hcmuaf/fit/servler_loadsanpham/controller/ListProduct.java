package vn.edu.hcmuaf.fit.servler_loadsanpham.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.servler_loadsanpham.dao.model.Product;
import vn.edu.hcmuaf.fit.servler_loadsanpham.services.ProductServices;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListProduct", value = "/listproduct")
public class ListProduct extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        ProductServices productServices = new ProductServices();
        List<Product> data = productServices.getAll();
        System.out.println(data.size());
        request.setAttribute("data",data); // Đặt data vào request
        request.getRequestDispatcher("listproduct.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
