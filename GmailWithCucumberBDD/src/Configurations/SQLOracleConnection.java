package Configurations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import org.testng.annotations.Test;
@Test
public class SQLOracleConnection {

	public ResultSet getDataBaseResultColumnNumber(String tableName,int columnNumber) throws SQLException {
	
		//Class.forname("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("JDBC:MySQL://localhost:3306/EMPLOYEE", "root", "Hariom001");
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery("select"+columnNumber +"from" +tableName);
		System.out.println("No. of Rows in the query result are: "+rs.getFetchSize());
		while (rs.next()) {
			String cusName=rs.getString(columnNumber).toString();
			System.out.println("Customer name is: "+cusName);
		}
		
		//Return resultset of column number to perform validation operation
		return rs;
		}
	public ResultSet getDataBaseResultColumnName(String tableName,String columnName) throws SQLException {
		
		//Class.forname("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("JDBC:MySQL://localhost:3306/EMPLOYEE", "root", "Hariom001");
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery("select"+columnName +"from" +tableName);
		System.out.println("No. of Rows in the query result are: "+rs.getFetchSize());
		while (rs.next()) {
			String cusName=rs.getString(columnName).toString();
			System.out.println("Customer name is: "+cusName);
		}
		
		//Return resultset of column name to perform validation operation
		return rs;
		}
		
	}


