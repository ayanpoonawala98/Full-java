package com.ayan.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ayan.product.bo.ProductBO;
import com.ayan.product.bo.ProductBOImpl;
import com.ayan.product.dto.Product;

/**
 * Servlet implementation class CreateProductServlet
 */

public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id =Integer.parseInt(request.getParameter("id"));
		String name =request.getParameter("name");
		String description =request.getParameter("desc");
		int price =Integer.parseInt(request.getParameter("price"));
		
		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setDescription(description);
		product.setPrice(price);
		
		ProductBO bo =new ProductBOImpl();
		bo.create(product);
		
		PrintWriter out=response.getWriter();
		out.print("product Created");
	}

}
