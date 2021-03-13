package com.ayan.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ayan.product.bo.ProductBO;
import com.ayan.product.bo.ProductBOImpl;
import com.ayan.product.dao.ProductDAO;
import com.ayan.product.dao.ProductDAOimpl;
import com.ayan.product.dto.Product;

/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductBO bo=new ProductBOImpl();
		Product product=bo.findProduct(Integer.parseInt(request.getParameter("id")));
		PrintWriter out=response.getWriter();
		out.print("Product Details");
		out.print("Product ID ::"+product.getId());
		out.print("Product Name ::"+product.getName());
		out.print("Product Description ::"+product.getDescription());
		out.print("Product Price ::"+product.getPrice());
		
	}

}