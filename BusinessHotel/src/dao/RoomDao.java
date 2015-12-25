package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.DBConn;
import model.Room;


public class RoomDao {
	
	private static final String INSERT_SQL = 
			"insert into Room values(?,?,?,?,?,?,?,?,?,?,?)";

	public void insert(Room r) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(INSERT_SQL);
			stmt.setString(1, r.getRid());
			stmt.setString(2, r.getRname());
			stmt.setString(3, r.getType());
			stmt.setString(4, r.getSheshi());
			stmt.setString(5, r.getPic());
			stmt.setString(6, r.getHealth());
			stmt.setString(7, r.getRdesc());
			stmt.setString(8, r.getStatus());
			stmt.setString(9, r.getMsg());
			stmt.setDouble(10, r.getPrice());
			stmt.setDouble(11, r.getYu_price());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatement(stmt);
			DBConn.closeConnection();
		}
	}

	private static final String FIND_RoomYUID_SQL = "select * from Room where rid=?";

	public Room findByRoomId(String id) {
		List<Room> list = new ArrayList<Room>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(FIND_RoomYUID_SQL);
			stmt.setString(1, id);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Room r = new Room();
				r.setRid(rs.getString(1));
				r.setRname(rs.getString(2));
				r.setType(rs.getString(3));
				r.setSheshi(rs.getString(4));
				r.setPic(rs.getString(5));
				r.setHealth(rs.getString(6));
				r.setRdesc(rs.getString(7));
				r.setStatus(rs.getString(8));
				r.setMsg(rs.getString(9));
				r.setPrice(rs.getDouble(10));
				r.setYu_price(rs.getDouble(11));
				list.add(r);
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
			"select * from Room where type=?";

	public List<Room> findAllBytype(String type) {
		List<Room> list = new ArrayList<Room>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(FIND_MUByAdsc_SQL);
			stmt.setString(1, type);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Room r = new Room();
				r.setRid(rs.getString(1));
				r.setRname(rs.getString(2));
				r.setType(rs.getString(3));
				r.setSheshi(rs.getString(4));
				r.setPic(rs.getString(5));
				r.setHealth(rs.getString(6));
				r.setRdesc(rs.getString(7));
				r.setStatus(rs.getString(8));
				r.setMsg(rs.getString(9));
				r.setPrice(rs.getDouble(10));
				r.setYu_price(rs.getDouble(11));
				list.add(r);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatementAndResultSet(stmt, rs);
			DBConn.closeConnection();
		}
		return list;
	}

	


	private static final String DELETE_Room_SQL = "delete from Room where rid=? ";

	public boolean delete(String id) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(DELETE_Room_SQL);
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


	private static final String UPDATE_Room_SQL = "update Room "
			+ " set rname=?,sheshi=?,health=?,rdesc=?,msg=?,price=?,yu_price=? where rid=? ";

	public void update(Room r) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(UPDATE_Room_SQL);
			stmt.setString(1, r.getRname());
			stmt.setString(2, r.getSheshi());
			stmt.setString(3, r.getHealth());
			stmt.setString(4, r.getRdesc());
			stmt.setString(5, r.getMsg());
			stmt.setDouble(6, r.getPrice());
			stmt.setDouble(7, r.getYu_price());
			stmt.setString(8, r.getRid());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatement(stmt);
			DBConn.closeConnection();
		}
	}
	
	private static final String UPDATE_RoomStatus_SQL = "update Room "
			+ " set status=? where rid=? ";

	public void updateStatus(Room r) {
		PreparedStatement stmt = null;
		try {
			Connection conn = DBConn.getConnection();
			stmt = conn.prepareStatement(UPDATE_RoomStatus_SQL);
			stmt.setString(1, r.getStatus());
			stmt.setString(2, r.getRid());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeStatement(stmt);
			DBConn.closeConnection();
		}
	}
}
