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
	System.out.println("�������ݿ�ɹ���");

	Statement stmt = con.createStatement();
	ResultSet rset = stmt.executeQuery("select * from telnum");
	
	while(rset.next())
		System.out.println("������"+rset.getString("name")+"\t"+"�绰: "+rset.getString("telnum"));
	rset.close();
	
	stmt.close();
		con.close();
	}catch(Exception e){
	e.printStackTrace();
		System.out.println("��������ʧ�ܣ�");
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
//			System.out.println("������"+rset.getString("name")+"\t"+"�绰: "+rset.getString("telnum"));
//		rset.close();
//		stmt.close();
//		conn.close();
//	}
}
