import java.sql.*;

public class JdbcPreparedStatementAndTransaction {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "your_username";
        String password = "your_password";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, user, password)) {
            conn.setAutoCommit(false); // Disable auto-commit for transaction

            // Prepared Statement Example
            String insertSql = "INSERT INTO users (name, age) VALUES (?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertSql)) {
                pstmt.setString(1, "John Doe");
                pstmt.setInt(2, 30);
                int rowsInserted = pstmt.executeUpdate();
                System.out.println(rowsInserted + " rows inserted.");
            }

            // Transaction Example
            String insertAccount1 = "INSERT INTO accounts (id, balance) VALUES (?, ?)";
            String insertAccount2 = "INSERT INTO accounts (id, balance) VALUES (?, ?)";
            try (PreparedStatement pstmt1 = conn.prepareStatement(insertAccount1);
                 PreparedStatement pstmt2 = conn.prepareStatement(insertAccount2)) {
                pstmt1.setInt(1, 1);
                pstmt1.setInt(2, 1000);
                pstmt2.setInt(1, 2);
                pstmt2.setInt(2, 500);

                pstmt1.executeUpdate();
                pstmt2.executeUpdate();

                conn.commit(); // Commit the transaction
                System.out.println("Transaction committed successfully.");
            } catch (SQLException e) {
                conn.rollback(); // Rollback the transaction
                System.out.println("Transaction rolled back due to error: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
