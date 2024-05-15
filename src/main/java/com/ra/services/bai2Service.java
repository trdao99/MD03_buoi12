package com.ra.services;

import com.ra.entity.Employee;
import com.ra.util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class bai2Service {
    List<Employee> employees = new ArrayList<>();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public List<Employee> getEmployees() {
        pst = null;
        try {
            con = DButil.getConnection();
            pst = con.prepareStatement("select * from employee");
            rs = pst.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setEmpId(rs.getInt("emp_id"));
                employee.setEmpName(rs.getString("emp_name"));
                employee.setAddress(rs.getString("address"));
                employee.setBirthday(rs.getDate("birthday"));
                employee.setSalary(rs.getDouble("salary"));
                employee.setDepartment(rs.getString("department"));
                employee.setPosition(rs.getString("position"));
                employee.setGender(rs.getBoolean("gender"));
                employees.add(employee);
            }
            return employees;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DButil.closeConnection(con);
        }
    }
}
