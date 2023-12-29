package section20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * JDBC (Java Data Base Connectivity)
 *  자바 어플리케이션에서 데이터베이스와 통신할 수 있는 API
 *  
 */

public class JDBC01 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			// 1. 드라입저 클래스 정보 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			// 3. 쿼리 (SQL) 수행을 위해 Statement 객체 생성
			stmt = conn.createStatement(); // worksheet 역할
			
			// 4. SQL 쿼리 작성
			String param = "30";
			String sql = "SELECT * FROM employees WHERE department_id = " + param;
			
			// 5. 쿼리 수정
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String employeeId = rs.getString("employee_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				
				System.out.println(employeeId + " / " + firstName + " / " + lastName);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				
			}
		}
		
	}
}
