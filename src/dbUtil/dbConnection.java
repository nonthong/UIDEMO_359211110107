package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    private static final String SQCONN = "jdbc:sqlite:school.sqlite";

<<<<<<< HEAD
    public  static Connection getConnection() throws SQLException {
=======
    public static Connection getConnection() throws SQLException {
>>>>>>> origin/master
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SQCONN);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
<<<<<<< HEAD

        return null;

    }








=======
        return null;
    }
>>>>>>> origin/master
}//class