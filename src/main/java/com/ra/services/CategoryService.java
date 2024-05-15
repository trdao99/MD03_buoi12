package com.ra.services;

import com.ra.entity.Category;
import com.ra.util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    public List<Category> getAllCategories() {
        Connection conn = DButil.getConnection1();
        List<Category> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from category");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category cate = new Category();
                cate.setId(rs.getInt("id"));
                cate.setName(rs.getString("name"));
                cate.setStatus(rs.getBoolean("status"));
                list.add(cate);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DButil.closeConnection(conn);
        }
    }


    public Category getCategoriesById(int id) {
        return getAllCategories().stream().filter(cate -> cate.getId() == id).findFirst().orElse(null);
    }
}
