package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.DBConn;
import model.Evaluate;


public class EvaluateDao {
	
	private static final String INSERT_SQL = 
			"insert into Evaluate values(?,?,?,?,?,?,?,?,?,?)";

	public void insert(Evaluate e) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(INSERT_SQL);
			stmt.setString(1, e.getEid());
			stmt.setString(2, e.getRid());
			stmt.setString(3, e.getRname());
			stmt.setString(4, e.getBegintime());
			stmt.setString(5, e.getEndtime());
			stmt.setString(6, e.getAddtime());
			stmt.setString(7, e.getContent());
			stmt.setString(8, e.getUid());
			stmt.setString(9, e.getUname());
			stmt.setString(10, e.getPic());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			DBConn.closeStatement(stmt);
			DBConn.closeConnection();
		}
	}

	private static final String FIND_EvaluateYUID_SQL = "select * from Evaluate where eid=?";

	public Evaluate findByEvaluateId(String id) {
		List<Evaluate> list = new ArrayList<Evaluate>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(FIND_EvaluateYUID_SQL);
			stmt.setString(1, id);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Evaluate e = new Evaluate();
				e.setEid(rs.getString(1));
				e.setRid(rs.getString(2));
				e.setRname(rs.getString(3));
				e.setBegintime(rs.getString(4));
				e.setEndtime(rs.getString(5));
				e.setAddtime(rs.getString(6));
				e.setContent(rs.getString(7));
				e.setUid(rs.getString(8));
				e.setUname(rs.getString(9));
				e.setPic(rs.getString(10));
				list.add(e);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatementAndResultSet(stmt, rs);
			DBConn.closeConnection();
		}
		return list.get(0);
	}


	private static final String DELETE_Evaluate_SQL =
			"delete from Evaluate where eid=? ";

	public boolean delete(String id) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(DELETE_Evaluate_SQL);
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


	private static final String UPDATE_Evaluate_SQL = "update Evaluate "
			+ " set content=? where eid=? ";

	public void update(Evaluate e) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(UPDATE_Evaluate_SQL);
			stmt.setString(1, e.getContent());
			stmt.setString(2, e.getEid());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			DBConn.closeStatement(stmt);
			DBConn.closeConnection();
		}
	}
	
/*	private static final String UPDATE_EvaluateJF_SQL = "update Evaluate "
			+ " set jifen=? where rid=? ";

	public void updateStatus(Evaluate m) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(UPDATE_EvaluateJF_SQL);
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
