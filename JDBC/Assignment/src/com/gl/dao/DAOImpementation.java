package com.gl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.gl.connection.DAO;

public class DAOImpementation {
	public static void insert() {

		String query = "insert into employee values(1,'Laison','laison2001@gl.com',9582585873)";
		String query2 = "insert into employee values(2,'Glanin','glanin2001@gl.com',9582585872)";
		String query3 = "insert into employee values(3,'Shakin','shakin2001@gl.com',9582585874)";
		String query4 = "insert into employee values(4,'Shanju','shanju2002@gl.com',9582585875)";
		String query5 = "insert into employee values(5,'Ebin','ebin2001@gl.com',9582585876)";
		Connection con;
		try {
			con = DAO.getConnection();
			Statement st = con.createStatement();
			int rows = st.executeUpdate(query);
			int row2 = st.executeUpdate(query2);
			int row3 = st.executeUpdate(query3);
			int row4 = st.executeUpdate(query4);
			int row5 = st.executeUpdate(query5);
			System.out.println("No of Rows Get Affected : " + (rows + row2 + row3 + row4 + row5));
			System.out.println("Excecuted Success Fully");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void modifyTable() {
		String querry = "alter table employee modify Email_Id varchar(30) not null";
		Connection con;
		try {
			con = DAO.getConnection();
			Statement st = con.createStatement();
			int row = st.executeUpdate(querry);
			System.out.println("no of table change " + row);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void insert2Record() {

		String query = "insert into employee values(6,'Ashmi','ashmi.gl.com',9546549861)";
		String query1 = "insert into employee values(7,'subi','sbb.gl.com',9546549872)";
		Connection con;

		try {
			con = DAO.getConnection();
			Statement st = con.createStatement();
			int row = st.executeUpdate(query);
			int row1 = st.executeUpdate(query1);
			System.out.println("no of table affected " + (row+row1));
			System.out.println("Connected");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void updateName() {
		String querry = "update employee set Name='Karthik' where Id=3";
		String querry2 = "update employee set Email_Id='Karthik@gl' where Id=3";
		String querry3 = "update employee set Phone_Number=1234567890 where Id=3";
		Connection con;
		try {
			con = DAO.getConnection();
			Statement st = con.createStatement();
			int row = st.executeUpdate(querry);
			int row1 = st.executeUpdate(querry2);
			System.out.println("Renamed " + (row + row1));
			con.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void delete() {
		String query = "delete from employee where Id=3";
		String query1 = "delete from employee where Id=4";
		Connection con;
		try {
			con = DAO.getConnection();
			Statement st = con.createStatement();
			int rows = st.executeUpdate(query);
			int row1 = st.executeUpdate(query1);
			System.out.println("No Of Rows Get Affected : " + (rows + row1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dropRecord() {
		String query = "truncate employee";
		Connection con;
		try {
			con = DAO.getConnection();
			Statement st = con.createStatement();
			int rows = st.executeUpdate(query);
			System.out.println("Rows get Affected : " + rows);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
