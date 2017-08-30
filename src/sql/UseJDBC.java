package sql;

import java.sql.*;

public class UseJDBC {

public static Connection con;
	 public static void main(String[] args) {
		

	  String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	  String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=PhoneBook";
	  String userName="sa";
	  String userPwd="sw123";
 try
{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:PhoneBook");
	System.out.println("连接数据库成功！");

	Statement stmt = con.createStatement();
	ResultSet rset = stmt.executeQuery("select * from telnum");
	
	while(rset.next())
		System.out.println("姓名："+rset.getString("name")+"\t"+"电话: "+rset.getString("telnum"));
	rset.close();
	
	stmt.close();
		con.close();
	}catch(Exception e){
	e.printStackTrace();
		System.out.println("加载驱动失败！");
	}
}
	
//	public static void main(String[] args)throws SQLException,ClassNotFoundException{
//		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:odbc:PhoneBook");
//		
//		Statement stmt = conn.createStatement();
//		
//		ResultSet rset = stmt.executeQuery("select * from telnum");
//		
//		while(rset.next())
//			System.out.println("姓名："+rset.getString("name")+"\t"+"电话: "+rset.getString("telnum"));
//		rset.close();
//		stmt.close();
//		conn.close();
//	}
}
