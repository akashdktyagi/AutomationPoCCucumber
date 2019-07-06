package bddcucumber.managers.dbmanager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bddcucumber.managers.dbmanager.DBConnectionManager;
/*
 * Author: Akash
 * Date: 23Jun2019
 * Using free MY SQl database for sampling details for the same is as below
 */
/*
 * Database: db_autofrat
   Username: akashdktyagi
   Email: akashdktyagi@gmail.com
   The host name to access the server is db4free.net and 
   the port is 3306. You can use phpMyAdmin on our website to log in to the server.
	https://www.db4free.net/

 */

public class DBManager {

	//for testing only Should be removed
	public static void main(String[] args) throws SQLException {
		
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Akash");
		obj.add("Tyagi");
		System.out.print(obj);
		
	
		String q = "Select * from Products";
		String [][] result  = FetchDataFromDB(q);

		System.out.print(result);
		
	}

	public static String[][] FetchDataFromDB(String query) throws SQLException {

		//String url = "jdbc:ucanaccess://E:\\_AkashStuff\\Automation\\EclipseWorkspace\\AutomationPoCCucumber\\src\\test\\resources\\dbtable\\mySQL.accdb";
		String url = "jdbc:mysql://db4free.net:3306/db_autofrat?user=akashdktyagi&password=akashdktyagi";
		DBConnectionManager DBInstance = DBConnectionManager.getInstance(url);
		Connection conn = DBInstance.getConnection();
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery(query);

		//To get total number of Column returned
		int clmCount = rs.getMetaData().getColumnCount();

		//To get total number of rows returned
		rs.last();// this will move the rs to last row
		int rowcount = rs.getRow(); // this will give the index of last row
		rs.beforeFirst(); // this will bring it back to first record

		//Create a Object 
		String[][] result = new String[rowcount][clmCount];
		int i=0;
		while(rs.next()) {

			for(int j=0;j<clmCount;j++) {
				result[i][j]=rs.getString(j+1);
			}
			i=i+1;
		}

		return result;

	}
}
