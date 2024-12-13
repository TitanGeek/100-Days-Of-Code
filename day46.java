import java.sql.*;

public class JDBCPreparedStatementTransaction {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver"); // Replace with your driver

            // Establish database connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "your_username", "your_password");
            conn.setAutoCommit(false); // Disable auto-commit for transaction

            // Create a prepared statement
            pstmt = conn.prepareStatement("INSERT INTO your_table (column1, column2) VALUES (?, ?)");

            // Set values for the first record
            pstmt.setString(1, "value1");
            pstmt.setInt(2, 10);
            pstmt.executeUpdate();

            // Set values for the second record
            pstmt.setString(1, "value2");
            pstmt.setInt(2, 20);
            pstmt.executeUpdate();

            // Commit the transaction
            conn.commit();
            System.out.println("Records inserted successfully.");
        } catch (SQLException | ClassNotFoundException e) {
            // Handle exceptions
            try {
                if (conn != null) {
                    conn.rollback(); // Rollback if an error occurs
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}