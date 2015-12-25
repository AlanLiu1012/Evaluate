package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.DBConn;
import model.Book;


public class BookDao {
	
	private static final String INSERT_SQL = 
			"insert into Book values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public void insert(Book b) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(INSERT_SQL);
			stmt.setString(1, b.getBid());
			stmt.setString(2, b.getRid());
			stmt.setString(3, b.getRname());
			stmt.setDouble(4, b.getYu_price());
			stmt.setInt(5, b.getDaytime());
			stmt.setDouble(6, b.getSum_price());
			stmt.setDouble(7, b.getOther_price());
			stmt.setString(8, b.getUid());
			stmt.setString(9, b.getCardId());
			stmt.setString(10, b.getUname());
			stmt.setString(11, b.getUtel());
			stmt.setString(12, b.getYutime());
			stmt.setString(13, b.getBegintime());
			stmt.setString(14, b.getEndtime());
			stmt.setString(15, b.getStatus());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatement(stmt);
			DBConn.closeConnection();
		}
	}

	private static final String FIND_BookBYID_SQL = "select * from Book where bid=?";

	public Book findByBookId(String id) {
		List<Book> list = new ArrayList<Book>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(FIND_BookBYID_SQL);
			stmt.setString(1, id);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Book b = new Book();
				b.setBid(rs.getString(1));
				b.setRid(rs.getString(2));
				b.setRname(rs.getString(3));
				b.setYu_price(rs.getDouble(4));
				b.setDaytime(rs.getInt(5));
				b.setSum_price(rs.getDouble(6));
				b.setOther_price(rs.getShort(7));
				b.setUid(rs.getString(8));
				b.setCardId(rs.getString(9));
				b.setUname(rs.getString(10));
				b.setUtel(rs.getString(11));
				b.setYutime(rs.getString(12));
				b.setBegintime(rs.getString(13));
				b.setEndtime(rs.getString(14));
				b.setStatus(rs.getString(15));
				list.add(b);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatementAndResultSet(stmt, rs);
			DBConn.closeConnection();
		}
		return list.get(0);
	}

	private static final String FIND_ALL_BYUID_SQL = 
			"select * from Book where uid=?";

	public List<Book> findAllBytype(String uid) {
		List<Book> list = new ArrayList<Book>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(FIND_ALL_BYUID_SQL);
			stmt.setString(1, uid);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Book b = new Book();
				b.setBid(rs.getString(1));
				b.setRid(rs.getString(2));
				b.setRname(rs.getString(3));
				b.setYu_price(rs.getDouble(4));
				b.setDaytime(rs.getInt(5));
				b.setSum_price(rs.getDouble(6));
				b.setOther_price(rs.getShort(7));
				b.setUid(rs.getString(8));
				b.setCardId(rs.getString(9));
				b.setUname(rs.getString(10));
				b.setUtel(rs.getString(11));
				b.setYutime(rs.getString(12));
				b.setBegintime(rs.getString(13));
				b.setEndtime(rs.getString(14));
				b.setStatus(rs.getString(15));
				list.add(b);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatementAndResultSet(stmt, rs);
			DBConn.closeConnection();
		}
		return list;
	}

	


	private static final String DELETE_Book_SQL = "delete from Book where bid=? ";

	public boolean delete(String id) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(DELETE_Book_SQL);
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


	/*private static final String UPDATE_Book_SQL = "update Book "
			+ " set mpwd=?,mname=?,mtel=?,maddress=?,msg=? where mid=? ";

	public void update(Book m) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(UPDATE_Book_SQL);
			stmt.setString(1, m.getMpwd());
			stmt.setString(2, m.getMname());
			stmt.setString(3, m.getMtel());
			stmt.setString(4, m.getMaddress());
			stmt.setString(5, m.getMsg());
			stmt.setString(6, m.getMid());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatement(stmt);
			DBConn.closeConnection();
		}
	}
	
	private static final String UPDATE_BookJF_SQL = "update Book "
			+ " set jifen=? where rid=? ";

	public void updateStatus(Book m) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(UPDATE_BookJF_SQL);
			stmt.setInt(1, m.getJifen());
			stmt.setString(2, m.getMid());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatement(stmt);
			DBConn.closeConnection();
		}
	}*/
}
