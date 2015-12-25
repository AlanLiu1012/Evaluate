package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.DBConn;
import model.Member;


public class MemberDao {
	
	private static final String INSERT_SQL = 
			"insert into Member values(?,?,?,?,?,?,?,?)";

	public void insert(Member m) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(INSERT_SQL);
			stmt.setString(1, m.getMid());
			stmt.setString(2, m.getMpwd());
			stmt.setString(3, m.getMname());
			stmt.setString(4, m.getMtype());
			stmt.setString(5, m.getMtel());
			stmt.setString(6, m.getMaddress());
			stmt.setString(7, m.getMsg());
			stmt.setInt(8, m.getJifen());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatement(stmt);
			DBConn.closeConnection();
		}
	}

	private static final String FIND_MemberYUID_SQL = "select * from Member where mid=?";

	public Member findByMemberId(String id) {
		List<Member> list = new ArrayList<Member>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(FIND_MemberYUID_SQL);
			stmt.setString(1, id);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Member m = new Member();
				m.setMid(rs.getString(1));
				m.setMpwd(rs.getString(2));
				m.setMname(rs.getString(3));
				m.setMtype(rs.getString(4));
				m.setMtel(rs.getString(5));
				m.setMaddress(rs.getString(6));
				m.setMsg(rs.getString(7));
				m.setJifen(rs.getInt(8));
				list.add(m);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatementAndResultSet(stmt, rs);
			DBConn.closeConnection();
		}
		return list.get(0);
	}

	private static final String FIND_MUByAdsc_SQL = 
			"select * from Member where mtype=?";

	public List<Member> findAllBytype(String type) {
		List<Member> list = new ArrayList<Member>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(FIND_MUByAdsc_SQL);
			stmt.setString(1, type);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Member m = new Member();
				m.setMid(rs.getString(1));
				m.setMpwd(rs.getString(2));
				m.setMname(rs.getString(3));
				m.setMtype(rs.getString(4));
				m.setMtel(rs.getString(5));
				m.setMaddress(rs.getString(6));
				m.setMsg(rs.getString(7));
				m.setJifen(rs.getInt(8));
				list.add(m);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatementAndResultSet(stmt, rs);
			DBConn.closeConnection();
		}
		return list;
	}

	


	private static final String DELETE_Member_SQL = "delete from Member where mid=? ";

	public boolean delete(String id) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(DELETE_Member_SQL);
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


	private static final String UPDATE_Member_SQL = "update Member "
			+ " set mpwd=?,mname=?,mtel=?,maddress=?,msg=? where mid=? ";

	public void update(Member m) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(UPDATE_Member_SQL);
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
	
	private static final String UPDATE_MemberJF_SQL = "update Member "
			+ " set jifen=? where rid=? ";

	public void updateStatus(Member m) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(UPDATE_MemberJF_SQL);
			stmt.setInt(1, m.getJifen());
			stmt.setString(2, m.getMid());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatement(stmt);
			DBConn.closeConnection();
		}
	}
}
