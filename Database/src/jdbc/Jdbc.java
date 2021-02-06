package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			try {
				//load the jdbc driver-4 into application for mysql
				Class.forName("com.mysql.jdbc.Driver");
				//establish the connection
				//DriverManager.getConnection(connectionURL,username,password)
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rmi","root","");
				//statement object creation
				Statement stmt=con.createStatement();
				//execution of sql statement .output is table which is represented as resultset in appliaction
				ResultSet rs=stmt.executeQuery("select * from employeetable");
				//retrive data from dataset
				System.out.println("eno\tename\tesal\tedept");
				while(rs.next()) {
					System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
}
