package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final String URL = "jdbc:mysql://localhost:3306/dbforjm";
    private final String USERNAME = "root";
    private final String PASSWORD = "13198520qWE---";

    public Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Сonnection established");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Сonnection error");
        }

        return connection;
    }
}
