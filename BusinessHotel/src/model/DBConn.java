package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBConn {
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
	private static String url;
	private static String driver;
	private static String username;
	private static String password;
	
	static {
			url = "jdbc:mysql://localhost:3306/businesshotel?useUnicode=true&characterEncoding=utf8";
			driver = "com.mysql.jdbc.Driver";
			username = "root";
			password = "sa";

			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	}

	public static Connection getConnection() throws SQLException {
		Connection con = tl.get();
		if (con == null) {
			con = DriverManager.getConnection(url, username, password);
			tl.set(con);
		}
		return con;
	}

	public static void closeConnection() {
		Connection con = tl.get();
		try {
			if (con != null) {
				con.close();
				tl.set(null);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeStatement(Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeResultSet(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeStatementAndResultSet(Statement stmt, ResultSet rs) {
		try {
			if (stmt != null) {
				stmt.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}