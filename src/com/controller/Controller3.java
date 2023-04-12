package com.controller;

import java.sql.SQLException;

import com.service.Service3;

public class Controller3 {
void deleteStaffRecord() throws ClassNotFoundException, SQLException {
	Service3 ss = new Service3();
	String msg = ss.deleteStaffRecord(13);
	System.out.println(msg);
}
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Controller3 cc = new Controller3();
	cc.deleteStaffRecord();
}
}
