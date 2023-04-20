package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.Complaint;
import model.Member;

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
	
	public static List<Complaint> approveListOfComplaint()
	{
		List<Complaint> list = new ArrayList<Complaint>();
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "select * from complaint";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Complaint c = new Complaint();
				c.setCid(rs.getInt("cid"));
				c.setMid(rs.getInt("mid"));
				c.setH_no(rs.getInt("h_no"));
				c.setSubject(rs.getString("subject"));
				c.setCdate(rs.getString("cdate"));
				c.setDescription(rs.getString("description"));
				c.setComplaint_status(rs.getString("complaint_status"));
				list.add(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
}
