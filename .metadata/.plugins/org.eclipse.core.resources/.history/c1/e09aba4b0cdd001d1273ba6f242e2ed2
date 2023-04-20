package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;
import model.Complaint;

public class ComplaintDao {

	
	public static void registerComplaint(Complaint c)
	{
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "insert into complaint(mid,h_no,subject,cdate,description,complaint_status) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getMid());
			pst.setInt(2, c.getH_no());
			pst.setString(3, c.getSubject());
			pst.setString(4, c.getCdate());
			pst.setString(5, c.getDescription());
			pst.setString(6, c.getComplaint_status());
			pst.executeUpdate();
			System.out.println("Complaint Registered");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
