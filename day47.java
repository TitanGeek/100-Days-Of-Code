import java.sql.*;

public class ResultSetMetadataExample {
    public static void main(String[] args) {
        try {
            // Replace with your database credentials
            String url = "jdbc:mysql://localhost:3306/your_database";
            String user = "your_username";
            String password = "your_password";

            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query
            String query = "SELECT * FROM your_table";
            ResultSet resultSet = statement.executeQuery(query);

            // Get ResultSetMetaData
            ResultSetMetaData metaData = resultSet.getMetaData();

            // Print column information
            int columnCount = metaData.getColumnCount();
            System.out.println("Number of columns: " + columnCount);

            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                String columnType = metaData.getColumnTypeName(i);
                int columnDisplaySize = metaData.getColumnDisplaySize(i);

                System.out.println("Column " + i + ":");
                System.out.println("  Name: " + columnName);
                System.out.println("  Type: " + columnType);
                System.out.println("  Display size: " + columnDisplaySize);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}