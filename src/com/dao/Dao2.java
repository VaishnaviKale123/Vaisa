package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao2{
public String insertStaffRecord(int id, String name, String salary,String des) throws ClassNotFoundException, SQLException{
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	
	String sql = "insert into staff (id,name,salary,des) values (?,?,?,?)";
	
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setInt(1, id);
	ps.setString(2,name);
	ps.setString(3, salary);
	ps.setString(4, des);
	
	int isInserted = ps.executeUpdate();
	return "Data Inserted Successfully";
	
	//preparedStatement 
}
	 
 }

