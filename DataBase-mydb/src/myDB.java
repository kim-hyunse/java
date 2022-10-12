import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class myDB {

	public static void main(String[] args) {

		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/cas";
			String user = "root", passwd = "12345";
			con = DriverManager.getConnection(url, user, passwd);
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		/*
		 * Statement stmt = null; try { stmt = con.createStatement(); String update =
		 * "update dept_inform2 set dept_code = dept_code +3 where dept_name='소프트웨어학과'";
		 * int count = stmt.executeUpdate(update); System.out.println(count); } catch
		 * (SQLException e1) { e1.printStackTrace(); } try { if (stmt != null &&
		 * !stmt.isClosed()) stmt.close(); } catch (SQLException e1) {
		 * e1.printStackTrace(); }
		 */
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			String sql = "select name, course_id from instructor natural join teaches";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String name = rs.getString(1);
				if (rs.wasNull())
					name = "null";
				String course_id = rs.getString(2);
				if (rs.wasNull())
					course_id = "null";
				System.out.println(name + "\t" + course_id);
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
