
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class JdbcDeleteDemo {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/food";
		String username = "root";
		String password = "";

		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {

			String sql = "DELETE FROM dafood WHERE food_Name=?";

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "Pad HongKong");

			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A user was deleted successfully!");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}