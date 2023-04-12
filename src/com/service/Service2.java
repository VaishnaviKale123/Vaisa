package com.service;

import java.sql.SQLException; 
import com.dao.Dao2;

public class Service2 {
public String insertStaffRecord(int id, String name,String salary,String des)throws ClassNotFoundException, SQLException {
	Dao2 dd = new Dao2();
	String mssg = dd.insertStaffRecord(id, name, salary, des);
	return mssg;
}
}
