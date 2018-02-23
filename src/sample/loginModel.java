package sample;

import java.sql.Connection;
import java.sql.SQLException;

public class loginModel {
    Connection Connection;

    public loginModel () {
        try {
            this.Connection = dbConnection.getConnection ();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if ()
    }


}//class
