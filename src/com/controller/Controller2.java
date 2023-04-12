package com.controller;

import java.sql.SQLException;

import com.service.Service2;

public class Controller2 {
void insertStaffRecord() throws ClassNotFoundException, SQLException{
	Service2 ss = new Service2();
	String msg= ss.insertStaffRecord(18, "Sahil", "30000", "Tester");
	System.out.println(msg);
	
}
public static void main(String[] args) throws ClassNotFoundException , SQLException{
	Controller2 cc = new Controller2();
	cc.insertStaffRecord();
	
}
}
