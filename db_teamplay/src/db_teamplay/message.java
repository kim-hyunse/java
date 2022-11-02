package db_teamplay;
import java.sql.*;

public class message {

	public static void main(String[] args) {

		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://172.16.232.88/jarvis";
			String user = "dbteam", passwd = "qlalfqjsgh11";
			con = DriverManager.getConnection(url, user, passwd);
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			String sql = "select writer_id,content from message";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String writer_id = rs.getString(1);
				if (rs.wasNull())
					writer_id = "null";
				String content = rs.getString(2);
				if (rs.wasNull())
					content = "null";
				
				System.out.println("------------------------------------");
				System.out.println(writer_id+"</br>");
				System.out.println("------------------------------------");
				System.out.println(content);
				System.out.println("------------------------------------");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			if (stmt != null && !stmt.isClosed())
				stmt.close();
			if (rs != null && !rs.isClosed())
				rs.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		try {
			if (con != null && !con.isClosed())
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
