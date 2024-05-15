package com.ra.dao;


import com.ra.dto.ProdcutRequest;
import com.ra.entity.Category;
import com.ra.entity.Product;
import com.ra.services.CategoryService;
import com.ra.services.ProductService;
import com.ra.util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    Connection con;
    ProductService ProductService = new ProductService();
    CategoryService category = new CategoryService();
    List<ProdcutRequest> productRQList = ProductService.getAllProduct();
    List<Product> productList = new ArrayList<Product>();

    public List<Product> getProducts() {
        con = DButil.getConnection1();
        for (ProdcutRequest prodcutRequest : productRQList) {
            Product product = new Product();
            product.setCategory(category.getCategoriesById(prodcutRequest.getCategoryID()));
            product.setId(prodcutRequest.getId());
            product.setName(prodcutRequest.getName());
            product.setPrice(prodcutRequest.getPrice());
            product.setStock(prodcutRequest.getStock());
            product.setStatus(prodcutRequest.isStatus());
            productList.add(product);
        }
        DButil.closeConnection(con);
        return productList;
    }

    public void saveProduct(ProdcutRequest prodcutRequest) throws SQLException {
        con = DButil.getConnection1();
        PreparedStatement ps = con.prepareStatement("INSERT INTO product( name, price, stock, categoryId, status) VALUES ( ?, ?, ?, ?, ?)");
        ps.setString(1, prodcutRequest.getName());
        ps.setDouble(2, prodcutRequest.getPrice());
        ps.setInt(3, prodcutRequest.getStock());
        ps.setInt(4, prodcutRequest.getCategoryID());
        ps.setBoolean(5, prodcutRequest.isStatus());
        ps.executeUpdate();
        DButil.closeConnection(con);
    }

}
