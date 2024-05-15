package com.ra.services;


import com.ra.dto.ProdcutRequest;
import com.ra.util.DButil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public List<ProdcutRequest> products = new ArrayList<>();
    Connection con1;
    PreparedStatement pst;
    ResultSet rs;

    public List<ProdcutRequest> getAllProduct() {
        try {
            con1 = DButil.getConnection1();
            pst = con1.prepareStatement("select * from product");
            rs = pst.executeQuery();
            while (rs.next()) {
                ProdcutRequest product = new ProdcutRequest();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setStock(rs.getInt("stock"));
                product.setCategoryID(rs.getInt("categoryID"));
                product.setStatus(rs.getBoolean("status"));
                products.add(product);
            }
            return products;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DButil.closeConnection(con1);
        }
    }
}
