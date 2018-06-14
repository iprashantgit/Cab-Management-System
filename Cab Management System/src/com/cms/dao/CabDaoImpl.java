package com.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cms.entity.Cab;
import com.cms.helper.DbUtil;

public class CabDaoImpl implements CabDao{
		
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	
	
	public CabDaoImpl() {};
	
	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = DbUtil.getInstance().getConnection();
		return conn;
	}
	
	public void addCab(Cab cab) {
		
		try {
			String queryString = "INSERT INTO Cab(cabId, driverName, availability) VALUES(?,?,?)";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setInt(1, cab.getCabId());
			ptmt.setString(2, cab.getDriverName());
			ptmt.setBoolean(3, cab.isAvalability());
			ptmt.executeUpdate();
			System.out.println("Data Added Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
	
	
		public int getCabId() {
			int cabId = 0;
		
		try {
			String queryString = "SELECT cabId FROM CAB WHERE AVAILABILITY = 1";
			connection = getConnection();
			Statement st = connection.createStatement();
		    ResultSet rs = st.executeQuery(queryString);
		    
		    if(rs.next()){
		    	cabId = rs.getInt(1);
		    	
		    	}
		    
		    
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return cabId;
		
	}
		
		public void changeCabStatus(int cabId,boolean toChange) {
			
		
		try {
			String queryString = "update cab set availability = ? where cabId=?";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);

			ptmt.setBoolean(1, toChange);
			ptmt.setInt(2, cabId);
			
			int rowsUpdated = ptmt.executeUpdate();
			if (rowsUpdated > 0) {
			    System.out.println("An existing cab status has been updated successfully!");
			}
			
	
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
	}


	
	
	
}
