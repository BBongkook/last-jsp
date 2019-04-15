package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.sql.Connection;

import org.junit.Test;

import com.common.DBConnector;

public class DBConnectorTest {

	@Test
	public void driverTest() throws ClassNotFoundException {
		DBConnector.setDriver();
	}
	
	@Test
	public void openTest() {//throws SQLException {
		DBConnector.open();
		
	}
//(expected=SQLException.class)
	
	@Test
	public void getConTest() {
		Connection con = DBConnector.getCon();
		//assertEquals(null, con); // null 이랑 con 이랑 같을거니까 실행해봐
		assertNotEquals(null, con);
	}
}
