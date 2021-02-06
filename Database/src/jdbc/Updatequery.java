package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class Updatequery {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		//load the jdbc driver-4 into application for mysql.
		Class.forName("com.mysql.jdbc.Driver");

		//establish the connection.
		//DriverManager.getConnection(connecctionURL,username,password)

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rmi","root","");
		
		
		//UPDATE QUERY
		String query="update employeetable set ename=? where edept=?";
		
		PreparedStatement upsmt=(PreparedStatement) con.prepareStatement(query);

		upsmt.setString(1, "rabiya");
		upsmt.setString(2, "CSE");
		//upsmt.setString(1,"30000");
		int rows=upsmt.executeUpdate();
		//retrive the data from resultset.

		System.out.println(rows+"row(s) are updated.");
		Statement stmt =con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employeetable");


		System.out.println("eno\tename\tesal\tedept");
		while(rs.next()) {
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));

		}
		con.close();

		} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		}
	}