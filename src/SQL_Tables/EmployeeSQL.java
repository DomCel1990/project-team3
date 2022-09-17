package SQL_Tables;

import java.sql.*;

public class EmployeeSQL {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer", "developer");
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM  employee");

            while(resultSet.next()){
                System.out.print(resultSet.getString("employee_id") + " ");
                System.out.print(resultSet.getString("name") + " ");
                System.out.print(resultSet.getString("surname") + " ");
                System.out.print(resultSet.getString("age") + " ");
                System.out.print(resultSet.getString("gender") + " ");
                System.out.print(resultSet.getString("phone_number") + " ");
                System.out.print(resultSet.getString("date_assumption") + " ");
                System.out.print(resultSet.getString("working_time") + " ");
                System.out.print(resultSet.getString("has_children") + " ");
                System.out.print(resultSet.getString("email"));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
