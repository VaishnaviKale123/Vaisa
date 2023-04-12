package com.service;

import java.sql.SQLException;

import com.dao.Dao3;

public class Service3 {
public String deleteStaffRecord (int id)throws ClassNotFoundException, SQLException {
	Dao3 dd = new Dao3();
	String mssg = dd.DeleteStaffRecord(id);
	return mssg;
}
}
