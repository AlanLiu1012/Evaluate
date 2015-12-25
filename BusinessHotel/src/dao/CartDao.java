package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.DBConn;
import model.Cart;


public class CartDao {
	
	private static final String INSERT_SQL = 
			"insert into Cart values(?,?,?,?,?,?,?)";

	public void insert(Cart c) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(INSERT_SQL);
			stmt.setString(1, c.getCid());
			stmt.setString(2, c.getRid());
			stmt.setString(3, c.getRname());
			stmt.setDouble(4, c.getPrice());
			stmt.setInt(5, c.getDaynum());
			stmt.setString(6, c.getUid());
			stmt.setString(7, c.getUname());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatement(stmt);
			DBConn.closeConnection();
		}
	}

	private static final String FIND_CartYUID_SQL = "select * from Cart where cid=?";

	public Cart findByCartId(String id) {
		List<Cart> list = new ArrayList<Cart>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(FIND_CartYUID_SQL);
			stmt.setString(1, id);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Cart c = new Cart();
				c.setCid(rs.getString(1));
				c.setRid(rs.getString(2));
				c.setRname(rs.getString(3));
				c.setPrice(rs.getDouble(4));
				c.setDaynum(rs.getInt(5));
				c.setUid(rs.getString(6));
				c.setUname(rs.getString(7));
				list.add(c);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatementAndResultSet(stmt, rs);
			DBConn.closeConnection();
		}
		return list.get(0);
	}

	private static final String FIND_CART_SQL = 
			"select * from Cart where uid=?";

	public List<Cart> findAllByUid(String uid) {
		List<Cart> list = new ArrayList<Cart>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(FIND_CART_SQL);
			stmt.setString(1, uid);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Cart c = new Cart();
				c.setCid(rs.getString(1));
				c.setRid(rs.getString(2));
				c.setRname(rs.getString(3));
				c.setPrice(rs.getDouble(4));
				c.setDaynum(rs.getInt(5));
				c.setUid(rs.getString(6));
				c.setUname(rs.getString(7));
				list.add(c);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatementAndResultSet(stmt, rs);
			DBConn.closeConnection();
		}
		return list;
	}

	


	private static final String DELETE_Cart_SQL = "delete from Cart where cid=? ";

	public boolean delete(String id) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(DELETE_Cart_SQL);
			stmt.setString(1, id);
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatement(stmt);
			DBConn.closeConnection();
		}
		return false;
	}


	private static final String UPDATE_Cart_SQL = "update Cart "
			+ " set daynum=? where mid=? ";

	public void update(Cart c) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(UPDATE_Cart_SQL);
			stmt.setInt(1, c.getDaynum());
			stmt.setString(2, c.getCid());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatement(stmt);
			DBConn.closeConnection();
		}
	}
	
}
