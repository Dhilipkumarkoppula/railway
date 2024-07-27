package com.railway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.railway.models.User;
import com.railway.utils.DBConnect;

public class UserDAO {

	public static User getUserDetails(String username, String password) {
		User user = null;
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, username);
			pst.setString(2, password);

			rs = pst.executeQuery();

			if (rs.next()) {
				user = new User();
				user.setId(String.valueOf(rs.getInt("id")));
				user.setUsername(rs.getString("username"));
				user.setEmail(rs.getString("email"));
				user.setMobile_number(rs.getString("mobile_number"));
				user.setAadhar(rs.getString("aadhar"));
			} else {
				throw new Exception("Username or password might be wrong");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error in getting details from username, password");
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pst != null)
					pst.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.out.println("Error in closing resources");
			}
		}
		return user;
	}

	public static void updateUserDetails(User user) throws Exception {
		Connection conn = null;
		PreparedStatement pst = null;

		try {
			conn = DBConnect.getConnection();
			String sql = "UPDATE users SET username = ?, email = ?, mobile_number = ?, aadhar = ? WHERE id = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getEmail());
			pst.setString(3, user.getMobile_number());
			pst.setString(4, user.getAadhar());
			pst.setInt(5, Integer.parseInt(user.getId()));

			pst.executeUpdate();
		} finally {
			if (pst != null)
				pst.close();
			if (conn != null)
				conn.close();
		}
	}

}
