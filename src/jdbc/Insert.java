package jdbc;

import java.sql.*;

public class Insert {
    public static void main(String[] args) throws SQLException {
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/devops", "root", "devops");
	    Statement s = c.createStatement();
	    s.executeUpdate("insert into emp values(4, 'd', 40000000)");
	    ResultSet r = s.executeQuery("select * from emp");
	    while(r.next())
		System.out.println(r.getInt(1) + " " + r.getString(2) + " " + r.getInt(3));
	    c.close();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}
    }
}
