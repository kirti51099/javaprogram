import java.sql.*;

class DisplayStudentTable {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String user = "your_username";
        String password = "your_password";

        // SQL query to execute
        String query = "SELECT * FROM student";

        try {
            // Establishing connection to the database
            Connection connection = DriverManager.getConnection(url, user, password);

            // Creating a statement object
            Statement statement = connection.createStatement();

            // Executing the query and getting the result set
            ResultSet resultSet = statement.executeQuery(query);

            // Displaying the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String department = resultSet.getString("department");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Department: " + department);
            }

            // Closing resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
