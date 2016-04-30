package DAO;

import java.awt.List;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import model.*;

public class goddessDao {

	public void addgoddess(goddess g) throws SQLException {
		java.sql.Connection con=JDBCtest.getConnection();
		String sql=""+"insert into ywq_goddess"+"(user_name,sex,age,birthday,email,mobile,"
			+"create_user,create_date,update_user,update_date,isdel)"+
				"values("+"?,?,?,current_date(),?,?,?,current_date(),?,current_date(),?)";
		java.sql.PreparedStatement ptmt=con.prepareStatement(sql);
		
		ptmt.setString(1, g.getUser_name());
		ptmt.setInt(2,g.getSex());
		ptmt.setInt(3, g.getAge());; 
		ptmt.setString(4, g.getEmail());
		ptmt.setString(5 ,g.getMobile());
		ptmt.setString(6, g.getCreate_user());
		ptmt.setString(7, g.getUser_name());
		ptmt.setInt(8, g.getIsdel());
		
		ptmt.execute();
	
	}
	public void updategoddess(goddess g) throws SQLException {
		
		java.sql.Connection conn=JDBCtest.getConnection();
		String sql="" +
				" update imooc_goddess " +
				" set user_name=?,sex=?,age=?,email=?,mobile=?, " +
				" update_user=?,update_date=current_date(),isdel=? " +
				" where id=? ";
		java.sql.PreparedStatement ptmt=conn.prepareStatement(sql);
		
		ptmt.setString(1, g.getUser_name());
		ptmt.setInt(2, g.getSex());
		ptmt.setInt(3, g.getAge());
		//ptmt.setDate(4, new Date(g.getBirthday().getTime()));
		ptmt.setString(4, g.getEmail());
		ptmt.setString(5, g.getMobile());
		ptmt.setString(7, g.getCreate_user());
		ptmt.setInt(6, g.getIsdel());
		ptmt.setInt(7, g.getId());
		ptmt.execute();
		
	}
	
	public void  delgoddess(int id) throws SQLException {
		java.sql.Connection conn=JDBCtest.getConnection();
		String sql="" +
				" delete from ywq_goddess " +
				" where id=? ";
		java.sql.PreparedStatement ptmt=conn.prepareStatement(sql);
		
		ptmt.setInt(1, id);
		ptmt.execute();
		
	}
	public java.util.List<goddess> query(){
		
		java.sql.Connection con=JDBCtest.getConnection();
		java.util.List<goddess> gs=new ArrayList<goddess>();
		try {
			java.sql.Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("select user_name,age  from ywq_goddess");
			goddess g=null;
			while (rs.next()) {
				g=new goddess();
				gs.add(g);
				g.setUser_name(rs.getString("user_name"));
				g.setAge(rs.getInt("age"));
				
			//	System.out.println(rs.getString("user_name") + rs.getInt("age"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gs;
	}
	
	
	
	public goddess  getone(int id) throws SQLException {
			
	goddess g=null;
	java.sql.Connection conn=JDBCtest.getConnection();
	String sql="" +
			" select * from imooc_goddess " +
			" where id=? ";
	java.sql.PreparedStatement ptmt=conn.prepareStatement(sql);
	
	ptmt.setInt(1, id);
	ResultSet rs=ptmt.executeQuery();
	while(rs.next()){
		g=new goddess();
		g.setId(rs.getInt("id"));
		g.setUser_name(rs.getString("user_name"));
		g.setAge(rs.getInt("age"));
		g.setSex(rs.getInt("sex"));
		g.setBirthday(rs.getDate("birthday"));
		g.setEmail(rs.getString("email"));
		g.setMobile(rs.getString("mobile"));
		g.setCreate_date(rs.getDate("create_date"));
		g.setCreate_user(rs.getString("create_user"));
		g.setUpdate_date(rs.getDate("update_date"));
	
		g.setIsdel(rs.getInt("isdel"));
	}
	return g;
	}
	
}

