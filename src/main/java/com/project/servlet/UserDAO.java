package com.project.servlet;

import java.sql.*;

public class UserDAO {
	public boolean create(User u) {
		String sql = "INSERT INTO users(first_name,last_name,gmail,password) VALUES (?,?,?,?) ";
		try (Connection con = DBUtil.getConnection();
			 PreparedStatement ps = con.prepareStatement(sql)){
			ps.setString(1, u.getFirstName());
			ps.setString(2, u.getLastName());
			ps.setString(3, u.getGmail());
			ps.setString(4, u.getPassword()); //plain text for demo only
			return ps.executeUpdate() == 1;
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean authenticate(String gmail, String password) {
		String sql = "SELECT 1 FROM users WHERE gmail=? AND password=?";
		try (Connection con = DBUtil.getConnection();
			 PreparedStatement ps = con.prepareStatement(sql)){
			ps.setString(1, gmail);
            ps.setString(2, password);
            try (ResultSet rs = ps.executeQuery()) {
            	return rs.next();
            }
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
